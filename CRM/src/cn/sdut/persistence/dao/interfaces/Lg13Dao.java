package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg02;

public interface Lg13Dao {
	public boolean add() throws Exception;
    
	public void setMapDto(Map dto);
	public List queryForPage() throws Exception;
	public String getPageInfo(String url);
	/**
	 * 
	 * @������  queryForPageForpz
	 * @����˵�� 
	 * @����ֵ  
	 * @����˵�� 
	 * @����    
	 * @�������� 2014-7-24
	 * @�������� 
	 * @��������
	 */
	public List queryForPageForpz() throws Exception;
	/**
	 * 
	 * @������  getInstance
	 * @����˵�� 
	 * @����ֵ  
	 * @����˵�� 
	 * @����    
	 * @�������� 2014-7-24
	 * @�������� 
	 * @��������
	 */
	public Map getInstance() throws Exception;
	/**
	 * 
	 * @������  update
	 * @����˵�� 
	 * @����ֵ  
	 * @����˵�� 
	 * @����    
	 * @�������� 2014-7-24
	 * @�������� 
	 * @��������
	 */
	public boolean update() throws Exception;
	
	/**
	 * ��ѯ�������
	 */
	public List query() throws Exception;
	public boolean update1() throws Exception;
	public boolean delete() throws Exception;
}
