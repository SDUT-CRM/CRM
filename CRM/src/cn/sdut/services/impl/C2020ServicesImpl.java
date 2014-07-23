package cn.sdut.services.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg14Dao;
import cn.sdut.services.C2020Services;

public class C2020ServicesImpl implements C2020Services
{
    private Map dto = null;
    private Lg14Dao lg14Dao;
    
    
    @Override
    public Map getInstance() throws Exception
    {
        return this.lg14Dao.getInstance();
    }
    
    
    @Override
    public boolean update() throws Exception
    {
        this.dto.put("lg0301", this.dto.get("SYSUID"));
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        dto.put("lg1404", dt.format(new Date()));
        return this.lg14Dao.update();
    }
    
    
    
    
    @Override
    public boolean batchModify() throws Exception
    {
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        dto.put("lg1404", dt.format(new Date()));
        return this.lg14Dao.batchModify();
    }
    
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
        this.lg14Dao.setMapDto(dto);
        
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
