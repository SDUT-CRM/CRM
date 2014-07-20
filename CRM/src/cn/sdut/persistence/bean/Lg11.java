package cn.sdut.persistence.bean;

import java.util.HashSet;
import java.util.Set;

public class Lg11 implements java.io.Serializable {

	// Fields

	private long lg1101;
	private Lg10 lg10;
	private String lg1102;
	private String lg1103;
	private Set lg12s = new HashSet(0);

	// Property accessors

	public long getLg1101() {
		return this.lg1101;
	}

	public void setLg1101(long lg1101) {
		this.lg1101 = lg1101;
	}

	public Lg10 getLg10() {
		return this.lg10;
	}

	public void setLg10(Lg10 lg10) {
		this.lg10 = lg10;
	}

	public String getLg1102() {
		return this.lg1102;
	}

	public void setLg1102(String lg1102) {
		this.lg1102 = lg1102;
	}

	public String getLg1103() {
		return this.lg1103;
	}

	public void setLg1103(String lg1103) {
		this.lg1103 = lg1103;
	}

	public Set getLg12s() {
		return this.lg12s;
	}

	public void setLg12s(Set lg12s) {
		this.lg12s = lg12s;
	}

}