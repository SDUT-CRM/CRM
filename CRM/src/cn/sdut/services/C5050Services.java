package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface C5050Services
{
    public void setMapDto(Map dto);
    public Map getMapDto();
    public String getPageInfo(String url);
    public List query()throws Exception;
    public Map getInstance() throws Exception;
    public boolean update() throws Exception;
    public boolean add() throws Exception;

}
