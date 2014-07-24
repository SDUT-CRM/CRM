package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg05Dao;
import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.services.B1020Services;

public class B1020ServicesImpl implements B1020Services {
	private Lg05Dao lg05Dao = null;
	private Lg06Dao lg06Dao = null;
	private Map dto = null;
	
	@Override
	public String getPageInfo(String url) {
		return this.lg06Dao.getPageInfo(url);
	}

	public Lg05Dao getLg05Dao() {
		return lg05Dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg05Dao.setMapDto(dto);
		this.lg06Dao.setMapDto(dto);
	}

	public void setLg05Dao(Lg05Dao lg05Dao) {
		this.lg05Dao = lg05Dao;
	}

	public Lg06Dao getLg06Dao() {
		return lg06Dao;
	}

	public void setLg06Dao(Lg06Dao lg06Dao) {
		this.lg06Dao = lg06Dao;
	}

	@Override
	public List query() throws Exception {
		this.dto.put("qlg0602", "1");
		return this.lg06Dao.queryForPage();
	}
	
	@Override
	public List query1() throws Exception {
		this.dto.put("qlg0602", "0");
		return this.lg06Dao.queryForPage();
	}

	@Override
	public boolean setOk() throws Exception {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);
		this.dto.put("lg0604", da);
		return lg06Dao.setOk() && lg06Dao.updateDate();
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg05Dao.setMapDto(dto);
		this.lg06Dao.setMapDto(dto);
	}

}
