package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.dao.interfaces.Lg01Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg01DaoImpl extends HibernatePageDaoSupport implements Lg01Dao{
    
    
    @Override
    public boolean updateStatus() throws Exception
    {
        this.hql=new StringBuilder()
        .append("update Lg21 a")
        .append("   set a.lg2105=?")
        .append(" where a.lg2101=?")
        ;
        Object args[]=
        {
                this.getObject("lg2105"),
                this.getLong("lg2101")
        };
        return this.update(hql.toString(), args);
    }
    
    @Override
    public boolean resetPwd() throws Exception
    {
        this.hql=new StringBuilder()
        .append("update Lg21 a")
        .append("   set a.lg2103=?")
        .append(" where a.lg2101=?")
        ;
        Object args[]=
        {
          this.getObject("lg2103"),
          this.getLong("lg2101")
        };
        return this.update(hql.toString(), args);
    }

    @Override
    public List queryForPage() throws Exception
    {
        Object lg2102=this.dto.get("qlg2102");
        Object lg0102=this.dto.get("qlg0102");
        Object lg0104=this.dto.get("qlg0103");
        Object lg0105=this.dto.get("qlg0105");
        this.hql=new StringBuilder()
        .append("select new map(a.lg21.lg2102 as lg2102,a.lg0102 as lg0102,")
        .append("               a.lg0103 as lg0103,a.lg0104 as lg0104,")
        .append("               a.lg0105 as lg0105,a.lg0106 as lg0106,")
        .append("               a.lg0107 as lg0107,a.lg0108 as lg0108,")
        .append("               a.lg21.lg2101 as lg2101)")
        .append("  from Lg01 a")
        .append(" where 1=1")
        ;
        this.pars=new ArrayList();
        if(this.checkVal(lg2102))
        {
            this.hql.append("  and a.lg21.lg2102 like ?");
            this.pars.add("%"+lg2102+"%");
        }
        if(this.checkVal(lg0102))
        {
            this.hql.append("  and a.lg0102 like ?");
            this.pars.add("%"+lg0102+"%");
        }
        if(this.checkVal(lg0104))
        {
            this.hql.append("  and a.lg0104=?");
            this.pars.add(lg0104);
        }
        if(this.checkVal(lg0105))
        {
            this.hql.append("  and a.lg0105=?");
            this.pars.add(lg0105);
        }
        
        this.hql.append(" order by a.lg21.lg2101");
        return this.queryForList();
    }

    @Override
    public boolean addCustomer() throws Exception
    {
        this.dto.put("lg0108", this.getUDate("lg0108"));
        this.dto.put("lg0107", this.getObject("SYSUID"));
        Lg01 lg01=this.addObject(Lg01.class);
        return true;
    }

    @Override
    public boolean updateCustomer() throws Exception
    {
        return false;
    }

   

}
