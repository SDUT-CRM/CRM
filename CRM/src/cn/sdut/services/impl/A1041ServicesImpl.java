package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.dao.interfaces.Lg19Dao;
import cn.sdut.persistence.dao.interfaces.Lg20Dao;
import cn.sdut.services.A1041Services;

public class A1041ServicesImpl implements A1041Services {

	private Map dto = null;
	private Lg20Dao lg20Dao = null;
	private Lg19Dao lg19Dao = null;

	@Override
	public boolean add1() throws Exception {
		Lg01 lg01 = new Lg01();
		Lg02 lg02 = new Lg02();

		this.dto.put("lg1801", this.dto.get("lg2001"));
		lg01.setLg21011(Long.parseLong(this.dto.get("lg2101").toString()));
		lg02.setLg21011(22L);

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);

		this.dto.put("lg1903", da);
		this.dto.put("lg01", lg01);
		this.dto.put("lg02", lg02);
		this.dto.put("lg1804", "4");
		return lg20Dao.update()&& lg19Dao.add();
	}

	public Lg19Dao getLg19Dao() {
		return lg19Dao;
	}

	public void setLg19Dao(Lg19Dao lg19Dao) {
		this.lg19Dao = lg19Dao;
	}

	@Override
	public List query() throws Exception {
		return lg20Dao.queryForPage();
	}

	@Override
	public boolean add() throws Exception {
		Lg01 lg01 = new Lg01();
		Lg02 lg02 = new Lg02();
		lg01.setLg21011(Long.parseLong(this.dto.get("lg2101").toString()));
		lg02.setLg21011(22L);

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String da = formatter.format(date);

		this.dto.put("lg01", lg01);
		this.dto.put("lg02", lg02);
		this.dto.put("lg2004", da);
		this.dto.put("lg2007", "1");
		return lg20Dao.add();
	}

	@Override
	public String getPageInfo(String url) {
		return this.lg20Dao.getPageInfo(url);
	}

	public Lg20Dao getLg20Dao() {
		return lg20Dao;
	}

	public void setLg20Dao(Lg20Dao lg20Dao) {
		this.lg20Dao = lg20Dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg20Dao.setMapDto(dto);
		this.lg19Dao.setMapDto(dto);

	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg20Dao.setMapDto(dto);
		this.lg19Dao.setMapDto(dto);
	}

	@Override
	public List queryById() throws Exception {
		this.dto.put("lg2101", "2");
		// this.dto.put("lg2001", "1");
		return lg20Dao.queryById();
	}

}
