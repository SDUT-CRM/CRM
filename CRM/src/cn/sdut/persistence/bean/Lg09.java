package cn.sdut.persistence.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Lg09 implements java.io.Serializable {

	// Fields

	private long lg0901;
	private Lg03 lg03;
	private Date lg0902;
	private Date lg0903;
	private Set lg10s = new HashSet(0);

	// Property accessors

	public long getLg0901() {
		return this.lg0901;
	}

	public void setLg0901(long lg0901) {
		this.lg0901 = lg0901;
	}

	public Lg03 getLg03() {
		return this.lg03;
	}

	public void setLg03(Lg03 lg03) {
		this.lg03 = lg03;
	}

	public Date getLg0902() {
		return this.lg0902;
	}

	public void setLg0902(Date lg0902) {
		this.lg0902 = lg0902;
	}

	public Date getLg0903() {
		return this.lg0903;
	}

	public void setLg0903(Date lg0903) {
		this.lg0903 = lg0903;
	}

	public Set getLg10s() {
		return this.lg10s;
	}

	public void setLg10s(Set lg10s) {
		this.lg10s = lg10s;
	}

}