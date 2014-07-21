package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg02Dao;

public class Lg02DaoTest
{
    private static ApplicationContext act = new FileSystemXmlApplicationContext(
            "C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
    private static Lg02Dao dao = act.getBean("lg02dao", Lg02Dao.class);
    private static Map dto = new HashMap();

    public static void main(String[] args)
    {
        dao.setMapDto(dto);
        try
        {
            Lg02DaoTest
            .updateEmployeeTest()
            ;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void updateEmployeeTest() throws Exception
    {
        /**
         * this.getObject("lg0202"),      
          this.getObject("lg0204"),      
          this.getObject("lg0205"),      
          this.getObject("lg0206"),      
          lg04,
          this.getObject("lg0207"),
          this.getUDate("lg0209")
         */
        dto.put("lg0202", "张三丰");
        dto.put("lg0204", "中国古代");
        dto.put("lg0205", "10000");
        dto.put("lg0206", "zsf@crm.com");
        dto.put("lg0401", "1");
        dto.put("lg0207", "3");
        dto.put("lg0209", "1500-01-01");
        dto.put("lg2101", "0");
        boolean tag =dao.updateEmployee();
        System.out.println(tag);
    }

   

}
