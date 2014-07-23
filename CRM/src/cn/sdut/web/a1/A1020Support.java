package cn.sdut.web.a1;

import java.util.List;

import cn.sdut.services.A1010Services;
import cn.sdut.services.A1020Services;
import cn.sdut.system.Tools;

public abstract class A1020Support {

	public abstract String execute() throws Exception;

	protected A1020Services a1020Services = null;

	protected String msg = null;
	protected List rows = null;
	protected String query = null;
	protected String path = null;

	protected String lg2101 = null;
	protected String lg0701 = null;
	protected String lg0702 = null;
	protected String lg0703 = null;
	protected String lg0704 = null;
	protected String lg0705 = null;
	protected String lg0706 = null;
	protected String lg0707 = null;
	protected String lg0708 = null;
	protected String lg0709 = null;
	protected String lg0710 = null;
	protected String cnlg0707 = null;
	protected List oclg0707 = null;
	protected String qlg0702 = null;
	protected String qlg0707 = null;
	protected String bqlg0708 = null;
	protected String eqlg0708 = null;

	public List getOclg0707() {
		return oclg0707;
	}

	public void setOclg0707(List oclg0707) {
		this.oclg0707 = oclg0707;
	}

	public String getQlg0702() {
		return qlg0702;
	}

	public void setQlg0702(String qlg0702) {
		this.qlg0702 = qlg0702;
	}

	public String getQlg0707() {
		return qlg0707;
	}

	public void setQlg0707(String qlg0707) {
		this.qlg0707 = qlg0707;
	}

	public String getBqlg0708() {
		return bqlg0708;
	}

	public void setBqlg0708(String bqlg0708) {
		this.bqlg0708 = bqlg0708;
	}

	public String getEqlg0708() {
		return eqlg0708;
	}

	public void setEqlg0708(String eqlg0708) {
		this.eqlg0708 = eqlg0708;
	}

	public String getLg2101() {
		return lg2101;
	}

	public void setLg2101(String lg2101) {
		this.lg2101 = lg2101;
	}

	public String getLg0701() {
		return lg0701;
	}

	public void setLg0701(String lg0701) {
		this.lg0701 = lg0701;
	}

	public String getLg0702() {
		return lg0702;
	}

	public void setLg0702(String lg0702) {
		this.lg0702 = lg0702;
	}

	public String getLg0703() {
		return lg0703;
	}

	public void setLg0703(String lg0703) {
		this.lg0703 = lg0703;
	}

	public String getLg0704() {
		return lg0704;
	}

	public void setLg0704(String lg0704) {
		this.lg0704 = lg0704;
	}

	public String getLg0705() {
		return lg0705;
	}

	public void setLg0705(String lg0705) {
		this.lg0705 = lg0705;
	}

	public String getLg0706() {
		return lg0706;
	}

	public void setLg0706(String lg0706) {
		this.lg0706 = lg0706;
	}

	public String getLg0707() {
		return lg0707;
	}

	public void setLg0707(String lg0707) {
		this.lg0707 = lg0707;
	}

	public String getLg0708() {
		return lg0708;
	}

	public void setLg0708(String lg0708) {
		this.lg0708 = lg0708;
	}

	public String getLg0709() {
		return lg0709;
	}

	public void setLg0709(String lg0709) {
		this.lg0709 = lg0709;
	}

	public String getLg0710() {
		return lg0710;
	}

	public void setLg0710(String lg0710) {
		this.lg0710 = lg0710;
	}

	public String getCnlg0707() {
		return cnlg0707;
	}

	public void setCnlg0707(String cnlg0707) {
		this.cnlg0707 = cnlg0707;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public A1020Services getA1020Services() {
		this.a1020Services.setMapDto(Tools.describe());
		return a1020Services;
	}

	public void setA1020Services(A1020Services a1020Services) {
		this.a1020Services = a1020Services;
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
