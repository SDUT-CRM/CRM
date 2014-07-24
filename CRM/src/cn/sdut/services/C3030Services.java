package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface C3030Services
{
    public String getPageInfo2(String url) throws Exception;
    public List getActivity()throws Exception;
    /**
     * 
     * @������  updateStatus
     * @����˵�� 
     * @����ֵ  
     * @����˵�� 
     * @����    
     * @�������� 2014-7-24
     * @�������� 
     * @��������
     */
    public boolean updateStatus()throws Exception;
    /**
     * 
     * @������  setMapDto
     * @����˵�� 
     * @����ֵ  
     * @����˵�� 
     * @����    
     * @�������� 2014-7-24
     * @�������� 
     * @��������
     */
    public void setMapDto(Map dto);
    
    /**
     * 
     * @������  getPageInfo
     * @����˵�� 
     * @����ֵ  
     * @����˵�� 
     * @����    
     * @�������� 2014-7-23
     * @�������� 
     * @��������
     */
    public String getPageInfo(String url);
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
    public List query()throws Exception;
    /**
     * 
     * @������  batchModify
     * @����˵�� 
     * @����ֵ  
     * @����˵�� 
     * @����    
     * @�������� 2014-7-23
     * @�������� 
     * @��������
     */
    public boolean batchModify()throws Exception;
    /**
     * 
     * @������  getInstance
     * @����˵�� 
     * @����ֵ  
     * @����˵�� 
     * @����    
     * @�������� 2014-7-23
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
     * @�������� 2014-7-23
     * @�������� 
     * @��������
     */
    public boolean update() throws Exception;

}
