package cn.sdut.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg21Dao;

public class Lg21DaoTest
{
    private static ApplicationContext act = new FileSystemXmlApplicationContext(
            "C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
    private static Lg21Dao dao = act.getBean("lg21dao", Lg21Dao.class);
    private static Map dto = new HashMap();

    public static void main(String[] args)
    {
        dao.setMapDto(dto);
        try
        {
           // checkUserTest();
            Lg21DaoTest
           // .UpdateUserTest()
            .getInstance()
            //.addUserTest()
            ;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    public static void getInstance() throws Exception
    {
        dto.put("lg2101", "0");
        Map map=dao.getInstance();
        System.out.println(map);
    }
    
    
    
    
    /**
     * 
     * @函数名  UpdateUserTest
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-21
     * @更新日期 
     * @更新内容
     */
    public static void UpdateUserTest() throws Exception
    {
        /**
         * this.getObject("lg2103"),
          this.getObject("lg2104"),
          this.getObject("lg2105"),
          this.getObject("lg2101")
         */
        
        dto.put("lg2101", "146");
        dto.put("lg2103", "bccc");
        dto.put("lg2104", "我是管理员");
        dto.put("lg2105", "2");
        boolean tag = dao.UpdateUser();
        System.out.println(tag);
        
    }

    private static void checkUserTest() throws Exception
    {
        dto.put("username", "admin");
        dto.put("pwd", "admin");
        Map ins = dao.checkUser();
        System.out.println("ins==" + ins);
    }
    /**
     * 
     * @函数名  addUserTest
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    
     * @创建日期 2014-7-21
     * @更新日期 
     * @更新内容
     */
    public static void addUserTest() throws Exception
    {
        dto.put("lg2102", "TEST001");
        dto.put("lg2103", "f40ed289d89877f1cdcc6ec056a7ce95");
        dto.put("lg2104", "测试用户001");
        dto.put("lg2105", "1");
        long lg2101=dao.addUser();
        System.out.println(lg2101);
    }

}
