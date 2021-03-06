package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg03;
import cn.sdut.persistence.bean.Lg21;
import cn.sdut.persistence.dao.interfaces.Lg07Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg07DaoImpl extends HibernatePageDaoSupport implements Lg07Dao {

	@Override
	public boolean increase() throws Exception {
		Object args[] = {
			this.getLong("lg0701")
		};
		this.hql = new StringBuilder()
		.append("update Lg07 ")
		.append("   set lg0705 = lg0705+1 ")
		.append(" where lg0705>0 and lg0701=?")
		;
		boolean tag = this.update(hql.toString(), args);
		return tag;
	}
	
	@Override
	public boolean decrease() throws Exception {
		Object args[] = {
			this.getLong("lg0701")
		};
		this.hql = new StringBuilder()
		.append("update Lg07 ")
		.append("   set lg0705 = lg0705-1 ")
		.append(" where lg0705>0 and lg0701=?")
		;
		boolean tag = this.update(hql.toString(), args);
		return tag;
	}
	
	@Override
	public Map getInstance() throws Exception {
		this.hql = new StringBuilder()
		.append("select new map(x.lg0701 as lg0701,x.lg03.lg2101 as lg0301,")
		.append("       x.lg0702 as lg0702, x.lg0703 as lg0703,")
		.append("       x.lg0704 as lg0704, x.lg0705 as lg0705,")
		.append("       to_char(x.lg0706,'YYYY-MM-DD') as lg0706, x.lg0707 as lg0707,")
		.append("       to_char(x.lg0708,'YYYY-MM-DD') as lg0708, to_char(x.lg0709,'YYYY-MM-DD') as lg0709,")
		.append("       to_char(x.lg0710,'YYYY-MM-DD') as lg0710, b.fvalue as cnlg0707")
		.append("       )")
		.append("  from Lg07 x, Syscode b")
		.append("   where x.lg0707=b.fcode")
		.append("   and b.fname='LG0707'")
        .append("   and x.lg0701=?");
		return this.queryForMap("lg0701");
	}
	
	
    @Override
    public List queryForPage() throws Exception
    {
        Object lg0701 = this.dto.get("qlg0701");
        Object lg2101 = this.dto.get("qlg2101");
        Object lg0702 = this.dto.get("qlg0702");
        Object lg0703 = this.dto.get("qlg0703");
        Object lg0704 = this.dto.get("qlg0704");
        Object lg0705 = this.dto.get("qlg0705");
        Object lg0707 = this.dto.get("qlg0707");
        Object lg0302 = this.dto.get("qlg0302");
        Object blg0706 = this.dto.get("blg0706");
        Object elg0706 = this.dto.get("elg0706");
        Object blg0708 = this.dto.get("blg0708");
        Object elg0708 = this.dto.get("elg0708");
        System.out.println(this.dto);
        this.pars = new ArrayList();
        this.hql = new StringBuilder()
                .append("select new map(x.lg0701 as lg0701,x.lg03.lg2101 as lg0301,")
                .append("               x.lg0702 as lg0702, x.lg0703 as lg0703,")
                .append("               x.lg0704 as lg0704, x.lg0705 as lg0705,")
                .append("               to_char(x.lg0706,'YYYY-MM-DD')as lg0706, x.lg0707 as lg0707,")
                .append("               to_char(x.lg0708,'YYYY-MM-DD') as lg0708, to_char(x.lg0709,'YYYY-MM-DD') as lg0709,")
                .append("               to_char(x.lg0710,'YYYY-MM-DD') as lg0710, b.fvalue as cnlg0707,")
                .append("               x.lg03.lg0302 as lg0302")
                .append("               )").append("  from Lg07 x, Syscode b")
                .append(" where x.lg0707=b.fcode")
                .append("   and b.fname='LG0707'");
           
        /*this.hql=new StringBuilder()
        .append("select new map(a.lg0701 as lg0701,a.lg03.lg2101 as lg2101,")
        .append("               a.lg0702 as lg0702,a.lg0703 as lg0703,")
        .append("               a.lg0704 as lg0704,a.lg0705 as lg0705,")
        .append("               to_char(a.lg0706,'yyyy-mm-dd') as lg0706,")
        .append("               a.lg0707 as lg0707,")
        .append("               to_char(a.lg0708,'yyyy-mm-dd') as lg0708,")
        .append("               to_char(a.lg0709,'yyyy-mm-dd') as lg0709,")
        .append("               to_char(a.lg0710,'yyyy-mm-dd') as lg0710,")
        .append("               c.fvalue as cnlg0707,")
        .append("               count(b.lg0801) as bmrs,")
        .append("               (a.lg0705-count(b.lg0801)) as syrs")
        .append("               )")
        .append("               from Lg08 b right join b.lg07 a , Syscode c")
        .append(" where a.lg0707=c.fcode")
        .append("  and c.fname='LG0707'")
        .append(" group by a.lg0701,a.lg03.lg2101,a.lg0702,a.lg0703,")
        .append("          a.lg0704,a.lg0705,a.lg0706,a.lg0707,")
        .append("          a.lg0708,a.lg0709,a.lg0710,c.fname,")
        .append("          c.fvalue,b.lg07.lg0701")
        ;*/

        if (this.checkVal(lg2101))
        {
            hql.append("  and x.lg03.lg2101=?");
            pars.add(lg2101);
        }

        if (this.checkVal(lg0302))
        {
            hql.append("  and x.lg03.lg0302 like ?");
            pars.add("%" + lg0302 + "%");
        }

        if (this.checkVal(lg0702))
        {
            hql.append("  and x.lg0702 like ?");
            pars.add("%" + lg0702 + "%");
        }

        if (this.checkVal(lg0703))
        {
            hql.append("  and x.lg0703 like ?");
            pars.add("%" + lg0703 + "%");
        }

        // 活动报名截止日期

        if (this.checkVal(blg0706))
        {
            hql.append("  and x.lg0706>=?");
            pars.add(Tools.parseDate(blg0706));
        }

        if (this.checkVal(elg0706))
        {
            hql.append("  and x.lg0706<=?");
            pars.add(Tools.parseDate(elg0706));
        }
        if (this.checkVal(lg0707))
        {
            hql.append("  and x.lg0707=?");
            pars.add(lg0707);
        }
        // 举行活动时间
        
        if (this.checkVal(blg0708))
        {
            hql.append("  and x.lg0708>=?");
            pars.add(Tools.parseDate(blg0708));
        }

        if (this.checkVal(elg0708))
        {
            hql.append("  and x.lg0708<=?");
            pars.add(Tools.parseDate(elg0708));
        }

        this.hql.append(" order by x.lg0701 desc");
        return this.queryForList();
    }

	@Override
	public boolean add() throws Exception {
	    Lg03 lg03=new Lg03();
	    lg03.setLg2101(this.getLong("SYSUID"));
	    dto.put("lg03", lg03);
	    dto.put("lg0702", this.getObject("lg0702"));
	    dto.put("lg0703", this.getObject("lg0703"));
	    dto.put("lg0704", this.getDouble("lg0704"));
	    dto.put("lg0705", this.getLong("lg0705"));
	    dto.put("lg0706", this.getUDate("lg0706"));
	    dto.put("lg0707", this.getObject("lg0707"));
	    dto.put("lg0708", this.getUDate("lg0708"));
	    dto.put("lg0709", this.getUDate("lg0709"));
	    dto.put("lg0710", this.getUDate("lg0710"));
	    this.addObject(Lg03.class);
		return true;
	}

	@Override
	public List query() throws Exception {
		Object lg0701 = this.dto.get("lg0701");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0701 as lg0701,x.lg03.lg2101 as lg0301,")
		.append("       x.lg0702 as lg0702, x.lg0703 as lg0703,")
		.append("       x.lg0704 as lg0704, x.lg0705 as lg0705,")
		.append("       x.lg0706 as lg0706, x.lg0707 as lg0707,")
		.append("       x.lg0708 as lg0708, x.lg0709 as lg0709,")
		.append("       x.lg0710 as lg0710")
		.append("       )")
		.append("  from Lg07 x")
		.append(" where 1=1");
		if (checkVal(lg0701)) {
			this.hql.append(" and x.lg0701=?");
			this.pars.add(Long.parseLong(lg0701.toString()));
		}
		return this.queryForList();
	}

	@Override
	public boolean modify() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
