package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg13Dao;
import cn.sdut.services.C2021Services;

public class C2021ServicesImpl implements C2021Services
{
    private Map dto = null;
    private Lg13Dao lg13Dao;
    @Override
    public void setMapDto(Map dto)
    {
        this.dto=dto;
        
    }
    
    
    
    public Map getDto()
    {
        return dto;
    }



    public void setDto(Map dto)
    {
        this.dto = dto;
    }



    public Lg13Dao getLg13Dao()
    {
        return lg13Dao;
    }



    public void setLg13Dao(Lg13Dao lg13Dao)
    {
        this.lg13Dao = lg13Dao;
    }



    @Override
    public String getPageInfo(String url)
    {
        // TODO Auto-generated method stub
        return this.lg13Dao.getPageInfoForpz(url);
    }

    @Override
    public List query() throws Exception
    {
        // TODO Auto-generated method stub
        return this.lg13Dao.queryForPageForpz();
    }

    @Override
    public Map getInstance() throws Exception
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean update() throws Exception
    {
        // TODO Auto-generated method stub
        return false;
    }

}
