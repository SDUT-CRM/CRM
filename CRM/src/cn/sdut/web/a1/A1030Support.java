package cn.sdut.web.a1;

import java.util.List;

import cn.sdut.services.A1030Services;
import cn.sdut.system.Tools;

public abstract class A1030Support {

	public abstract String execute() throws Exception;

	protected A1030Services a1030Services = null;

	protected String msg = null;
	protected List rows = null;
	protected String query = null;
	protected String path = null;

	protected List oclg1701 = null;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public A1030Services getA1030Services() {
		this.a1030Services.setMapDto(Tools.describe());
		return a1030Services;
	}

	public void setA1030Services(A1030Services a1030Services) {
		this.a1030Services = a1030Services;
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

	public List getOclg1701() {
		return oclg1701;
	}

	public void setOclg1701(List oclg1701) {
		this.oclg1701 = oclg1701;
	}
	
}
