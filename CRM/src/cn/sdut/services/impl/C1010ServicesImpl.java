package cn.sdut.services.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg02Dao;
import cn.sdut.persistence.dao.interfaces.Lg21Dao;
import cn.sdut.services.C1010Services;

public class C1010ServicesImpl implements C1010Services
{
    private Lg02Dao lg02Dao = null;
    private Lg21Dao lg21Dao =null;
    private Map dto = null;
    
    @Override
    public boolean addEmployee() throws Exception
    {
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        dto.put("lg0209", dt.format(new Date()));
        lg21Dao.addUser();
        lg02Dao.addEmployee();
        System.out.println(dto);
        return true;
    }
    
    @Override
    public String getPageInfo(String url)
    {
             return this.lg02Dao.getPageInfo(url);
    }
    
    
    
    
    public Lg21Dao getLg21Dao()
    {
        return lg21Dao;
    }

    public void setLg21Dao(Lg21Dao lg21Dao)
    {
        this.lg21Dao = lg21Dao;
    }

    public Lg02Dao getLg02Dao()
    {
        return lg02Dao;
    }

    public void setLg02Dao(Lg02Dao lg02Dao)
    {
        this.lg02Dao = lg02Dao;
    }

    @Override
    public List query() throws Exception
    {
        return this.lg02Dao.queryForPage();
    }

    @Override
    public void setMapDto(Map dto)
    {
        this.dto =dto;
        this.lg02Dao.setMapDto(dto);
        this.lg21Dao.setMapDto(dto);

    }
}
