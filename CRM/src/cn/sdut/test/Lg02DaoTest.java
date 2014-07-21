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
            Lg02DaoTest.queryTest();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
     * 
     * @函数名  queryTest
     * @参数说明 
     * @返回值  
     * @功能说明 
     * @作者    明睿
     * @创建日期 2014-7-20
     * @更新日期 
     * @更新内容
     */
    public static void queryTest() throws Exception
    {
        // Object lg2102=this.dto.get("lg2102"); //员工编号
        // Object lg0401=this.dto.get("lg0401"); //员工部门
        // Object lg0202=this.dto.get("lg0202"); //员工姓名
        // Object lg0207=this.dto.get("lg0207"); //员工状态
        // Object blg0208=this.dto.get("blg0208"); //入职时间 开始
        // Object elg0208=this.dto.get("elg0208"); //入职时间 开始
        // dto.put("lg", "");
        
        dto.put("blg0208", "2012-01-01");
        dto.put("elg0208", "2014-05-05");
       // dto.put("lg2102", "E10000");
        //dto.put("lg2102", "E10001");
        //dto.put("lg0401", "1");
        //dto.put("lg0202", "李");
        List list = dao.query();
        System.out.println(list);
        /**
         * [{lg2102=E10000, lg0208=2014-01-01, lg0402=售后服务部, lg0202=张三, cnlg0207=在职}, 
         * {lg2102=E10001, lg0208=2014-01-01, lg0402=业务部, lg0202=李四, cnlg0207=在职}]
         */
    }

}
