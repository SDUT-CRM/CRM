package cn.sdut.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.bean.Lg04;
import cn.sdut.persistence.dao.interfaces.Lg04Dao;

public class Lg04DaoTest {
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
	"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg04Dao dao = act.getBean("lg04dao", Lg04Dao.class);
	private static Map dto = new HashMap();

	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			getInstanceTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void getInstanceTest() throws Exception{
		dto.put("lg0401", "2");
		Lg04 lg04 = dao.getInstance();
		System.out.println("sasas:::"+lg04);
	}
}
