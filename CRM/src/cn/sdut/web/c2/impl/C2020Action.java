package cn.sdut.web.c2.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.web.c2.C2020Support;

public class C2020Action extends C2020Support
{

    @Override
    public String execute() throws Exception
    {
        List list=this.c2020Services.query();
        if (rows.size() > 0)
        {
            this.rows = rows;
            String pageinfo=this.getC2020Services().getPageInfo("c2020Action");
            Map request=(Map)ActionContext.getContext().get("request");
            request.put("pageinfo", pageinfo);
        }
        else
        {
            this.rows=null;
            this.msg="没有符合条件的数据!";
        }   
        return null;
    }

}
