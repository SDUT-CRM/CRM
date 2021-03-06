package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

public interface Lg08Dao {
	
	public void setMapDto(Map dto);
	
	public boolean add()throws Exception;
	
	public List query()throws Exception;
	
	public boolean modify()throws Exception;
	
	public boolean delete()throws Exception;
	
	public boolean check() throws Exception;
	
	public List queryForPage() throws Exception;
	
	public String getPageInfo(String url);
	
	public int getNum() throws Exception;
	
	public Map getInstance() throws Exception;
	
	public List getActivity() throws Exception;
	
	
	
}
