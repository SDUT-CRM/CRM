package cn.sdut.persistence.support;

import java.util.List;
import java.util.Map;

public interface BaseDaoInterfaces
{
	   public void setMapDto(Map dto);
	   public String getPageInfo(String url);
	   public String getPageOption(String url); 
	   
	   public List queryForPage()throws Exception;
	   public Map getInstance()throws Exception;
	   
}
