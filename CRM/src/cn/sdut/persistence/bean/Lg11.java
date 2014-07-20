package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg11 entity. @author MyEclipse Persistence Tools
 */

public class Lg11 implements java.io.Serializable {

	// Fields

	private BigDecimal lg1101;
	private Lg10 lg10;
	private String lg1102;
	private String lg1103;
	private Set lg12s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Lg11() {
	}

	/** minimal constructor */
	public Lg11(BigDecimal lg1101, Lg10 lg10, String lg1102) {
		this.lg1101 = lg1101;
		this.lg10 = lg10;
		this.lg1102 = lg1102;
	}

	/** full constructor */
	public Lg11(BigDecimal lg1101, Lg10 lg10, String lg1102, String lg1103,
			Set lg12s) {
		this.lg1101 = lg1101;
		this.lg10 = lg10;
		this.lg1102 = lg1102;
		this.lg1103 = lg1103;
		this.lg12s = lg12s;
	}

	// Property accessors

	public BigDecimal getLg1101() {
		return this.lg1101;
	}

	public void setLg1101(BigDecimal lg1101) {
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