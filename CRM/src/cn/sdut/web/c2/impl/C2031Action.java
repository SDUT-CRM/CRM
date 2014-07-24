package cn.sdut.web.c2.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.web.c2.C2030Support;

import com.opensymphony.xwork2.ActionContext;

public class C2031Action extends C2030Support
{

    @Override
    public String execute() throws Exception
    {
        List rows=this.c2021Services.query();
        if (rows.size() > 0)
        {
            this.rows = rows;
            String pageinfo=this.getC2021Services().getPageInfo("c2031Action");
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
