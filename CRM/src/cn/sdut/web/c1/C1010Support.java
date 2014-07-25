package cn.sdut.web.c1;

import java.util.List;
import java.util.Map;

import cn.sdut.services.C1010Services;
import cn.sdut.system.Tools;

public abstract class C1010Support
{
    public  abstract String execute()throws Exception;
    protected C1010Services c1010Services;
    protected String msg;
    protected List rows;
    protected Map maps;
    
    protected List oclg0401=null;
    protected List oclg0207=null;
    protected List oclg2105=null;
    protected String qlg0401;
    protected String qlg0207;
    protected String qlg2102;//员工编号
    protected String qlg0202;//员工姓名
    protected String blg0208;
    protected String elg0208;
    
    protected String lg2101;
    protected String lg2102;
    protected String lg2103;
    protected String lg2104;
    protected String lg2105;
    protected String lg0202;
    protected String lg0203;
    protected String lg0204;
    protected String lg0205;
    protected String lg0206;
    protected String lg0207;
    protected String lg0208;
    protected String lg0209;
    protected String lg0401;
    
    protected String cnlg2105;
    protected String cnlg0401;
    protected String cnlg0207;
    
    
    
    public String getLg2101()
    {
        return lg2101;
    }

    public void setLg2101(String lg2101)
    {
        this.lg2101 = lg2101;
    }

    public List getOclg2105()
    {
        return oclg2105;
    }

    public void setOclg2105(List oclg2105)
    {
        this.oclg2105 = oclg2105;
    }

    public String getCnlg2105()
    {
        return cnlg2105;
    }

    public void setCnlg2105(String cnlg2105)
    {
        this.cnlg2105 = cnlg2105;
    }

    public String getCnlg0401()
    {
        return cnlg0401;
    }

    public void setCnlg0401(String cnlg0401)
    {
        this.cnlg0401 = cnlg0401;
    }

    public String getCnlg0207()
    {
        return cnlg0207;
    }

    public void setCnlg0207(String cnlg0207)
    {
        this.cnlg0207 = cnlg0207;
    }

    public Map getMaps()
    {
        return maps;
    }

    public void setMaps(Map maps)
    {
        this.maps = maps;
    }

    private void initEdit2() throws Exception
    {
        this.oclg0401=Tools.getOptions("LLG02");
        this.oclg0207=Tools.getOptions("LLG01");
        this.oclg2105=Tools.getOptions("LLG03");
    }
    
    private void initMain() throws Exception
    {
        this.oclg0401=Tools.getOptions("LLG02");
        this.oclg0207=Tools.getOptions("LLG01");
    }
    
    private void initEdit() throws Exception
    {
        this.oclg0401=Tools.getOptions("LLG02");
    }
    
    
    public String getLg2103()
    {
        return lg2103;
    }
    public void setLg2103(String lg2103)
    {
        this.lg2103 = lg2103;
    }
    public String getLg2104()
    {
        return lg2104;
    }
    public void setLg2104(String lg2104)
    {
        this.lg2104 = lg2104;
    }
    public String getLg2105()
    {
        return lg2105;
    }
    public void setLg2105(String lg2105)
    {
        this.lg2105 = lg2105;
    }
    public String getLg0203()
    {
        return lg0203;
    }
    public void setLg0203(String lg0203)
    {
        this.lg0203 = lg0203;
    }
    public String getLg0204()
    {
        return lg0204;
    }
    public void setLg0204(String lg0204)
    {
        this.lg0204 = lg0204;
    }
    public String getLg0205()
    {
        return lg0205;
    }
    public void setLg0205(String lg0205)
    {
        this.lg0205 = lg0205;
    }
    public String getLg0206()
    {
        return lg0206;
    }
    public void setLg0206(String lg0206)
    {
        this.lg0206 = lg0206;
    }
    public String getLg0207()
    {
        return lg0207;
    }
    public void setLg0207(String lg0207)
    {
        this.lg0207 = lg0207;
    }
    public String getLg0208()
    {
        return lg0208;
    }
    public void setLg0208(String lg0208)
    {
        this.lg0208 = lg0208;
    }
    public String getLg0209()
    {
        return lg0209;
    }
    public void setLg0209(String lg0209)
    {
        this.lg0209 = lg0209;
    }
    public String getLg0401()
    {
        return lg0401;
    }
    public void setLg0401(String lg0401)
    {
        this.lg0401 = lg0401;
    }
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
        return c1010Services;
    }
    public void setC1010Services(C1010Services c1010Services)
    {
        this.c1010Services = c1010Services;
        this.c1010Services.setMapDto(Tools.describe());
    }

    public String getLg2102()
    {
        return lg2102;
    }
    public void setLg2102(String lg2102)
    {
        this.lg2102 = lg2102;
    }
    
    public String getLg0202()
    {
        return lg0202;
    }
    public void setLg0202(String lg0202)
    {
        this.lg0202 = lg0202;
    }
    
    public String getQlg2102()
    {
        return qlg2102;
    }
    public void setQlg2102(String qlg2102)
    {
        this.qlg2102 = qlg2102;
    }
    public String getQlg0202()
    {
        return qlg0202;
    }
    public void setQlg0202(String qlg0202)
    {
        this.qlg0202 = qlg0202;
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
