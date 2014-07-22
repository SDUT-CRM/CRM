package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg07;
import cn.sdut.persistence.bean.Lg08;
import cn.sdut.persistence.dao.interfaces.Lg08Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg08DaoImpl extends HibernatePageDaoSupport implements Lg08Dao{
	
	@Override
	public boolean check() throws Exception {
		System.out.println(dto);
		Object args[]={
			this.getLong("lg2101"),
			this.getLong("lg0701")
		};
		StringBuilder hql=new StringBuilder()
		.append("select count(*)")
		.append("  from Lg08 x")
		.append(" where x.lg01.lg2101 = ? and x.lg07.lg0701 = ?")
		.append("       and x.lg0804 = 1");
		;
		return this.queryForNumber(hql.toString(), args).intValue()==0;
	}
	
	@Override
	public boolean add() throws Exception {
		this.dto.put("lg0802", this.getUDate("lg0802"));
		this.dto.put("lg0803", this.getUDate("lg0803"));
		this.dto.put("lg0804", this.getObject("lg0804"));

		Lg01 lg01 = (Lg01)dto.get("lg01");
		Lg07 lg07 = (Lg07)dto.get("lg07");
		
		Lg08 lg08 = this.addObject(Lg08.class);
		this.dto.put("lg08", lg08);
		return lg08.getLg0801()>0;
	}
	
	@Override
	public boolean delete() throws Exception {
		StringBuilder hql=new StringBuilder()
		.append("update Lg08 x")
		.append("   set x.lg0804=?")
		.append(" where x.lg0801=?")
		;
		//System.out.println("dto=="+dto);
		Object args[]={
			"2",
			this.getLong("lg0801")
		};
		return this.update(hql.toString(), args);
	}

	@Override
	public List query() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List queryForPage() throws Exception {
		Object lg2101 = this.dto.get("lg2101");
		Object lg0801 = this.dto.get("lg0801");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0801 as lg0801,x.lg01.lg2101 as lg0101,")
		.append("       x.lg07.lg0701 as lg0701, to_char(x.lg0802,'YYYY-MM-DD') as lg0802,")
		.append("       to_char(x.lg0803,'YYYY-MM-DD') as lg0803, b.fvalue as cnlg0707,")
		.append("       y.lg0707 as lg0707, y.lg0702 as lg0702, ")
		.append("       x.lg0804 as lg0804, c.fvalue as cnlg0804, ")
		.append("       to_char(y.lg0708,'YYYY-MM-DD') as lg0708")
		.append("       )")
		.append("  from Lg08 x, Lg07 y, Syscode b, Syscode c")
		.append(" where 1=1")
        .append("   and y.lg0707=b.fcode")
        .append("   and b.fname='LG0707'")
        .append("   and x.lg0804=c.fcode")
        .append("   and c.fname='LG0804'")
		.append("   and y.lg0701=x.lg07.lg0701");

        if (this.checkVal(lg2101)){
            this.hql.append(" and x.lg01.lg2101=?");
            this.pars.add(this.getLong("lg2101"));
        }
		this.hql.append(" order by x.lg0801");
		return this.queryForList();
	}
}
