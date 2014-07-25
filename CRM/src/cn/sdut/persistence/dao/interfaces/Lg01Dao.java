package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

public interface Lg01Dao {
	
	public void setMapDto(Map dto);
	public List queryForPage() throws Exception;
    public String getPageInfo(String url);
    public boolean addCustomer() throws Exception;
    public boolean updateCustomer() throws Exception;
    public boolean resetPwd() throws Exception;
}
