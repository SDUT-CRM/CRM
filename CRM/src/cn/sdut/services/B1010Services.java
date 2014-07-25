package cn.sdut.services;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface B1010Services
{
    @Transactional
    public boolean addCustomer() throws Exception;
    /**
     * 
     * @函数名  lock
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-25
     * @更新日期 
     * @更新内容
     */
    public boolean lock() throws Exception;
    
    /**
     * 
     * @函数名  resetPwd
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-25
     * @更新日期 
     * @更新内容
     */
    public boolean resetPwd()throws Exception;
    /**
     * 
     * @函数名  setMapDto
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-25
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
