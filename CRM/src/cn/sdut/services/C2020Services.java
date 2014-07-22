package cn.sdut.services;

import java.util.List;
import java.util.Map;

public interface C2020Services
{
    public void setMapDto(Map dto);
    public String getPageInfo(String url);
    public List query()throws Exception;
    public boolean batchModify()throws Exception;
}
