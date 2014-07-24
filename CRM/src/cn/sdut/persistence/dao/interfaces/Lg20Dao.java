package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

public interface Lg20Dao {
	
	public void setMapDto(Map dto);
	
	//添加问题
	public boolean add() throws Exception;
	
	//追加问题
	public boolean append() throws Exception;
	
	//修改问题
	public boolean modify() throws Exception;
	
	//查询问题
	public List queryForPage() throws Exception;
	
	public List queryById() throws Exception;
	
	
	//删除问题
	public boolean delete() throws Exception;
	
	public String getPageInfo(String url);
	
}
