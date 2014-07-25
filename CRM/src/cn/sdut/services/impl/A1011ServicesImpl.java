package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg05;
import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.services.A1011Services;

public class A1011ServicesImpl implements A1011Services {

	private Lg06Dao lg06Dao = null;
	private Map dto = null;

	@Override
	public boolean cancel() throws Exception {
		return lg06Dao.delete();
	}
	
	@Override
	public boolean add() throws Exception {

		System.out.println("services dto:::"+dto);
		
		Lg01 lg01 = new Lg01();
		Lg05 lg05 = new Lg05();

		lg01.setLg21011(Long.parseLong(this.dto.get("lg2101").toString()));
		lg05.setLg0501(Long.parseLong(this.dto.get("lg0501").toString()));

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);

		this.dto.put("lg0602", "2");
		this.dto.put("lg0603", da);
		this.dto.put("lg0604", da);
		this.dto.put("lg01", lg01);
		this.dto.put("lg05", lg05);

		return lg06Dao.add();
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg06Dao.setMapDto(dto);
	}

	public Lg06Dao getLg06Dao() {
		return lg06Dao;
	}

	public void setLg06Dao(Lg06Dao lg06Dao) {
		this.lg06Dao = lg06Dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg06Dao.setMapDto(dto);
	}

	@Override
	public List query() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Map ins = (Map)session.get("USERINFO");
		this.dto.put("lg2101", ins.get("lg2101"));
		return this.lg06Dao.queryForPage();
	}
	
	@Override
	public String getPageInfo(String url) {
		return this.lg06Dao.getPageInfo(url);
	}
}
