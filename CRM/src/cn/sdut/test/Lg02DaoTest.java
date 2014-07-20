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

    public static void queryTest() throws Exception
    {
        // Object lg2102=this.dto.get("lg2102"); //Ա�����
        // Object lg0401=this.dto.get("lg0401"); //Ա������
        // Object lg0202=this.dto.get("lg0202"); //Ա������
        // Object lg0207=this.dto.get("lg0207"); //Ա��״̬
        // Object blg0208=this.dto.get("blg0208"); //��ְʱ�� ��ʼ
        // Object elg0208=this.dto.get("elg0208"); //��ְʱ�� ��ʼ
        // dto.put("lg", "");
        List list = dao.query();
        System.out.println(list);
    }

}
