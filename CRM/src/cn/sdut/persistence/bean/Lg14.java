package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Lg14 entity. @author MyEclipse Persistence Tools
 */

public class Lg14 implements java.io.Serializable {

	// Fields

	private BigDecimal lg1401;
	private Lg02 lg02;
	private Lg13 lg13;
	private Lg03 lg03;
	private Timestamp lg1402;
	private String lg1403;
	private Timestamp lg1404;
	private Timestamp lg1405;

	// Constructors

	/** default constructor */
	public Lg14() {
	}

	/** full constructor */
	public Lg14(BigDecimal lg1401, Lg02 lg02, Lg13 lg13, Lg03 lg03,
			Timestamp lg1402, String lg1403, Timestamp lg1404, Timestamp lg1405) {
		this.lg1401 = lg1401;
		this.lg02 = lg02;
		this.lg13 = lg13;
		this.lg03 = lg03;
		this.lg1402 = lg1402;
		this.lg1403 = lg1403;
		this.lg1404 = lg1404;
		this.lg1405 = lg1405;
	}

	// Property accessors

	public BigDecimal getLg1401() {
		return this.lg1401;
	}

	public void setLg1401(BigDecimal lg1401) {
		this.lg1401 = lg1401;
	}

	public Lg02 getLg02() {
		return this.lg02;
	}

	public void setLg02(Lg02 lg02) {
		this.lg02 = lg02;
	}

	public Lg13 getLg13() {
		return this.lg13;
	}

	public void setLg13(Lg13 lg13) {
		this.lg13 = lg13;
	}

	public Lg03 getLg03() {
		return this.lg03;
	}

	public void setLg03(Lg03 lg03) {
		this.lg03 = lg03;
	}

	public Timestamp getLg1402() {
		return this.lg1402;
	}

	public void setLg1402(Timestamp lg1402) {
		this.lg1402 = lg1402;
	}

	public String getLg1403() {
		return this.lg1403;
	}

	public void setLg1403(String lg1403) {
		this.lg1403 = lg1403;
	}

	public Timestamp getLg1404() {
		return this.lg1404;
	}

	public void setLg1404(Timestamp lg1404) {
		this.lg1404 = lg1404;
	}

	public Timestamp getLg1405() {
		return this.lg1405;
	}

	public void setLg1405(Timestamp lg1405) {
		this.lg1405 = lg1405;
	}

}