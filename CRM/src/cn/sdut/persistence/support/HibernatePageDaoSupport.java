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

	private int countPage = 0; // 总页码
	private int currentPage = 0; // 当前实际可获取的页码
	private String pagename = "query"; // 默认分页器名称
	private int defpagesize = 10; // 默认一页十条数据
	private String contextpath = null; // 工程上下文路径--工程访问名称

	protected StringBuilder hql = null; // 子类的HQL语句
	protected List pars = null; // 子类HQL语句的参数列表

	protected Map dto = null;

	public final void setMapDto(Map dto) {
		this.dto = dto;
	}

	/**
	 * 分页查询方法
	 * 
	 * @return
	 * @throws Exception
	 */
	protected final List queryForList() throws Exception {
		return this.queryForList(this.defpagesize);
	}

	/**
	 * 分页查询方法
	 * 
	 * @param pagename
	 *            分页器名称
	 * @return
	 * @throws Exception
	 */
	protected final List queryForList(String pagename) throws Exception {
		this.pagename = pagename;
		return this.queryForList(defpagesize);
	}

	/**
	 * 分页查询方法
	 * 
	 * @param pagesize
	 *            每页记录数
	 * @param pagename
	 *            分页器名称
	 * @return
	 * @throws Exception
	 */
	protected final List queryForList(int pagesize, String pagename)
			throws Exception {
		this.pagename = pagename;
		return this.queryForList(pagesize);
	}

	/**
	 * 分页查询方法
	 * 
	 * @param pagesize
	 *            用户指定的每页记录数
	 * @return
	 * @throws Exception
	 */
	protected final List queryForList(final int pagesize) throws Exception {
		this.contextpath = (String) this.dto.get("contextpath");
		this.getPageCount(pagesize);
		this.getCurrentPageNumber();
		// 将光标定位到当前页头一行数据上(确定当前页的起始行数)
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
						// 确定起始行数
						query.setFirstResult(startRow);
						// 设定最大读取行数
						query.setMaxResults(pagesize);
						return query.list();
					}
				});
	}

	/**
	 * 计算实际可获取的页码
	 * 
	 * @throws Exception
	 */
	private final void getCurrentPageNumber() throws Exception {
		int onPageNo = 1; // 默认获取第一页
		Object queryVal = this.dto.get(this.pagename);
		if (queryVal != null && !queryVal.equals("")) {
			onPageNo = Integer.parseInt(queryVal.toString());
		}
		// 如果传入的当前页码比总的页数大,那么获取最后页
		if (onPageNo > this.countPage) {
			onPageNo = this.countPage;
		}
		// 当前可以获取页码
		this.currentPage = onPageNo;
	}

	/**
	 * 计算总的页数
	 * 
	 * @return
	 */
	private final void getPageCount(int pagesize) throws Exception {
		int fromIndex = this.hql.toString().toUpperCase().indexOf("FROM");
		final StringBuilder count_hql = new StringBuilder().append(
				"select count(*)  ").append(this.hql.substring(fromIndex));
		;
		// 总的行数
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
	 * 下拉列表分页器
	 * 
	 * @param url
	 *            整个功能点中,分页查询的action访问路径
	 * @return
	 */
	public final String getPageOption(String url) {
		StringBuilder sel = new StringBuilder().append("<select name=\""
				+ this.pagename + "\" onchange=\"changePageNo()\">");
		for (int i = 1; i <= this.countPage; i++) {
			if (i == this.currentPage) {
				sel.append(" <option value=" + i + " selected=\"selected\">第 "
						+ i + " 页</option>");
			} else {
				sel.append(" <option value=" + i + ">第 " + i + " 页</option>");
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
				// 加入下拉列表控件
				.append("    </td>")
				.append("    <td align=\"right\" nowrap=\"nowrap\" width=\"30%\">")
				.append("      第&nbsp;" + this.currentPage
						+ "&nbsp;页&nbsp;&nbsp;共&nbsp;" + this.countPage
						+ "&nbsp;页")
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
	 * 下页页码计算
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
	 * 上页页码计算
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
	 * 对象创建方法
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
	 * 单一实例查询方法
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
	 * 单一实例查询方法
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
	 * 数据更新方法
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
	 * 数据批量更新
	 * 
	 * @param hql
	 *            -- hql语句
	 * @param ids
	 *            主键数组
	 * @param idname
	 *            主键命名绑定字符串名称
	 * @param param
	 *            set类别值数组
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
	 * 数值查询方法
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
