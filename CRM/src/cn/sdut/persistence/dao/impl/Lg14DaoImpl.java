package cn.sdut.persistence.dao.impl;

import java.util.List;

import cn.sdut.persistence.dao.interfaces.Lg14Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg14DaoImpl extends HibernatePageDaoSupport implements Lg14Dao{

    @Override
    public List queryForPage() throws Exception
    {
       this.hql=new StringBuilder()
        .append("select  new map(a.lg14.lg1401 as lg1401,h.fvalue as cnlg0402,")
        .append("                f.lg2102 as lg2102,c.lg0202 as lg0202,")
        .append("                b.lg1302 as lg1302,b.lg1303 as lg1303,")
        .append("                a.lg1406 as lg1406,d.fvalue as cnlg1403,")
        .append("                e.lg0302 as lg0302,a.lg1403 as lg1403,")
        .append("                g.lg0402 as lg0402")
        .append("                )")
        .append("  from Lg14 a,Lg13 b,Lg02 c,Syscode d,Lg03 e,")
        .append("       Lg21 f,Lg04 g,Syscode h")
        .append(" where a.lg21.lg2101=f.lg2101")
        .append("   and a.lg1403=d.fcode")
        .append("   and a.lg03.lg0301=e.lg21.lg2101")
        .append("   and a.lg13.lg1301=b.lg1301")
        .append("   and a.lg21.lg2101=c.lg21.lg2101")
        .append("   and c.lg04.lg0401=g.lg0401")
        .append("   and g.lg0402=h.fcode")
        .append("   and d.fname='LLG04'")
        .append("   and h.fname='LLG02'")
        ;
        return this.queryForList();
    }

}
