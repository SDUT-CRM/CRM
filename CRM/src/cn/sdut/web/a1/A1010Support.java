package cn.sdut.web.a1;

import java.util.List;

import cn.sdut.services.A1010Services;
import cn.sdut.system.Tools;

public abstract class A1010Support {

	public abstract String execute() throws Exception;

	protected A1010Services services = null;

	protected String msg = null;
	protected List rows = null;
	protected String query = null;

	public void setServices(A1010Services services) {
		this.services = services;
		this.services.setMapDto(Tools.describe());
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List getRows() {
		return rows;
	}

	public void setRows(List rows) {
		this.rows = rows;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	
	
}
