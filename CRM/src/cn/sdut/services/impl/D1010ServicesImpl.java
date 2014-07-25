package cn.sdut.services.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg01Dao;
import cn.sdut.persistence.dao.interfaces.Lg02Dao;
import cn.sdut.persistence.dao.interfaces.Lg03Dao;
import cn.sdut.persistence.dao.interfaces.Lg21Dao;
import cn.sdut.services.D1010Services;
import cn.sdut.system.Tools;

public class D1010ServicesImpl implements D1010Services {

	protected Lg21Dao lg21Dao=null;
	protected Lg03Dao lg03Dao=null;
	protected Map dto=null;
	//power by zxh
	@Override
	public boolean addMs() throws Exception {
		 DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
	     dto.put("lg2103", Tools.getMd5("0000"));
	     dto.put("lg2102", "zxh");
	     dto.put("lg2105", "3");
	     dto.put("lg2104", this.dto.get("name"));
	     dto.put("lg0302", this.dto.get("name"));
	     dto.put("lg0303", this.dto.get("idcard"));
	     dto.put("lg0304", this.dto.get("address"));
	     dto.put("lg0305", this.dto.get("phonenumber"));
	     dto.put("lg0306", this.dto.get("email"));
	     dto.put("lg0307", "1");
	     dto.put("lg0308", dt.format(new Date()));
	     dto.put("lg0309", dt.format(new Date()));
	     
	     lg21Dao.addUser();
	     lg03Dao.add();
	     System.out.println(dto);
	     return true;
	}

	public Lg21Dao getLg21Dao() {
		return lg21Dao;
	}

	public void setLg21Dao(Lg21Dao lg21Dao) {
		this.lg21Dao = lg21Dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto=dto;
		this.lg21Dao.setMapDto(dto);
		this.lg03Dao.setMapDto(dto);
	}

	@Override
	public List query() throws Exception {
		return this.lg21Dao.adminQuery();
	}

	@Override
	public String getPageInfo(String url)throws Exception {

		return this.lg21Dao.getPageInfo(url);
	}

	public Lg03Dao getLg03Dao() {
		return lg03Dao;
	}

	public void setLg03Dao(Lg03Dao lg03Dao) {
		this.lg03Dao = lg03Dao;
	}




	
}
