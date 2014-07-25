package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg17 entity. @author MyEclipse Persistence Tools
 */

public class Lg17 implements java.io.Serializable {

	// Fields

	private BigDecimal lg1701;
	private String lg1702;
	private String lg1703;
	private Set lg18s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Lg17() {
	}

	/** minimal constructor */
	public Lg17(String lg1702, String lg1703) {
		this.lg1702 = lg1702;
		this.lg1703 = lg1703;
	}

	/** full constructor */
	public Lg17(String lg1702, String lg1703, Set lg18s) {
		this.lg1702 = lg1702;
		this.lg1703 = lg1703;
		this.lg18s = lg18s;
	}

	// Property accessors

	public BigDecimal getLg1701() {
		return this.lg1701;
	}

	public void setLg1701(BigDecimal lg1701) {
		this.lg1701 = lg1701;
	}

	public String getLg1702() {
		return this.lg1702;
	}

	public void setLg1702(String lg1702) {
		this.lg1702 = lg1702;
	}

	public String getLg1703() {
		return this.lg1703;
	}

	public void setLg1703(String lg1703) {
		this.lg1703 = lg1703;
	}

	public Set getLg18s() {
		return this.lg18s;
	}

	public void setLg18s(Set lg18s) {
		this.lg18s = lg18s;
	}

}