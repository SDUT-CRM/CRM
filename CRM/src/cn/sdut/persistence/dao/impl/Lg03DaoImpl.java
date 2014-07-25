package cn.sdut.persistence.dao.impl;

import cn.sdut.persistence.bean.Lg03;
import cn.sdut.persistence.bean.Lg04;
import cn.sdut.persistence.dao.interfaces.Lg03Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg03DaoImpl extends HibernatePageDaoSupport implements Lg03Dao {

	@Override
	public boolean add() throws Exception {
		Lg04 lg04 = new Lg04();
        lg04.setLg0401(Long.parseLong("1"));
        this.dto.put("lg04", lg04);
        this.dto.put("lg0308",this.getUDate("lg0308"));
        this.dto.put("lg0309", this.getUDate("lg0309"));
        Lg03 lg03 = this.addObject(Lg03.class);
		return true;
	}

}
