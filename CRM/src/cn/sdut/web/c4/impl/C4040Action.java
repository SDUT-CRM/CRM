package cn.sdut.web.c4.impl;

import org.jfree.chart.JFreeChart;

import cn.sdut.web.c4.C4040Support;

public class C4040Action extends C4040Support
{

    @Override
    public String execute() throws Exception
    {
        chart=this.c4040Services.getChart();
        return "main";
    }
    
}
