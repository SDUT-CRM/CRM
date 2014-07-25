package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg17;
import cn.sdut.persistence.dao.interfaces.Lg18Dao;
import cn.sdut.services.A1030Services;

public class A1030ServicesImpl implements A1030Services {
	
	private Map dto = null;
	private Lg18Dao lg18Dao = null;
	
	public Lg18Dao getLg18Dao() {
		return lg18Dao;
	}

	public void setLg18Dao(Lg18Dao lg18Dao) {
		this.lg18Dao = lg18Dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg18Dao.setMapDto(dto);
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg18Dao.setMapDto(dto);
	}

	@Override
	public List query() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Map ins = (Map)session.get("USERINFO");
		this.dto.put("lg2101", ins.get("lg2101"));
		return lg18Dao.queryForPage();
	}

	@Override
	public String getPageInfo(String url) {
		return lg18Dao.getPageInfo(url);
	}

	@Override
	public Map getInstance() throws Exception {
		return lg18Dao.getInstance();
	}

	@Override
	public boolean add() throws Exception {
		Lg01 lg01 = new Lg01();
		Lg02 lg02 = new Lg02();
		Lg17 lg17 = new Lg17();

		lg01.setLg21011(Long.parseLong(this.dto.get("lg2101").toString()));
		lg02.setLg21011(22L);
		lg17.setLg1701(Long.parseLong(this.dto.get("lg1701").toString()));

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);

		this.dto.put("lg1804", "1");
		this.dto.put("lg1802", da);
		this.dto.put("lg1803", da);
		this.dto.put("lg1805", this.dto.get("lg1805").toString());
		this.dto.put("lg01", lg01);
		this.dto.put("lg02", lg02);
		this.dto.put("lg17", lg17);
		
		return lg18Dao.add();
	}

	@Override
	public boolean cancel() throws Exception {
		return lg18Dao.delete();
	}

	@Override
	public boolean modify() throws Exception {
		return lg18Dao.modify();
	}

}
