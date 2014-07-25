package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg01Dao;
import cn.sdut.services.B1010Services;

public class B1010ServicesImpl implements B1010Services
{
    private Map dto = null;
    private Lg01Dao lg01Dao;
    @Override
    public void setMapDto(Map dto)
    {
       this.dto=dto;
       this.lg01Dao.setMapDto(dto);
    }

    @Override
    public String getPageInfo(String url)
    {
        return this.lg01Dao.getPageInfo(url);
    }

    @Override
    public List query() throws Exception
    {
        return this.lg01Dao.queryForPage();
    }

    @Override
    public boolean batchModify() throws Exception
    {
        return false;
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

    public Map getDto()
    {
        return dto;
    }

    public void setDto(Map dto)
    {
        this.dto = dto;
    }

    public Lg01Dao getLg01Dao()
    {
        return lg01Dao;
    }

    public void setLg01Dao(Lg01Dao lg01Dao)
    {
        this.lg01Dao = lg01Dao;
    }
    
    

}
