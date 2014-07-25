package cn.sdut.services.impl;

import java.util.Map;


import cn.sdut.persistence.bean.Lg21;

import cn.sdut.persistence.dao.interfaces.Lg21Dao;

import cn.sdut.services.D1012Services;
import cn.sdut.system.Tools;

public class D1012ServicesImpl implements D1012Services {

	
	private Lg21Dao lg21dao=null;
	



	private Map dto=null;
	
	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg21dao.setMapDto(dto);
	}
	
	public Lg21Dao getLg21dao() {
		return lg21dao;
	}

	public void setLg21dao(Lg21Dao lg21dao) {
		this.lg21dao = lg21dao;
	}

	@Override
	public  boolean delete() throws Exception {
		System.out.println("====D1012ServicesImpl.delete()=====");
		System.out.println("dto-----"+this.dto);
		return this.lg21dao.deleteUser();
	}

	@Override
	public boolean update() throws Exception {
		return this.lg21dao.UpdateUser();
	}
}
