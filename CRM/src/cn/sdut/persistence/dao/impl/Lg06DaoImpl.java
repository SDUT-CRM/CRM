package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg05;
import cn.sdut.persistence.bean.Lg06;
import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg06DaoImpl extends HibernatePageDaoSupport implements Lg06Dao {

	@Override
	public boolean add() throws Exception {
		this.dto.put("lg2101", this.getObject("lg2101"));
		this.dto.put("lg0501", this.getObject("lg0501"));
		this.dto.put("lg0201", this.getObject("lg0201"));
		this.dto.put("lg0602", this.getObject("lg0602"));
		this.dto.put("lg0603", this.getUDate("lg0603"));
		this.dto.put("lg0604", this.getUDate("lg0604"));
		
		Lg01 lg01 = new Lg01();
		Lg02 lg02 = new Lg02();
		Lg05 lg05 = new Lg05();
		
		lg01.setLg2101(Long.parseLong(this.dto.get("lg2101").toString()));
		lg02.setLg2101(Long.parseLong(this.dto.get("lg0201").toString()));
		lg05.setLg0501(Long.parseLong(this.dto.get("lg0501").toString()));
		
		this.dto.put("lg01", lg01);
		this.dto.put("lg02", lg02);
		this.dto.put("lg05", lg05);
		
		System.out.println(dto);
		Lg06 lg06 = this.addObject(Lg06.class);
		this.dto.put("lg06", lg06);
		return lg06.getLg0601()>0;
		
	}

	@Override
	public List query() throws Exception {
		Object lg0601 = this.dto.get("lg0601");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0601 as lg0601,x.lg01.lg2101 as lg2101,")
		.append("       x.lg05.lg0501 as lg0501, x.lg02.lg2101 as lg0201,")
		.append("       x.lg0602 as lg0602, x.lg0603 as lg0603,")
		.append("       x.lg0604 as lg0604")
		.append("       )")
		.append("  from Lg06 x")
		.append(" where 1=1 and x.lg0602 < '5'");
		if (checkVal(lg0601)) {
			this.hql.append(" and x.lg0601=?");
			this.pars.add(Long.parseLong(lg0601.toString()));
		}
		return this.queryForList();
	}

	@Override
	public boolean modify() throws Exception {
		StringBuilder hql=new StringBuilder()
		.append("update Lg06 x")
		.append("   set x.lg05.lg0501=?, x.lg02.lg2101=?, x.lg0602=?,x.lg0604=?")
		.append(" where x.lg0601=?")
		;
		System.out.println("dto=="+dto);
		Object args[]={
			this.getLong("lg0501"),
			this.getLong("lg0201"),
			this.dto.get("lg0602"),
			this.getUDate("lg0604"),
			this.getLong("lg0601")
		};
		return this.update(hql.toString(), args);
	}

	@Override
	public boolean delete() throws Exception {
		StringBuilder hql=new StringBuilder()
		.append("update Lg06 x")
		.append("   set x.lg0602=?")
		.append(" where x.lg0601=?")
		;
		System.out.println("dto=="+dto);
		Object args[]={
			"5",
			this.getLong("lg0601")
		};
		return this.update(hql.toString(), args);
	}

}
