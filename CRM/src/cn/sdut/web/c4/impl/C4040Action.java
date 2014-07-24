package cn.sdut.web.c4.impl;

import java.util.Map;

import cn.sdut.web.c4.C4040Support;

import com.opensymphony.xwork2.ActionContext;

public class C4040Action extends C4040Support
{

    @Override
    public String execute() throws Exception
    {
        ActionContext actionContext = ActionContext.getContext();
        Map map = actionContext.getSession();
        Object begintime = map.get("begintime");
        Object endtime = map.get("endtime");
        if (begintime != null && !begintime.equals(""))
        {
            this.c4040Services.getMapDto().put("begintime", begintime);
        }
        if(endtime!=null&&!endtime.equals(""))
        {
            this.c4040Services.getMapDto().put("endtime", endtime);
        }
        if(map.get("cha")!=null)
        chart = this.c4040Services.getChart();
        map.put("cha", "1");
        return "main";
    }

}
