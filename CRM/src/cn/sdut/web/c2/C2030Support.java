package cn.sdut.web.c2;

import java.util.List;
import java.util.Map;

import cn.sdut.services.C2021Services;

public abstract class C2030Support
{
    public abstract String execute() throws Exception;

    protected String msg;
    protected List rows;
    protected Map maps;
    
    protected C2021Services c2021Services;
    
    protected String lg1301;
    protected String lg1302;
    protected String lg1303;
    protected String lg1304;
    protected String lg1305;
    protected String lg1306;
    
    protected String qlg1302;
    protected String qlg1303;
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
    public C2021Services getC2021Services()
    {
        return c2021Services;
    }
    public void setC2021Services(C2021Services c2021Services)
    {
        this.c2021Services = c2021Services;
    }
    public String getLg1301()
    {
        return lg1301;
    }
    public void setLg1301(String lg1301)
    {
        this.lg1301 = lg1301;
    }
    public String getLg1302()
    {
        return lg1302;
    }
    public void setLg1302(String lg1302)
    {
        this.lg1302 = lg1302;
    }
    public String getLg1303()
    {
        return lg1303;
    }
    public void setLg1303(String lg1303)
    {
        this.lg1303 = lg1303;
    }
    public String getLg1304()
    {
        return lg1304;
    }
    public void setLg1304(String lg1304)
    {
        this.lg1304 = lg1304;
    }
    public String getLg1305()
    {
        return lg1305;
    }
    public void setLg1305(String lg1305)
    {
        this.lg1305 = lg1305;
    }
    public String getLg1306()
    {
        return lg1306;
    }
    public void setLg1306(String lg1306)
    {
        this.lg1306 = lg1306;
    }
    public String getQlg1302()
    {
        return qlg1302;
    }
    public void setQlg1302(String qlg1302)
    {
        this.qlg1302 = qlg1302;
    }
    public String getQlg1303()
    {
        return qlg1303;
    }
    public void setQlg1303(String qlg1303)
    {
        this.qlg1303 = qlg1303;
    }
    
    
    

}
