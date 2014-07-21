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
     * lg2102=E10000, lg0208=2014-01-01, lg0402=�ۺ����, lg0202=����, cnlg0207=��ְ
     * @������  queryTest
     * @����˵�� 
     * @����ֵ  
     * @����˵�� 
     * @����    
     * @�������� 2014-7-21
     * @�������� 
     * @��������
     */
    public static void queryTest() throws Exception
    {
       List list = services.query();
       System.out.println(list);
    }
    
    

}
