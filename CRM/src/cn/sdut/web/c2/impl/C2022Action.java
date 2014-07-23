package cn.sdut.web.c2.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.web.c2.C2020Support;

public class C2022Action extends C2020Support
{

    @Override
    public String execute() throws Exception
    {
        msg=this.c2020Services.batchModify()?"更新成功！":"更新失败!";
        List rows=this.c2020Services.query();
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
        return "main";
    }

}
