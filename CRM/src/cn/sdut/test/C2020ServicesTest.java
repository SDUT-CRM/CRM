package cn.sdut.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.services.C2020Services;

public class C2020ServicesTest
{
    private static ApplicationContext act = new FileSystemXmlApplicationContext(
            "C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
    private static C2020Services services = act.getBean("c2020services", C2020Services.class);
    private static Map dto = new HashMap();
    public static void main(String[] args)
    {
        services.setMapDto(dto);
        try
        {
            C2020ServicesTest.batchModify();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void batchModify() throws Exception
    {
        String parsList[]={"1","8","9","10"};
        dto.put("type", "3");
        dto.put("parsList", parsList);
        boolean tag=services.batchModify();
        System.out.println(tag);
    }
    
    
    

}
