package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg13 entity. @author MyEclipse Persistence Tools
 */

public class Lg13 implements java.io.Serializable {

	// Fields

	private BigDecimal lg1301;
	private String lg1302;
	private String lg1303;
	private Double lg1304;
	private BigDecimal lg1305;
	private Set lg14s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Lg13() {
	}

	/** minimal constructor */
	public Lg13(BigDecimal lg1301, String lg1302, String lg1303, Double lg1304,
			BigDecimal lg1305) {
		this.lg1301 = lg1301;
		this.lg1302 = lg1302;
		this.lg1303 = lg1303;
		this.lg1304 = lg1304;
		this.lg1305 = lg1305;
	}

	/** full constructor */
	public Lg13(BigDecimal lg1301, String lg1302, String lg1303, Double lg1304,
			BigDecimal lg1305, Set lg14s) {
		this.lg1301 = lg1301;
		this.lg1302 = lg1302;
		this.lg1303 = lg1303;
		this.lg1304 = lg1304;
		this.lg1305 = lg1305;
		this.lg14s = lg14s;
	}

	// Property accessors

	public BigDecimal getLg1301() {
		return this.lg1301;
	}

	public void setLg1301(BigDecimal lg1301) {
		this.lg1301 = lg1301;
	}

	public String getLg1302() {
		return this.lg1302;
	}

	public void setLg1302(String lg1302) {
		this.lg1302 = lg1302;
	}

	public String getLg1303() {
		return this.lg1303;
	}

	public void setLg1303(String lg1303) {
		this.lg1303 = lg1303;
	}

	public Double getLg1304() {
		return this.lg1304;
	}

	public void setLg1304(Double lg1304) {
		this.lg1304 = lg1304;
	}

	public BigDecimal getLg1305() {
		return this.lg1305;
	}

	public void setLg1305(BigDecimal lg1305) {
		this.lg1305 = lg1305;
	}

	public Set getLg14s() {
		return this.lg14s;
	}

	public void setLg14s(Set lg14s) {
		this.lg14s = lg14s;
	}

}