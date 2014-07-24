package cn.sdut.web.c2.impl;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.web.c2.C2030Support;

public class C2032Action extends C2030Support
{

    @Override
    public String execute() throws Exception
    {
        this.maps=this.c2021Services.getInstance();
        BeanUtils.populate(this, maps);
        return "main";
    }

}
