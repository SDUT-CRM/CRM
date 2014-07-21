package cn.sdut.web.c1;

import java.util.List;

import cn.sdut.services.C1010Services;

public abstract class C1010Support
{
    public  abstract String execute()throws Exception;
    private C1010Services c1010Services;
    private String msg;
    private List rows;
    
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
        return c1010Services;
    }
    public void setC1010Services(C1010Services c1010Services)
    {
        this.c1010Services = c1010Services;
    }
    private String lg2102;//员工编号
    private String lg0401;//员工部门
    private String lg0202;//员工姓名
    private String lg0207;//员工状态
    private String blg0208;
    private String elg0208;
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
