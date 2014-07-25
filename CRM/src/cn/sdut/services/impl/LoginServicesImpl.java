package cn.sdut.services.impl;

import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg21Dao;
import cn.sdut.services.LoginServices;

public class LoginServicesImpl implements LoginServices {
	private Lg21Dao lg21dao = null;
	private Map dto = null;

	@Override
	public void setMapDto(Map dto) {
		this.dto = dto;
		this.lg21dao.setMapDto(dto);
	}

	public void setLg21dao(Lg21Dao lg21dao) {
		this.lg21dao = lg21dao;
	}

	@Override
	public Map getInstance() throws Exception {
		return this.lg21dao.checkUser();
	}

}
