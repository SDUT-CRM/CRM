package cn.sdut.web.c2.impl;

import cn.sdut.web.c2.C2030Support;

public class C2035Action extends C2030Support
{

    @Override
    public String execute() throws Exception
    {
        this.msg=this.c2021Services.add()?"添加成功！":"添加失败！";
        return "main";
    }

}
