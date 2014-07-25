package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg16Dao;
import cn.sdut.services.C5050Services;

public class C5050ServicesImpl implements C5050Services
{
    private Map dto;
    private Lg16Dao lg16Dao;

    @Override
    public void setMapDto(Map dto)
    {
        this.dto=dto;
        this.lg16Dao.setMapDto(dto);
        
    }

    @Override
    public Map getMapDto()
    {
        return this.dto;
    }

    @Override
    public String getPageInfo(String url)
    {
        return this.lg16Dao.getPageInfo(url);
    }

    @Override
    public List query() throws Exception
    {
        return this.lg16Dao.query();
    }

    @Override
    public Map getInstance() throws Exception
    {
        return null;
    }

    @Override
    public boolean update() throws Exception
    {
        return false;
    }

    @Override
    public boolean add() throws Exception
    {
        return false;
    }

    public Map getDto()
    {
        return dto;
    }

    public void setDto(Map dto)
    {
        this.dto = dto;
    }

    public Lg16Dao getLg16Dao()
    {
        return lg16Dao;
    }

    public void setLg16Dao(Lg16Dao lg16Dao)
    {
        this.lg16Dao = lg16Dao;
    }
    
    

}
