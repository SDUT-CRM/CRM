package cn.sdut.system.db.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.sdut.system.db.DBOptions;

public class DBOptionsImpl extends HibernateDaoSupport implements DBOptions {
	@Override
	public String getLastNumber(String fname) throws Exception {
		long nextval = 0;
		String hql = "select fvalue from Sval where fname=?";
		Number fvalue = this.queryFroNumber(hql, fname);
		if (fvalue != null) {
			nextval = fvalue.longValue();
		}

		if (nextval == 0) // 创建fname='PAS002'的对象
		{
			//Sval sv = new Sval();
			//Sval sv = null;
			//sv.setFname(fname);
			//sv.setFvalue(++nextval);
			//this.getHibernateTemplate().save(sv);
		} else // 更新fname= PAS002 的对象
		{
			String update_hql = "update Sval set fvalue=? where fname=?";
			Object args[] = { ++nextval, fname };
			this.update(update_hql, args);
		}
		return String.valueOf(nextval);
	}

	private boolean update(final String hql, final Object... args)
			throws Exception {
		return this.getHibernateTemplate().execute(
				new HibernateCallback<Boolean>() {
					@Override
					public Boolean doInHibernate(Session session)
							throws HibernateException, SQLException {
						Query q = session.createQuery(hql);
						int index = 0;
						for (Object val : args) {
							q.setParameter(index++, val);
						}
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
	private Number queryFroNumber(final String hql, final Object... args) {
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

	@Override
	public List getOptions(String fname, String pfcode) throws Exception {
		StringBuilder hql = new StringBuilder()
				.append("select new list(fcode,fvalue)")
				.append("  from Syscode").append(" where pfcode=? and fname=?");
		Object args[] = { pfcode, fname };
		List<List> val = this.getHibernateTemplate().find(hql.toString(), args);

		List opts = new ArrayList();
		ValEntry ve = null;
		for (List tem : val) {
			ve = new ValEntry(tem.get(0), tem.get(1));
			opts.add(ve);
		}
		return opts;
	}

}
