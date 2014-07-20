package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg05Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg05DaoImpl extends HibernatePageDaoSupport implements Lg05Dao {

	/*
	 * 查询所有业务
	 * @see cn.sdut.persistence.dao.interfaces.Lg05Dao#query()
	 */
	@Override
	public List query() throws Exception {
		Object lg0509 = this.dto.get("lg0509");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
				.append("select new map(x.lg0501 as lg0501,x.lg0502 as lg0502,")
				.append("       x.lg0503 as lg0503, x.lg0504 as lg0504,")
				.append("       x.lg0505 as lg0505, x.lg0506 as lg0506,")
				.append("       x.lg0507 as lg0507, x.lg0508 as lg0508,")
				.append("       x.lg0509 as lg0509, x.lg0510 as lg0510")
				.append("       )")
				.append("  from Lg05 x").append(" where 1=1");
		if (checkVal(lg0509)) {
			this.hql.append(" and x.lg0509=?");
			this.pars.add(lg0509);
		}
		return this.queryForList();
	}
}
