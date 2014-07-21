package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg02;

public interface Lg02Dao {
	
	public void setMapDto(Map dto);
	public List query() throws Exception;
	public List queryForPage() throws Exception;
}
