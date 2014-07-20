package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg05;

public interface Lg05Dao {
	
	public void setMapDto(Map dto);

	public List query() throws Exception;
	
	public Lg05 getInstance() throws Exception;
}
