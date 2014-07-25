package cn.sdut.web.c5;

import java.util.List;

import cn.sdut.services.C5050Services;
import cn.sdut.system.Tools;

public abstract class C5050Support
{
    
    
    
    public abstract String execute()throws Exception;
    protected C5050Services c5050Services;
    protected String msg;
    
    protected String qlg0202;
    protected String blg1605;
    protected String elg1605;
    
    protected String lg1601;
    protected String lg0201;
    protected String lg0202;
    protected String lg0301;
    protected String lg0302;
    protected String lg1501;
    protected String lg1503;
    protected String cnlg1503;
    protected String lg1603;
    protected String cnlg1603;
    protected String lg1604;
    protected String lg1605;
    protected String lg1606;
    
    
    protected List rows;
    
    
    public List getRows()
    {
        return rows;
    }
    public void setRows(List rows)
    {
        this.rows = rows;
    }
    public String getQlg0202()
    {
        return qlg0202;
    }
    public void setQlg0202(String qlg0202)
    {
        this.qlg0202 = qlg0202;
    }
    public String getBlg1605()
    {
        return blg1605;
    }
    public void setBlg1605(String blg1605)
    {
        this.blg1605 = blg1605;
    }
    public String getElg1605()
    {
        return elg1605;
    }
    public void setElg1605(String elg1605)
    {
        this.elg1605 = elg1605;
    }
    public C5050Services getC5050Services()
    {
        return c5050Services;
    }
    public void setC5050Services(C5050Services c5050Services)
    {
        this.c5050Services = c5050Services;
        this.c5050Services.setMapDto(Tools.describe());
    }
    public String getMsg()
    {
        return msg;
    }
    public void setMsg(String msg)
    {
        this.msg = msg;
    }
    public String getLg1601()
    {
        return lg1601;
    }
    public void setLg1601(String lg1601)
    {
        this.lg1601 = lg1601;
    }
    public String getLg0201()
    {
        return lg0201;
    }
    public void setLg0201(String lg0201)
    {
        this.lg0201 = lg0201;
    }
    public String getLg0202()
    {
        return lg0202;
    }
    public void setLg0202(String lg0202)
    {
        this.lg0202 = lg0202;
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
    public String getLg1501()
    {
        return lg1501;
    }
    public void setLg1501(String lg1501)
    {
        this.lg1501 = lg1501;
    }
    public String getLg1503()
    {
        return lg1503;
    }
    public void setLg1503(String lg1503)
    {
        this.lg1503 = lg1503;
    }
    public String getCnlg1503()
    {
        return cnlg1503;
    }
    public void setCnlg1503(String cnlg1503)
    {
        this.cnlg1503 = cnlg1503;
    }
    public String getLg1603()
    {
        return lg1603;
    }
    public void setLg1603(String lg1603)
    {
        this.lg1603 = lg1603;
    }
    public String getCnlg1603()
    {
        return cnlg1603;
    }
    public void setCnlg1603(String cnlg1603)
    {
        this.cnlg1603 = cnlg1603;
    }
    public String getLg1604()
    {
        return lg1604;
    }
    public void setLg1604(String lg1604)
    {
        this.lg1604 = lg1604;
    }
    public String getLg1605()
    {
        return lg1605;
    }
    public void setLg1605(String lg1605)
    {
        this.lg1605 = lg1605;
    }
    public String getLg1606()
    {
        return lg1606;
    }
    public void setLg1606(String lg1606)
    {
        this.lg1606 = lg1606;
    }
    
    

}
