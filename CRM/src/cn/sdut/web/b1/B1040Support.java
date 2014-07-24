package cn.sdut.web.b1;

import java.util.List;

import cn.sdut.services.B1040Services;
import cn.sdut.system.Tools;

public abstract class B1040Support {

	public abstract String execute() throws Exception;

	protected B1040Services b1040Services = null;

	protected String msg = null;
	protected List rows = null;
	protected String query = null;
	protected String path = null;
	
	protected String qlg1303 = null;
	protected String qlg1403 = null;
	protected String blg1402 = null;
	protected String elg1402 = null;
	protected String blg1404 = null;
	protected String elg1404 = null;
	protected String lg1302 = null;
	protected String lg1303 = null;
	protected String lg1406 = null;
	protected String cnlg1403 = null;
	protected List oclg1403 = null;
	protected String lg1404 = null;
	protected String lg1403 = null;
	
	public String getLg1404() {
		return lg1404;
	}

	public void setLg1404(String lg1404) {
		this.lg1404 = lg1404;
	}

	public String getLg1403() {
		return lg1403;
	}

	public void setLg1403(String lg1403) {
		this.lg1403 = lg1403;
	}

	public List getOclg1403() {
		return oclg1403;
	}

	public void setOclg1403(List oclg1403) {
		this.oclg1403 = oclg1403;
	}

	public B1040Services getB1040Services() {
		this.b1040Services.setMapDto(Tools.describe());
		return b1040Services;
	}

	public void setB1040Services(B1040Services b1040Services) {
		this.b1040Services = b1040Services;
	}

	public String getQlg1303() {
		return qlg1303;
	}

	public void setQlg1303(String qlg1303) {
		this.qlg1303 = qlg1303;
	}

	public String getQlg1403() {
		return qlg1403;
	}

	public void setQlg1403(String qlg1403) {
		this.qlg1403 = qlg1403;
	}

	public String getBlg1402() {
		return blg1402;
	}

	public void setBlg1402(String blg1402) {
		this.blg1402 = blg1402;
	}

	public String getElg1402() {
		return elg1402;
	}

	public void setElg1402(String elg1402) {
		this.elg1402 = elg1402;
	}

	public String getBlg1404() {
		return blg1404;
	}

	public void setBlg1404(String blg1404) {
		this.blg1404 = blg1404;
	}

	public String getElg1404() {
		return elg1404;
	}

	public void setElg1404(String elg1404) {
		this.elg1404 = elg1404;
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

	public String getLg1406() {
		return lg1406;
	}

	public void setLg1406(String lg1406) {
		this.lg1406 = lg1406;
	}

	public String getCnlg1403() {
		return cnlg1403;
	}

	public void setCnlg1403(String cnlg1403) {
		this.cnlg1403 = cnlg1403;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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
