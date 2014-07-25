package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg13Dao;
import cn.sdut.services.D3030Services;

public class D3030ServicesImpl implements D3030Services {

	protected Lg13Dao lg13dao=null;
	protected Map dto=null;
	
	public Lg13Dao getLg13dao() {
		return lg13dao;
	}

	public void setLg13dao(Lg13Dao lg13dao) {
		this.lg13dao = lg13dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto=dto;
		this.lg13dao.setMapDto(dto);

	}

	@Override
	public List query() throws Exception {
		return this.lg13dao.query();
	}

	@Override
	public String getPageInfo(String url) {
		return this.lg13dao.getPageInfo(url);
	}

	@Override
	public boolean update() throws Exception {
		return this.lg13dao.update1();
	}

	@Override
	public boolean delete() throws Exception {
		return this.lg13dao.delete();
	}

	@Override
	public boolean add() throws Exception {
		return this.lg13dao.add();
	}

	@Override
	public Map getInstance() throws Exception {
		return this.lg13dao.getInstance();
	}

}
