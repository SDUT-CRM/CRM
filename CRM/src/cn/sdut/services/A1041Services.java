package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface A1041Services {

	public void setMapDto(Map dto);

	public List queryById() throws Exception;
	
	public String getPageInfo(String url);
	
	public boolean add() throws Exception;

}