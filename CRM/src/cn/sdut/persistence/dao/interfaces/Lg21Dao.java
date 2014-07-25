package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

public interface Lg21Dao {
	public void setMapDto(Map dto);
	
	public Map checkUser()throws Exception;
	
	public long addUser() throws Exception;
	
	public boolean UpdateUser() throws Exception;
	
	public Map getInstance() throws Exception;
	
	
	
	
	
	
	 public List queryForPage() throws Exception;	
		public String getPageInfo(String url);
		public List adminQuery() throws Exception;
		public boolean deleteUser() throws Exception;
		public boolean add()throws Exception;
}
