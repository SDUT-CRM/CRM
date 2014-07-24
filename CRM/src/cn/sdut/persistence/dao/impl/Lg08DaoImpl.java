package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import cn.sdut.persistence.bean.Lg01;
import cn.sdut.persistence.bean.Lg07;
import cn.sdut.persistence.bean.Lg08;
import cn.sdut.persistence.dao.interfaces.Lg08Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg08DaoImpl extends HibernatePageDaoSupport implements Lg08Dao
{

    @Override
    public Map getInstance() throws Exception
    {
        return null;
    }

    // 查询某个活动的详情
    @Override
    public List getActivity() throws Exception
    {
        Object lg0701 = this.getObject("lg0701");
        this.hql = new StringBuilder()
                .append("select new map(a.lg01.lg0102 as lg0102,a.lg0801 as lg0801,")
                .append("               a.lg0802 as lg0802,a.lg0804 as lg0804,b.fvalue as cnlg0804,")
                .append("               a.lg01.lg2101 as lg2101,a.lg01.lg0102 as lg0102,a.lg07.lg0702 as lg0702,")
                .append("               a.lg07.lg03.lg0302 as lg0302,a.lg07.lg0706,a.lg07.lg0708,a.lg07.lg0707")
                .append("               )")
                .append("  from Lg08 a,Syscode b")
                .append(" where a.lg0804=b.fcode")
                .append("   and b.fname='LG0804'")
                .append("   and a.lg07.lg0701=?");
        this.pars=new ArrayList();
        if (this.checkVal(lg0701))
        {
            pars.add(this.getLong("lg0701"));
        }

        return this.queryForList();
    }

    @Override
    public int getNum() throws Exception
    {
        Object args[] =
        { this.getLong("lg0701"), "1" };
        StringBuilder hql = new StringBuilder().append("select count(*)")
                .append("  from Lg08 x ")
                .append(" where x.lg07.lg0701=? and x.lg0804=?");
        return this.queryForNumber(hql.toString(), args).intValue();
    }

    @Override
    public boolean check() throws Exception
    {
        Object args[] =
        { this.getLong("lg2101"), this.getLong("lg0701") };
        StringBuilder hql = new StringBuilder().append("select count(*)")
                .append("  from Lg08 x")
                .append(" where x.lg01.lg2101 = ? and x.lg07.lg0701 = ?")
                .append("       and x.lg0804 = 1");;
        return this.queryForNumber(hql.toString(), args).intValue() == 0;
    }

    @Override
    public boolean add() throws Exception
    {
        this.dto.put("lg0802", this.getUDate("lg0802"));
        this.dto.put("lg0803", this.getUDate("lg0803"));
        this.dto.put("lg0804", this.getObject("lg0804"));

        Lg01 lg01 = (Lg01) dto.get("lg01");
        Lg07 lg07 = (Lg07) dto.get("lg07");

        Lg08 lg08 = this.addObject(Lg08.class);
        this.dto.put("lg08", lg08);
        return lg08.getLg0801() > 0;
    }

    @Override
    public boolean delete() throws Exception
    {
        StringBuilder hql = new StringBuilder().append("update Lg08 x")
                .append("   set x.lg0804=?").append(" where x.lg0801=?");
        // System.out.println("dto=="+dto);
        Object args[] =
        { "2", this.getLong("lg0801") };
        return this.update(hql.toString(), args);
    }

    @Override
    public List query() throws Exception
    {

        return null;
    }

    @Override
    public boolean modify() throws Exception
    {
        return true;
    }

    @Override
    public List queryForPage() throws Exception
    {
        Object lg2101 = this.dto.get("lg2101");
        Object lg0801 = this.dto.get("lg0801");
        Object qlg0702 = this.getObject("qlg0702");
        Object qlg0804 = this.getObject("qlg0804");
        Object bqlg0708 = this.getObject("bqlg0708");
        Object eqlg0708 = this.getObject("eqlg0708");
        Object bqlg0802 = this.getObject("bqlg0802");
        Object eqlg0802 = this.getObject("eqlg0802");

        this.pars = new ArrayList();
        this.hql = new StringBuilder()
                .append("select new map(x.lg0801 as lg0801,x.lg01.lg2101 as lg0101,")
                .append("       x.lg07.lg0701 as lg0701, to_char(x.lg0802,'YYYY-MM-DD') as lg0802,")
                .append("       to_char(x.lg0803,'YYYY-MM-DD') as lg0803, b.fvalue as cnlg0707,")
                .append("       y.lg0707 as lg0707, y.lg0702 as lg0702,")
                .append("       x.lg0804 as lg0804, c.fvalue as cnlg0804, ")
                .append("       to_char(y.lg0708,'YYYY-MM-DD') as lg0708")
                .append("       )")
                .append("  from Lg08 x, Lg07 y, Syscode b, Syscode c")
                .append(" where 1=1").append("   and y.lg0707=b.fcode")
                .append("   and b.fname='LG0707'")
                .append("   and x.lg0804=c.fcode")
                .append("   and c.fname='LG0804'")
                .append("   and y.lg0701=x.lg07.lg0701");

        if (this.checkVal(lg2101))
        {
            this.hql.append(" and x.lg01.lg2101=?");
            this.pars.add(this.getLong("lg2101"));
        }

        if (this.checkVal(qlg0702))
        {
            this.hql.append(" and y.lg0702=?");
            this.pars.add(this.getObject("qlg0702"));
        }

        if (this.checkVal(qlg0804))
        {
            this.hql.append(" and x.lg0804=?");
            this.pars.add(this.getObject("qlg0804"));
        }

        if (this.checkVal(bqlg0708))
        {
            this.hql.append(" and y.lg0708>=?");
            this.pars.add(this.getUDate("bqlg0708"));
        }

        if (this.checkVal(eqlg0708))
        {
            this.hql.append(" and y.lg0708<=?");
            this.pars.add(this.getUDate("eqlg0708"));
        }

        if (this.checkVal(bqlg0802))
        {
            this.hql.append(" and x.lg0802>=?");
            this.pars.add(this.getUDate("bqlg0802"));
        }

        if (this.checkVal(eqlg0802))
        {
            this.hql.append(" and x.lg0802<=?");
            this.pars.add(this.getUDate("eqlg0802"));
        }
        this.hql.append(" order by x.lg0801 desc");
        return this.queryForList();
    }
}
