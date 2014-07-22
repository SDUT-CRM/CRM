package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg14Dao;

public class Lg14DaoTest {
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
	"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg14Dao dao = act.getBean("lg14dao", Lg14Dao.class);
	private static Map dto = new HashMap();

	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			Lg14DaoTest.queryForPageTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void queryForPageTest() throws Exception
	{
	    List list = dao.queryForPage();
	    System.out.println(list);
	}
}
