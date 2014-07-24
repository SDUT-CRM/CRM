package cn.sdut.persistence.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import cn.sdut.persistence.dao.interfaces.Lg13Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg13DaoImpl extends HibernatePageDaoSupport implements Lg13Dao
{

    
    @Override
    public Map getInstance() throws Exception
    {
        this.hql=new StringBuilder()
        .append("select new map(a.lg1301 as lg1301,a.lg1302 as lg1302,")
        .append("               a.lg1303 as lg1303,a.lg1304 as lg1304,")
        .append("               a.lg1305 as lg1305")
        .append("              )")
        .append("  from Lg13 a")
        .append(" where a.lg1301=?")
        ;
        return this.queryForMap("lg1301");
    }
    
    @Override
    public List queryForPageForpz() throws Exception
    {

        Object lg1302 = this.dto.get("qlg1302");
        Object lg1303 = this.dto.get("qlg1303");
        this.hql = new StringBuilder()
                .append("select new map(a.lg1301 as lg1301,a.lg1302 as lg1302,")
                .append("               a.lg1303 as lg1303,a.lg1304 as lg1304,")
                .append("               a.lg1305 as lg1305")
                .append("              )").append("  from Lg13 a")
                .append(" where 1=1");
        this.pars = new ArrayList();
        if (this.checkVal(lg1302))
        {
            this.hql.append("  and a.lg1302=?");
            pars.add(lg1302);
        }
        if (this.checkVal(lg1303))
        {
            this.hql.append("  and a.lg1303 like ?");
            pars.add("%" + lg1303 + "%");
        }
        this.hql.append(" order by a.lg1301");
        return this.queryForList();
    }

    /**
     * Ming
     */
    @Override
    public List queryForPage() throws Exception
    {

        Object lg0402 = this.dto.get("qlg0402");// ���ű��
        Object lg2102 = this.dto.get("qlg2102");// Ա�����
        Object lg0202 = this.dto.get("qlg0202");// Ա������
        Object lg1302 = this.dto.get("qlg1302");// ������
        Object lg1303 = this.dto.get("qlg1303");// �������
        Object lg1403 = this.dto.get("qlg1403");// ���״̬���
        Object lg0302 = this.dto.get("qlg0302");// ����������
        Object blg1402 = this.dto.get("blg1402");// ���뿪ʼʱ��
        Object elg1402 = this.dto.get("elg1402");// �������ʱ��
        Object blg1404 = this.dto.get("blg1404");// ��˿�ʼʱ��
        Object elg1404 = this.dto.get("elg1404");// ��˽���ʱ��
        Object blg1405 = this.dto.get("blg1405");// ��ȡ��ʼʱ��
        Object elg1405 = this.dto.get("elg1405");// ��ȡ����ʱ��

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
         * Object blg1402=this.dto.get("blg1402");//���뿪ʼʱ�� Object
         * elg1402=this.dto.get("elg1402");//�������ʱ�� Object
         * blg1404=this.dto.get("blg1404");//��˿�ʼʱ�� Object
         * elg1404=this.dto.get("elg1404");//��˽���ʱ�� Object
         * blg1405=this.dto.get("blg1405");//��ȡ��ʼʱ�� Object
         * elg1405=this.dto.get("elg1405");//��ȡ����ʱ��
         */

        // ����ʱ�� ��ʼ
        if (this.checkVal(blg1402))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            blg1402 = df.parseObject((String) blg1402);
            this.hql.append(" and a.lg1402>=?");
            this.pars.add(blg1402);
        }
        // ����ʱ�� ����
        if (this.checkVal(elg1402))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            elg1402 = df.parseObject((String) elg1402);
            this.hql.append(" and a.lg1402<=?");
            this.pars.add(elg1402);
        }
        // ���ʱ�� ��ʼ
        if (this.checkVal(blg1404))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            blg1404 = df.parseObject((String) blg1404);
            this.hql.append(" and a.lg1404>=?");
            this.pars.add(blg1404);
        }
        // ���ʱ�� ����
        if (this.checkVal(elg1404))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            elg1404 = df.parseObject((String) elg1404);
            this.hql.append(" and a.lg1404<=?");
            this.pars.add(elg1404);
        }
        // ���ʱ�� ��ʼ
        if (this.checkVal(blg1405))
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            blg1405 = df.parseObject((String) blg1405);
            this.hql.append(" and a.lg1405>=?");
            this.pars.add(blg1405);
        }
        // ���ʱ�� ����
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

}
