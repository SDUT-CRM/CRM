package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sdut.persistence.bean.Lg20;
import cn.sdut.persistence.dao.interfaces.Lg20Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg20DaoImpl extends HibernatePageDaoSupport implements Lg20Dao {

	@Override
	public List queryById() throws Exception {
		this.hql = new StringBuilder()
		.append("select new map(x.lg2001 as lg2001, x.lg01.lg2101 as lg0101, ")
		.append("               x.lg02.lg2101 as lg0201, x.lg2002 as lg2002, ")
		.append("               x.lg2003 as lg2003, to_char(x.lg2004,'YYYY-MM-DD HH24:mi:ss') as lg2004, ")
		.append("               x.lg2006 as lg2006, to_char(x.lg2005,'YYYY-MM-DD HH24:mi:ss') as lg2005")
		.append("       )")
		.append("  from Lg20 x")
		.append(" where x.lg2001=? or x.lg2006=?")
		.append("       and x.lg01.lg2101=? ")
		.append(" order by lg2001");
		;
		this.pars = new ArrayList();
		pars.add(this.getLong("lg2001"));
		pars.add(this.getLong("lg2001"));
		pars.add(this.getLong("lg2101"));
		return this.queryForList();
	}
	
	@Override
	public boolean add() throws Exception {
		this.dto.put("lg2004", this.getUDate1("lg2004"));
		Lg20 lg20 = this.addObject(Lg20.class);
		return lg20.getLg2001()>0;
	}

	@Override
	public boolean append() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List query() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
