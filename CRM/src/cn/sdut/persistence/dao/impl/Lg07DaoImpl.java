package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sdut.persistence.dao.interfaces.Lg07Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg07DaoImpl extends HibernatePageDaoSupport implements Lg07Dao {

	@Override
	public boolean add() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List query() throws Exception {
		Object lg0701 = this.dto.get("lg0701");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0701 as lg0701,x.lg03.lg2101 as lg0301,")
		.append("       x.lg0702 as lg0702, x.lg0703 as lg0703,")
		.append("       x.lg0704 as lg0704, x.lg0705 as lg0705,")
		.append("       x.lg0706 as lg0706, x.lg0707 as lg0707,")
		.append("       x.lg0708 as lg0708, x.lg0709 as lg0709,")
		.append("       x.lg0710 as lg0710")
		.append("       )")
		.append("  from Lg07 x").append(" where 1=1");
		if (checkVal(lg0701)) {
			this.hql.append(" and x.lg0701=?");
			this.pars.add(Long.parseLong(lg0701.toString()));
		}
		return this.queryForList();
	}

	@Override
	public boolean modify() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
