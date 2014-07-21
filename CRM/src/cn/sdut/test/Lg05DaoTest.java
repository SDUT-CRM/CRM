package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.bean.Lg05;
import cn.sdut.persistence.dao.interfaces.Lg05Dao;

public class Lg05DaoTest {
	
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
		"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg05Dao dao = act.getBean("lg05dao", Lg05Dao.class);
	private static Map dto = new HashMap();

	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			queryTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void queryTest() throws Exception {
		dto.put("lg0509", "1");
		List ins = dao.query();
		System.out.println("ins=="+ins);
	}
}
