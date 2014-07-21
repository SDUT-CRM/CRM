package cn.sdut.web.c1.impl;

import java.util.List;

import cn.sdut.web.c1.C1010Support;

public class C1010Action extends C1010Support
{

    @Override
    public String execute() throws Exception
    {
        List rows = this.getC1010Services().query();
        if (rows.size() > 0)
        {
            this.setRows(rows);
            String pageinfo=this.getC1010Services().getPageInfo("c1010Action");
        }
        return null;
    }

}
