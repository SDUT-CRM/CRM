package cn.sdut.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.services.C4040Services;

public class C4040ServicesTest
{
    private static ApplicationContext act = new FileSystemXmlApplicationContext(
            "C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
    private static C4040Services services = act.getBean("c4040services", C4040Services.class);
    private static Map dto = new HashMap();
    public static void main(String[] args)
    {
        services.setMapDto(dto);
        try
        {
            C4040ServicesTest.calFormsTest();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void calFormsTest() throws Exception
    {
        dto.put("begintime", "2014-05-05");
        dto.put("endtime", "2015-01-01");
        services.calForms();
    }
    
    

}
