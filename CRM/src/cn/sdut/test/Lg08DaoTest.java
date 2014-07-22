package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg08Dao;

public class Lg08DaoTest {

	private static ApplicationContext act = new FileSystemXmlApplicationContext(
	"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg08Dao dao = act.getBean("lg08dao", Lg08Dao.class);
	private static Map dto = new HashMap();
	
	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			getNumTest();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void getNumTest() throws Exception{
		dto.put("lg0701", "1");
		int num = dao.getNum();
		System.out.println(num);
	}
	
	public static void queryTest() throws Exception{
		List res = dao.queryForPage();
		System.out.println(res);
	}
	
	public static void deleteTest() throws Exception{
		dto.put("lg0801", "5");
		boolean res = dao.delete();
		System.out.println(res);
	}
	
	public static void addTest() throws Exception {
		dto.put("lg2101","2");
		dto.put("lg0701","1");
		dto.put("lg0802","2014-01-01");
		dto.put("lg0803","2014-11-11");
		dto.put("lg0804","2");
		boolean res = dao.add();
		System.out.println(res);
	}
	
	
}
