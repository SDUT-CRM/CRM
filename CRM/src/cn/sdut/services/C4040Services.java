package cn.sdut.services;

import java.util.Map;

import org.jfree.chart.JFreeChart;

public interface C4040Services
{
    public void setMapDto(Map dto);
    /**
     * 
     * @函数名  calForms
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-23
     * @更新日期 
     * @更新内容
     */
    public void calForms() throws Exception;
    public JFreeChart getChart() throws Exception;
}
