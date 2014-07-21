package cn.sdut.web.c1.impl;

import cn.sdut.system.Tools;
import cn.sdut.web.c1.C1010Support;

public class C1011Action extends C1010Support
{
    

    @Override
    public String execute() throws Exception
    {
        this.oclg0401=Tools.getOptions("LLG02");
        this.oclg0207=Tools.getOptions("LLG01");
        return "main";
    }

}
