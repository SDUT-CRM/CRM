package cn.sdut.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.sdut.persistence.dao.interfaces.Lg14Dao;

public class Lg14DaoTest {
	private static ApplicationContext act = new FileSystemXmlApplicationContext(
	"C:/Users/Administrator/git/CRM/CRM/WebRoot/WEB-INF/applicationContext.xml");
	private static Lg14Dao dao = act.getBean("lg14dao", Lg14Dao.class);
	private static Map dto = new HashMap();

	public static void main(String[] args) {
		dao.setMapDto(dto);
		try {
			Lg14DaoTest
			.queryForPageTest()
			//.getInstanceTest()
			//.updateTest()
			;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void updateTest() throws Exception
	{
	    dto.put("lg1401","1");
	    dto.put("lg1404", "2014-07-25");
	    dto.put("lg0301", "6");
	    dto.put("lg1403", "2");
	    boolean tag=dao.update();
	    System.out.println(tag);
	}
	
	
	
	
	/**
	 * 
	 * @函数名  queryForPageTest
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-23
	 * @更新日期 
	 * @更新内容
	 */
	public static void queryForPageTest() throws Exception
	{
	    //dto.put("lg0302", "王");
	   // dto.put("lg1303", "水");
	    List list = dao.queryForPage();
	    
	    System.out.println(list);
	}
	/**
	 * 
	 * @函数名  getInstanceTest
	 * @参数说明 
	 * @返回值  
	 * @功能说明 
	 * @作者    
	 * @创建日期 2014-7-23
	 * @更新日期 
	 * @更新内容
	 */
	public static void getInstanceTest() throws Exception
	{
	    dto.put("lg1401", "8");
	    Map maps=dao.getInstance();
	    System.out.println(maps);
	}
}
