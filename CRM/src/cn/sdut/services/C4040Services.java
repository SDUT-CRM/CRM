package cn.sdut.services;

import java.util.Map;

import org.jfree.chart.JFreeChart;

public interface C4040Services
{
    public void setMapDto(Map dto);
    /**
     * 
     * @������  calForms
     * @����˵�� 
     * @����ֵ  
     * @����˵�� 
     * @����    
     * @�������� 2014-7-23
     * @�������� 
     * @��������
     */
    public void calForms() throws Exception;
    public JFreeChart getChart() throws Exception;
}
