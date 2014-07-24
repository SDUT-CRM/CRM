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
	protected String lg1701 = null;
	protected String lg1801 = null;
	protected String lg1802 = null;
	protected String lg1803 = null;
	protected String lg1804 = null;
	protected String lg1805 = null;
	protected String lg2101 = null;
	protected String lg0201 = null;
	protected String cnlg1804 = null;
	protected List oclg1804 = null;
	protected String bqlg1802 = null;
	protected String eqlg1802 = null;
	protected String qlg1701 = null;
	protected String qlg1802 = null;
	protected String qlg1804 = null;
	
	public String getQlg1804() {
		return qlg1804;
	}

	public void setQlg1804(String qlg1804) {
		this.qlg1804 = qlg1804;
	}

	public String getQlg1701() {
		return qlg1701;
	}

	public void setQlg1701(String qlg1701) {
		this.qlg1701 = qlg1701;
	}

	public String getQlg1802() {
		return qlg1802;
	}

	public void setQlg1802(String qlg1802) {
		this.qlg1802 = qlg1802;
	}

	public void setOclg1804(List oclg1804) {
		this.oclg1804 = oclg1804;
	}

	public void setEqlg1802(String eqlg1802) {
		this.eqlg1802 = eqlg1802;
	}

	public List getOclg1804() {
		return oclg1804;
	}

	public void setOclg0804(List oclg1804) {
		this.oclg1804 = oclg1804;
	}

	public String getBqlg1802() {
		return bqlg1802;
	}

	public void setBqlg1802(String bqlg0802) {
		this.bqlg1802 = bqlg1802;
	}

	public String getEqlg1802() {
		return eqlg1802;
	}

	public void setEqlg0802(String eqlg0802) {
		this.eqlg1802 = eqlg0802;
	}

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

	public String getLg1701() {
		return lg1701;
	}

	public void setLg1701(String lg1701) {
		this.lg1701 = lg1701;
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

	public String getLg1802() {
		return lg1802;
	}

	public void setLg1802(String lg1802) {
		this.lg1802 = lg1802;
	}

	public String getLg1803() {
		return lg1803;
	}

	public void setLg1803(String lg1803) {
		this.lg1803 = lg1803;
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

	public String getCnlg1804() {
		return cnlg1804;
	}

	public void setCnlg1804(String cnlg1804) {
		this.cnlg1804 = cnlg1804;
	}
	
}
