package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface B1040Services {
	public void setMapDto(Map dto);

	public List query() throws Exception;

	public String getPageInfo(String url);
	
	public boolean get() throws Exception;
	
	public List queryForPage() throws Exception;
	
	public boolean add() throws Exception;
	
	public String getPageInfo1(String url);
}