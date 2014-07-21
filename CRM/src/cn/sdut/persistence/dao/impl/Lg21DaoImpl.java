package cn.sdut.persistence.dao.impl;

import java.util.Map;

import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg04;
import cn.sdut.persistence.bean.Lg21;
import cn.sdut.persistence.dao.interfaces.Lg21Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg21DaoImpl extends HibernatePageDaoSupport implements Lg21Dao {
    
    
    @Override
    public boolean UpdateUser() throws Exception
    {
        //this.dto.put("lg2101", this.getObject("lg2101"));
        //this.dto.put("lg2103", this.getObject("lg2103"));
       //// this.dto.put("lg2104", this.getObject("lg2104"));
       // this.dto.put("lg2105", this.getObject("lg2105"));
        StringBuilder hql=new StringBuilder()
        .append("update Lg21")
        .append("   set lg2103=?,lg2104=?,lg2105=?")
        .append(" where lg2101=?")
        ;
        Object[] args={
          this.getObject("lg2103"),
          this.getObject("lg2104"),
          this.getObject("lg2105"),
          this.getLong("lg2101")
        };
        this.update(hql.toString(), args);
        return true;
    }
    
    @Override
    public long addUser() throws Exception
    {
        this.dto.put("lg2102", this.getObject("lg2102"));
        this.dto.put("lg2103", this.getObject("lg2103"));
        this.dto.put("lg2104", this.getObject("lg2104"));
        this.dto.put("lg2105", this.getObject("lg2105"));
        Lg21 lg21 =  this.addObject(Lg21.class);
        this.dto.put("lg21", lg21);
        return lg21.getLg2101();
    }

	@Override
	public Map checkUser() throws Exception {
		StringBuilder hql = new StringBuilder()
				.append("select new map(x.lg2101 as lg2101,")
				.append("       x.lg2102 as lg2102,x.lg2103 as lg2103,")
				.append("       x.lg2104 as lg2104,x.lg2105 as lg2105)")
				.append("  from Lg21 x")
				.append(" where x.lg2102=? and x.lg2103=?");
		Object args[] = { 
				this.dto.get("username") ,
				Tools.getMd5(this.dto.get("pwd"))
		};
		return this.queryForMap(hql.toString(), args);
	}
}
