package cn.sdut.web.c1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.system.Tools;
import cn.sdut.web.c1.C1010Support;

public class C1010Action extends C1010Support
{

    @Override
    public String execute() throws Exception
    {
        this.oclg0401=Tools.getOptions("LLG02");
        this.oclg0207=Tools.getOptions("LLG01");
        List rows = this.getC1010Services().query();
        if (rows.size() > 0)
        {
            this.rows = rows;
            String pageinfo=this.getC1010Services().getPageInfo("c1010Action");
            Map request=(Map)ActionContext.getContext().get("request");
            request.put("pageinfo", pageinfo);
        }
        else
        {
            this.rows=null;
            this.msg="没有符合条件的数据!";
        }   
        return "main";
    }

}
