package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Lg06 entity. @author MyEclipse Persistence Tools
 */

public class Lg06 implements java.io.Serializable {

	// Fields

	private BigDecimal lg0601;
	private Lg05 lg05;
	private Lg01 lg01;
	private Lg02 lg02;
	private String lg0602;
	private Timestamp lg0603;
	private Timestamp lg0604;

	// Constructors

	/** default constructor */
	public Lg06() {
	}

	/** full constructor */
	public Lg06(BigDecimal lg0601, Lg05 lg05, Lg01 lg01, Lg02 lg02,
			String lg0602, Timestamp lg0603, Timestamp lg0604) {
		this.lg0601 = lg0601;
		this.lg05 = lg05;
		this.lg01 = lg01;
		this.lg02 = lg02;
		this.lg0602 = lg0602;
		this.lg0603 = lg0603;
		this.lg0604 = lg0604;
	}

	// Property accessors

	public BigDecimal getLg0601() {
		return this.lg0601;
	}

	public void setLg0601(BigDecimal lg0601) {
		this.lg0601 = lg0601;
	}

	public Lg05 getLg05() {
		return this.lg05;
	}

	public void setLg05(Lg05 lg05) {
		this.lg05 = lg05;
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

	public String getLg0602() {
		return this.lg0602;
	}

	public void setLg0602(String lg0602) {
		this.lg0602 = lg0602;
	}

	public Timestamp getLg0603() {
		return this.lg0603;
	}

	public void setLg0603(Timestamp lg0603) {
		this.lg0603 = lg0603;
	}

	public Timestamp getLg0604() {
		return this.lg0604;
	}

	public void setLg0604(Timestamp lg0604) {
		this.lg0604 = lg0604;
	}

}