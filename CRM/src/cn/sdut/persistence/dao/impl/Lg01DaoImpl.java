package cn.sdut.persistence.dao.impl;

import java.util.List;

import cn.sdut.persistence.dao.interfaces.Lg01Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg01DaoImpl extends HibernatePageDaoSupport implements Lg01Dao{

    @Override
    public List queryForPage() throws Exception
    {
        Object lg2102=this.dto.get("qlg2102");
        Object lg0102=this.dto.get("qlg0102");
        Object lg0104=this.dto.get("qlg0103");
        Object lg0105=this.dto.get("qlg0105");
        this.hql=new StringBuilder();
        
        return null;
    }

    @Override
    public boolean addCustomer() throws Exception
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updateCustomer() throws Exception
    {
        // TODO Auto-generated method stub
        return false;
    }

   

}
