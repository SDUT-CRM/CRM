package cn.sdut.web.c4.impl;

import java.util.Map;

import cn.sdut.web.c4.C4040Support;

import com.opensymphony.xwork2.ActionContext;

public class C4041Action extends C4040Support
{

    @Override
    public String execute() throws Exception
    {
        ActionContext actionContext = ActionContext.getContext();
        Map map=actionContext.getSession();
        if(begintime!=null&&!begintime.equals(""))
        {
            map.put("begintime", begintime);
        }
        else{map.put("begintime", "");}
        if(endtime!=null&&!endtime.equals(""))
        {
            map.put("endtime", endtime);
        }else{map.put("endtime", "");}
        return "main";
    }

}
