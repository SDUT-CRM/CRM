package cn.sdut.web.c1;

import java.util.List;

import cn.sdut.services.C1010Services;
import cn.sdut.system.Tools;

public abstract class C1010Support
{
    public  abstract String execute()throws Exception;
    protected C1010Services c1010Services;
    protected String msg;
    protected List rows;
    
    protected List oclg0401=null;
    protected List oclg0207=null;
    protected String qlg0401;
    protected String qlg0207;
    
    
    public String getQlg0401()
    {
        return qlg0401;
    }
    public void setQlg0401(String qlg0401)
    {
        this.qlg0401 = qlg0401;
    }
    public String getQlg0207()
    {
        return qlg0207;
    }
    public void setQlg0207(String qlg0207)
    {
        this.qlg0207 = qlg0207;
    }
    public List getOclg0401()
    {
        return oclg0401;
    }
    public void setOclg0401(List oclg0401)
    {
        this.oclg0401 = oclg0401;
    }
    public List getOclg0207()
    {
        return oclg0207;
    }
    public void setOclg0207(List oclg0207)
    {
        this.oclg0207 = oclg0207;
    }
    public List getRows()
    {
        return rows;
    }
    public void setRows(List rows)
    {
        this.rows = rows;
    }
    public String getMsg()
    {
        return msg;
    }
    public void setMsg(String msg)
    {
        this.msg = msg;
    }
    public C1010Services getC1010Services()
    {
        this.c1010Services.setMapDto(Tools.describe());
        return c1010Services;
    }
    public void setC1010Services(C1010Services c1010Services)
    {
        this.c1010Services = c1010Services;
    }
    protected String lg2102;//员工编号
    protected String lg0401;//员工部门
    protected String lg0202;//员工姓名
    protected String lg0207;//员工状态
    protected String blg0208;
    protected String elg0208;
    public String getLg2102()
    {
        return lg2102;
    }
    public void setLg2102(String lg2102)
    {
        this.lg2102 = lg2102;
    }
    public String getLg0401()
    {
        return lg0401;
    }
    public void setLg0401(String lg0401)
    {
        this.lg0401 = lg0401;
    }
    public String getLg0202()
    {
        return lg0202;
    }
    public void setLg0202(String lg0202)
    {
        this.lg0202 = lg0202;
    }
    public String getLg0207()
    {
        return lg0207;
    }
    public void setLg0207(String lg0207)
    {
        this.lg0207 = lg0207;
    }
    public String getBlg0208()
    {
        return blg0208;
    }
    public void setBlg0208(String blg0208)
    {
        this.blg0208 = blg0208;
    }
    public String getElg0208()
    {
        return elg0208;
    }
    public void setElg0208(String elg0208)
    {
        this.elg0208 = elg0208;
    }
    
}
