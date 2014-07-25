package cn.sdut.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg13;
import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.persistence.dao.interfaces.Lg13Dao;
import cn.sdut.persistence.dao.interfaces.Lg14Dao;
import cn.sdut.services.B1040Services;

public class B1040ServicesImpl implements B1040Services {
	private Lg13Dao lg13Dao = null;
	private Lg14Dao lg14Dao = null;
	private Map dto = null;

	@Override
	public boolean get() throws Exception{
		return lg14Dao.get();
	}
	
	public Lg13Dao getLg13Dao() {
		return lg13Dao;
	}

	public void setLg13Dao(Lg13Dao lg13Dao) {
		this.lg13Dao = lg13Dao;
	}

	public Lg14Dao getLg14Dao() {
		return lg14Dao;
	}

	public void setLg14Dao(Lg14Dao lg14Dao) {
		this.lg14Dao = lg14Dao;
	}

	@Override
	public String getPageInfo(String url) {
		return this.lg14Dao.getPageInfo(url);
	}

	@Override
	public String getPageInfo1(String url) {
		return this.lg13Dao.getPageInfo(url);
	}
	
	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.lg13Dao.setMapDto(dto);
		this.lg14Dao.setMapDto(dto);
	}

	@Override
	public List query() throws Exception {
		return this.lg14Dao.queryForPage();
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg13Dao.setMapDto(dto);
		this.lg14Dao.setMapDto(dto);
	}
	
	@Override
	public List queryForPage() throws Exception {
		return lg13Dao.queryForPageForpz(); 
	}
	
	@Override
	public boolean add() throws Exception {
		System.out.println(dto);
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String da = formatter.format(date);
		Lg02 lg02 = new Lg02();
		Lg13 lg13 = new Lg13();
		lg02.setLg21011(Long.parseLong(this.dto.get("lg0201").toString()));
		this.dto.put("lg02",lg02); 
		lg13.setLg1301(Long.parseLong(this.dto.get("lg1301").toString()));
		this.dto.put("lg13",lg13);
		this.dto.put("lg1403", "1");
		this.dto.put("lg1402", da);
		String[]strArr = (String [])this.dto.get("lg1406");
		for(int i = 0; i < strArr.length; i++){
			if(!strArr[i].equals("")){
				this.dto.put("lg1406",Long.parseLong(strArr[i]));
				break;
			}
		}
		return lg14Dao.add();
	}
}
