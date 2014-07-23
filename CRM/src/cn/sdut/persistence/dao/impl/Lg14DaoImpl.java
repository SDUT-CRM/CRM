package cn.sdut.persistence.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg14Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg14DaoImpl extends HibernatePageDaoSupport implements Lg14Dao
{

    
    @Override
    public boolean update() throws Exception
    {
        this.hql=new StringBuilder()
        .append("update Lg14")
        .append("   set lg1403=?,lg1404=?,lg03.lg2101=?")
        .append(" where lg1401=?")
        .append("")
        .append("")
        ;
        Object args[]={
                this.getObject("lg1403"),
                this.getUDate("lg1404"),
                this.getLong("lg0301"),
                this.getLong("lg1401")
        };
        return this.update(hql.toString(), args);
    }
    
    
    
    @Override
    public Map getInstance() throws Exception
    {
        this.hql=new StringBuilder()
        .append("select new map(a.lg1401 as lg1401,a.lg02.lg2101 as lg2101,")
        .append("               a.lg13.lg1301 as lg1301,to_char(a.lg1402,'yyyy-MM-dd') as lg1402,")
        .append("               a.lg1403 as lg1403,a.lg1405 as lg1405,a.lg03.lg2101 as lg0301")
        .append("              )")
        .append("  from Lg14 a")
        .append(" where a.lg1401=?")
        ;
        this.dto.put("lg1401", this.getLong("lg1401"));
        return this.queryForMap("lg1401");
    }
    
    
    
    
    /**
     * 
     */
    @Override
    public List queryForPage() throws Exception
    {

        Object lg0402 = this.dto.get("qlg0402");// 部门编号
        Object lg2102 = this.dto.get("qlg2102");// 员工编号
        Object lg0202 = this.dto.get("qlg0202");// 员工姓名
        Object lg1302 = this.dto.get("qlg1302");// 配件编号
        Object lg1303 = this.dto.get("qlg1303");// 配件名称
        Object lg1403 = this.dto.get("qlg1403");// 审核状态编号
        Object lg0302 = this.dto.get("qlg0302");// 经手人姓名
        Object blg1402 = this.dto.get("blg1402");// 申请开始时间
        Object elg1402 = this.dto.get("elg1402");// 申请结束时间
        Object blg1404 = this.dto.get("blg1404");// 审核开始时间
        Object elg1404 = this.dto.get("elg1404");// 审核结束时间
        Object blg1405 = this.dto.get("blg1405");// 领取开始时间
        Object elg1405 = this.dto.get("elg1405");// 领取结束时间

        this.pars = new ArrayList();
        this.hql = new StringBuilder()
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
                .append("   and h.fname='LLG02'");

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
            this.hql.append(" and c.lg0202 like ?");
            this.pars.add("%" + lg0202 + "%");
        }

        if (this.checkVal(lg1302))
        {
            this.hql.append(" and b.lg1302=?");
            this.pars.add(lg1302);
        }

        if (this.checkVal(lg1303))
        {
            this.hql.append(" and b.lg1303 like ?");
            this.pars.add("%" + lg1303 + "%");
        }

        if (this.checkVal(lg1403))
        {
            this.hql.append(" and a.lg1403=?");
            this.pars.add(lg1403);
        }

        if (this.checkVal(lg0302))
        {
            this.hql.append(" and e.lg0302 like ?");
            this.pars.add("%" + lg0302 + "%");
        }

        /*
         * Object blg1402=this.dto.get("blg1402");//申请开始时间 Object
         * elg1402=this.dto.get("elg1402");//申请结束时间 Object
         * blg1404=this.dto.get("blg1404");//审核开始时间 Object
         * elg1404=this.dto.get("elg1404");//审核结束时间 Object
         * blg1405=this.dto.get("blg1405");//领取开始时间 Object
         * elg1405=this.dto.get("elg1405");//领取结束时间
         */

        // 申请时间 开始
        if (this.checkVal(blg1402))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            blg1402 = df.parseObject((String) blg1402);
            this.hql.append(" and a.lg1402>=?");
            this.pars.add(blg1402);
        }
        // 申请时间 结束
        if (this.checkVal(elg1402))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            elg1402 = df.parseObject((String) elg1402);
            this.hql.append(" and a.lg1402<=?");
            this.pars.add(elg1402);
        }
        // 审核时间 开始
        if (this.checkVal(blg1404))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            blg1404 = df.parseObject((String) blg1404);
            this.hql.append(" and a.lg1404>=?");
            this.pars.add(blg1404);
        }
        // 审核时间 结束
        if (this.checkVal(elg1404))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            elg1404 = df.parseObject((String) elg1404);
            this.hql.append(" and a.lg1404<=?");
            this.pars.add(elg1404);
        }
        // 审核时间 开始
        if (this.checkVal(blg1405))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            blg1405 = df.parseObject((String) blg1405);
            this.hql.append(" and a.lg1405>=?");
            this.pars.add(blg1405);
        }
        // 审核时间 结束
        if (this.checkVal(elg1405))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            elg1405 = df.parseObject((String) elg1405);
            this.hql.append(" and a.lg1405<=?");
            this.pars.add(elg1405);
        }
        this.hql.append(" order by a.lg1401");
        return this.queryForList();
    }

    @Override
    public boolean batchModify() throws Exception
    {
        this.hql = new StringBuilder()
        .append("update Lg14")
        .append("   set lg1403=?,lg1404=?")
        .append(" where lg1401 in (:lg1401)");
        Object val[] = Tools.StringtoLongArray(this.dto.get("parsList"));
        Object parm[]={
                this.dto.get("type"),
                this.getUDate("lg1404")
        };
        return this.batchUpdate(hql.toString(), val, "lg1401",
                parm);
    }

}
