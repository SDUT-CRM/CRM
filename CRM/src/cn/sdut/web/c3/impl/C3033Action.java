package cn.sdut.web.c3.impl;

import cn.sdut.web.c3.C3030Support;

public class C3033Action extends C3030Support
{

    @Override
    public String execute() throws Exception
    {
        this.msg=this.c3030Services.add()?"��ӳɹ���":"���ʧ�ܣ�";
        return "main";
    }

}
