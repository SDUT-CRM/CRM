package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg02Dao;
import cn.sdut.services.C1010Services;

public class C1010ServicesImpl implements C1010Services
{
    private Lg02Dao lg02Dao = null;
    private Map dto = null;

    public Lg02Dao getLg02Dao()
    {
        return lg02Dao;
    }

    public void setLg02Dao(Lg02Dao lg02Dao)
    {
        this.lg02Dao = lg02Dao;
    }

    public Map getDto()
    {
        return dto;
    }

    public void setDto(Map dto)
    {
        this.dto = dto;
        this.lg02Dao.setMapDto(dto);
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

    }
}
