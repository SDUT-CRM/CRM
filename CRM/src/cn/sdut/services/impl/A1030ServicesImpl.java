package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.services.A1030Services;

public class A1030ServicesImpl implements A1030Services {
	private Map dto = null;

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		//this.lg07Dao.setMapDto(dto);
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		//this.lg07Dao.setMapDto(dto);
	}

	@Override
	public List query() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageInfo(String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getInstance() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancel() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
