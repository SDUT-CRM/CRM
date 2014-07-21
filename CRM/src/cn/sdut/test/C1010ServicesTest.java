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
            C1010ServicesTest
            .addEmployeeTest()
            ;
            //.queryTest();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void addEmployeeTest() throws Exception
    {
        dto.put("lg2102", "TEST999");
        dto.put("lg2103", "f40ed289d89877f1cdcc6ec056a7ce95");
        dto.put("lg2104", "�����û�999");
        dto.put("lg2105", "2");
        dto.put("lg0202", "�����û�");
        dto.put("lg0203", "123456789012345678");
        dto.put("lg0204", "ɽ��ʡ�Ͳ���");
        dto.put("lg0205", "13145677894");
        dto.put("lg0206", "test@crm.com");
        dto.put("lg0207", "1");
        dto.put("lg0401", "1");
        dto.put("lg0208", "2014-01-08");
        dto.put("lg0209", "2014-07-21");
        boolean tag=services.addEmployee();
        System.out.println(tag);
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
