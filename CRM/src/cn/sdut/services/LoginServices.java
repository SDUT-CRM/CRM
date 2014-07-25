package cn.sdut.services;

import java.util.Map;

public interface LoginServices {
	public void setMapDto(Map dto);

	public Map getInstance() throws Exception;
}
