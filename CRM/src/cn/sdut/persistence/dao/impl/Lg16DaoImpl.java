package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sdut.persistence.dao.interfaces.Lg16Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg16DaoImpl extends HibernatePageDaoSupport implements Lg16Dao {

    
    
    @Override
    public boolean batchUpdate() throws Exception
    {
        this.hql = new StringBuilder()
        .append("update Lg16")
        .append("   set lg1603=?,lg1604=?")
        .append(" where lg1601 in (:lg1601)");
        Object val[] = Tools.StringtoLongArray(this.dto.get("parsList"));
        Object parm[]={
                this.dto.get("type"),
                this.getUDate("lg1604")
        };
        return this.batchUpdate(hql.toString(), val, "lg1601",
                parm);
    }
    
    @Override
    public List queryForForms() throws Exception
    {
        Object lg0202=this.getObject("qlg0202");
        Object blg1605=this.getObject("blg1605");
        Object elg1605=this.getObject("elg1605");
        this.hql=new StringBuilder()
        .append("select new map(a.lg02.lg0202 as lg0202,a.lg03.lg0302 as lg0302,")
        .append("               a.lg15.lg1503 as lg1503,a.lg1606 as lg1606,")
        .append("               a.lg1601 as lg1601,to_char(a.lg1602,'YYYY-MM-DD') as lg1602,")
        .append("               a.lg1603 as lg1603,b.fvalue as cnlg1603,")
        .append("               c.fvalue as cnlg1503,to_char(a.lg1604,'YYYY-MM-DD') as lg1604")
        .append(")")
        .append("  from Lg16 a,Syscode b,Syscode c")
        .append(" where b.fcode=a.lg1603")
        .append("   and a.lg15.lg1503=c.fcode")
        .append("   and b.fname='LG1603'")
        .append("   and c.fname='LG1503'")
        ;
        this.pars=new ArrayList();
        
        if(this.checkVal(lg0202))
        {
            this.hql.append("  and lg0202 like ?");
            pars.add("%"+lg0202+"%");
        }
        
        if(this.checkVal(blg1605))
        {
            blg1605=this.getUDate("blg1605");
            this.hql.append("  and lg1605>=?");
            pars.add(blg1605);
        }
        if(this.checkVal(elg1605))
        {
            elg1605=this.getUDate("elg1605");
            this.hql.append("  and lg1605<=?");
            pars.add(elg1605);
        }
        System.out.println("pars="+pars);
        return this.queryForList(10000);
    }
    
	@Override
	public boolean add() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean append() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List query() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
