package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface B1030Services {
	public void setMapDto(Map dto);

	public List query() throws Exception;

	public String getPageInfo(String url);
	
	public boolean setOk() throws Exception;
	
	public boolean update() throws Exception;
	
	public List query1() throws Exception;
	
	public List query2() throws Exception;
	
	public Map queryById() throws Exception;
	
	public boolean modify() throws Exception;
	
}