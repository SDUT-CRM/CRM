package cn.sdut.web.b1;

import java.util.List;
import java.util.Map;

import cn.sdut.system.Tools;

public abstract class B1010Support
{
    protected String msg;
    protected List rows;
    protected Map maps;
    public  abstract String execute()throws Exception;
    protected List oclg2105=null;
    
    
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
    
    
    
    
    
    
    private void initMain() throws Exception
    {
        this.oclg2105=Tools.getOptions("LLG03");
    }

}
