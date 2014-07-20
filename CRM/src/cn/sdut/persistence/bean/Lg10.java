package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg10 entity. @author MyEclipse Persistence Tools
 */

public class Lg10 implements java.io.Serializable {

	// Fields

	private BigDecimal lg1001;
	private Lg09 lg09;
	private String lg1002;
	private String lg1003;
	private Set lg12s = new HashSet(0);
	private Set lg11s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Lg10() {
	}

	/** minimal constructor */
	public Lg10(BigDecimal lg1001, Lg09 lg09, String lg1002, String lg1003) {
		this.lg1001 = lg1001;
		this.lg09 = lg09;
		this.lg1002 = lg1002;
		this.lg1003 = lg1003;
	}

	/** full constructor */
	public Lg10(BigDecimal lg1001, Lg09 lg09, String lg1002, String lg1003,
			Set lg12s, Set lg11s) {
		this.lg1001 = lg1001;
		this.lg09 = lg09;
		this.lg1002 = lg1002;
		this.lg1003 = lg1003;
		this.lg12s = lg12s;
		this.lg11s = lg11s;
	}

	// Property accessors

	public BigDecimal getLg1001() {
		return this.lg1001;
	}

	public void setLg1001(BigDecimal lg1001) {
		this.lg1001 = lg1001;
	}

	public Lg09 getLg09() {
		return this.lg09;
	}

	public void setLg09(Lg09 lg09) {
		this.lg09 = lg09;
	}

	public String getLg1002() {
		return this.lg1002;
	}

	public void setLg1002(String lg1002) {
		this.lg1002 = lg1002;
	}

	public String getLg1003() {
		return this.lg1003;
	}

	public void setLg1003(String lg1003) {
		this.lg1003 = lg1003;
	}

	public Set getLg12s() {
		return this.lg12s;
	}

	public void setLg12s(Set lg12s) {
		this.lg12s = lg12s;
	}

	public Set getLg11s() {
		return this.lg11s;
	}

	public void setLg11s(Set lg11s) {
		this.lg11s = lg11s;
	}

}