package cn.sdut.services.impl;

import java.awt.Font;
import java.util.List;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.persistence.dao.interfaces.Lg16Dao;
import cn.sdut.services.C4040Services;

public class C4040ServicesImpl implements C4040Services
{
    private Lg06Dao lg06Dao;
    private Lg16Dao lg16Dao;
    private Map dto;
    private Double cb=0d;
    private Double price=0d;
    private Double bx=0d;
    private Double lr=0d;
    
    public Map getDto()
    {
        return dto;
    }

    public void setDto(Map dto)
    {
        this.dto = dto;
    }

    public Double getCb()
    {
        return cb;
    }

    public void setCb(Double cb)
    {
        this.cb = cb;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double price)
    {
        this.price = price;
    }

    public Double getBx()
    {
        return bx;
    }

    public void setBx(Double bx)
    {
        this.bx = bx;
    }

    public Double getLr()
    {
        return lr;
    }

    public void setLr(Double lr)
    {
        this.lr = lr;
    }

    public JFreeChart getjFreeChart()
    {
        return jFreeChart;
    }

    public void setjFreeChart(JFreeChart jFreeChart)
    {
        this.jFreeChart = jFreeChart;
    }

    public Lg06Dao getLg06Dao()
    {
        return lg06Dao;
    }

    public void setLg06Dao(Lg06Dao lg06Dao)
    {
        this.lg06Dao = lg06Dao;
    }

    public Lg16Dao getLg16Dao()
    {
        return lg16Dao;
    }

    public void setLg16Dao(Lg16Dao lg16Dao)
    {
        this.lg16Dao = lg16Dao;
    }
    private JFreeChart jFreeChart;
    @Override
    public void calForms() throws Exception
    {
        //成本blg0604
        //报销blg1605
        Object begintime=this.dto.get("begintime");
        if(begintime!=null&&begintime.equals(""))
        {
            this.dto.put("blg0604", begintime);
            this.dto.put("blg1605", begintime);
        }
        Object endtime=this.dto.get("endtime");
        if(endtime!=null&&endtime.equals(""))
        {
            
            this.dto.put("elg0604", endtime);
            this.dto.put("elg1605", endtime);
            
        }
        
        List list1=this.lg06Dao.queryForForms();
        List list2=this.lg16Dao.queryForForms();
        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("begin="+begintime+",end="+endtime);
        System.out.println(dto);
        for(int i=0;i<list1.size();i++)
        {
            cb+=Double.parseDouble(((Map)list1.get(i)).get("lg0505").toString());
            price+=Double.parseDouble(((Map)list1.get(i)).get("lg0506").toString());
        }
        for(int i=0;i<list2.size();i++)
        {
            bx+=Double.parseDouble(((Map)list2.get(i)).get("lg1606").toString());
        }
        this.lg16Dao.queryForForms();
        lr=price-cb-bx;
        System.out.println("cb="+cb+",price="+price+",bx="+bx+",lr="+lr);
       
    }
    
    
    @Override
    public JFreeChart getChart() throws Exception {
        calForms();
        jFreeChart = ChartFactory.createPieChart3D("运营状况统计图", getDataset(), true, true, false);
        jFreeChart.setTitle(new TextTitle("运营状况统计图",
                new Font("黑体", Font.ITALIC, 22)));
        LegendTitle legend = jFreeChart.getLegend();
        legend.setItemFont(new Font("宋体", Font.BOLD, 14));
        PiePlot plot = (PiePlot) jFreeChart.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{2}"));
        plot.setLabelFont(new Font("隶书", Font.BOLD, 18));
        return jFreeChart;
    }
    
    private DefaultPieDataset getDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        int per_cb=(int)(cb/price*100);
        int per_fy=(int)(bx/price*100);
        int per_lr=(int)(lr/price*100);
        System.out.println(per_cb+" "+per_fy+" "+per_lr);
        
        dataset.setValue("利润", per_lr);
        dataset.setValue("成本", per_cb);
        dataset.setValue("费用", per_fy);
        return dataset;
    }

    @Override
    public void setMapDto(Map dto)
    {
        this.dto=dto;
        this.lg06Dao.setMapDto(dto);
        this.lg16Dao.setMapDto(dto);
    }
}
