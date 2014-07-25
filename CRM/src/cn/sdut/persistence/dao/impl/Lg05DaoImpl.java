package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg05;
import cn.sdut.persistence.dao.interfaces.Lg05Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg05DaoImpl extends HibernatePageDaoSupport implements Lg05Dao {

	/*
	 * 查询所有业务
	 * @see cn.sdut.persistence.dao.interfaces.Lg05Dao#query()
	 */
	@Override
	public List queryForPage() throws Exception {
		Object qlg0503 = this.getObject("qlg0503");
		Object qlg0509 = this.getObject("qlg0509");
		Object bqlg0507 = this.getObject("bqlg0507");
		Object eqlg0507 = this.getObject("eqlg0507");
		Object lg0501 = this.dto.get("lg0501");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0501 as lg0501,x.lg0502 as lg0502,")
		.append("       x.lg0503 as lg0503, x.lg0504 as lg0504,")
		.append("       x.lg0505 as lg0505, x.lg0506 as lg0506,")
		.append("       to_char(x.lg0507,'YYYY-MM-DD') as lg0507, to_char(x.lg0508,'YYYY-MM-DD') as lg0508,")
		.append("       b.fvalue as cnlg0509, x.lg0510 as lg0510")
		.append("       )")
		.append("  from Lg05 x, Syscode b")
		.append(" where 1=1")
        .append("   and x.lg0509=b.fcode")
        .append("   and b.fname='LG0509'");
		if (this.checkVal(qlg0503)){
            this.hql.append(" and x.lg0503 like ?");
            this.pars.add("%"+qlg0503+"%");
        }
        if (this.checkVal(qlg0509)){
            this.hql.append(" and x.lg0509 = ?");
            this.pars.add(qlg0509);
        }
        if (this.checkVal(bqlg0507)){
            this.hql.append(" and x.lg0507 >= ?");
            this.pars.add(this.getUDate("bqlg0507"));
        }
        if (this.checkVal(eqlg0507)){
            this.hql.append(" and x.lg0507 <= ?");
            this.pars.add(this.getUDate("eqlg0507"));
        }
		this.hql.append(" order by x.lg0501 desc");
		
		return this.queryForList();
	}

	
	/*
	 * 查询所有业务
	 * @see cn.sdut.persistence.dao.interfaces.Lg05Dao#query()
	 */
	@Override
	public List query() throws Exception {
		Object lg0501 = this.dto.get("lg0501");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0501 as lg0501,x.lg0502 as lg0502,")
		.append("       x.lg0503 as lg0503, x.lg0504 as lg0504,")
		.append("       x.lg0505 as lg0505, x.lg0506 as lg0506,")
		.append("       to_char(x.lg0507,'YYYY-MM-DD') as lg0507, to_char(x.lg0508,'YYYY-MM-DD') as lg0508,")
		.append("       b.fvalue as cnlg0509, x.lg0510 as lg0510")
		.append("       )")
		.append("  from Lg05 x, Syscode b")
		.append(" where 1=1")
        .append("   and x.lg0509=b.fcode")
        .append("   and b.fname='LG0509'");
		if (checkVal(lg0501)) {
			this.hql.append(" and x.lg0501=?");
			this.pars.add(Long.parseLong(lg0501.toString()));
		}
		return this.queryForList();
	}
	
	@Override
	public Map getInstance() throws Exception{
		this.hql = new StringBuilder()
		.append("select new map(x.lg0501 as lg0501,x.lg0502 as lg0502,")
		.append("       x.lg0503 as lg0503, x.lg0504 as lg0504,")
		.append("       x.lg0505 as lg0505, x.lg0506 as lg0506,")
		.append("       to_char(x.lg0507,'YYYY-MM-DD') as lg0507, to_char(x.lg0508,'YYYY-MM-DD') as lg0508,")
		.append("       x.lg0509 as lg0509,b.fvalue as cnlg0509, x.lg0510 as lg0510")
		.append("       )")
		.append("  from Lg05 x, Syscode b")
		.append(" where x.lg0501=?")
        .append("   and x.lg0509=b.fcode")
        .append("   and b.fname='LG0509'");
		return this.queryForMap("lg0501");
	}
	
	
	
	
	/**
	 * 管理员修改业务
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update() throws Exception{
		
		this.hql=new StringBuilder();
		hql.append("update Lg05")
		.append("      set lg0503=?,lg0504=?,lg0505=?,lg0506=?,")
		.append("      lg0508=?")
		.append("    where lg0501=?")
		;
		Object args[]={
			this.dto.get("lg0503"),	
			this.dto.get("lg0504"),	
			Double.parseDouble(this.dto.get("lg0505").toString()),
			Double.parseDouble(this.dto.get("lg0506").toString()),	
			new java.util.Date(),		
			this.getLong("lg0501")	
		};
		return this.update(hql.toString(), args);
	}
	/**
	 * 停办业务
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean delete() throws Exception {
		System.out.println("我的dto里面有什么呢？"+dto);
		this.hql=new StringBuilder()
		.append("update Lg05")
		.append("   set lg0509=?")
		.append(" where lg0501=(:lg0501)")
		;
		Object ids[] = this.getIdArray("parsList");
		return this.batchUpdate(hql.toString(), ids, "lg0501", "2");
	}


	@Override
	public boolean add() throws Exception {

		this.dto.put("lg0502", this.getObject("lg0502"));
		this.dto.put("lg0503", this.getObject("lg0503"));
		this.dto.put("lg0504", this.getObject("lg0504"));
		this.dto.put("lg0505", this.getObject("lg0505"));
		this.dto.put("lg0506", this.getObject("lg0506"));
		this.dto.put("lg0507", new java.util.Date());
		this.dto.put("lg0508", new java.util.Date());
		this.dto.put("lg0509", "1");
		this.dto.put("lg0510", "admin");
		System.out.println("my dto is ?="+dto);
		Lg05 lg05=this.addObject(Lg05.class);
		
		return lg05.getLg0501()>0;
	}
}
