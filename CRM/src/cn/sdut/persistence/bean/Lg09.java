package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg09 entity. @author MyEclipse Persistence Tools
 */

public class Lg09 implements java.io.Serializable {

	// Fields

	private BigDecimal lg0901;
	private Lg03 lg03;
	private Timestamp lg0902;
	private Timestamp lg0903;
	private Set lg10s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Lg09() {
	}

	/** minimal constructor */
	public Lg09(BigDecimal lg0901, Lg03 lg03, Timestamp lg0902, Timestamp lg0903) {
		this.lg0901 = lg0901;
		this.lg03 = lg03;
		this.lg0902 = lg0902;
		this.lg0903 = lg0903;
	}

	/** full constructor */
	public Lg09(BigDecimal lg0901, Lg03 lg03, Timestamp lg0902,
			Timestamp lg0903, Set lg10s) {
		this.lg0901 = lg0901;
		this.lg03 = lg03;
		this.lg0902 = lg0902;
		this.lg0903 = lg0903;
		this.lg10s = lg10s;
	}

	// Property accessors

	public BigDecimal getLg0901() {
		return this.lg0901;
	}

	public void setLg0901(BigDecimal lg0901) {
		this.lg0901 = lg0901;
	}

	public Lg03 getLg03() {
		return this.lg03;
	}

	public void setLg03(Lg03 lg03) {
		this.lg03 = lg03;
	}

	public Timestamp getLg0902() {
		return this.lg0902;
	}

	public void setLg0902(Timestamp lg0902) {
		this.lg0902 = lg0902;
	}

	public Timestamp getLg0903() {
		return this.lg0903;
	}

	public void setLg0903(Timestamp lg0903) {
		this.lg0903 = lg0903;
	}

	public Set getLg10s() {
		return this.lg10s;
	}

	public void setLg10s(Set lg10s) {
		this.lg10s = lg10s;
	}

}