package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg07Dao;

public class Lg07DaoTest {
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
	"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg07Dao dao = act.getBean("lg07dao", Lg07Dao.class);
	private static Map dto = new HashMap();
	
	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			decreaseTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void decreaseTest() throws Exception {
		dto.put("lg0701", "1");
		boolean res = dao.decrease();
		System.out.println(res);
	}
	
	public static void increaseTest() throws Exception {
		dto.put("lg0701", "1");
		boolean res = dao.increase();
		System.out.println(res);
	}
	
	public static void queryTest() throws Exception {
		dto.put("lg0701","1");
		List res = dao.query();
		System.out.println(res);
	}
	
}
