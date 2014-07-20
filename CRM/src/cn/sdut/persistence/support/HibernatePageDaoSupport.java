package cn.sdut.persistence.support;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.sdut.system.Tools;

public abstract class HibernatePageDaoSupport extends HibernateDaoSupport {

	private int countPage = 0; // ��ҳ��
	private int currentPage = 0; // ��ǰʵ�ʿɻ�ȡ��ҳ��
	private String pagename = "query"; // Ĭ�Ϸ�ҳ������
	private int defpagesize = 10; // Ĭ��һҳʮ������
	private String contextpath = null; // ����������·��--���̷�������

	protected StringBuilder hql = null; // �����HQL���
	protected List pars = null; // ����HQL���Ĳ����б�

	protected Map dto = null;

	public final void setMapDto(Map dto) {
		this.dto = dto;
	}

	/**
	 * ��ҳ��ѯ����
	 * 
	 * @return
	 * @throws Exception
	 */
	protected final List queryForList() throws Exception {
		return this.queryForList(this.defpagesize);
	}

	/**
	 * ��ҳ��ѯ����
	 * 
	 * @param pagename
	 *            ��ҳ������
	 * @return
	 * @throws Exception
	 */
	protected final List queryForList(String pagename) throws Exception {
		this.pagename = pagename;
		return this.queryForList(defpagesize);
	}

	/**
	 * ��ҳ��ѯ����
	 * 
	 * @param pagesize
	 *            ÿҳ��¼��
	 * @param pagename
	 *            ��ҳ������
	 * @return
	 * @throws Exception
	 */
	protected final List queryForList(int pagesize, String pagename)
			throws Exception {
		this.pagename = pagename;
		return this.queryForList(pagesize);
	}

	/**
	 * ��ҳ��ѯ����
	 * 
	 * @param pagesize
	 *            �û�ָ����ÿҳ��¼��
	 * @return
	 * @throws Exception
	 */
	protected final List queryForList(final int pagesize) throws Exception {
		this.contextpath = (String) this.dto.get("contextpath");
		this.getPageCount(pagesize);
		this.getCurrentPageNumber();
		// ����궨λ����ǰҳͷһ��������(ȷ����ǰҳ����ʼ����)
		final int startRow = (this.currentPage - 1) * pagesize;

		return this.getHibernateTemplate().executeFind(
				new HibernateCallback<List>() {
					@Override
					public List doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query query = session.createQuery(hql.toString());
						if (pars != null) {
							int index = 0;
							for (Object val : pars) {
								query.setParameter(index++, val);
							}
						}
						// ȷ����ʼ����
						query.setFirstResult(startRow);
						// �趨����ȡ����
						query.setMaxResults(pagesize);
						return query.list();
					}
				});
	}

	/**
	 * ����ʵ�ʿɻ�ȡ��ҳ��
	 * 
	 * @throws Exception
	 */
	private final void getCurrentPageNumber() throws Exception {
		int onPageNo = 1; // Ĭ�ϻ�ȡ��һҳ
		Object queryVal = this.dto.get(this.pagename);
		if (queryVal != null && !queryVal.equals("")) {
			onPageNo = Integer.parseInt(queryVal.toString());
		}
		// �������ĵ�ǰҳ����ܵ�ҳ����,��ô��ȡ���ҳ
		if (onPageNo > this.countPage) {
			onPageNo = this.countPage;
		}
		// ��ǰ���Ի�ȡҳ��
		this.currentPage = onPageNo;
	}

	/**
	 * �����ܵ�ҳ��
	 * 
	 * @return
	 */
	private final void getPageCount(int pagesize) throws Exception {
		int fromIndex = this.hql.toString().toUpperCase().indexOf("FROM");
		final StringBuilder count_hql = new StringBuilder().append(
				"select count(*)  ").append(this.hql.substring(fromIndex));
		;
		// �ܵ�����
		int row_count = this.getHibernateTemplate()
				.execute(new HibernateCallback<Number>() {
					@Override
					public Number doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query q = session.createQuery(count_hql.toString());
						if (pars != null) {
							int index = 0;
							for (Object val : pars) {
								q.setParameter(index++, val);
							}
						}
						return (Number) q.uniqueResult();
					}
				}).intValue();
		this.countPage = (row_count + pagesize - 1) / pagesize;
	}

	protected final boolean checkVal(Object obj) {
		return obj != null && !obj.equals("");
	}

	/**
	 * �����б��ҳ��
	 * 
	 * @param url
	 *            �������ܵ���,��ҳ��ѯ��action����·��
	 * @return
	 */
	public final String getPageOption(String url) {
		StringBuilder sel = new StringBuilder().append("<select name=\""
				+ this.pagename + "\" onchange=\"changePageNo()\">");
		for (int i = 1; i <= this.countPage; i++) {
			if (i == this.currentPage) {
				sel.append(" <option value=" + i + " selected=\"selected\">�� "
						+ i + " ҳ</option>");
			} else {
				sel.append(" <option value=" + i + ">�� " + i + " ҳ</option>");
			}
		}
		sel.append("</select>");

		sel.append("<script language=\"javascript\">")
				.append("  function changePageNo()")
				.append("  {")
				.append("     with(document.forms[0])")
				.append("     {")
				.append("        action=\"" + this.contextpath + "/" + url
						+ ".action\";")
				.append("        submit();")
				.append("     }  ")
				.append("  }")
				.append("  document.all[\"" + this.pagename
						+ "\"].onmousewheel = dealWheel;")
				.append("  function dealWheel()").append("  {")
				.append("     return false;").append("  }")
				.append(" </script>");
		return sel.toString();
	}

	public final String getPageInfo(String url) {
		StringBuilder pagetable = new StringBuilder()
				.append("<table  width=\"100%\" border=\"0\" >")
				.append("  <tr bgcolor=\"#FFFFFF\">")
				.append("    <td align=\"left\" nowrap=\"nowrap\" width=\"70%\">")
				.append(this.getPageOption(url))
				// ���������б�ؼ�
				.append("    </td>")
				.append("    <td align=\"right\" nowrap=\"nowrap\" width=\"30%\">")
				.append("      ��&nbsp;" + this.currentPage
						+ "&nbsp;ҳ&nbsp;&nbsp;��&nbsp;" + this.countPage
						+ "&nbsp;ҳ")
				.append("      &nbsp;&nbsp;")
				.append("      <a href=\"#\" onclick=\"ConPages('1')\">                          <font class=\"Pagination\">9</font></a>")
				.append("      <a href=\"#\" onclick=\"ConPages('"
						+ this.getPreviousPage()
						+ "')\"> <font class=\"Pagination\">3</font></a>")
				.append("      <a href=\"#\" onclick=\"ConPages('"
						+ this.getNextPage()
						+ "')\">     <font class=\"Pagination\">4</font></a>")
				.append("      <a href=\"#\" onclick=\"ConPages('"
						+ this.countPage
						+ "')\">         <font class=\"Pagination\">:</font></a>")
				.append("    </td>")
				.append("  </tr>")
				.append("</table>	")
				.append("<script language=\"javascript\">")
				.append("  function ConPages(pno)")
				.append("  {")
				.append("    with(document.forms[0])")
				.append("    {")
				.append("        " + this.pagename + ".value=pno;")
				.append("        action=\"" + this.contextpath + "/" + url
						+ ".action\";").append("        submit();")
				.append("    }  ").append("  }").append(" </script>");
		;
		return pagetable.toString();

	}

	/**
	 * ��ҳҳ�����
	 * 
	 * @return
	 */
	private final int getNextPage() {
		int nextpage = this.currentPage + 1;
		if (nextpage >= this.countPage) {
			nextpage = this.countPage;
		}
		return nextpage;
	}

	/**
	 * ��ҳҳ�����
	 * 
	 * @return
	 */
	private final int getPreviousPage() {
		int previouspage = this.currentPage - 1;
		if (previouspage <= 1) {
			previouspage = 1;
		}
		return previouspage;
	}

	/**
	 * ���󴴽�����
	 * 
	 * @param <T>
	 * @param classType
	 * @return
	 * @throws Exception
	 */
	protected final <T> T addObject(Class<T> classType) throws Exception {
		T bean = classType.newInstance();
		BeanUtils.populate(bean, dto);
		this.getHibernateTemplate().save(bean);
		return bean;
	}

	/**
	 * ��һʵ����ѯ����
	 * 
	 * @param hql
	 * @param dto
	 * @param idname
	 * @return
	 * @throws Exception
	 */
	protected final Map queryForMap(final String hql, final Object... args)
			throws Exception {
		return this.getHibernateTemplate().execute(
				new HibernateCallback<Map>() {
					@Override
					public Map doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query q = session.createQuery(hql);
						int size = args.length;
						for (int i = 0; i < size; i++) {
							q.setParameter(i, args[i]);
						}
						return (Map) q.uniqueResult();
					}
				});
	}

	/**
	 * ��һʵ����ѯ����
	 * 
	 * @param hql
	 * @param dto
	 * @param idname
	 * @return
	 * @throws Exception
	 */
	protected final Map queryForMap(final String idname) throws Exception {
		return this.getHibernateTemplate().execute(
				new HibernateCallback<Map>() {
					@Override
					public Map doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query q = session.createQuery(hql.toString());
						q.setParameter(0,
								Long.parseLong(dto.get(idname).toString()));
						return (Map) q.uniqueResult();
					}
				});
	}

	/**
	 * ���ݸ��·���
	 * 
	 * @param hql
	 * @param args
	 * @return
	 * @throws Exception
	 */
	protected final boolean update(final String hql, final Object... args)
			throws Exception {
		final int size = args.length;
		return this.getHibernateTemplate().execute(
				new HibernateCallback<Boolean>() {
					@Override
					public Boolean doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query q = session.createQuery(hql);
						for (int i = 0; i < size; i++) {
							q.setParameter(i, args[i]);
						}
						return q.executeUpdate() > 0;
					}
				});
	}

	/**
	 * ������������
	 * 
	 * @param hql
	 *            -- hql���
	 * @param ids
	 *            ��������
	 * @param idname
	 *            �����������ַ�������
	 * @param param
	 *            set���ֵ����
	 * @return
	 */
	protected final boolean batchUpdate(final String hql, final Object ids[],
			final String idname, final Object... param) {
		return this.getHibernateTemplate().execute(
				new HibernateCallback<Boolean>() {
					@Override
					public Boolean doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query q = session.createQuery(hql);
						int index = 0;
						for (Object tem : param) {
							q.setParameter(index++, tem);
						}
						q.setParameterList(idname, ids);
						return q.executeUpdate() > 0;
					}
				});
	}

	/**
	 * ��ֵ��ѯ����
	 * 
	 * @param hql
	 * @param args
	 * @return
	 */
	protected Number queryFroNumber(final String hql, final Object... args) {
		return this.getHibernateTemplate().execute(
				new HibernateCallback<Number>() {
					@Override
					public Number doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query q = session.createQuery(hql);
						int index = 0;
						for (Object val : args) {
							q.setParameter(index++, val);
						}
						return (Number) q.uniqueResult();
					}
				});
	}

	// ============================================================
	protected Object getObject(String key) {
		return this.dto.get(key);
	}

	protected Long getLong(String key) {
		return Long.parseLong(this.dto.get(key).toString());
	}

	protected java.util.Date getUDate(String key) throws ParseException {
		return Tools.parseDate(this.dto.get(key));
	}

	protected Object[] getIdArray(String key) {
		return Tools.StringtoLongArray(this.dto.get(key));
	}

	protected Double getDouble(String key) {
		return Tools.ObjToDouble(this.dto.get(key));
	}

}
