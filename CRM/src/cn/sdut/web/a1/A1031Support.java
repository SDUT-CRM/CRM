package cn.sdut.web.a1;

import java.util.List;

import cn.sdut.services.A1030Services;
import cn.sdut.services.A1031Services;
import cn.sdut.system.Tools;

public abstract class A1031Support {

	public abstract String execute() throws Exception;

	protected A1031Services a1031Services = null;

	protected String msg = null;
	protected List rows = null;
	protected String query = null;
	protected String path = null;

	protected List oclg1701 = null;
	protected String lg1801 = null;
	protected String lg1901 = null;
	protected String lg1902 = null;
	protected String lg1903 = null;
	protected String lg1804 = null;
	protected String lg1805 = null;
	protected String lg2101 = null;
	protected String lg0201 = null;

	public List getOclg1701() {
		return oclg1701;
	}

	public void setOclg1701(List oclg1701) {
		this.oclg1701 = oclg1701;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public A1031Services getA1031Services() {
		this.a1031Services.setMapDto(Tools.describe());
		return a1031Services;
	}

	public void setA1031Services(A1031Services a1031Services) {
		this.a1031Services = a1031Services;
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

	public String getLg1805() {
		return lg1805;
	}

	public void setLg1805(String lg1805) {
		this.lg1805 = lg1805;
	}

	public String getLg1801() {
		return lg1801;
	}

	public void setLg1801(String lg1801) {
		this.lg1801 = lg1801;
	}

	public String getLg1804() {
		return lg1804;
	}

	public void setLg1804(String lg1804) {
		this.lg1804 = lg1804;
	}

	public String getLg2101() {
		return lg2101;
	}

	public void setLg2101(String lg2101) {
		this.lg2101 = lg2101;
	}

	public String getLg0201() {
		return lg0201;
	}

	public void setLg0201(String lg0201) {
		this.lg0201 = lg0201;
	}

	public String getLg1901() {
		return lg1901;
	}

	public void setLg1901(String lg1901) {
		this.lg1901 = lg1901;
	}

	public String getLg1902() {
		return lg1902;
	}

	public void setLg1902(String lg1902) {
		this.lg1902 = lg1902;
	}

	public String getLg1903() {
		return lg1903;
	}

	public void setLg1903(String lg1903) {
		this.lg1903 = lg1903;
	}
	
}
