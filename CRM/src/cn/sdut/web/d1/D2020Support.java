package cn.sdut.web.d1;

import java.util.List;

import cn.sdut.services.D2020Services;
import cn.sdut.system.Tools;

public abstract class D2020Support {
	public abstract String execute() throws Exception;
	
	protected D2020Services d2020Services=null;
	
	public D2020Services getD2020Services() {
		return d2020Services;
	}
	public void setD2020Services(D2020Services d2020Services) {
		this.d2020Services = d2020Services;
		this.d2020Services.setMapDto(Tools.describe());
	}

	protected String msg=null;
	protected String lg0501=null;
	protected String lg0502=null;
	protected String lg0503=null;
	protected String lg0509=null;
	protected String lg0505=null;
	protected String lg0504=null;
	protected String lg0506=null;
	protected String lg0507=null;
	protected String lg0508=null;
	protected String cnlg0509=null;

	
	public String getCnlg0509() {
		return cnlg0509;
	}
	public void setCnlg0509(String cnlg0509) {
		this.cnlg0509 = cnlg0509;
	}

	protected List rows=null;
	
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getLg0501() {
		return lg0501;
	}
	public void setLg0501(String lg0501) {
		this.lg0501 = lg0501;
	}
	public String getLg0502() {
		return lg0502;
	}
	public void setLg0502(String lg0502) {
		this.lg0502 = lg0502;
	}
	public String getLg0503() {
		return lg0503;
	}
	public void setLg0503(String lg0503) {
		this.lg0503 = lg0503;
	}
	public String getLg0509() {
		return lg0509;
	}
	public void setLg0509(String lg0509) {
		this.lg0509 = lg0509;
	}
	public String getLg0505() {
		return lg0505;
	}
	public void setLg0505(String lg0505) {
		this.lg0505 = lg0505;
	}
	public String getLg0504() {
		return lg0504;
	}
	public void setLg0504(String lg0504) {
		this.lg0504 = lg0504;
	}
	public String getLg0506() {
		return lg0506;
	}
	public void setLg0506(String lg0506) {
		this.lg0506 = lg0506;
	}
	public String getLg0507() {
		return lg0507;
	}
	public void setLg0507(String lg0507) {
		this.lg0507 = lg0507;
	}
	public String getLg0508() {
		return lg0508;
	}
	public void setLg0508(String lg0508) {
		this.lg0508 = lg0508;
	}
	

}
