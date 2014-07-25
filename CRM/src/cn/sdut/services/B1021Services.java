package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface B1021Services {

	public void setMapDto(Map dto);

	public List queryById() throws Exception;
	
	public String getPageInfo(String url);
	
	public boolean add() throws Exception;
	
	public boolean add1() throws Exception;
	
	public List query() throws Exception;

}
