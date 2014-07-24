package cn.sdut.web.c2.impl;

import cn.sdut.web.c2.C2030Support;

public class C2033Action extends C2030Support
{

    @Override
    public String execute() throws Exception
    {
        this.msg=this.c2021Services.update()?"更新成功！":"更新失败！";
        return "main";
    }

}
