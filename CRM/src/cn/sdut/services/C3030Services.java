package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface C3030Services
{
    public String getPageInfo2(String url) throws Exception;
    public List getActivity()throws Exception;
    /**
     * 
     * @函数名  updateStatus
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-24
     * @更新日期 
     * @更新内容
     */
    public boolean updateStatus()throws Exception;
    /**
     * 
     * @函数名  setMapDto
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-24
     * @更新日期 
     * @更新内容
     */
    public void setMapDto(Map dto);
    
    /**
     * 
     * @函数名  getPageInfo
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-23
     * @更新日期 
     * @更新内容
     */
    public String getPageInfo(String url);
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
    public List query()throws Exception;
    /**
     * 
     * @函数名  batchModify
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-23
     * @更新日期 
     * @更新内容
     */
    public boolean batchModify()throws Exception;
    /**
     * 
     * @函数名  getInstance
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-23
     * @更新日期 
     * @更新内容
     */
    public Map getInstance() throws Exception;
    /**
     * 
     * @函数名  update
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-23
     * @更新日期 
     * @更新内容
     */
    public boolean update() throws Exception;

}
