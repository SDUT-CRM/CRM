package cn.sdut.persistence.bean;

import java.math.BigDecimal;

/**
 * Lg12 entity. @author MyEclipse Persistence Tools
 */

public class Lg12 implements java.io.Serializable {

	// Fields

	private BigDecimal lg1201;
	private Lg11 lg11;
	private Lg10 lg10;
	private String lg1202;
	private String lg1203;

	// Constructors

	/** default constructor */
	public Lg12() {
	}

	/** minimal constructor */
	public Lg12(BigDecimal lg1201, Lg11 lg11, Lg10 lg10, String lg1202) {
		this.lg1201 = lg1201;
		this.lg11 = lg11;
		this.lg10 = lg10;
		this.lg1202 = lg1202;
	}

	/** full constructor */
	public Lg12(BigDecimal lg1201, Lg11 lg11, Lg10 lg10, String lg1202,
			String lg1203) {
		this.lg1201 = lg1201;
		this.lg11 = lg11;
		this.lg10 = lg10;
		this.lg1202 = lg1202;
		this.lg1203 = lg1203;
	}

	// Property accessors

	public BigDecimal getLg1201() {
		return this.lg1201;
	}

	public void setLg1201(BigDecimal lg1201) {
		this.lg1201 = lg1201;
	}

	public Lg11 getLg11() {
		return this.lg11;
	}

	public void setLg11(Lg11 lg11) {
		this.lg11 = lg11;
	}

	public Lg10 getLg10() {
		return this.lg10;
	}

	public void setLg10(Lg10 lg10) {
		this.lg10 = lg10;
	}

	public String getLg1202() {
		return this.lg1202;
	}

	public void setLg1202(String lg1202) {
		this.lg1202 = lg1202;
	}

	public String getLg1203() {
		return this.lg1203;
	}

	public void setLg1203(String lg1203) {
		this.lg1203 = lg1203;
	}

}