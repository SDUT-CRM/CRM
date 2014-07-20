package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.dao.interfaces.Lg02Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg02DaoImpl extends HibernatePageDaoSupport implements Lg02Dao {

	@Override
	public Lg02 getInstance() throws Exception {
		Object lg2101 = this.dto.get("lg2101");
		Lg02 lg02 = new Lg02();
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
				.append("select new map(x.lg2101 as lg2101,x.lg0202 as lg0202,")
				.append("       x.lg0203 as lg0203, x.lg0204 as lg0204,")
				.append("       x.lg0205 as lg0205, x.lg0206 as lg0206,")
				.append("       x.lg0401 as lg0401, x.lg0207 as lg0207,")
				.append("       x.lg0208 as lg0208, x.lg0209 as lg0209")
				.append("       )").append("  from Lg02 x")
				.append(" where x.lg2101=?");
		pars.add(Long.parseLong(lg2101.toString()));
		Map ins = this.queryForMap(hql.toString(), pars.toArray());
		ins.put("lg0208", Tools.parseDate(ins.get("lg0208")));
		ins.put("lg0209", Tools.parseDate(ins.get("lg0209")));
		// ins.put("lg0508", this.getUDate(ins.get("lg0508").toString()));

		BeanUtils.populate(lg02, ins);
		System.out.println("ins==" + ins);
		return lg02;
	}

}
