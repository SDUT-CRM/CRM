package cn.sdut.persistence.dao.impl;

import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg21Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg21DaoImpl extends HibernatePageDaoSupport implements Lg21Dao {

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
