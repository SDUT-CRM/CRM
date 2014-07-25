package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface D3030Services {

	public void setMapDto(Map dto);
	
	 public List query()throws Exception;
	 public String getPageInfo(String url);
	 public boolean update() throws Exception;
	 public boolean delete() throws Exception;
	 public boolean add() throws Exception;
	 public Map getInstance() throws Exception;
}
