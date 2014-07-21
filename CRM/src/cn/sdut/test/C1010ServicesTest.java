package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.services.C1010Services;

public class C1010ServicesTest
{
    private static ApplicationContext act = new FileSystemXmlApplicationContext(
            "C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
    private static C1010Services services = act.getBean("c1010services", C1010Services.class);
    private static Map dto = new HashMap();
    public static void main(String[] args)
    {
        services.setMapDto(dto);
        try
        {
            C1010ServicesTest.queryTest();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    /**
     * lg2102=E10000, lg0208=2014-01-01, lg0402=售后服务部, lg0202=张三, cnlg0207=在职
     * @函数名  queryTest
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-21
     * @更新日期 
     * @更新内容
     */
    public static void queryTest() throws Exception
    {
       List list = services.query();
       System.out.println(list);
    }
    
    

}
