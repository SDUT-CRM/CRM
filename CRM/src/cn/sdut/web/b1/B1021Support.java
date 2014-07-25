package cn.sdut.web.b1;

import java.util.List;

import cn.sdut.services.A1041Services;
import cn.sdut.services.B1021Services;
import cn.sdut.system.Tools;

public abstract class B1021Support {

	public abstract String execute() throws Exception;

	protected B1021Services b1021Services = null;

	protected String msg = null;
	protected List rows = null;
	protected String query = null;
	protected String path = null;
	
	protected String lg2001 = null;
	protected String lg2002 = null;
	protected String lg2003 = null;
	protected String lg2004 = null;
	protected String lg2005 = null;
	protected String lg2006 = null;
	protected String lg2101 = null;
	
	public String getLg2006() {
		return lg2006;
	}

	public void setLg2006(String lg2006) {
		this.lg2006 = lg2006;
	}

	public String getLg2101() {
		return lg2101;
	}

	public void setLg2101(String lg2101) {
		this.lg2101 = lg2101;
	}
	
	public String getLg2001() {
		return lg2001;
	}

	public void setLg2001(String lg2001) {
		this.lg2001 = lg2001;
	}

	public String getLg2002() {
		return lg2002;
	}

	public void setLg2002(String lg2002) {
		this.lg2002 = lg2002;
	}

	public String getLg2003() {
		return lg2003;
	}

	public void setLg2003(String lg2003) {
		this.lg2003 = lg2003;
	}

	public String getLg2004() {
		return lg2004;
	}

	public void setLg2004(String lg2004) {
		this.lg2004 = lg2004;
	}

	public String getLg2005() {
		return lg2005;
	}

	public void setLg2005(String lg2005) {
		this.lg2005 = lg2005;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public B1021Services getB1021Services() {
		this.b1021Services.setMapDto(Tools.describe());
		return b1021Services;
	}

	public void setB1021Services(B1021Services b1021Services) {
		this.b1021Services = b1021Services;
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
