package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg05Dao;
import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.services.A1010Services;

public class A1010ServicesImpl implements A1010Services {

	private Map dto=null;
	private Lg05Dao lg05dao=null;
	private Lg06Dao lg06dao=null;
	
	public void setLg05dao(Lg05Dao lg05dao) {
		this.lg05dao = lg05dao;
	}

	public void setLg06dao(Lg06Dao lg06dao) {
		this.lg06dao = lg06dao;
	}

	@Override
	public void setMapDto(Map dto){
		this.dto=dto;
		this.lg05dao.setMapDto(dto);
		this.lg06dao.setMapDto(dto);
	}

	@Override
	public boolean add() throws Exception {
		return lg06dao.add();
	}

	@Override
	public List query() throws Exception {
		return lg05dao.query();
	}

	@Override
	public boolean modify() throws Exception {
		return lg06dao.modify();
	}

	@Override
	public boolean delete() throws Exception {
		return lg06dao.delete();
	}

}
