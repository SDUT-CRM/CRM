package cn.sdut.services.impl;

import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg06Dao;
import cn.sdut.persistence.dao.interfaces.Lg16Dao;
import cn.sdut.services.C4040Services;

public class C4040ServicesImpl implements C4040Services
{
    private Lg06Dao lg06Dao;
    private Lg16Dao lg16Dao;
    private Map dto;
    
    
    public Lg06Dao getLg06Dao()
    {
        return lg06Dao;
    }

    public void setLg06Dao(Lg06Dao lg06Dao)
    {
        this.lg06Dao = lg06Dao;
    }

    public Lg16Dao getLg16Dao()
    {
        return lg16Dao;
    }

    public void setLg16Dao(Lg16Dao lg16Dao)
    {
        this.lg16Dao = lg16Dao;
    }

    @Override
    public Map calForms() throws Exception
    {
        
        //成本blg0604
        //报销blg1605
        this.dto.put("blg0604", this.dto.get("begintime"));
        this.dto.put("elg0604", this.dto.get("begintime"));
        this.dto.put("blg1605", this.dto.get("endtime"));
        this.dto.put("elg1605", this.dto.get("endtime"));
        this.lg06Dao.queryForForms();
        this.lg16Dao.queryForForms();
        return null;
    }

    @Override
    public void setMapDto(Map dto)
    {
        this.dto=dto;
        this.lg06Dao.setMapDto(dto);
        this.lg16Dao.setMapDto(dto);
    }
}
