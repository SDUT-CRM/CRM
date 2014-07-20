package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Lg18 entity. @author MyEclipse Persistence Tools
 */

public class Lg18 implements java.io.Serializable {

	// Fields

	private BigDecimal lg1801;
	private Lg17 lg17;
	private Lg02 lg02;
	private String lg0101;
	private Timestamp lg1802;
	private Timestamp lg1803;
	private String lg1804;

	// Constructors

	/** default constructor */
	public Lg18() {
	}

	/** minimal constructor */
	public Lg18(BigDecimal lg1801, Lg02 lg02, String lg0101, Timestamp lg1802,
			Timestamp lg1803, String lg1804) {
		this.lg1801 = lg1801;
		this.lg02 = lg02;
		this.lg0101 = lg0101;
		this.lg1802 = lg1802;
		this.lg1803 = lg1803;
		this.lg1804 = lg1804;
	}

	/** full constructor */
	public Lg18(BigDecimal lg1801, Lg17 lg17, Lg02 lg02, String lg0101,
			Timestamp lg1802, Timestamp lg1803, String lg1804) {
		this.lg1801 = lg1801;
		this.lg17 = lg17;
		this.lg02 = lg02;
		this.lg0101 = lg0101;
		this.lg1802 = lg1802;
		this.lg1803 = lg1803;
		this.lg1804 = lg1804;
	}

	// Property accessors

	public BigDecimal getLg1801() {
		return this.lg1801;
	}

	public void setLg1801(BigDecimal lg1801) {
		this.lg1801 = lg1801;
	}

	public Lg17 getLg17() {
		return this.lg17;
	}

	public void setLg17(Lg17 lg17) {
		this.lg17 = lg17;
	}

	public Lg02 getLg02() {
		return this.lg02;
	}

	public void setLg02(Lg02 lg02) {
		this.lg02 = lg02;
	}

	public String getLg0101() {
		return this.lg0101;
	}

	public void setLg0101(String lg0101) {
		this.lg0101 = lg0101;
	}

	public Timestamp getLg1802() {
		return this.lg1802;
	}

	public void setLg1802(Timestamp lg1802) {
		this.lg1802 = lg1802;
	}

	public Timestamp getLg1803() {
		return this.lg1803;
	}

	public void setLg1803(Timestamp lg1803) {
		this.lg1803 = lg1803;
	}

	public String getLg1804() {
		return this.lg1804;
	}

	public void setLg1804(String lg1804) {
		this.lg1804 = lg1804;
	}

}