package cn.sdut.web.b1;

import java.util.List;

import cn.sdut.services.B1030Services;
import cn.sdut.system.Tools;

public abstract class B1030Support {

	public abstract String execute() throws Exception;

	protected B1030Services b1030Services = null;

	protected String msg = null;
	protected List rows = null;
	protected String query = null;
	protected String path = null;
	
	protected String bqlg1802 = null;
	protected String eqlg1802 = null;
	protected String lg2101 = null;
	protected String lg1701 = null;
	protected String lg1804 = null;
	protected String lg1805 = null;
	protected String lg1802 = null;
	protected String lg1801 = null;
	protected String lg1803 = null;
	protected String lg0102 = null;
	protected String lg0105 = null;
	protected String lg0104 = null;
	protected List oclg1701 = null;
	protected List ocllg18 = null;
	protected String cnlg1701 = null;

	public List getOcllg18() {
		return ocllg18;
	}

	public void setOclg18(List ocllg18) {
		this.ocllg18 = ocllg18;
	}

	public String getLg1801() {
		return lg1801;
	}

	public void setLg1801(String lg1801) {
		this.lg1801 = lg1801;
	}

	public String getLg1805() {
		return lg1805;
	}

	public void setLg1805(String lg1805) {
		this.lg1805 = lg1805;
	}

	public String getBqlg1802() {
		return bqlg1802;
	}

	public void setBqlg1802(String bqlg1802) {
		this.bqlg1802 = bqlg1802;
	}

	public String getEqlg1802() {
		return eqlg1802;
	}

	public void setEqlg1802(String eqlg1802) {
		this.eqlg1802 = eqlg1802;
	}

	public String getLg2101() {
		return lg2101;
	}

	public void setLg2101(String lg2101) {
		this.lg2101 = lg2101;
	}

	public String getLg1701() {
		return lg1701;
	}

	public void setLg1701(String lg1701) {
		this.lg1701 = lg1701;
	}

	public String getLg1804() {
		return lg1804;
	}

	public void setLg1804(String lg1804) {
		this.lg1804 = lg1804;
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

	public String getLg0102() {
		return lg0102;
	}

	public void setLg0102(String lg0102) {
		this.lg0102 = lg0102;
	}

	public String getLg0105() {
		return lg0105;
	}

	public void setLg0105(String lg0105) {
		this.lg0105 = lg0105;
	}

	public String getLg0104() {
		return lg0104;
	}

	public void setLg0104(String lg0104) {
		this.lg0104 = lg0104;
	}

	public List getOclg1701() {
		return oclg1701;
	}

	public void setOclg1701(List oclg1701) {
		this.oclg1701 = oclg1701;
	}

	public String getCnlg1701() {
		return cnlg1701;
	}

	public void setCnlg1701(String cnlg1701) {
		this.cnlg1701 = cnlg1701;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	

	public B1030Services getB1030Services() {
		this.b1030Services.setMapDto(Tools.describe());
		return b1030Services;
	}

	public void setB1030Services(B1030Services b1030Services) {
		this.b1030Services = b1030Services;
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
