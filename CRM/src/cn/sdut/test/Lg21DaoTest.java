package cn.sdut.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg21Dao;

public class Lg21DaoTest {
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
			"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg21Dao dao = act.getBean("lg21dao", Lg21Dao.class);
	private static Map dto = new HashMap();

	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			checkUserTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void checkUserTest() throws Exception {
		dto.put("username", "admin");
		dto.put("pwd", "admin");
		Map ins = dao.checkUser();
		System.out.println("ins=="+ins);
	}

}
