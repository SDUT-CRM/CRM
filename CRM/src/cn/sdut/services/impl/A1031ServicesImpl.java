package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.dao.interfaces.Lg18Dao;
import cn.sdut.persistence.dao.interfaces.Lg19Dao;
import cn.sdut.persistence.dao.interfaces.Lg20Dao;
import cn.sdut.services.A1031Services;

public class A1031ServicesImpl implements A1031Services {

	private Map dto = null;
	private Lg19Dao lg19Dao = null;
	private Lg18Dao lg18Dao = null;

	public Lg18Dao getLg18Dao() {
		return lg18Dao;
	}

	public void setLg18Dao(Lg18Dao lg18Dao) {
		this.lg18Dao = lg18Dao;
	}

	public Lg19Dao getLg19Dao() {
		return lg19Dao;
	}

	public void setLg19Dao(Lg19Dao lg19Dao) {
		this.lg19Dao = lg19Dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg19Dao.setMapDto(dto);
		this.lg18Dao.setMapDto(dto);
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg18Dao.setMapDto(dto);
		this.lg19Dao.setMapDto(dto);
	}

	@Override
	public boolean add() throws Exception {
		Lg01 lg01 = new Lg01();
		Lg02 lg02 = new Lg02();

		lg01.setLg21011(Long.parseLong(this.dto.get("lg2101").toString()));
		lg02.setLg21011(22L);

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);

		this.dto.put("lg1903", da);
		this.dto.put("lg01", lg01);
		this.dto.put("lg02", lg02);
		this.dto.put("lg1804", "4");
		return lg18Dao.modify() && lg19Dao.add();
	}

	@Override
	public Map getInstance() throws Exception {
		return lg18Dao.getInstance();
	}
}
