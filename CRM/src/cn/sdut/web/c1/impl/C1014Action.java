package cn.sdut.web.c1.impl;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.c1.C1010Support;

public class C1014Action extends C1010Support
{

    @Override
    public String execute() throws Exception
    {
        BeanUtils.populate(this, this.maps);
        this.msg=this.c1010Services.updateEmployee()?"更新成功！":"网络故障！";
        return "main";
    }

}
