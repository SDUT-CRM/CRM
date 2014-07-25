package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

public interface Lg16Dao {
	
    
    
    /**
     * 
     * @函数名  queryForForms
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-23
     * @更新日期 
     * @更新内容
     */
    public List queryForForms() throws Exception;
    /**
     * 
     * @函数名  setMapDto
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-23
     * @更新日期 
     * @更新内容
     */
	public void setMapDto(Map dto);
	
	/**
	 * 
	 * @函数名  add
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-23
	 * @更新日期 
	 * @更新内容
	 */
	public boolean add() throws Exception;
	
	/**
	 * 
	 * @函数名  append
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-23
	 * @更新日期 
	 * @更新内容
	 */
	public boolean append() throws Exception;
	
	/**
	 * 
	 * @函数名  modify
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-23
	 * @更新日期 
	 * @更新内容
	 */
	public boolean modify() throws Exception;
	
	/**
	 * 
	 * @函数名  query
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-23
	 * @更新日期 
	 * @更新内容
	 */
	public List query() throws Exception;
	
	/**
	 * 
	 * @函数名  delete
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-23
	 * @更新日期 
	 * @更新内容
	 */
	public boolean delete() throws Exception;
	
	public String getPageInfo(String url);
	
}
