package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg17;
import cn.sdut.persistence.bean.Lg18;
import cn.sdut.persistence.dao.interfaces.Lg18Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg18DaoImpl extends HibernatePageDaoSupport implements Lg18Dao {

	@Override
	public boolean add() throws Exception {
		this.dto.put("lg2101", this.getObject("lg2101"));
		this.dto.put("lg0201", this.getObject("lg0201"));
		this.dto.put("lg1701", this.getObject("lg1701"));
		this.dto.put("lg1802", this.getUDate("lg1802"));
		this.dto.put("lg1803", this.getUDate("lg1803"));
		this.dto.put("lg1804", this.getObject("lg1804"));
		this.dto.put("lg1805", this.getObject("lg1805"));
		
		Lg01 lg01 = new Lg01();
		Lg02 lg02 = new Lg02();
		Lg17 lg17 = new Lg17();
		
		lg01.setLg2101(Long.parseLong(this.dto.get("lg2101").toString()));
		lg02.setLg2101(Long.parseLong(this.dto.get("lg0201").toString()));
		lg17.setLg1701(Long.parseLong(this.dto.get("lg1701").toString()));
		
		this.dto.put("lg01", lg01);
		this.dto.put("lg02", lg02);
		this.dto.put("lg17", lg17);
		
		System.out.println(dto);
		Lg18 lg18 = this.addObject(Lg18.class);
		this.dto.put("lg06", lg18);
		return lg18.getLg1801()>0;
	}

	@Override
	public List query() throws Exception {
		Object lg1801 = this.dto.get("lg1801");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg1801 as lg1801,x.lg01.lg2101 as lg2101,")
		.append("       x.lg02.lg2101 as lg0201, x.lg17.lg1701 as lg1701,")
		.append("       x.lg1802 as lg1802, x.lg1803 as lg1803,")
		.append("       x.lg1804 as lg1804")
		.append("       )")
		.append("  from Lg18 x")
		.append(" where 1=1 and x.lg1804 < '6'");
		if (checkVal(lg1801)) {
			this.hql.append(" and x.lg1801=?");
			this.pars.add(Long.parseLong(lg1801.toString()));
		}
		return this.queryForList();
	}

	@Override
	public boolean modify() throws Exception {
		StringBuilder hql=new StringBuilder()
		.append("update Lg18 x")
		.append("   set x.lg02.lg2101=?, x.lg1803=?, x.lg1804=?,x.lg1805=?")
		.append(" where x.lg1801=?")
		;
		System.out.println("dto=="+dto);
		Object args[]={
			this.getLong("lg0201"),
			this.getUDate("lg1803"),
			this.dto.get("lg1804"),
			this.dto.get("lg1805"),
			this.getLong("lg1801")
		};
		return this.update(hql.toString(), args);
	}

	@Override
	public boolean delete() throws Exception {
		StringBuilder hql=new StringBuilder()
		.append("update Lg18 x")
		.append("   set x.lg1804=?")
		.append(" where x.lg1801=?")
		;
		System.out.println("dto=="+dto);
		Object args[]={
			"6",
			this.getLong("lg1801")
		};
		return this.update(hql.toString(), args);
	}

}
