package cn.sdut.web.a1;

import java.util.List;

import cn.sdut.services.A1031Services;
import cn.sdut.services.A1041Services;
import cn.sdut.system.Tools;

public abstract class A1040Support {

	public abstract String execute() throws Exception;

	protected A1041Services a1041Services = null;

	protected String msg = null;
	protected List rows = null;
	protected String query = null;
	protected String path = null;
	
	protected String lg2002 = null;
	protected String lg2003 = null;
	protected String lg2004 = null;
	protected String lg2005 = null;
	protected String lg2006 = null;
	protected String lg0101 = null;

	protected String qlg2002 = null;
	protected String qlg2003 = null;
	protected String bqlg2004 = null;
	protected String eqlg2004 = null;
	protected String qlg2007 = null;
	protected List oclg2007 = null;
	
	public String getQlg2002() {
		return qlg2002;
	}

	public void setQlg2002(String qlg2002) {
		this.qlg2002 = qlg2002;
	}

	public String getQlg2003() {
		return qlg2003;
	}

	public void setQlg2003(String qlg2003) {
		this.qlg2003 = qlg2003;
	}

	public String getBqlg2004() {
		return bqlg2004;
	}

	public void setBqlg2004(String bqlg2004) {
		this.bqlg2004 = bqlg2004;
	}

	public String getEqlg2004() {
		return eqlg2004;
	}

	public void setEqlg2004(String eqlg2004) {
		this.eqlg2004 = eqlg2004;
	}

	public String getQlg2007() {
		return qlg2007;
	}

	public void setQlg2007(String qlg2007) {
		this.qlg2007 = qlg2007;
	}

	public List getOclg2007() {
		return oclg2007;
	}

	public void setOclg2007(List oclg2007) {
		this.oclg2007 = oclg2007;
	}

	public String getLg2006() {
		return lg2006;
	}

	public void setLg2006(String lg2006) {
		this.lg2006 = lg2006;
	}

	public String getLg0101() {
		return lg0101;
	}

	public void setLg0101(String lg0101) {
		this.lg0101 = lg0101;
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

	public A1041Services getA1041Services() {
		this.a1041Services.setMapDto(Tools.describe());
		return a1041Services;
	}

	public void setA1041Services(A1041Services a1041Services) {
		this.a1041Services = a1041Services;
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
