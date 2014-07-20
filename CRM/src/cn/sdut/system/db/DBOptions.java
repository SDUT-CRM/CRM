package cn.sdut.system.db;

import java.util.List;

public interface DBOptions {
	public List getOptions(String fname, String pfcode) throws Exception;

	public String getLastNumber(String fname) throws Exception;
}
