package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

public interface Lg16Dao {
	
    
    
    /**
     * 
     * @������  queryForForms
     * @����˵�� 
     * @����ֵ  
     * @����˵�� 
     * @����    
     * @�������� 2014-7-23
     * @�������� 
     * @��������
     */
    public List queryForForms() throws Exception;
    /**
     * 
     * @������  setMapDto
     * @����˵�� 
     * @����ֵ  
     * @����˵�� 
     * @����    
     * @�������� 2014-7-23
     * @�������� 
     * @��������
     */
	public void setMapDto(Map dto);
	
	/**
	 * 
	 * @������  add
	 * @����˵�� 
	 * @����ֵ  
	 * @����˵�� 
	 * @����    
	 * @�������� 2014-7-23
	 * @�������� 
	 * @��������
	 */
	public boolean add() throws Exception;
	
	/**
	 * 
	 * @������  append
	 * @����˵�� 
	 * @����ֵ  
	 * @����˵�� 
	 * @����    
	 * @�������� 2014-7-23
	 * @�������� 
	 * @��������
	 */
	public boolean append() throws Exception;
	
	/**
	 * 
	 * @������  modify
	 * @����˵�� 
	 * @����ֵ  
	 * @����˵�� 
	 * @����    
	 * @�������� 2014-7-23
	 * @�������� 
	 * @��������
	 */
	public boolean modify() throws Exception;
	
	/**
	 * 
	 * @������  query
	 * @����˵�� 
	 * @����ֵ  
	 * @����˵�� 
	 * @����    
	 * @�������� 2014-7-23
	 * @�������� 
	 * @��������
	 */
	public List query() throws Exception;
	
	/**
	 * 
	 * @������  delete
	 * @����˵�� 
	 * @����ֵ  
	 * @����˵�� 
	 * @����    
	 * @�������� 2014-7-23
	 * @�������� 
	 * @��������
	 */
	public boolean delete() throws Exception;
	
	public String getPageInfo(String url);
	
}
