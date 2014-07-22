package cn.sdut.web.a1;

import java.util.List;

import cn.sdut.services.A1011Services;
import cn.sdut.services.A1021Services;
import cn.sdut.system.Tools;

public abstract class A1022Support {

	public abstract String execute() throws Exception;

	protected A1021Services a1021Services = null;
	protected String msg = null;
	protected List rows = null;
	protected String query = null;

	protected String lg0801 = null;
	protected String lg0101 = null;
	protected String lg0701 = null;
	protected String lg0802 = null;
	protected String lg0803 = null;
	protected String lg0707 = null;
	protected String lg0702 = null;
	protected String lg0804 = null;
	protected String lg0708 = null;	
	protected String cnlg0707 = null;
	protected String cnlg0804 = null;

	public String getLg0801() {
		return lg0801;
	}

	public void setLg0801(String lg0801) {
		this.lg0801 = lg0801;
	}

	public String getLg0701() {
		return lg0701;
	}

	public void setLg0701(String lg0701) {
		this.lg0701 = lg0701;
	}

	public String getLg0802() {
		return lg0802;
	}

	public void setLg0802(String lg0802) {
		this.lg0802 = lg0802;
	}

	public String getLg0803() {
		return lg0803;
	}

	public void setLg0803(String lg0803) {
		this.lg0803 = lg0803;
	}

	public String getLg0707() {
		return lg0707;
	}

	public void setLg0707(String lg0707) {
		this.lg0707 = lg0707;
	}

	public String getLg0702() {
		return lg0702;
	}

	public void setLg0702(String lg0702) {
		this.lg0702 = lg0702;
	}

	public String getLg0804() {
		return lg0804;
	}

	public void setLg0804(String lg0804) {
		this.lg0804 = lg0804;
	}

	public String getLg0708() {
		return lg0708;
	}

	public void setLg0708(String lg0708) {
		this.lg0708 = lg0708;
	}

	public String getCnlg0707() {
		return cnlg0707;
	}

	public void setCnlg0707(String cnlg0707) {
		this.cnlg0707 = cnlg0707;
	}

	public String getCnlg0804() {
		return cnlg0804;
	}

	public void setCnlg0804(String cnlg0804) {
		this.cnlg0804 = cnlg0804;
	}

	public String getLg0101() {
		return lg0101;
	}

	public void setLg0101(String lg0101) {
		this.lg0101 = lg0101;
	}


	public A1021Services getA1021Services() {
		this.a1021Services.setMapDto(Tools.describe());
		return a1021Services;
	}

	public void setA1021Services(A1021Services a1021Services) {
		this.a1021Services = a1021Services;
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
