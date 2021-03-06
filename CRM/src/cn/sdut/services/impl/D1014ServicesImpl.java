package cn.sdut.services.impl;

import java.util.Map;

import cn.sdut.persistence.dao.interfaces.adminDao;
import cn.sdut.services.D1014Services;

public class D1014ServicesImpl implements D1014Services {

	private adminDao admindao=null;
	private Map dto=null;
	
	@Override
	public void setMapDto(Map dto) {
		this.dto=dto;
		this.admindao.setMapDto(dto);
	}

	@Override
	public Map getInstance() throws Exception {
		
		return this.admindao.getInstance();
	}

	public adminDao getAdmindao() {
		return admindao;
	}

	public void setAdmindao(adminDao admindao) {
		this.admindao = admindao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
		this.admindao.setMapDto(dto);
	}

	
	
}
