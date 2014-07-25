package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg18Dao;
import cn.sdut.services.B1030Services;

public class B1030ServicesImpl implements B1030Services {
	private Lg18Dao lg18Dao = null;
	private Map dto = null;
	
	public Lg18Dao getLg18Dao() {
		return lg18Dao;
	}

	public void setLg18Dao(Lg18Dao lg18Dao) {
		this.lg18Dao = lg18Dao;
	}

	@Override
	public boolean modify() throws Exception {
		this.dto.put("lg1804", "2");
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);
		this.dto.put("lg1803", da);
		return lg18Dao.modify();
	}
	
	@Override
	public String getPageInfo(String url) {
		return this.lg18Dao.getPageInfo(url);
	}


	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg18Dao.setMapDto(dto);
	}

	@Override
	public List query() throws Exception {
		this.dto.put("qlg1804", "1");
		return this.lg18Dao.queryForPage();
	}
	
	@Override
	public List query1() throws Exception {
		this.dto.put("qlg0602", "0");
		return null;
	}

	@Override
	public boolean setOk() throws Exception {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);
		this.dto.put("lg0604", da);
		return false;
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg18Dao.setMapDto(dto);
	}

	
	@Override
	public Map queryById() throws Exception {
		return lg18Dao.getInstance();
	}
}
