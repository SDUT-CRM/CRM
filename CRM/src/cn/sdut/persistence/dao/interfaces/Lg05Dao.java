package cn.sdut.persistence.dao.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface Lg05Dao {
	
	public void setMapDto(Map dto);

	public List query() throws Exception;
}
