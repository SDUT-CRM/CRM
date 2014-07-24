package cn.sdut.web.c4;

import org.jfree.chart.JFreeChart;

import cn.sdut.services.C4040Services;
import cn.sdut.system.Tools;

public abstract class C4040Support
{
    protected C4040Services c4040Services;
    public abstract String execute()throws Exception;
    protected JFreeChart chart;
    protected String begintime;
    protected String endtime;
    
    public String getBegintime()
    {
        return begintime;
    }
    
    public void setBegintime(String begintime)
    {
        this.begintime = begintime;
    }
    public String getEndtime()
    {
        return endtime;
    }
    public void setEndtime(String endtime)
    {
        this.endtime = endtime;
    }
    public JFreeChart getChart()
    {
        return chart;
    }
    public void setChart(JFreeChart chart)
    {
        this.chart = chart;
    }
    public C4040Services getC4040Services()
    {
        return c4040Services;
    }
    public void setC4040Services(C4040Services c4040Services)
    {
        this.c4040Services = c4040Services;
        this.c4040Services.setMapDto(Tools.describe());
    }
    
}
