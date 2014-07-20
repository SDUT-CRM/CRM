package cn.sdut.persistence.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg01 entity. @author MyEclipse Persistence Tools
 */

public class Lg01 implements java.io.Serializable {

	// Fields

	private long lg2101;
	private Lg21 lg21;
	private String lg0102;
	private String lg0103;
	private String lg0104;
	private String lg0105;
	private String lg0106;
	private String lg0107;
	private Date lg0108;
	private Set lg06s = new HashSet(0);
	private Set lg20s = new HashSet(0);
	private Set lg08s = new HashSet(0);
	private Set lg19s = new HashSet(0);

	// Property accessors

	public Lg21 getLg21() {
		return this.lg21;
	}

	public long getLg2101() {
		return lg2101;
	}

	public void setLg2101(long lg2101) {
		this.lg2101 = lg2101;
	}

	public void setLg21(Lg21 lg21) {
		this.lg21 = lg21;
	}

	public String getLg0102() {
		return this.lg0102;
	}

	public void setLg0102(String lg0102) {
		this.lg0102 = lg0102;
	}

	public String getLg0103() {
		return this.lg0103;
	}

	public void setLg0103(String lg0103) {
		this.lg0103 = lg0103;
	}

	public String getLg0104() {
		return this.lg0104;
	}

	public void setLg0104(String lg0104) {
		this.lg0104 = lg0104;
	}

	public String getLg0105() {
		return this.lg0105;
	}

	public void setLg0105(String lg0105) {
		this.lg0105 = lg0105;
	}

	public String getLg0106() {
		return this.lg0106;
	}

	public void setLg0106(String lg0106) {
		this.lg0106 = lg0106;
	}

	public String getLg0107() {
		return this.lg0107;
	}

	public void setLg0107(String lg0107) {
		this.lg0107 = lg0107;
	}


	public Date getLg0108() {
		return lg0108;
	}

	public void setLg0108(Date lg0108) {
		this.lg0108 = lg0108;
	}

	public Set getLg06s() {
		return this.lg06s;
	}

	public void setLg06s(Set lg06s) {
		this.lg06s = lg06s;
	}

	public Set getLg20s() {
		return this.lg20s;
	}

	public void setLg20s(Set lg20s) {
		this.lg20s = lg20s;
	}

	public Set getLg08s() {
		return this.lg08s;
	}

	public void setLg08s(Set lg08s) {
		this.lg08s = lg08s;
	}

	public Set getLg19s() {
		return this.lg19s;
	}

	public void setLg19s(Set lg19s) {
		this.lg19s = lg19s;
	}

}