package cn.sdut.persistence.dao.interfaces;

import java.util.Map;

public interface Lg21Dao {
	public void setMapDto(Map dto);
	
	public Map checkUser()throws Exception;
	
	public long addUser() throws Exception;
	
	public boolean UpdateUser() throws Exception;
}
