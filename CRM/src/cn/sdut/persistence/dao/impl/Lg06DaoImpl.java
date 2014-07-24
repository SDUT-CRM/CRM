package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg05;
import cn.sdut.persistence.bean.Lg06;
import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg06DaoImpl extends HibernatePageDaoSupport implements Lg06Dao {
	
    
    
    @Override
    public List queryForForms() throws Exception
    {
        Object blg0604=this.getObject("blg0604");
        Object elg0604=this.getObject("elg0604");
        this.hql=new StringBuilder()//成本，价格
        .append("select new map(a.lg05.lg0505 as lg0505,a.lg05.lg0506 as lg0506,")
        .append("               a.lg02.lg2101 as lg2101,a.lg02.lg0202 as lg0202,")
        .append("               a.lg01.lg0102 as lg0102)")
        .append("  from Lg06 a")
        .append(" where 1=1")
        ;
        this.pars=new ArrayList();
        if(this.checkVal(blg0604))
        {
            blg0604=this.getUDate("blg0604");
            this.hql.append("  and lg0604>=?");
            pars.add(blg0604);
        }
        if(this.checkVal(elg0604))
        {
            elg0604=this.getUDate("elg0604");
            this.hql.append("  and lg0604<=?");
            pars.add(elg0604);
        }
        System.out.println("pars="+pars);
        return this.queryForList(10000);
    }
    
	@Override
	public List queryForPage() throws Exception {
		Object qlg0503 = this.getObject("qlg0503");
		Object qlg0602 = this.getObject("qlg0602");
		Object bqlg0603 = this.getObject("bqlg0603");
		Object eqlg0603 = this.getObject("eqlg0603");
		Object bqlg0604 = this.getObject("bqlg0604");
		Object eqlg0604 = this.getObject("eqlg0604");
		Object lg0201 = this.getObject("lg0201");
		Object lg2101 = this.dto.get("lg2101");
		Object lg0501 = this.dto.get("lg0501");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0601 as lg0601,x.lg01.lg2101 as lg0101,")
		.append("       x.lg05.lg0501 as lg0501, x.lg05.lg0502 as lg0502, x.lg02.lg2101 as lg0201,")
		.append("       x.lg0602 as lg0602, to_char(x.lg0603,'YYYY-MM-DD') as lg0603,")
		.append("       b.fvalue as cnlg0602,to_char(x.lg0604,'YYYY-MM-DD') as lg0604,")
		.append("       y.lg0503 as lg0503, y.lg0506 as lg0506, z.lg0102 as lg0102")
		.append("       )")
		.append("  from Lg06 x, Lg05 y, Lg01 z, Syscode b")
		.append(" where 1 = 1")
        .append("   and x.lg0602 = b.fcode")
        .append("   and b.fname = 'LG0602'")
		.append("   and y.lg0501 = x.lg05.lg0501")
		.append("   and x.lg01.lg2101 = z.lg2101");

			System.out.println(dto);
        if (this.checkVal(qlg0503)){
            this.hql.append(" and y.lg0503 like ?");
            this.pars.add("%"+qlg0503+"%");
        }
        if (this.checkVal(qlg0602)){
        	if(qlg0602.toString().equals("0")){
        		this.hql.append(" and x.lg0602 between ? and ? ");
        		this.pars.add("1");
        		this.pars.add("3");
        	}else{
                this.hql.append(" and x.lg0602 = ?");
                this.pars.add(qlg0602);       		
        	}
        }
        if (this.checkVal(bqlg0603)){
            this.hql.append(" and x.lg0603 >= ?");
            this.pars.add(this.getUDate("bqlg0603"));
        }
        if (this.checkVal(eqlg0603)){
            this.hql.append(" and x.lg0603 <= ?");
            this.pars.add(this.getUDate("eqlg0603"));
        }
        if (this.checkVal(bqlg0604)){
            this.hql.append(" and x.lg0604 >= ?");
            this.pars.add(this.getUDate("bqlg0604"));
        }
        if (this.checkVal(eqlg0604)){
            this.hql.append(" and x.lg0604 <= ?");
            this.pars.add(this.getUDate("eqlg0604"));
        }
        if (this.checkVal(lg2101)){
            this.hql.append(" and x.lg01.lg2101=?");
            this.pars.add(this.getLong("lg2101"));
        }
        if (this.checkVal(lg0201)){
            this.hql.append(" and x.lg02.lg2101=?");
            this.pars.add(this.getLong("lg0201"));
        }
		this.hql.append(" order by x.lg0601 desc");
		return this.queryForList();
	}
	
	
	@Override
	public boolean add() throws Exception {

		this.dto.put("lg0602", this.getObject("lg0602"));
		this.dto.put("lg0603", this.getUDate("lg0603"));
		this.dto.put("lg0604", this.getUDate("lg0604"));
		
		Lg05 lg05 = (Lg05)dto.get("lg05");
		Lg01 lg01 = (Lg01)dto.get("lg01");
		Lg02 lg02 = (Lg02)dto.get("lg02");
		
		System.out.println(":::::::::"+dto);
		Lg06 lg06 = this.addObject(Lg06.class);
		
		this.dto.put("lg06", lg06);
		return lg06.getLg0601()>0;
		
	}

	@Override
	public List query() throws Exception {
		Object lg0601 = this.dto.get("lg0601");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0601 as lg0601,x.lg01.lg2101 as lg2101,")
		.append("       x.lg05.lg0501 as lg0501, x.lg02.lg2101 as lg0201,")
		.append("       x.lg0602 as lg0602, x.lg0603 as lg0603,")
		.append("       x.lg0604 as lg0604")
		.append("       )")
		.append("  from Lg06 x")
		.append(" where 1=1 and x.lg0602 < '5'");
		if (checkVal(lg0601)) {
			this.hql.append(" and x.lg0601=?");
			this.pars.add(Long.parseLong(lg0601.toString()));
		}
		
		return this.queryForList();
	}

	@Override
	public boolean setOk() throws Exception {
		System.out.println("dao::"+dto);
		StringBuilder hql = new StringBuilder()
		.append("update Lg06 x")
		.append("   set x.lg0602 = ?")
		.append(" where x.lg0601 in (:lg0601)")
		;
		Object parsList[] = this.getIdArray("parsList");
		Object lg0602 = this.dto.get("lg0602");
		return this.batchUpdate(hql.toString(), parsList, "lg0601", lg0602);
	}
	
	public boolean updateDate() throws Exception{
		System.out.println("dao::"+dto);
		StringBuilder hql = new StringBuilder()
		.append("update Lg06 x")
		.append("   set x.lg0604 = ?")
		.append(" where x.lg0601 in (:lg0601)")
		;
		Object parsList[] = this.getIdArray("parsList");
		Date lg0604 = this.getUDate("lg0604");
		return this.batchUpdate(hql.toString(), parsList, "lg0601", lg0604);
	}
	
	@Override
	public boolean modify() throws Exception {
		Object lg0501 = this.getObject("lg0501");
		Object lg0201 = this.getObject("lg0201");
		Object lg0602 = this.getObject("lg0602");
		Object lg0604 = this.getObject("lg0604");
		
		List args = new ArrayList();
		StringBuilder hql = new StringBuilder()
		.append("update Lg06 x")
		.append("   set x.lg0601 = x,lg0601 ");
		
		if(checkVal(lg0501)){
			hql.append(", x.lg05.lg0501 = ?");
			args.add(this.getLong("lg0501"));
		}
		
		if(checkVal(lg0201)){
			hql.append(", x.lg02.lg2101 = ?");
			args.add(this.getLong("lg0201"));
		}
		
		if(checkVal(lg0602)){
			hql.append(", x.lg0602 = ?");
			args.add(this.dto.get("lg0602"));
		}
		
		if(checkVal(lg0604)){
			hql.append(", x.lg0604 = ?");
			args.add(this.getUDate("lg0604"));
		}
		//.append("   set x.lg05.lg0501=?, , ,x.lg0604=?")
		hql.append(" where x.lg0601 = ?");
		//;
		args.add(this.getLong("lg0601"));
		return this.update(hql.toString(), args.toArray());
	}

	@Override
	public boolean delete() throws Exception {
		StringBuilder hql=new StringBuilder()
		.append("update Lg06 x")
		.append("   set x.lg0602=?")
		.append(" where x.lg0601=? and x.lg0602=1")
		;
		System.out.println("dto=="+dto);
		Object args[]={
			"5",
			this.getLong("lg0601")
		};
		return this.update(hql.toString(), args);
	}
	
	@Override
	public boolean check() throws Exception {
		Object args[]={
			this.getLong("lg2101"),
			this.getLong("lg0501")
		};
		StringBuilder hql=new StringBuilder()
		.append("select count(*)")
		.append("  from Lg06 x")
		.append(" where x.lg01.lg2101 = ? and x.lg05.lg0501 = ?")
		.append("       and x.lg0602<4");
		;
		return this.queryForNumber(hql.toString(), args).intValue()==0;
	}
}
