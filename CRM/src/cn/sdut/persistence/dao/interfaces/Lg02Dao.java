package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg02;

public interface Lg02Dao {
	
	public void setMapDto(Map dto);
	public List queryForPage() throws Exception;
	public String getPageInfo(String url);
	public boolean addEmployee() throws Exception;
}
