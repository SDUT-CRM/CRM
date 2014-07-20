package cn.sdut.persistence.dao.impl;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map findById() throws Exception {
		// TODO Auto-generated method stub
		return null;
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
