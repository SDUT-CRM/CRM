package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.bean.Lg07;
import cn.sdut.persistence.dao.interfaces.Lg07Dao;
import cn.sdut.services.C3030Services;

public class C3030ServicesImpl implements C3030Services
{

    private Lg07Dao lg07Dao;
    private Map dto;
    @Override
    public void setMapDto(Map dto)
    {
        this.dto=dto;
        this.lg07Dao.setMapDto(dto);
    }

    @Override
    public String getPageInfo(String url)
    {
        return this.lg07Dao.getPageInfo(url);
    }

    @Override
    public List query() throws Exception
    {
        return this.lg07Dao.queryForPage();
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

    
    public Lg07Dao getLg07Dao()
    {
        return lg07Dao;
    }

    public void setLg07Dao(Lg07Dao lg07Dao)
    {
        this.lg07Dao = lg07Dao;
    }

    public Map getDto()
    {
        return dto;
    }

    public void setDto(Map dto)
    {
        this.dto = dto;
    }
    
    
    
    

}
