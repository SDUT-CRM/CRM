package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg01Dao;
import cn.sdut.persistence.dao.interfaces.Lg05Dao;
import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.persistence.dao.interfaces.Lg17Dao;
import cn.sdut.persistence.dao.interfaces.Lg18Dao;
import cn.sdut.services.B1020Services;

public class B1030ServicesImpl implements B1020Services {
	private Lg01Dao lg01Dao = null;
	private Lg17Dao lg17Dao = null;
	private Lg18Dao lg18Dao = null;
	private Map dto = null;
	
	@Override
	public String getPageInfo(String url) {
		//return this.lg06Dao.getPageInfo(url);
		return null;
	}


	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg01Dao.setMapDto(dto);
		this.lg17Dao.setMapDto(dto);
		this.lg18Dao.setMapDto(dto);
	}

	@Override
	public List query() throws Exception {
		this.dto.put("qlg0602", "1");
		//return this.lg06Dao.queryForPage();
		return null;
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
		this.lg01Dao.setMapDto(dto);
		this.lg17Dao.setMapDto(dto);
		this.lg18Dao.setMapDto(dto);
	}

}
