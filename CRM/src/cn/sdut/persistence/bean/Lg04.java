package cn.sdut.persistence.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Lg04 implements java.io.Serializable {

	// Fields

	private long lg0401;
	private String lg0402;
	private String lg0403;
	private Double lg0404;
	private Double lg0405;
	private Date lg0406;
	private Date lg0407;
	private Set lg02s = new HashSet(0);
	private Set lg03s = new HashSet(0);

	// Property accessors

	public long getLg0401() {
		return this.lg0401;
	}

	public void setLg0401(long lg0401) {
		this.lg0401 = lg0401;
	}

	public String getLg0402() {
		return this.lg0402;
	}

	public void setLg0402(String lg0402) {
		this.lg0402 = lg0402;
	}

	public String getLg0403() {
		return this.lg0403;
	}

	public void setLg0403(String lg0403) {
		this.lg0403 = lg0403;
	}

	public Double getLg0404() {
		return this.lg0404;
	}

	public void setLg0404(Double lg0404) {
		this.lg0404 = lg0404;
	}

	public Double getLg0405() {
		return this.lg0405;
	}

	public void setLg0405(Double lg0405) {
		this.lg0405 = lg0405;
	}

	public Date getLg0406() {
		return this.lg0406;
	}

	public void setLg0406(Date lg0406) {
		this.lg0406 = lg0406;
	}

	public Date getLg0407() {
		return this.lg0407;
	}

	public void setLg0407(Date lg0407) {
		this.lg0407 = lg0407;
	}

	public Set getLg02s() {
		return this.lg02s;
	}

	public void setLg02s(Set lg02s) {
		this.lg02s = lg02s;
	}

	public Set getLg03s() {
		return this.lg03s;
	}

	public void setLg03s(Set lg03s) {
		this.lg03s = lg03s;
	}

}