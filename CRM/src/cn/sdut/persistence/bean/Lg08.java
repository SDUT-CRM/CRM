package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Lg08 entity. @author MyEclipse Persistence Tools
 */

public class Lg08 implements java.io.Serializable {

	// Fields

	private BigDecimal lg0801;
	private Lg01 lg01;
	private Lg07 lg07;
	private Timestamp lg0802;
	private Timestamp lg0803;
	private String lg0804;

	// Constructors

	/** default constructor */
	public Lg08() {
	}

	/** full constructor */
	public Lg08(BigDecimal lg0801, Lg01 lg01, Lg07 lg07, Timestamp lg0802,
			Timestamp lg0803, String lg0804) {
		this.lg0801 = lg0801;
		this.lg01 = lg01;
		this.lg07 = lg07;
		this.lg0802 = lg0802;
		this.lg0803 = lg0803;
		this.lg0804 = lg0804;
	}

	// Property accessors

	public BigDecimal getLg0801() {
		return this.lg0801;
	}

	public void setLg0801(BigDecimal lg0801) {
		this.lg0801 = lg0801;
	}

	public Lg01 getLg01() {
		return this.lg01;
	}

	public void setLg01(Lg01 lg01) {
		this.lg01 = lg01;
	}

	public Lg07 getLg07() {
		return this.lg07;
	}

	public void setLg07(Lg07 lg07) {
		this.lg07 = lg07;
	}

	public Timestamp getLg0802() {
		return this.lg0802;
	}

	public void setLg0802(Timestamp lg0802) {
		this.lg0802 = lg0802;
	}

	public Timestamp getLg0803() {
		return this.lg0803;
	}

	public void setLg0803(Timestamp lg0803) {
		this.lg0803 = lg0803;
	}

	public String getLg0804() {
		return this.lg0804;
	}

	public void setLg0804(String lg0804) {
		this.lg0804 = lg0804;
	}

}