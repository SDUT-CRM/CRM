package cn.sdut.persistence.dao.impl;

import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg02Dao;
import cn.sdut.persistence.dao.interfaces.adminDao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class adminDaoImpl extends HibernatePageDaoSupport implements adminDao {

	/**
	 * 人员修改
	 * @throws Exception
	 */
	@Override
	public boolean personUpdate() throws Exception {
		Object lg2105=this.dto.get("lg2105");
		dto.put("lg2104", dto.get("name"));
		Object lg2104=this.dto.get("lg2104");
		System.out.println("我的2104是多少呢？"+lg2104);
		this.hql=new StringBuilder();
		boolean tag=false;
		if(lg2105.equals("3")) {
			hql.append("update Lg03 x")
			.append("      set x.lg0302=?,x.lg0303=?,x.lg0304=?,x.lg0305=?,x.lg0306=?,")
			.append("          x.lg21.lg2104=?")
			.append("    where x.lg2101=?")
			;
			Object args[]={
				this.dto.get("name"),
				this.dto.get("idcard"),
				this.dto.get("address"),
				this.dto.get("phonenumber"),
				this.dto.get("email"),
				this.dto.get("name"),
				//this.dto.get("lg0301")
				this.getLong("lg2101")
			};
			System.out.println(hql.toString());
			System.out.println(dto);
			tag= this.update(hql.toString(), args);
		}
		if(lg2105.equals("2")) {
			hql
			.append("update Lg02 x")
			.append("   set x.lg0202=?,x.lg0203=?,x.lg0204=?,x.lg0205=?,x.lg0206=?,x.lg21.lg2104=?")
			.append(" where x.lg21.lg2101=?")
			;
			Object args[]={
					this.dto.get("name"),
					this.dto.get("idcard"),
					this.dto.get("address"),
					this.dto.get("phonenumber"),
					this.dto.get("email"),
					this.dto.get("name"),
					this.getLong("lg2101")
				};
			for (Object object : args) {
				System.out.println(object);
			}
			System.out.println("adminDaoImpl.lg2105==2  is "+hql.toString());
				tag= this.update(hql.toString(), args);
				
		}
		if(lg2105.equals("1")) {
			hql.append("update Lg01 x")
			.append("      set x.lg0102=?,x.lg0103=?,x.lg0104=?,x.lg0105=?,x.lg0106=?,")
			.append("          x.lg21.lg2104=?")
			.append("    where x.lg21.lg2101=?")
			;
			Object args[]={
					this.dto.get("name"),
					this.dto.get("idcard"),
					this.dto.get("address"),
					this.dto.get("phonenumber"),
					this.dto.get("email"),
					this.dto.get("name"),
					this.getLong("lg2101")
				};
			for (Object object : args) {
				System.out.println(object);
			}
				tag= this.update(hql.toString(), args);
		}
		return tag;
	}
	
	/**
	 * 查询
	 */
	@Override
	public Map getInstance() throws Exception {

		System.out.println(dto);
		Object lg2105=this.dto.get("lg2105");
		System.out.println("为什么给我输出的是这个呢？？？"+lg2105);
		//System.out.println(lg2105);
		this.hql=new StringBuilder();
		//经理
		if(lg2105.equals("3")){
			
			hql.append("select new map(y.lg2101 as lg2101,y.lg0302 as name,y.lg0303 as idcard,")
			.append("       y.lg0304 as address,y.lg0305 as phonenumber,")
			.append("       y.lg0306 as email,b.fvalue as dept")
			.append(")")
			.append("  from Lg21 x,Lg03 y ,Lg04 a,Syscode b")
			.append(" where y.lg2101=?")
			.append("   and y.lg2101=x.lg2101")
			.append("   and y.lg04.lg0401=a.lg0401")
			.append("   and a.lg0402=b.fcode")
			.append("   and b.fname='LLG02'")
			;
			
		}

		//员工
	    if(lg2105.equals("2")) {
			
			hql.append("select new map( y.lg2101 as lg2101,y.lg0202 as name,y.lg0203 as idcard,")
			.append("       y.lg0204 as address,y.lg0205 as phonenumber,")
			.append("       y.lg0206 as email,b.fvalue as dept")
			.append(")")
			.append("  from Lg21 x,Lg02 y ,Lg04 a,Syscode b")
			.append(" where x.lg2101=y.lg2101")
			.append("   and y.lg04.lg0401=a.lg0401")
			.append("   and a.lg0402=b.fcode")
			.append("   and b.fname='LLG02'")
			.append("  and y.lg2101=?")
			;
		}
		//客户
		if(lg2105.equals("1")) {
			
			hql.append("select new map( y.lg0102 as name,y.lg0103 as idcard,")
			.append("       y.lg0104 as address,y.lg0105 as phonenumber,")
			.append("       y.lg0106 as email")
			.append(")")
			.append("  from Lg21 x,Lg01 y")
			.append(" where y.lg2101=?")
			.append("   and x.lg2101=y.lg2101")
			;
		}
		System.out.println(hql.toString());
		System.out.println("为什么是前六啊？？"+dto);
		return this.queryForMap("lg2101");
	}
	
}
