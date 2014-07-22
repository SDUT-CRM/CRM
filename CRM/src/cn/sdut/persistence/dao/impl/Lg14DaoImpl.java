package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.sdut.persistence.dao.interfaces.Lg14Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg14DaoImpl extends HibernatePageDaoSupport implements Lg14Dao{

    @Override
    public List queryForPage() throws Exception
    {
        
        Object lg0402=this.dto.get("lg0402");//部门编号
        Object lg2102=this.dto.get("lg2102");//员工编号
        Object lg0202=this.dto.get("lg0202");//员工姓名
        Object lg1302=this.dto.get("lg1302");//配件编号
        Object lg1303=this.dto.get("lg1303");//配件名称
        Object lg1403=this.dto.get("lg1403");//审核状态编号
        Object lg0302=this.dto.get("lg0302");//经手人姓名
        this.pars = new ArrayList();
       this.hql=new StringBuilder()
        .append("select  new map(a.lg1401 as lg1401,h.fvalue as cnlg0402,")
        .append("                f.lg2102 as lg2102,c.lg0202 as lg0202,")
        .append("                b.lg1302 as lg1302,b.lg1303 as lg1303,")
        .append("                a.lg1406 as lg1406,d.fvalue as cnlg1403,")
        .append("                e.lg0302 as lg0302,a.lg1403 as lg1403,")
        .append("                g.lg0402 as lg0402,to_char(a.lg1402,'YYYY-MM-DD') as lg1402,")
        .append("                to_char(a.lg1404,'YYYY-MM-DD') as lg1404,")
        .append("                to_char(a.lg1405,'YYYY-MM-DD') as lg1405")
        .append("                )")
        .append("  from Lg14 a,Lg13 b,Lg02 c,Syscode d,Lg03 e,")
        .append("       Lg21 f,Lg04 g,Syscode h")
        .append(" where a.lg02.lg2101=f.lg2101")
        .append("   and a.lg03.lg2101=e.lg2101")
        .append("   and a.lg13.lg1301=b.lg1301")
        .append("   and a.lg02.lg2101=c.lg2101")
        .append("   and c.lg04.lg0401=g.lg0401")
        .append("   and a.lg1403=d.fcode")
        .append("   and g.lg0402=h.fcode")
        .append("   and d.fname='LLG04'")
        .append("   and h.fname='LLG02'")
        ;
       System.out.println(this.dto);
       if (this.checkVal(lg0402))
       {
           this.hql.append(" and g.lg0402=?");
           this.pars.add(lg0402);
       }
       
       if (this.checkVal(lg2102))
       {
           this.hql.append(" and c.lg2102=?");
           this.pars.add(lg2102);
       }
       
       if (this.checkVal(lg0202))
       {
           this.hql.append(" and c.lg0202 like ？");
           this.pars.add("%"+lg0202+"%");
       }
       
       if (this.checkVal(lg1302))
       {
           this.hql.append(" and b.lg1302=?");
           this.pars.add(lg1302);
       }
       
       if (this.checkVal(lg1303))
       {
           this.hql.append(" and b.lg1303 like ?");
           this.pars.add("%"+lg1303+"%");
       }
       
       if (this.checkVal(lg1403))
       {
           this.hql.append(" and a.lg1403=?");
           this.pars.add(lg1403);
       }
       
       if (this.checkVal(lg0302))
       {
           this.hql.append(" and e.lg0302 like ?");
           this.pars.add("%"+lg0302+"%");
       }
       this.hql.append(" order by a.lg1401");
       return this.queryForList();
    }

}
