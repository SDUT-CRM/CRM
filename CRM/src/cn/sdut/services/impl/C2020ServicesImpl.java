package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg14Dao;
import cn.sdut.services.C2020Services;

public class C2020ServicesImpl implements C2020Services
{
    private Map dto = null;
    private Lg14Dao lg14Dao;
    
    
    public Lg14Dao getLg14Dao()
    {
        return lg14Dao;
    }

    public void setLg14Dao(Lg14Dao lg14Dao)
    {
        this.lg14Dao = lg14Dao;
    }

    @Override
    public void setMapDto(Map dto)
    {
        this.dto=dto;
        
    }

    @Override
    public String getPageInfo(String url)
    {
        return this.lg14Dao.getPageInfo(url);
    }

    @Override
    public List query() throws Exception
    {
        return this.lg14Dao.queryForPage();
    }

}
