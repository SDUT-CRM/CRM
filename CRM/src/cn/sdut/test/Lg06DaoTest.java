package cn.sdut.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg05;
import cn.sdut.persistence.bean.Lg21;
import cn.sdut.persistence.dao.interfaces.Lg06Dao;

public class Lg06DaoTest{
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
	"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg06Dao dao = act.getBean("lg06dao", Lg06Dao.class);
	private static Map dto = new HashMap();
	
	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			new Lg06DaoTest().addTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addTest() throws Exception{
/*		Lg21 lg21 = new Lg21();
		Lg01 lg01 = new Lg01();
		Lg02 lg02 = new Lg02();
		Lg05 lg05 = new Lg05();
		lg21.setLg2101(5);
		lg21.setLg2102("U10003");
		lg21.setLg2103("f40ed289d89877f1cdcc6ec056a7ce95");
		lg21.setLg2104("¿Í»§2");
		lg21.setLg2105("4");
		lg01.setLg21(lg21);
		lg01.setLg2101(5);
		lg01.setLg0102("");
		lg01.setLg0103("");
		lg01.setLg0104("");
		lg01.setLg0105("");
		lg01.setLg0106("");
		lg01.setLg0107("");
		lg01.setLg0108(new Date());*/
		
		
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
