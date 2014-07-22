package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface A1030Services {

	public void setMapDto(Map dto);

	public List query() throws Exception;

	public String getPageInfo(String url);

	public Map getInstance() throws Exception;

	public boolean add() throws Exception;

	public boolean cancel() throws Exception;

	public boolean modify() throws Exception;
}