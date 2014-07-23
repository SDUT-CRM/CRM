package cn.sdut.persistence.dao.impl;

import cn.sdut.persistence.bean.Lg19;
import cn.sdut.persistence.dao.interfaces.Lg19Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg19DaoImpl extends HibernatePageDaoSupport implements Lg19Dao {

	@Override
	public boolean add() throws Exception {
		this.dto.put("lg2101", this.getLong("lg2101"));
		this.dto.put("lg0201", this.getLong("lg0201"));
		this.dto.put("lg1801", this.getLong("lg1801"));
		this.dto.put("lg1903", this.getUDate("lg1903"));
		this.dto.put("lg1902", this.getObject("lg1902"));

		System.out.println("sad?"+dto);
		Lg19 lg19 = this.addObject(Lg19.class);
		return lg19.getLg1901()>0;
	}

}
