package cn.sdut.services.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg01Dao;
import cn.sdut.persistence.dao.interfaces.Lg21Dao;
import cn.sdut.services.B1010Services;
import cn.sdut.system.Tools;

public class B1010ServicesImpl implements B1010Services
{
    private Map dto = null;
    private Lg01Dao lg01Dao;
    private Lg21Dao lg21Dao;
    @Override
    public void setMapDto(Map dto)
    {
       this.dto=dto;
       this.lg01Dao.setMapDto(dto);
       this.lg21Dao.setMapDto(dto);
    }
    
    
    @Override
    public boolean addCustomer() throws Exception
    {
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        dto.put("lg0108", dt.format(new Date()));
        dto.put("lg2103", Tools.getMd5("0000"));
        dto.put("lg2104", this.dto.get("lg0102"));
        dto.put("lg2105", "1");
        lg21Dao.addUser();
        lg01Dao.addCustomer();
        return true;
    }
    
    public Lg21Dao getLg21Dao()
    {
        return lg21Dao;
    }


    public void setLg21Dao(Lg21Dao lg21Dao)
    {
        this.lg21Dao = lg21Dao;
    }


    @Override
    public boolean lock() throws Exception
    {
        this.dto.put("lg2105", "5");
        return this.lg01Dao.updateStatus();
    }
    
    @Override
    public boolean resetPwd() throws Exception
    {
        this.dto.put("lg2103", Tools.getMd5("0000"));
        return this.lg01Dao.resetPwd();
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
