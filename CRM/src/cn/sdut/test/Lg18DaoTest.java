package cn.sdut.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg18Dao;

public class Lg18DaoTest {
	
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
	"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg18Dao dao = act.getBean("lg18dao", Lg18Dao.class);
	private static Map dto = new HashMap();

	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			addTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void addTest() throws Exception {
		dto.put("lg2101", "2");
		dto.put("lg0201", "4");
		dto.put("lg1701", "1");
		dto.put("lg1802", "2014-07-18");
		dto.put("lg1803", "2014-08-10");
		dto.put("lg1804", "2");
		dto.put("lg1805", "‘ı√¥∞Ï£ø");
		boolean res = dao.add();
		System.out.println(res);
	}
}
