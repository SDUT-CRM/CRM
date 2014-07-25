package cn.sdut.web.d1;

import java.util.List;

import cn.sdut.services.D1010Services;
import cn.sdut.services.D1012Services;
import cn.sdut.services.D1013Services;
import cn.sdut.services.D1014Services;
import cn.sdut.system.Tools;

public abstract class D1010Support {
	public abstract String execute() throws Exception;

	protected D1010Services d1010Services = null;
	protected D1012Services d1012Services = null;
	protected D1013Services d1013Services = null;
	protected D1014Services d1014Services = null;
	protected String msg = null;
	protected List rows = null;
	protected List parsList = null;

	public List getParsList() {
		return parsList;
	}

	public void setParsList(List parsList) {
		this.parsList = parsList;
	}

	public D1012Services getD1012Services() {
		return d1012Services;
	}

	public void setD1012Services(D1012Services d1012Services) {
		this.d1012Services = d1012Services;
		this.d1012Services.setDto(Tools.describe());
	}

	public D1013Services getD1013Services() {
		return d1013Services;
	}

	public void setD1013Services(D1013Services d1013Services) {
		this.d1013Services = d1013Services;
		this.d1013Services.setMapDto(Tools.describe());

	}

	protected String query = null;

	protected String lg2102 = null;
	protected String qlg2102 = null;
	protected String lg2104 = null;
	protected String lg2105 = null;
	protected String cnlg2105 = null;
	protected String lg0101 = null;
	protected String lg0102 = null;
	protected String lg0103 = null;
	protected String lg0104 = null;
	protected String lg0105 = null;
	protected String lg0106 = null;
	protected String lg0201 = null;
	protected String lg0202 = null;
	protected String lg0203 = null;
	protected String lg0204 = null;
	protected String lg0205 = null;
	protected String lg0206 = null;
	protected String lg0301 = null;
	protected String lg0302 = null;
	protected String lg0303 = null;
	protected String lg0304 = null;
	protected String lg0305 = null;
	protected String lg0306 = null;
	protected String name = null;
	protected String idcard = null;
	protected String address = null;
	protected String phonenumber = null;
	protected String email = null;
	protected String dept = null;
	protected String lg2101 = null;

	public String getLg2101() {
		return lg2101;
	}

	public void setLg2101(String lg2101) {
		this.lg2101 = lg2101;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public D1010Services getD1010Services() {
		return d1010Services;
	}

	public void setD1010Services(D1010Services d1010Services) {
		this.d1010Services = d1010Services;
		this.d1010Services.setMapDto(Tools.describe());
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

	public String getLg2102() {
		return lg2102;
	}

	public void setLg2102(String lg2102) {
		this.lg2102 = lg2102;
	}

	public String getQlg2102() {
		return qlg2102;
	}

	public void setQlg2102(String qlg2102) {
		this.qlg2102 = qlg2102;
	}

	public String getLg2104() {
		return lg2104;
	}

	public void setLg2104(String lg2104) {
		this.lg2104 = lg2104;
	}

	public String getLg2105() {
		return lg2105;
	}

	public void setLg2105(String lg2105) {
		this.lg2105 = lg2105;
	}

	public String getCnlg2105() {
		return cnlg2105;
	}

	public void setCnlg2105(String cnlg2105) {
		this.cnlg2105 = cnlg2105;
	}

	public String getLg0101() {
		return lg0101;
	}

	public void setLg0101(String lg0101) {
		this.lg0101 = lg0101;
	}

	public String getLg0102() {
		return lg0102;
	}

	public void setLg0102(String lg0102) {
		this.lg0102 = lg0102;
	}

	public String getLg0103() {
		return lg0103;
	}

	public void setLg0103(String lg0103) {
		this.lg0103 = lg0103;
	}

	public String getLg0104() {
		return lg0104;
	}

	public void setLg0104(String lg0104) {
		this.lg0104 = lg0104;
	}

	public String getLg0105() {
		return lg0105;
	}

	public void setLg0105(String lg0105) {
		this.lg0105 = lg0105;
	}

	public String getLg0106() {
		return lg0106;
	}

	public void setLg0106(String lg0106) {
		this.lg0106 = lg0106;
	}

	public String getLg0201() {
		return lg0201;
	}

	public void setLg0201(String lg0201) {
		this.lg0201 = lg0201;
	}

	public String getLg0202() {
		return lg0202;
	}

	public void setLg0202(String lg0202) {
		this.lg0202 = lg0202;
	}

	public String getLg0203() {
		return lg0203;
	}

	public void setLg0203(String lg0203) {
		this.lg0203 = lg0203;
	}

	public String getLg0204() {
		return lg0204;
	}

	public void setLg0204(String lg0204) {
		this.lg0204 = lg0204;
	}

	public String getLg0205() {
		return lg0205;
	}

	public void setLg0205(String lg0205) {
		this.lg0205 = lg0205;
	}

	public String getLg0206() {
		return lg0206;
	}

	public void setLg0206(String lg0206) {
		this.lg0206 = lg0206;
	}

	public String getLg0301() {
		return lg0301;
	}

	public void setLg0301(String lg0301) {
		this.lg0301 = lg0301;
	}

	public String getLg0302() {
		return lg0302;
	}

	public void setLg0302(String lg0302) {
		this.lg0302 = lg0302;
	}

	public String getLg0303() {
		return lg0303;
	}

	public void setLg0303(String lg0303) {
		this.lg0303 = lg0303;
	}

	public String getLg0304() {
		return lg0304;
	}

	public void setLg0304(String lg0304) {
		this.lg0304 = lg0304;
	}

	public String getLg0305() {
		return lg0305;
	}

	public void setLg0305(String lg0305) {
		this.lg0305 = lg0305;
	}

	public String getLg0306() {
		return lg0306;
	}

	public void setLg0306(String lg0306) {
		this.lg0306 = lg0306;
	}

	public D1014Services getD1014Services() {
		return d1014Services;
	}

	public void setD1014Services(D1014Services d1014Services) {
		this.d1014Services = d1014Services;
		this.d1014Services.setMapDto(Tools.describe());
	}

}
