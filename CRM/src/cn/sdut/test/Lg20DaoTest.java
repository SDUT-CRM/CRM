package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg20Dao;

public class Lg20DaoTest {
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
		"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg20Dao dao = act.getBean("lg20dao", Lg20Dao.class);
	private static Map dto = new HashMap();

	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			queryByIdTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryByIdTest() throws Exception{
		dto.put("lg2001", "1");
		List res = dao.queryById();
		System.out.println(res);
	}
	
}
