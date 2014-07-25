package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sdut.persistence.bean.Lg20;
import cn.sdut.persistence.dao.interfaces.Lg20Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg20DaoImpl extends HibernatePageDaoSupport implements Lg20Dao {

	@Override
	public boolean update() throws Exception {
		String hql = "update Lg20 set lg2007=2 where lg2001=? or lg2006=?";
		Object args[] = {
			this.getLong("lg2001"),
			this.getLong("lg2001")
		};
		return this.update(hql, args);
	}
	
	@Override
	public List queryById() throws Exception {
		System.out.println(dto);
		this.hql = new StringBuilder()
		.append("select new map(x.lg2001 as lg2001, x.lg01.lg2101 as lg0101, ")
		.append("               x.lg02.lg2101 as lg0201, x.lg2002 as lg2002, ")
		.append("               x.lg2003 as lg2003, to_char(x.lg2004,'YYYY-MM-DD HH24:mi:ss') as lg2004, ")
		.append("               x.lg2006 as lg2006, to_char(x.lg2005,'YYYY-MM-DD HH24:mi:ss') as lg2005")
		.append("       )")
		.append("  from Lg20 x")
		.append(" where x.lg2001=? or x.lg2006=?")
		.append("       and x.lg01.lg2101=? ")
		.append(" order by lg2001");
		;
		this.pars = new ArrayList();
		pars.add(this.getLong("lg2001"));
		pars.add(this.getLong("lg2001"));
		pars.add(this.getLong("lg2101"));
		
		System.out.println(pars);
		return this.queryForList();
	}
	
	@Override
	public boolean add() throws Exception {
		this.dto.put("lg2004", this.getUDate1("lg2004"));
		Lg20 lg20 = this.addObject(Lg20.class);
		return lg20.getLg2001()>0;
	}

	@Override
	public boolean modify() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List queryForPage() throws Exception {
		Object lg2002 = this.getObject("qlg2002");
		Object lg2003 = this.getObject("qlg2003");
		Object bqlg2004 = this.getObject("bqlg2004");
		Object eqlg2004 = this.getObject("eqlg2004");
		Object lg2007 = this.getObject("qlg2007");
		Object lg2101 = this.getObject("lg2101");
		
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg2001 as lg2001,x.lg01.lg2101 as lg2101,")
		.append("       x.lg02.lg2101 as lg0201, x.lg2002 as lg2002,")
		.append("       x.lg2003 as lg2003, x.lg2006 as lg2006,")
		.append("       b.fvalue as cnlg2007, x.lg2007 as lg2007, ")
		.append("       to_char(x.lg2004,'YYYY-MM-DD') as lg2004,")
		.append("       to_char(x.lg2005,'YYYY-MM-DD') as lg2005")
		.append("       )")
		.append("  from Lg20 x, Syscode b")
		.append(" where x.lg2006 = 0 ")
		.append("   and x.lg2007=b.fcode")
        .append("   and b.fname='LG2007'");
		
		if (this.checkVal(lg2101)){
            this.hql.append(" and x.lg01.lg2101=?");
            this.pars.add(this.getLong("lg2101"));
        }
		
		if(this.checkVal(lg2002)){
			hql.append("   and( x.lg2001 in (select y.lg2006 as lg2006" +
					" from Lg20 y where y.lg2002 like ?) or x.lg2001 in " +
					" (select y.lg2001 as lg2001 from Lg20 y" +
					" where y.lg2002 like ?))");
			this.pars.add("%"+lg2002+"%");
			this.pars.add("%"+lg2002+"%");
		}
		
		if(this.checkVal(lg2003)){
			hql.append("   and( x.lg2001 in (select y.lg2006 as lg2006" +
					" from Lg20 y where y.lg2003 like ?) or x.lg2001 in " +
					" (select y.lg2001 as lg2001 from Lg20 y" +
					" where y.lg2003 like ?))");
			this.pars.add("%"+lg2003+"%");
			this.pars.add("%"+lg2003+"%");
		}
		if(this.checkVal(lg2007)){
			hql.append(" and x.lg2007 = ?");
			this.pars.add(lg2007);
		}
		
		if(this.checkVal(bqlg2004)){
			hql.append(" and x.lg2004 >= ?");
			this.pars.add(this.getUDate("bqlg2004"));
		}
		
		if(this.checkVal(eqlg2004)){
			hql.append(" and x.lg2004 <= ?");
			this.pars.add(this.getUDate("eqlg2004"));
		}
		
		hql.append(" order by x.lg2001 desc");
		return this.queryForList();
	}

	@Override
	public boolean delete() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
