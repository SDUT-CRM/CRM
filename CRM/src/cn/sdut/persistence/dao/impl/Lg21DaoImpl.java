package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg21;
import cn.sdut.persistence.dao.interfaces.Lg21Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;
import cn.sdut.system.Tools;

public class Lg21DaoImpl extends HibernatePageDaoSupport implements Lg21Dao {
    
    
    
    @Override
    public Map getInstance() throws Exception
    {
        StringBuilder hql = new StringBuilder()
        .append("select new map(a.lg2101 as lg2101,a.lg2104 as lg2104,a.lg2105 as lg2105,")
        .append("               b.lg0202 as lg0202,b.lg0203 as lg0203,a.lg2102 as lg2102,")
        .append("               b.lg0204 as lg0204,b.lg0205 as lg0205,b.lg0206 as lg0206,")
        .append("               d.fvalue as cnlg0401,c.fvalue as cnlg0207,to_char(b.lg0208,'yyyy-MM-dd') as lg0208,")
        .append("               f.fvalue as cnlg2105,e.lg0401 as lg0401,b.lg0207 as lg0207")
        .append(")")
        .append("  from Lg21 a,Lg02 b,Syscode c,Syscode d,Lg04 e,Syscode f")
        .append(" where a.lg2101=b.lg2101")
        .append("   and e.lg0401=b.lg04.lg0401")
        .append("   and a.lg2105=f.fcode")
        .append("   and d.fcode=e.lg0402")
        .append("   and c.fcode=b.lg0207")
        .append("   and d.fname='LLG02'")
        .append("   and c.fname='LLG01'")
        .append("   and f.fname='LLG03'")
        .append("   and a.lg2101=?")
        ;
        Object args=this.getLong("lg2101");
        return this.queryForMap(hql.toString(), args);
    }
    
    @Override
    public boolean UpdateUser() throws Exception
    {
        //this.dto.put("lg2101", this.getObject("lg2101"));
        //this.dto.put("lg2103", this.getObject("lg2103"));
       //// this.dto.put("lg2104", this.getObject("lg2104"));
       // this.dto.put("lg2105", this.getObject("lg2105"));
        StringBuilder hql=new StringBuilder()
        .append("update Lg21")
        .append("   set lg2104=?")
        .append(" where lg2101=?")
        ;
        System.out.println(dto);
        Object[] args={
          this.getObject("lg2104"),
          this.getLong("lg2101")
        };
        this.update(hql.toString(), args);
        return true;
    }
    
    @Override
    public long addUser() throws Exception
    {
        this.dto.put("lg2102", this.getObject("lg2102"));
        this.dto.put("lg2103", Tools.getMd5(this.getObject("lg2103")));
        this.dto.put("lg2104", this.getObject("lg2104"));
        this.dto.put("lg2105", this.getObject("lg2105"));
        Lg21 lg21 =  this.addObject(Lg21.class);
        this.dto.put("lg21", lg21);
        return lg21.getLg2101();
    }

	@Override
	public Map checkUser() throws Exception {
		StringBuilder hql = new StringBuilder()
				.append("select new map(x.lg2101 as lg2101,")
				.append("       x.lg2102 as lg2102,x.lg2103 as lg2103,")
				.append("       x.lg2104 as lg2104,x.lg2105 as lg2105)")
				.append("  from Lg21 x")
				.append(" where x.lg2102=? and x.lg2103=?");
		Object args[] = { 
				this.dto.get("username") ,
				Tools.getMd5(this.dto.get("pwd"))
		};
		return this.queryForMap(hql.toString(), args);
	}
	
	
	
	
	/**
	 * 管理员查询人员信息
	 */
	@Override
	public List adminQuery() throws Exception {
		System.out.println(this.dto);
		hql=new StringBuilder()
		.append("select new map(x.lg2101 as lg2101,x.lg2102 as lg2102,")
		.append("       x.lg2104 as lg2104,x.lg2105 as lg2105,y.fvalue as cnlg2105)")
		.append("  from Lg21 x, Syscode y")
		.append(" where x.lg2105=y.fcode")
		.append(" and y.fname='LLG03'")
		.append("  and x.lg2105!='5'")
		;
	
		
		System.out.println(hql.toString());
		return this.queryForList();
	}

	@Override
	public List queryForPage() throws Exception {
		Object lg2104=this.dto.get("lg2104");
		this.pars=new ArrayList();
		hql=new StringBuilder()
		.append("select new map(x.lg2101 as lg2101,x.lg2102 as lg2102,")
		.append("       x.lg2104 as lg2104,x.lg2105 as lg2105,y.fvalue as cnlg2105)")
		.append("  from Lg21 x, Syscode y")
		.append(" where x.lg2105=y.fcode")
		.append(" and y.fname='LLG03'")
		.append("  and x.lg2105!='5'")
		;
		return this.queryForList();
	}
	/**
	 * 删除：即将21表中的状态改为5
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean deleteUser() throws Exception 
	{
		this.hql=new StringBuilder()
		.append("update Lg21")
		.append("   set lg2105=?")
		.append(" where lg2101=(:lg2101)")
		;
		
		System.out.println("=====Lg21DaoImpl.deleteUser()=====");
		System.out.println("parsList++++"+this.dto);
		Object ids[] = this.getIdArray("parsList");
		System.out.println(":::::"+ids.length);
		for(int i = 0; i < ids.length; i++){
			System.out.println("zxh"+ids[i]);
		}
		return this.batchUpdate(hql.toString(), ids, "lg2101", "5");
		
	}

	@Override
	public boolean add() throws Exception {
		this.dto.put("lg2102", "test");
        this.dto.put("lg2103", "0000");
        this.dto.put("lg2104", this.getObject("name"));
        this.dto.put("lg2105", "3");
        Lg21 lg21 =  this.addObject(Lg21.class);
        this.dto.put("lg21", lg21);
        return lg21.getLg2101()>0;
        }
}
