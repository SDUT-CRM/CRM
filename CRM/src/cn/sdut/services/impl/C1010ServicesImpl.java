package cn.sdut.services.impl;

import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg02Dao;
import cn.sdut.services.C1010Services;

public class C1010ServicesImpl implements C1010Services
{
    private Lg02Dao lg02Dao = null;
    private Map dto = null;

    @Override
    public List query() throws Exception
    {
        return this.lg02Dao.queryForPage();
    }

    @Override
    public void setMapDto(Map dto)
    {
        // TODO Auto-generated method stub

    }
}
