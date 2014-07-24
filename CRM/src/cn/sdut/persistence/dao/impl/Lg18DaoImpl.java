package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg17;
import cn.sdut.persistence.bean.Lg18;
import cn.sdut.persistence.dao.interfaces.Lg18Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg18DaoImpl extends HibernatePageDaoSupport implements Lg18Dao {

	@Override
	public Map getInstance() throws Exception {
		this.hql = new StringBuilder()
		.append("select new map(x.lg1801 as lg1801,x.lg01.lg2101 as lg0101,")
		.append("       x.lg02.lg2101 as lg0201, x.lg17.lg1701 as lg1701,")
		.append("       b.fvalue as cnlg1701, x.lg1804 as lg1804, x.lg1805 as lg1805,")
		.append("       to_char(x.lg1802,'YYYY-MM-DD') as lg1802,")
		.append("       to_char(x.lg1803,'YYYY-MM-DD') as lg1803")
		.append("       )")
		.append("  from Lg18 x, Syscode b")
		.append(" where x.lg1801=?")
		.append("   and x.lg17.lg1701=b.fcode")
        .append("   and b.fname='LG1701'");
		return this.queryForMap("lg1801");
	}
	
	@Override
	public boolean add() throws Exception {
		this.dto.put("lg1802", this.getUDate("lg1802"));
		this.dto.put("lg1803", this.getUDate("lg1803"));
		this.dto.put("lg1804", this.getObject("lg1804"));
		this.dto.put("lg1805", this.getObject("lg1805"));

		Lg18 lg18 = this.addObject(Lg18.class);
		this.dto.put("lg18", lg18);
		return lg18.getLg1801()>0;
	}

	@Override
	public List query() throws Exception {
		Object lg1801 = this.dto.get("lg1801");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg1801 as lg1801,x.lg01.lg2101 as lg2101,")
		.append("       x.lg02.lg2101 as lg0201, x.lg17.lg1701 as lg1701,")
		.append("       x.lg1802 as lg1802, x.lg1803 as lg1803,")
		.append("       x.lg1804 as lg1804")
		.append("       )")
		.append("  from Lg18 x")
		.append(" where 1=1 and x.lg1804 < '6'");
		if (checkVal(lg1801)) {
			this.hql.append(" and x.lg1801=?");
			this.pars.add(Long.parseLong(lg1801.toString()));
		}
		return this.queryForList();
	}

	@Override
	public boolean modify() throws Exception {
		List args = new ArrayList();
		StringBuilder hql=new StringBuilder()
		.append("update Lg18 x")
		.append("   set x.lg1801 = x.lg1801");
		if(checkVal(this.dto.get("lg0201"))){
			hql.append(",x.lg02.lg2101=?");
			args.add(this.getLong("lg0201"));
		}
		if(checkVal(this.dto.get("lg1701"))){
			hql.append(",x.lg17.lg1701=?");
			args.add(this.getLong("lg1701"));
		}
		if(checkVal(this.dto.get("lg1803"))){
			hql.append(",x.lg1803=?");
			args.add(this.getUDate("lg1803"));
		}
		if(checkVal(this.dto.get("lg1804"))){
			hql.append(",x.lg1804=?");
			args.add(this.getObject("lg1804"));
		}
		if(checkVal(this.dto.get("lg1805"))){
			hql.append(",x.lg1805=?");
			args.add(this.getObject("lg1805"));
		}
		hql.append(" where x.lg1801=?");
		args.add(this.getLong("lg1801"));
		
		System.out.println("hql=="+hql+"\n args=="+args.toString());
		return this.update(hql.toString(), args.toArray());
	}

	@Override
	public boolean delete() throws Exception {
		StringBuilder hql=new StringBuilder()
		.append("update Lg18 x")
		.append("   set x.lg1804=?")
		.append(" where x.lg1801=? and x.lg1804=?")
		;
		System.out.println("dto=="+dto);
		Object args[]={
			"6",
			this.getLong("lg1801"),
			"1"
		};
		return this.update(hql.toString(), args);
	}

	@Override
	public List queryForPage() throws Exception {
		Object lg1804 = this.getObject("qlg1804");
		Object lg1701 = this.getObject("qlg1701");
		Object bqlg1802 = this.getObject("bqlg1802");
		Object eqlg1802 = this.getObject("eqlg1802");

		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg1801 as lg1801,x.lg01.lg2101 as lg2101,")
		.append("       x.lg02.lg2101 as lg0201, x.lg17.lg1701 as lg1701,")
		.append("       b.fvalue as cnlg1701, x.lg1805 as lg1805,")
		.append("       c.fvalue as cnlg1804, x.lg1804 as lg1804, ")
		.append("       to_char(x.lg1802,'YYYY-MM-DD') as lg1802,")
		.append("       to_char(x.lg1803,'YYYY-MM-DD') as lg1803")
		.append("       )")
		.append("  from Lg18 x, Syscode b, Syscode c")
		.append(" where 1=1")
		.append("   and x.lg17.lg1701=b.fcode")
        .append("   and b.fname='LG1701'")
        .append("   and x.lg1804=c.fcode")
        .append("   and c.fname='LG1804'");
		
		if(this.checkVal(lg1701)){
			hql.append(" and x.lg17.lg1701 = ?");
			this.pars.add(this.getLong("qlg1701"));
		}
		
		if(this.checkVal(lg1804)){
			hql.append(" and x.lg1804 = ?");
			this.pars.add(lg1804);
		}
		
		if(this.checkVal(bqlg1802)){
			hql.append(" and x.lg1802 >= ?");
			this.pars.add(this.getUDate("bqlg1802"));
		}
		
		if(this.checkVal(eqlg1802)){
			hql.append(" and x.lg1802 <= ?");
			this.pars.add(this.getUDate("eqlg1802"));
		}
		
		hql.append(" order by x.lg1801 desc");
		return this.queryForList();
	}

}
