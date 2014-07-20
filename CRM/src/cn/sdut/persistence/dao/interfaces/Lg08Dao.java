package cn.sdut.persistence.dao.interfaces;

import java.util.Map;

public interface Lg08Dao {
	
	public void setMapDto(Map dto);
	
	public boolean add() throws Exception;
	
	public boolean delete() throws Exception;
	
}
