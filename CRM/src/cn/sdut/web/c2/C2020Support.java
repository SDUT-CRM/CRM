package cn.sdut.web.c2;

import java.util.List;
import java.util.Map;

import cn.sdut.services.C2020Services;
import cn.sdut.system.Tools;

/**
 * @功能说明:
 * @作者   :
 * @创建日期:2014-7-22
 * @更新日期:
 * @更新内容:
 */
public abstract class C2020Support
{
    public abstract String execute() throws Exception;

    protected String msg;
    protected List rows;
    protected Map maps;
    protected C2020Services c2020Services;

    protected List oclg0402;
    protected List oclg1403;

    protected String lg1401;
    protected String lg0402;
    protected String lg2102;
    protected String lg0202;
    protected String lg1302;
    protected String lg1303;
    protected String lg1406;
    protected String lg1403;
    protected String lg0302;
    

    protected String cnlg1403;
    protected String cnlg0402;
    
    protected String qlg1302;
    protected String qlg1303;
    protected String qlg0402;
    protected String qlg1403;
    protected String qlg0202;
    protected String qlg0302;
    protected String blg1402;
    protected String elg1402;
    protected String blg1404;
    protected String elg1404;
    protected String blg1405;
    protected String elg1405;
    
    public String getQlg1403()
    {
        return qlg1403;
    }

    public void setQlg1403(String qlg1403)
    {
        this.qlg1403 = qlg1403;
    }

    private void initMain() throws Exception
    {
        this.oclg0402=Tools.getOptions("LLG02");
        this.oclg1403=Tools.getOptions("LLG04");
    }
    
    private void initEdit() throws Exception
    {
        this.oclg1403=Tools.getOptions("LLG04");
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

    public String getQlg0402()
    {
        return qlg0402;
    }

    public void setQlg0402(String qlg0402)
    {
        this.qlg0402 = qlg0402;
    }

    public String getQlg0202()
    {
        return qlg0202;
    }

    public void setQlg0202(String qlg0202)
    {
        this.qlg0202 = qlg0202;
    }

    public String getQlg0302()
    {
        return qlg0302;
    }

    public void setQlg0302(String qlg0302)
    {
        this.qlg0302 = qlg0302;
    }

    public String getBlg1402()
    {
        return blg1402;
    }

    public void setBlg1402(String blg1402)
    {
        this.blg1402 = blg1402;
    }

    public String getElg1402()
    {
        return elg1402;
    }

    public void setElg1402(String elg1402)
    {
        this.elg1402 = elg1402;
    }

    public String getBlg1404()
    {
        return blg1404;
    }

    public void setBlg1404(String blg1404)
    {
        this.blg1404 = blg1404;
    }

    public String getElg1404()
    {
        return elg1404;
    }

    public void setElg1404(String elg1404)
    {
        this.elg1404 = elg1404;
    }

    public String getBlg1405()
    {
        return blg1405;
    }

    public void setBlg1405(String blg1405)
    {
        this.blg1405 = blg1405;
    }

    public String getElg1405()
    {
        return elg1405;
    }

    public void setElg1405(String elg1405)
    {
        this.elg1405 = elg1405;
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

    public C2020Services getC2020Services()
    {
        return c2020Services;
    }

    public void setC2020Services(C2020Services c2020Services)
    {
        this.c2020Services = c2020Services;
        this.c2020Services.setMapDto(Tools.describe());
    }

    public List getOclg0402()
    {
        return oclg0402;
    }

    public void setOclg0402(List oclg0402)
    {
        this.oclg0402 = oclg0402;
    }

    public List getOclg1403()
    {
        return oclg1403;
    }

    public void setOclg1403(List oclg1403)
    {
        this.oclg1403 = oclg1403;
    }

    public String getLg1401()
    {
        return lg1401;
    }

    public void setLg1401(String lg1401)
    {
        this.lg1401 = lg1401;
    }

    public String getLg0402()
    {
        return lg0402;
    }

    public void setLg0402(String lg0402)
    {
        this.lg0402 = lg0402;
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

    public String getLg1406()
    {
        return lg1406;
    }

    public void setLg1406(String lg1406)
    {
        this.lg1406 = lg1406;
    }

    public String getLg1403()
    {
        return lg1403;
    }

    public void setLg1403(String lg1403)
    {
        this.lg1403 = lg1403;
    }

    public String getLg0302()
    {
        return lg0302;
    }

    public void setLg0302(String lg0302)
    {
        this.lg0302 = lg0302;
    }

    public String getCnlg1403()
    {
        return cnlg1403;
    }

    public void setCnlg1403(String cnlg1403)
    {
        this.cnlg1403 = cnlg1403;
    }

    public String getCnlg0402()
    {
        return cnlg0402;
    }

    public void setCnlg0402(String cnlg0402)
    {
        this.cnlg0402 = cnlg0402;
    }

}
