package cn.sdut.web.c2.impl;

import cn.sdut.web.c2.C2020Support;

public class C2024Action extends C2020Support
{

    @Override
    public String execute() throws Exception
    {
        msg=this.c2020Services.update()?"���³ɹ���":"����ʧ�ܣ�";
        return "main";
    }

}
