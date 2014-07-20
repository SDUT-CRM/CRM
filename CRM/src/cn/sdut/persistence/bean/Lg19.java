package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Lg19 entity. @author MyEclipse Persistence Tools
 */

public class Lg19 implements java.io.Serializable {

	// Fields

	private BigDecimal lg1901;
	private Lg01 lg01;
	private Lg02 lg02;
	private BigDecimal lg1801;
	private String lg1902;
	private Timestamp lg1903;

	// Constructors

	/** default constructor */
	public Lg19() {
	}

	/** full constructor */
	public Lg19(BigDecimal lg1901, Lg01 lg01, Lg02 lg02, BigDecimal lg1801,
			String lg1902, Timestamp lg1903) {
		this.lg1901 = lg1901;
		this.lg01 = lg01;
		this.lg02 = lg02;
		this.lg1801 = lg1801;
		this.lg1902 = lg1902;
		this.lg1903 = lg1903;
	}

	// Property accessors

	public BigDecimal getLg1901() {
		return this.lg1901;
	}

	public void setLg1901(BigDecimal lg1901) {
		this.lg1901 = lg1901;
	}

	public Lg01 getLg01() {
		return this.lg01;
	}

	public void setLg01(Lg01 lg01) {
		this.lg01 = lg01;
	}

	public Lg02 getLg02() {
		return this.lg02;
	}

	public void setLg02(Lg02 lg02) {
		this.lg02 = lg02;
	}

	public BigDecimal getLg1801() {
		return this.lg1801;
	}

	public void setLg1801(BigDecimal lg1801) {
		this.lg1801 = lg1801;
	}

	public String getLg1902() {
		return this.lg1902;
	}

	public void setLg1902(String lg1902) {
		this.lg1902 = lg1902;
	}

	public Timestamp getLg1903() {
		return this.lg1903;
	}

	public void setLg1903(Timestamp lg1903) {
		this.lg1903 = lg1903;
	}

}