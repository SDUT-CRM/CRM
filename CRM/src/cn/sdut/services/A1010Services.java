package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface A1010Services {

	public void setMapDto(Map dto);
	
	public boolean add()throws Exception;
	
	public List query()throws Exception;
	
	public boolean modify()throws Exception;
	
	public boolean delete()throws Exception;
}
