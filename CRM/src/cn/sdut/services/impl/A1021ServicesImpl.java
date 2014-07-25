package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg07;
import cn.sdut.persistence.dao.interfaces.Lg07Dao;
import cn.sdut.persistence.dao.interfaces.Lg08Dao;
import cn.sdut.services.A1021Services;

public class A1021ServicesImpl implements A1021Services {

	private Lg07Dao lg07Dao = null;
	private Lg08Dao lg08Dao = null;
	private Map dto = null;

	@Override
	public boolean cancel() throws Exception {
		System.out.println(dto);
		return lg07Dao.increase()&&lg08Dao.delete();
	}
	
	@Override
	public boolean add() throws Exception {

		Lg01 lg01 = new Lg01();
		Lg07 lg07 = new Lg07();

		lg01.setLg21011(Long.parseLong(this.dto.get("lg2101").toString()));
		lg07.setLg0701(Long.parseLong(this.dto.get("lg0701").toString()));

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);

		this.dto.put("lg0804", "1");
		this.dto.put("lg0802", da);
		this.dto.put("lg0803", da);
		this.dto.put("lg01", lg01);
		this.dto.put("lg07", lg07);
		return lg07Dao.decrease()&&lg08Dao.add();
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg08Dao.setMapDto(dto);
		this.lg07Dao.setMapDto(dto);
	}

	public Lg07Dao getLg07Dao() {
		return lg07Dao;
	}

	public void setLg07Dao(Lg07Dao lg07Dao) {
		this.lg07Dao = lg07Dao;
	}

	public Lg08Dao getLg08Dao() {
		return lg08Dao;
	}

	public void setLg08Dao(Lg08Dao lg08Dao) {
		this.lg08Dao = lg08Dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg08Dao.setMapDto(dto);
		this.lg07Dao.setMapDto(dto);
	}

	@Override
	public List query() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Map ins = (Map)session.get("USERINFO");
		this.dto.put("lg2101", ins.get("lg2101"));
		return this.lg08Dao.queryForPage();
	}
	
	@Override
	public String getPageInfo(String url) {
		return this.lg08Dao.getPageInfo(url);
	}
}
