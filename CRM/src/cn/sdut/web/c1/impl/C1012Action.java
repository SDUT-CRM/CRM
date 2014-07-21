package cn.sdut.web.c1.impl;

import cn.sdut.system.Tools;
import cn.sdut.web.c1.C1010Support;

public class C1012Action extends C1010Support
{
    private String edit;

    @Override
    public String execute() throws Exception
    {
        if (edit!=null&&edit.equals("1"))
        {
            
            System.out.println();
            msg=this.c1010Services.addEmployee()?"添加成功!":"添加失败！";
            return "main";
        }
        else
        {
            return "main";
        }
    }

    public void setEdit(String edit)
    {
        this.edit = edit;
    }

    public String getEdit()
    {
        return edit;
    }

}
