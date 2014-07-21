package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg06Dao;

public class Lg06DaoTest{
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
		"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg06Dao dao = act.getBean("lg06dao", Lg06Dao.class);
	private static Map dto = new HashMap();
	
	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			queryForPageTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void queryForPageTest() throws Exception{
		dto.put("lg2101", "2");
		List res = dao.queryForPage();
		System.out.println(res);
	}
	
	public static void checkTest() throws Exception {
		dto.put("lg2101","2");
		dto.put("lg0501","1");
		boolean res = dao.check();
		System.out.println(res);
	}
	
	public static void deleteTest() throws Exception {
		dto.put("lg0601","9");
		boolean res = dao.delete();
		System.out.println(res);
	}
	
	public static void modifyTest() throws Exception {
		dto.put("lg0501", "1");
		dto.put("lg0201", "0");
		dto.put("lg0602", "3");
		dto.put("lg0604", "2014-07-22");
		dto.put("lg0601", "9");
		boolean res = dao.modify();
		System.out.println(res);
	}
	
	public static void queryTest() throws Exception {
		dto.put("lg0601", "9");
		List res = dao.query();
		System.out.println(res);
		
	}
	
	public static void addTest() throws Exception{
		dto.put("lg2101","2");
		dto.put("lg0501","1");
		dto.put("lg0201","4");
		dto.put("lg0602","2");
		dto.put("lg0603","2014-07-20");
		dto.put("lg0604","2014-07-20");
		boolean res = dao.add();
		System.out.println(res);
	}

}
