package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg16Dao;

public class Lg16DaoTest {
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
		"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg16Dao dao = act.getBean("lg16dao", Lg16Dao.class);
	private static Map dto = new HashMap();

	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			//modifyTest();
		    Lg16DaoTest.queryForFormsTest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @函数名  queryForFormsTest
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-23
	 * @更新日期 
	 * @更新内容
	 */
	public static void queryForFormsTest() throws Exception
	{
	    List lists = dao.queryForForms(10);
	    System.out.println(lists);
	}
}
