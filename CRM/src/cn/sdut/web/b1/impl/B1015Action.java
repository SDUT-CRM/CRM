package cn.sdut.web.b1.impl;

import cn.sdut.web.b1.B1010Support;

public class B1015Action extends B1010Support
{

    @Override
    public String execute() throws Exception
    {
        this.msg=this.b1010Services.addCustomer()?"添加用户成功！":"操作失败！";
        return "main";
    }

}
