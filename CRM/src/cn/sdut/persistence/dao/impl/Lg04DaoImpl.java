package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.persistence.bean.Lg04;
import cn.sdut.persistence.dao.interfaces.Lg04Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg04DaoImpl extends HibernatePageDaoSupport implements Lg04Dao {

	@Override
	public Lg04 getInstance() throws Exception {
		Object lg0401 = this.dto.get("lg0401");
		Lg04 lg04 = new Lg04();
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
				.append("select new map(x.lg0401 as lg0401,x.lg0402 as lg0402,")
				.append("       x.lg0403 as lg0403, x.lg0404 as lg0404,")
				.append("       x.lg0405 as lg0405, x.lg0406 as lg0406,")
				.append("       x.lg0407 as lg0407")
				.append("       )").append("  from Lg04 x")
				.append(" where x.lg0401=?");
		pars.add(Long.parseLong(lg0401.toString()));
		Map ins = this.queryForMap(hql.toString(), pars.toArray());
		ins.put("lg0406", Tools.parseDate(ins.get("lg0406")));
		ins.put("lg0407", Tools.parseDate(ins.get("lg0407")));
		ins.put("lg0401", Long.parseLong(ins.get("lg0401").toString()));
		ins.put("lg0403", Long.parseLong(ins.get("lg0403").toString()));
		
		// ins.put("lg0508", this.getUDate(ins.get("lg0508").toString()));

		BeanUtils.populate(lg04, ins);
		System.out.println("ins==" + ins);
		return lg04;
	}

}
