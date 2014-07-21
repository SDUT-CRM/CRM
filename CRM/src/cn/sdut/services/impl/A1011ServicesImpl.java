package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg05;
import cn.sdut.persistence.bean.Lg21;
import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.services.A1011Services;

public class A1011ServicesImpl implements A1011Services {

	private Lg06Dao lg06Dao = null;
	private Map dto = null;

	@Override
	public boolean add() throws Exception {

		Lg01 lg01 = new Lg01();
		Lg02 lg02 = new Lg02();
		Lg05 lg05 = new Lg05();

		lg01.setLg21011(Long.parseLong(this.dto.get("lg2101").toString()));
		lg02.setLg21011(22L);
		lg05.setLg0501(Long.parseLong(this.dto.get("lg0501").toString()));

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);

		this.dto.put("lg0602", "2");
		this.dto.put("lg0603", da);
		this.dto.put("lg0604", da);
		this.dto.put("lg01", lg01);
		this.dto.put("lg02", lg02);
		this.dto.put("lg05", lg05);

		System.out.println("ds::::" + this.dto);
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

}
