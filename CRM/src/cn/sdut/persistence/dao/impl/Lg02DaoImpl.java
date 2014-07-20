package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import cn.sdut.persistence.bean.Lg02;
import cn.sdut.persistence.dao.interfaces.Lg02Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg02DaoImpl extends HibernatePageDaoSupport implements Lg02Dao {
    @Override
    public List query() throws Exception
    {
        
        /**
         * 
         */
        Object lg2102=this.dto.get("lg2102");    //Ա�����
        Object lg0401=this.dto.get("lg0401");    //Ա������
        Object lg0202=this.dto.get("lg0202");    //Ա������
        Object lg0207=this.dto.get("lg0207");    //Ա��״̬
        Object blg0208=this.dto.get("blg0208");    //��ְʱ�� ��ʼ
        Object elg0208=this.dto.get("elg0208");    //��ְʱ�� ��ʼ
        this.pars = new ArrayList();
        /**
         * ��Ҫ�鵽
         * Ա����ţ�Ա��������Ա�����ţ�Ա��״̬����ְʱ��
         */
        this.hql = new StringBuilder()
        .append("select new map(c.lg2102 as lg2102,a.lg0202 as lg0202,d.lg0402 as lg0402,")
        .append("               b.fname as cnlg0207,to_char(a.lg0208,'YYYY-MM-DD') as lg0208")
        .append(")")
        .append("  from Lg02 a,Syscode b,Lg21 c,Lg04 d")
        .append(" where a.lg04.lg0401=d.lg0401")
        .append("   and c.lg2101=a.lg2101")
        .append("   and a.lg0207=b.fvalue")
        .append("   and b.fcode='LLG01'")
        ;
        //Ա�����
        if(this.checkVal(lg2102))
        {
            this.hql.append(" and c.lg2102=?");
            this.pars.add(lg2102);
        }
        //Ա������
        if(this.checkVal(lg0401))
        {
            this.hql.append(" and a.lg0401=?");
            this.pars.add(lg0401);
        }
        //Ա������
        if(this.checkVal(lg0202))
        {
            this.hql.append(" and a.lg0202 like ?");
            this.pars.add("%"+lg0202+"%");
        }
        //Ա��״̬
        if(this.checkVal(lg0207))
        {
            this.hql.append(" and a.lg0207=?");
            this.pars.add(lg0207);
        }
        //��ְʱ�� ��ʼ
        if(this.checkVal(blg0208))
        {
            this.hql.append(" and a.lg0208>=?");
            this.pars.add(blg0208);
        }
        //��ְʱ�� ����
        if(this.checkVal(elg0208))
        {
            this.hql.append(" and a.elg0208<=?");
            this.pars.add(elg0208);
        }
        this.hql.append(" order by c.lg2102");
        return this.queryForList();
    }
	
}
