package cn.sdut.web.c2.impl;

import cn.sdut.web.c2.C2020Support;

public class C2023Action extends C2020Support
{

    @Override
    public String execute() throws Exception
    {
        this.c2020Services.getInstance();
        return "main";
    }
    
}
