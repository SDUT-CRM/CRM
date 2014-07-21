package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg05;

public interface Lg05Dao {
	
	public void setMapDto(Map dto);

	public List query() throws Exception;
	
	public List queryForPage() throws Exception;
	
	public String getPageInfo(String url);
	
	public Map getInstance() throws Exception;

}
