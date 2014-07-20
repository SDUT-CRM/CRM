package cn.sdut.persistence.bean;

import java.util.HashSet;
import java.util.Set;

public class Lg15 implements java.io.Serializable {

	// Fields

	private long lg1501;
	private String lg1502;
	private String lg1503;
	private Set lg16s = new HashSet(0);

	// Property accessors

	public long getLg1501() {
		return this.lg1501;
	}

	public void setLg1501(long lg1501) {
		this.lg1501 = lg1501;
	}

	public String getLg1502() {
		return this.lg1502;
	}

	public void setLg1502(String lg1502) {
		this.lg1502 = lg1502;
	}

	public String getLg1503() {
		return this.lg1503;
	}

	public void setLg1503(String lg1503) {
		this.lg1503 = lg1503;
	}

	public Set getLg16s() {
		return this.lg16s;
	}

	public void setLg16s(Set lg16s) {
		this.lg16s = lg16s;
	}

}