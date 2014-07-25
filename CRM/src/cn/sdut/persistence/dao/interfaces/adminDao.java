package cn.sdut.persistence.dao.interfaces;

import java.util.List;
import java.util.Map;

public interface adminDao {

	public void setMapDto(Map dto);
	
	public Map getInstance() throws Exception;
	public boolean personUpdate() throws Exception;

}
