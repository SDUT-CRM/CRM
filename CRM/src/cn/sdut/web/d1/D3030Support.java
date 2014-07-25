package cn.sdut.web.d1;

import java.util.List;

import cn.sdut.services.D3030Services;
import cn.sdut.system.Tools;

public abstract class D3030Support {
	public abstract String execute() throws Exception;

	protected D3030Services d3030Services=null;
	protected String lg1301=null;
	protected String lg1302=null;
	protected String lg1303=null;
	protected String lg1304=null;
	protected String lg1305=null;	
	protected String lg0202=null;
    protected String lg0302=null;
	protected String lg0402=null;
	protected String cnlg0402=null;
	protected String lg2102=null;
	protected String lg1401=null;
    protected String lg1402=null;
    protected String lg1403=null;   
    protected String cnlg1403=null;
    protected String lg1404=null;
    protected String lg1405=null;
    protected String lg1406=null;
    protected List rows=null;
    protected String msg=null;
	public D3030Services getD3030Services() {
		return d3030Services;
	}
	public void setD3030Services(D3030Services d3030Services) {
		this.d3030Services = d3030Services;
		this.d3030Services.setMapDto(Tools.describe());
	}
	public String getLg1301() {
		return lg1301;
	}
	public void setLg1301(String lg1301) {
		this.lg1301 = lg1301;
	}
	public String getLg1302() {
		return lg1302;
	}
	public void setLg1302(String lg1302) {
		this.lg1302 = lg1302;
	}
	public String getLg1303() {
		return lg1303;
	}
	public void setLg1303(String lg1303) {
		this.lg1303 = lg1303;
	}
	public String getLg1304() {
		return lg1304;
	}
	public void setLg1304(String lg1304) {
		this.lg1304 = lg1304;
	}
	public String getLg1305() {
		return lg1305;
	}
	public void setLg1305(String lg1305) {
		this.lg1305 = lg1305;
	}
	public String getLg0202() {
		return lg0202;
	}
	public void setLg0202(String lg0202) {
		this.lg0202 = lg0202;
	}
	public String getLg0302() {
		return lg0302;
	}
	public void setLg0302(String lg0302) {
		this.lg0302 = lg0302;
	}
	public String getLg0402() {
		return lg0402;
	}
	public void setLg0402(String lg0402) {
		this.lg0402 = lg0402;
	}
	public String getCnlg0402() {
		return cnlg0402;
	}
	public void setCnlg0402(String cnlg0402) {
		this.cnlg0402 = cnlg0402;
	}
	public String getLg2102() {
		return lg2102;
	}
	public void setLg2102(String lg2102) {
		this.lg2102 = lg2102;
	}
	public String getLg1401() {
		return lg1401;
	}
	public void setLg1401(String lg1401) {
		this.lg1401 = lg1401;
	}
	public String getLg1402() {
		return lg1402;
	}
	public void setLg1402(String lg1402) {
		this.lg1402 = lg1402;
	}
	public String getLg1403() {
		return lg1403;
	}
	public void setLg1403(String lg1403) {
		this.lg1403 = lg1403;
	}
	public String getCnlg1403() {
		return cnlg1403;
	}
	public void setCnlg1403(String cnlg1403) {
		this.cnlg1403 = cnlg1403;
	}
	public String getLg1404() {
		return lg1404;
	}
	public void setLg1404(String lg1404) {
		this.lg1404 = lg1404;
	}
	public String getLg1405() {
		return lg1405;
	}
	public void setLg1405(String lg1405) {
		this.lg1405 = lg1405;
	}
	public String getLg1406() {
		return lg1406;
	}
	public void setLg1406(String lg1406) {
		this.lg1406 = lg1406;
	}
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
    
    
	
	
}
