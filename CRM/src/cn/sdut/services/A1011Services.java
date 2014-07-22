package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface A1011Services {
	public void setMapDto(Map dto);

	public boolean add() throws Exception;
	
	public List query() throws Exception;
	
	public String getPageInfo(String url);
	
	public boolean cancel() throws Exception;
	
}