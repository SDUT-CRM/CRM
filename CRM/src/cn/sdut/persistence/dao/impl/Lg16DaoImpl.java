package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sdut.persistence.dao.interfaces.Lg16Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg16DaoImpl extends HibernatePageDaoSupport implements Lg16Dao {

    
    
    @Override
    public List queryForForms() throws Exception
    {
        Object blg1605=this.getObject("blg1605");
        Object elg1605=this.getObject("elg1605");
        this.hql=new StringBuilder()
        .append("select new map(a.lg02.lg0202 as lg0202,a.lg03.lg0302 as lg0302,")
        .append("               a.lg15.lg1503 as lg1503,a.lg1606 as lg1606")
        .append(")")
        .append("  from Lg16 a")
        .append(" where 1=1")
        ;
        this.pars=new ArrayList();
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
