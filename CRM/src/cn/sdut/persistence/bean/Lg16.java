package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Lg16 entity. @author MyEclipse Persistence Tools
 */

public class Lg16 implements java.io.Serializable {

	// Fields

	private BigDecimal lg1601;
	private Lg15 lg15;
	private Lg03 lg03;
	private Lg02 lg02;
	private Timestamp lg1602;
	private String lg1603;
	private Timestamp lg1604;
	private Timestamp lg1605;

	// Constructors

	/** default constructor */
	public Lg16() {
	}

	/** full constructor */
	public Lg16(BigDecimal lg1601, Lg15 lg15, Lg03 lg03, Lg02 lg02,
			Timestamp lg1602, String lg1603, Timestamp lg1604, Timestamp lg1605) {
		this.lg1601 = lg1601;
		this.lg15 = lg15;
		this.lg03 = lg03;
		this.lg02 = lg02;
		this.lg1602 = lg1602;
		this.lg1603 = lg1603;
		this.lg1604 = lg1604;
		this.lg1605 = lg1605;
	}

	// Property accessors

	public BigDecimal getLg1601() {
		return this.lg1601;
	}

	public void setLg1601(BigDecimal lg1601) {
		this.lg1601 = lg1601;
	}

	public Lg15 getLg15() {
		return this.lg15;
	}

	public void setLg15(Lg15 lg15) {
		this.lg15 = lg15;
	}

	public Lg03 getLg03() {
		return this.lg03;
	}

	public void setLg03(Lg03 lg03) {
		this.lg03 = lg03;
	}

	public Lg02 getLg02() {
		return this.lg02;
	}

	public void setLg02(Lg02 lg02) {
		this.lg02 = lg02;
	}

	public Timestamp getLg1602() {
		return this.lg1602;
	}

	public void setLg1602(Timestamp lg1602) {
		this.lg1602 = lg1602;
	}

	public String getLg1603() {
		return this.lg1603;
	}

	public void setLg1603(String lg1603) {
		this.lg1603 = lg1603;
	}

	public Timestamp getLg1604() {
		return this.lg1604;
	}

	public void setLg1604(Timestamp lg1604) {
		this.lg1604 = lg1604;
	}

	public Timestamp getLg1605() {
		return this.lg1605;
	}

	public void setLg1605(Timestamp lg1605) {
		this.lg1605 = lg1605;
	}

}