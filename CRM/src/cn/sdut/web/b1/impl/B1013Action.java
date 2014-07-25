package cn.sdut.web.b1.impl;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.sdut.web.b1.B1010Support;

public class B1013Action extends B1010Support
{

    @Override
    public String execute() throws Exception
    {
        this.msg=this.b1010Services.resetPwd()?"重置成功！":"重置失败！";
        List rows = this.getB1010Services().query();
        if (rows.size() > 0)
        {
            this.rows = rows;
            String pageinfo=this.getB1010Services().getPageInfo("c1011Action");
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
