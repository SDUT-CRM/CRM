package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg21 entity. @author MyEclipse Persistence Tools
 */

public class Lg21 implements java.io.Serializable {

	// Fields

	private BigDecimal lg2101;
	private String lg2102;
	private String lg2103;
	private String lg2104;
	private String lg2105;
	private Set lg03s = new HashSet(0);
	private Set lg02s = new HashSet(0);
	private Set lg01s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Lg21() {
	}

	/** minimal constructor */
	public Lg21(BigDecimal lg2101, String lg2102, String lg2103) {
		this.lg2101 = lg2101;
		this.lg2102 = lg2102;
		this.lg2103 = lg2103;
	}

	/** full constructor */
	public Lg21(BigDecimal lg2101, String lg2102, String lg2103, String lg2104,
			String lg2105, Set lg03s, Set lg02s, Set lg01s) {
		this.lg2101 = lg2101;
		this.lg2102 = lg2102;
		this.lg2103 = lg2103;
		this.lg2104 = lg2104;
		this.lg2105 = lg2105;
		this.lg03s = lg03s;
		this.lg02s = lg02s;
		this.lg01s = lg01s;
	}

	// Property accessors

	public BigDecimal getLg2101() {
		return this.lg2101;
	}

	public void setLg2101(BigDecimal lg2101) {
		this.lg2101 = lg2101;
	}

	public String getLg2102() {
		return this.lg2102;
	}

	public void setLg2102(String lg2102) {
		this.lg2102 = lg2102;
	}

	public String getLg2103() {
		return this.lg2103;
	}

	public void setLg2103(String lg2103) {
		this.lg2103 = lg2103;
	}

	public String getLg2104() {
		return this.lg2104;
	}

	public void setLg2104(String lg2104) {
		this.lg2104 = lg2104;
	}

	public String getLg2105() {
		return this.lg2105;
	}

	public void setLg2105(String lg2105) {
		this.lg2105 = lg2105;
	}

	public Set getLg03s() {
		return this.lg03s;
	}

	public void setLg03s(Set lg03s) {
		this.lg03s = lg03s;
	}

	public Set getLg02s() {
		return this.lg02s;
	}

	public void setLg02s(Set lg02s) {
		this.lg02s = lg02s;
	}

	public Set getLg01s() {
		return this.lg01s;
	}

	public void setLg01s(Set lg01s) {
		this.lg01s = lg01s;
	}

}