package cn.sdut.persistence.dao.impl;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg07;
import cn.sdut.persistence.bean.Lg08;
import cn.sdut.persistence.dao.interfaces.Lg08Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg08DaoImpl extends HibernatePageDaoSupport implements Lg08Dao{

	@Override
	public boolean check() throws Exception {
		System.out.println(dto);
		Object args[]={
			this.getLong("lg2101"),
			this.getLong("lg0701")
		};
		StringBuilder hql=new StringBuilder()
		.append("select count(*)")
		.append("  from Lg08 x")
		.append(" where x.lg01.lg2101 = ? and x.lg07.lg0701 = ?")
		.append("       and x.lg0804 = 1");
		;
		return this.queryForNumber(hql.toString(), args).intValue()==0;
	}
	
	@Override
	public boolean add() throws Exception {
		this.dto.put("lg2101", this.getObject("lg2101"));
		this.dto.put("lg0701", this.getObject("lg0701"));
		this.dto.put("lg0802", this.getUDate("lg0802"));
		this.dto.put("lg0803", this.getUDate("lg0803"));
		this.dto.put("lg0804", this.getObject("lg0804"));
		
		Lg01 lg01 = new Lg01();
		Lg07 lg07 = new Lg07();
		
		//lg01.setLg2101(Long.parseLong(this.dto.get("lg2101").toString()));
		lg01.setLg2101(Long.parseLong(this.dto.get("lg2101").toString()));
		lg07.setLg0701(Long.parseLong(this.dto.get("lg0701").toString()));
		
		this.dto.put("lg01", lg01);
		this.dto.put("lg07", lg07);
		
		System.out.println(dto);
		Lg08 lg08 = this.addObject(Lg08.class);
		this.dto.put("lg08", lg08);
		return lg08.getLg0801()>0;
	}
	
	@Override
	public boolean delete() throws Exception {
		StringBuilder hql=new StringBuilder()
		.append("update Lg08 x")
		.append("   set x.lg0804=?")
		.append(" where x.lg0801=?")
		;
		//System.out.println("dto=="+dto);
		Object args[]={
			"2",
			this.getLong("lg0801")
		};
		return this.update(hql.toString(), args);
	}
}
