package cn.sdut.web.c5.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.web.c5.C5050Support;

public class C5052Action extends C5050Support
{

    @Override
    public String execute() throws Exception
    {
        this.msg=this.c5050Services.batchUpdate()?"操作成功！":"操作失败！";
        List rows=this.c5050Services.query();
        if (rows.size() > 0)
        {
            this.rows = rows;
            String pageinfo=this.getC5050Services().getPageInfo("c5051Action");
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
