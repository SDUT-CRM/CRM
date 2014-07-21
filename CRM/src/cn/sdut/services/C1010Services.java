package cn.sdut.services;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface C1010Services
{
    public void setMapDto(Map dto);

    public List query()throws Exception;
    
    public String getPageInfo(String url);
    @Transactional
    public boolean addEmployee() throws Exception;
}