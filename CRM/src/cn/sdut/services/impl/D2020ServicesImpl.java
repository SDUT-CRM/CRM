package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg05Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.services.D2020Services;

public class D2020ServicesImpl implements D2020Services {

	protected Lg05Dao lg05dao=null;
	protected Map dto=null;
	
	public Lg05Dao getLg05dao() {
		return lg05dao;
	}

	public void setLg05dao(Lg05Dao lg05dao) {
		this.lg05dao = lg05dao;
	}

	public Map getDto() {
		return dto;
	}

	public void setDto(Map dto) {
		this.dto = dto;
	}

	@Override
	public List query() throws Exception {

		return this.lg05dao.query();
	}

	@Override
	public void setMapDto(Map dto) {
		this.dto=dto;
		this.lg05dao.setMapDto(dto);
		
		
	}

	@Override
	public String getPageInfo(String url) {

		return this.lg05dao.getPageInfo(url);
	}

	@Override
	public Map getInstance() throws Exception {
		if(this.dto.get("lg0501") instanceof String[]){
			String[]aa = (String[])this.dto.get("lg0501");
			for(int i = 0; i < aa.length; i++){
				if(!aa[i].equals("")){
					this.dto.put("lg0501", aa[i]);
				}
			}
		}
		return this.lg05dao.getInstance();
	}

	@Override
	public boolean update() throws Exception {

		return this.lg05dao.update();
	}

	@Override
	public boolean delete() throws Exception {

		return this.lg05dao.delete();
	}

	@Override
	public boolean add() throws Exception {

		return this.lg05dao.add();
	}

}
