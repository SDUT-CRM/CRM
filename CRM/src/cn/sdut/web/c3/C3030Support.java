package cn.sdut.web.c3;

import java.util.List;
import java.util.Map;

import cn.sdut.services.C3030Services;
import cn.sdut.system.Tools;


/**
 * 
 * @功能说明:
 * @作者   :Ming
 * @创建日期:2014-7-23
 * @更新日期:
 * @更新内容:
 */
public abstract class C3030Support
{
    
    public abstract String execute() throws Exception;
    
    
    protected String msg;
    protected List rows;
    protected Map maps;
    protected C3030Services c3030Services;
    
    protected List oclg0707;
    
    protected String qlg0702;
    protected String qlg0703;
    protected String qlg0302;
    protected String qlg0707;
    protected String blg0706;
    protected String elg0706;
    protected String blg0708;
    protected String elg0708;
    
    protected String lg0301;
    protected String lg0302;
    protected String lg0702;
    protected String lg0703;
    protected String lg0704;
    protected String lg0705;
    protected String lg0706;
    protected String lg0707;
    protected String lg0708;
    protected String lg0709;
    protected String lg0710;
    protected String lg0701;
    
    
    protected String cnlg0707;

    
    
    
    
    
    
    
    public String getLg0701()
    {
        return lg0701;
    }




    public void setLg0701(String lg0701)
    {
        this.lg0701 = lg0701;
    }




    public String getQlg0703()
    {
        return qlg0703;
    }




    public void setQlg0703(String qlg0703)
    {
        this.qlg0703 = qlg0703;
    }




    public String getQlg0302()
    {
        return qlg0302;
    }




    public void setQlg0302(String qlg0302)
    {
        this.qlg0302 = qlg0302;
    }




    public String getQlg0707()
    {
        return qlg0707;
    }




    public void setQlg0707(String qlg0707)
    {
        this.qlg0707 = qlg0707;
    }




    public String getBlg0706()
    {
        return blg0706;
    }




    public void setBlg0706(String blg0706)
    {
        this.blg0706 = blg0706;
    }




    public String getElg0706()
    {
        return elg0706;
    }




    public void setElg0706(String elg0706)
    {
        this.elg0706 = elg0706;
    }




    public String getBlg0708()
    {
        return blg0708;
    }




    public void setBlg0708(String blg0708)
    {
        this.blg0708 = blg0708;
    }




    public String getElg0708()
    {
        return elg0708;
    }




    public void setElg0708(String elg0708)
    {
        this.elg0708 = elg0708;
    }




    private void initMain() throws Exception
    {
        this.oclg0707=Tools.getOptions("LG0707");
    }
    
    
    
    
    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public List getRows()
    {
        return rows;
    }

    public void setRows(List rows)
    {
        this.rows = rows;
    }

    public Map getMaps()
    {
        return maps;
    }

    public void setMaps(Map maps)
    {
        this.maps = maps;
    }

    public C3030Services getC3030Services()
    {
        return c3030Services;
    }

    public void setC3030Services(C3030Services c3030Services)
    {
        this.c3030Services = c3030Services;
        this.c3030Services.setMapDto(Tools.describe());
        
    }

    public List getOclg0707()
    {
        return oclg0707;
    }

    public void setOclg0707(List oclg0707)
    {
        this.oclg0707 = oclg0707;
    }

    public String getQlg0702()
    {
        return qlg0702;
    }

    public void setQlg0702(String qlg0702)
    {
        this.qlg0702 = qlg0702;
    }

    public String getLg0301()
    {
        return lg0301;
    }

    public void setLg0301(String lg0301)
    {
        this.lg0301 = lg0301;
    }

    public String getLg0302()
    {
        return lg0302;
    }

    public void setLg0302(String lg0302)
    {
        this.lg0302 = lg0302;
    }

    public String getLg0702()
    {
        return lg0702;
    }

    public void setLg0702(String lg0702)
    {
        this.lg0702 = lg0702;
    }

    public String getLg0703()
    {
        return lg0703;
    }

    public void setLg0703(String lg0703)
    {
        this.lg0703 = lg0703;
    }

    public String getLg0704()
    {
        return lg0704;
    }

    public void setLg0704(String lg0704)
    {
        this.lg0704 = lg0704;
    }

    public String getLg0705()
    {
        return lg0705;
    }

    public void setLg0705(String lg0705)
    {
        this.lg0705 = lg0705;
    }

    public String getLg0706()
    {
        return lg0706;
    }

    public void setLg0706(String lg0706)
    {
        this.lg0706 = lg0706;
    }

    public String getLg0707()
    {
        return lg0707;
    }

    public void setLg0707(String lg0707)
    {
        this.lg0707 = lg0707;
    }

    public String getLg0708()
    {
        return lg0708;
    }

    public void setLg0708(String lg0708)
    {
        this.lg0708 = lg0708;
    }

    public String getLg0709()
    {
        return lg0709;
    }

    public void setLg0709(String lg0709)
    {
        this.lg0709 = lg0709;
    }

    public String getLg0710()
    {
        return lg0710;
    }

    public void setLg0710(String lg0710)
    {
        this.lg0710 = lg0710;
    }

    public String getCnlg0707()
    {
        return cnlg0707;
    }

    public void setCnlg0707(String cnlg0707)
    {
        this.cnlg0707 = cnlg0707;
    }
    
    
    
}
