package cn.sdut.web.c3.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.web.c3.C3030Support;

public class C3041Action extends C3030Support
{
    @Override
    public String execute() throws Exception
    {
        msg=this.c3030Services.updateStatus()?"更新成功！":"更新失败！";
        List rows=this.c3030Services.getActivity();
        if (rows.size() > 0)
        {
            this.rows = rows;
            String pageinfo=this.getC3030Services().getPageInfo2("c3040Action");
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
