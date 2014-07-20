package cn.sdut.persistence.bean;

import java.util.HashSet;
import java.util.Set;

public class Lg10 implements java.io.Serializable {

	// Fields

	private long lg1001;
	private Lg09 lg09;
	private String lg1002;
	private String lg1003;
	private Set lg12s = new HashSet(0);
	private Set lg11s = new HashSet(0);

	// Property accessors

	public long getLg1001() {
		return this.lg1001;
	}

	public void setLg1001(long lg1001) {
		this.lg1001 = lg1001;
	}

	public Lg09 getLg09() {
		return this.lg09;
	}

	public void setLg09(Lg09 lg09) {
		this.lg09 = lg09;
	}

	public String getLg1002() {
		return this.lg1002;
	}

	public void setLg1002(String lg1002) {
		this.lg1002 = lg1002;
	}

	public String getLg1003() {
		return this.lg1003;
	}

	public void setLg1003(String lg1003) {
		this.lg1003 = lg1003;
	}

	public Set getLg12s() {
		return this.lg12s;
	}

	public void setLg12s(Set lg12s) {
		this.lg12s = lg12s;
	}

	public Set getLg11s() {
		return this.lg11s;
	}

	public void setLg11s(Set lg11s) {
		this.lg11s = lg11s;
	}

}