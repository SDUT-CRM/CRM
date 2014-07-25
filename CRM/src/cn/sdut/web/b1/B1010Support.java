package cn.sdut.web.b1;

import java.util.List;
import java.util.Map;

import cn.sdut.services.B1010Services;
import cn.sdut.system.Tools;

public abstract class B1010Support
{
    protected String msg;
    protected List rows;
    protected Map maps;
    protected B1010Services b1010Services;

    public abstract String execute() throws Exception;

    protected List oclg2105 = null;

    protected String cnlg0207;

    protected String lg2101;
    protected String lg2102;
    protected String lg2103;
    protected String lg2104;
    protected String lg2105;
    protected String lg0102;
    protected String lg0103;
    protected String lg0104;
    protected String lg0105;
    protected String lg0106;
    protected String lg0107;
    protected String lg0108;

    protected String qlg2102;
    protected String qlg0102;
    protected String qlg0103;
    protected String qlg0105;

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

    public B1010Services getB1010Services()
    {
        return b1010Services;
    }

    public void setB1010Services(B1010Services b1010Services)
    {
        this.b1010Services = b1010Services;
        this.b1010Services.setMapDto(Tools.describe());
    }

    public List getOclg2105()
    {
        return oclg2105;
    }

    public void setOclg2105(List oclg2105)
    {
        this.oclg2105 = oclg2105;
    }

    public String getCnlg0207()
    {
        return cnlg0207;
    }

    public void setCnlg0207(String cnlg0207)
    {
        this.cnlg0207 = cnlg0207;
    }

    public String getLg2101()
    {
        return lg2101;
    }

    public void setLg2101(String lg2101)
    {
        this.lg2101 = lg2101;
    }

    public String getLg2102()
    {
        return lg2102;
    }

    public void setLg2102(String lg2102)
    {
        this.lg2102 = lg2102;
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

    public String getLg0102()
    {
        return lg0102;
    }

    public void setLg0102(String lg0102)
    {
        this.lg0102 = lg0102;
    }

    public String getLg0103()
    {
        return lg0103;
    }

    public void setLg0103(String lg0103)
    {
        this.lg0103 = lg0103;
    }

    public String getLg0104()
    {
        return lg0104;
    }

    public void setLg0104(String lg0104)
    {
        this.lg0104 = lg0104;
    }

    public String getLg0105()
    {
        return lg0105;
    }

    public void setLg0105(String lg0105)
    {
        this.lg0105 = lg0105;
    }

    public String getLg0106()
    {
        return lg0106;
    }

    public void setLg0106(String lg0106)
    {
        this.lg0106 = lg0106;
    }

    public String getLg0107()
    {
        return lg0107;
    }

    public void setLg0107(String lg0107)
    {
        this.lg0107 = lg0107;
    }

    public String getLg0108()
    {
        return lg0108;
    }

    public void setLg0108(String lg0108)
    {
        this.lg0108 = lg0108;
    }

    public String getQlg2102()
    {
        return qlg2102;
    }

    public void setQlg2102(String qlg2102)
    {
        this.qlg2102 = qlg2102;
    }

    public String getQlg0102()
    {
        return qlg0102;
    }

    public void setQlg0102(String qlg0102)
    {
        this.qlg0102 = qlg0102;
    }

    public String getQlg0103()
    {
        return qlg0103;
    }

    public void setQlg0103(String qlg0103)
    {
        this.qlg0103 = qlg0103;
    }

    public String getQlg0105()
    {
        return qlg0105;
    }

    public void setQlg0105(String qlg0105)
    {
        this.qlg0105 = qlg0105;
    }

    private void initMain() throws Exception
    {
        this.oclg2105 = Tools.getOptions("LLG03");
    }

}
