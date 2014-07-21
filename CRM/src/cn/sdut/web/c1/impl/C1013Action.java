package cn.sdut.web.c1.impl;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.c1.C1010Support;

public class C1013Action extends C1010Support
{

    @Override
    public String execute() throws Exception
    {
        this.maps = this.c1010Services.getEmployee();
        BeanUtils.populate(this, maps);
        System.out.println(maps);
        return "main";
    }

}
