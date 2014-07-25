package cn.sdut.persistence.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.bean.Lg04;
import cn.sdut.persistence.dao.interfaces.Lg02Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg02DaoImpl extends HibernatePageDaoSupport implements Lg02Dao
{

    
    
    
    @Override
    public boolean updateEmployee() throws Exception
    {
        StringBuilder hql = new StringBuilder()
        .append("update Lg02")
        .append("   set lg0202=?,lg0204=?,lg0205=?,lg0203=?,")
        .append("       lg0206=?,lg04=?,lg0207=?,lg0209=?")
        .append(" where lg2101=?")
        ;
        Lg04 lg04 = new Lg04();
        lg04.setLg0401(this.getLong("lg0401"));
        System.out.println(dto);
        Object args[]={
          this.getObject("lg0202"),      
          this.getObject("lg0204"),      
          this.getObject("lg0205"),  
          this.getObject("lg0203"),
          this.getObject("lg0206"),      
          lg04,
          this.getObject("lg0207"),
          this.getUDate("lg0209"),
          this.getLong("lg2101")
        };
        return this.update(hql.toString(), args);
    }
    /**
     * 
     */
    @Override
    public boolean addEmployee() throws Exception
    {
        //this.dto.put("lg0401", this.getObject("lg0401"));
        Lg04 lg04 = new Lg04();
        lg04.setLg0401(this.getLong("lg0401"));
        this.dto.put("lg04", lg04);
        this.dto.put("lg0202", this.getObject("lg0202"));
        this.dto.put("lg0203", this.getObject("lg0203"));
        this.dto.put("lg0204", this.getObject("lg0204"));
        this.dto.put("lg0205", this.getObject("lg0205"));
        this.dto.put("lg0206", this.getObject("lg0206"));
        this.dto.put("lg0207", this.getObject("lg0207"));
        this.dto.put("lg0208", this.getUDate("lg0208"));
        this.dto.put("lg0209", this.getUDate("lg0209"));
        Lg02 lg02 = this.addObject(Lg02.class);
        return true;
    }
    /**
     * 
     */
    @Override
    public List queryForPage() throws Exception
    {
        /**
         * 
         */
        Object lg2102 = this.dto.get("qlg2102"); // 员工编号
        Object lg0401 = this.dto.get("qlg0401"); // 员工部门
        Object lg0202 = this.dto.get("qlg0202"); // 员工姓名
        Object lg0207 = this.dto.get("qlg0207"); // 员工状态
        Object blg0208 = this.dto.get("blg0208");// this.dto.get("blg0208");
        Object elg0208 = this.dto.get("elg0208");// this.dto.get("elg0208");
                                                  // //入职时间 开始
        this.pars = new ArrayList();
        /**
         * 需要查到 员工编号，员工姓名，员工部门，员工状态，入职时间
         */
        this.hql = new StringBuilder()
                .append("select new map(c.lg2101 as lg2101,c.lg2102 as lg2102,a.lg0202 as lg0202,e.fvalue as cnlg0402,")
                .append("               b.fvalue as cnlg0207,to_char(a.lg0208,'YYYY-MM-DD') as lg0208")
                .append(")").append("  from Lg02 a,Syscode b,Lg21 c,Lg04 d,Syscode e")
                .append(" where a.lg04.lg0401=d.lg0401")
                .append("   and c.lg2101=a.lg2101")
                .append("   and a.lg0207=b.fcode")
                .append("   and a.lg04.lg0402=e.fcode")
                .append("   and b.fname='LLG01'")
                .append("   and e.fname='LLG02'")
                ;
        // 员工编号
        if (this.checkVal(lg2102))
        {
            this.hql.append(" and c.lg2102=?");
            this.pars.add(lg2102);
        }
        // 员工部门
        if (this.checkVal(lg0401))
        {
            lg0401=Long.parseLong((String)lg0401);
            this.hql.append(" and a.lg04.lg0401=?");
            this.pars.add(lg0401);
        }
        // 员工姓名
        if (this.checkVal(lg0202))
        {
            this.hql.append(" and a.lg0202 like ?");
            this.pars.add("%" + lg0202 + "%");
        }
        // 员工状态
        if (this.checkVal(lg0207))
        {
            this.hql.append(" and a.lg0207=?");
            this.pars.add(lg0207);
        }
        // 入职时间 开始
        if (this.checkVal(blg0208))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            blg0208=df.parseObject((String)blg0208);
            this.hql.append(" and a.lg0208>=?");
            this.pars.add(blg0208);
        }
        // 入职时间 结束
        if (this.checkVal(elg0208))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            elg0208=df.parseObject((String)elg0208);
            this.hql.append(" and a.lg0208<=?");
            this.pars.add(elg0208);
        }
        this.hql.append(" order by c.lg2102");
        return this.queryForList();
    }

    

}
