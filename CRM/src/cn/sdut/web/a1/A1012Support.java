package cn.sdut.web.a1;

import java.util.List;

import cn.sdut.services.A1010Services;
import cn.sdut.services.A1011Services;
import cn.sdut.system.Tools;

public abstract class A1012Support {

	public abstract String execute() throws Exception;

	protected A1011Services a1011Services = null;
	protected String msg = null;
	protected List rows = null;
	protected String query = null;

	protected String lg0501 = null;
	protected String lg0503 = null;
	protected String lg0506 = null;
	protected String lg0604 = null;
	protected String lg0101 = null;
	protected String lg0603 = null;
	protected String cnlg0602 = null;
	protected String lg0601 = null;
	protected String lg0602 = null;
	protected String lg0201 = null;

	public String getLg0501() {
		return lg0501;
	}

	public void setLg0501(String lg0501) {
		this.lg0501 = lg0501;
	}

	public String getLg0503() {
		return lg0503;
	}

	public void setLg0503(String lg0503) {
		this.lg0503 = lg0503;
	}

	public String getLg0506() {
		return lg0506;
	}

	public void setLg0506(String lg0506) {
		this.lg0506 = lg0506;
	}

	public String getLg0604() {
		return lg0604;
	}

	public void setLg0604(String lg0604) {
		this.lg0604 = lg0604;
	}

	public String getLg0101() {
		return lg0101;
	}

	public void setLg0101(String lg0101) {
		this.lg0101 = lg0101;
	}

	public String getLg0603() {
		return lg0603;
	}

	public void setLg0603(String lg0603) {
		this.lg0603 = lg0603;
	}

	public String getCnlg0602() {
		return cnlg0602;
	}

	public void setCnlg0602(String cnlg0602) {
		this.cnlg0602 = cnlg0602;
	}

	public String getLg0601() {
		return lg0601;
	}

	public void setLg0601(String lg0601) {
		this.lg0601 = lg0601;
	}

	public String getLg0602() {
		return lg0602;
	}

	public void setLg0602(String lg0602) {
		this.lg0602 = lg0602;
	}

	public String getLg0201() {
		return lg0201;
	}

	public void setLg0201(String lg0201) {
		this.lg0201 = lg0201;
	}

	public A1011Services getA1011Services() {
		this.a1011Services.setMapDto(Tools.describe());
		return a1011Services;
	}

	public void setA1011Services(A1011Services a1011Services) {
		this.a1011Services = a1011Services;
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
