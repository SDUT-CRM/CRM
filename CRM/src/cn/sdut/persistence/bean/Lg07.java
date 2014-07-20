package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg07 entity. @author MyEclipse Persistence Tools
 */

public class Lg07 implements java.io.Serializable {

	// Fields

	private BigDecimal lg0701;
	private Lg03 lg03;
	private String lg0702;
	private String lg0703;
	private Double lg0704;
	private BigDecimal lg0705;
	private Timestamp lg0706;
	private String lg0707;
	private Timestamp lg0708;
	private Timestamp lg0709;
	private Timestamp lg0710;
	private Set lg08s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Lg07() {
	}

	/** minimal constructor */
	public Lg07(BigDecimal lg0701, Lg03 lg03, String lg0702, String lg0703,
			Double lg0704, BigDecimal lg0705, Timestamp lg0706, String lg0707,
			Timestamp lg0708, Timestamp lg0709, Timestamp lg0710) {
		this.lg0701 = lg0701;
		this.lg03 = lg03;
		this.lg0702 = lg0702;
		this.lg0703 = lg0703;
		this.lg0704 = lg0704;
		this.lg0705 = lg0705;
		this.lg0706 = lg0706;
		this.lg0707 = lg0707;
		this.lg0708 = lg0708;
		this.lg0709 = lg0709;
		this.lg0710 = lg0710;
	}

	/** full constructor */
	public Lg07(BigDecimal lg0701, Lg03 lg03, String lg0702, String lg0703,
			Double lg0704, BigDecimal lg0705, Timestamp lg0706, String lg0707,
			Timestamp lg0708, Timestamp lg0709, Timestamp lg0710, Set lg08s) {
		this.lg0701 = lg0701;
		this.lg03 = lg03;
		this.lg0702 = lg0702;
		this.lg0703 = lg0703;
		this.lg0704 = lg0704;
		this.lg0705 = lg0705;
		this.lg0706 = lg0706;
		this.lg0707 = lg0707;
		this.lg0708 = lg0708;
		this.lg0709 = lg0709;
		this.lg0710 = lg0710;
		this.lg08s = lg08s;
	}

	// Property accessors

	public BigDecimal getLg0701() {
		return this.lg0701;
	}

	public void setLg0701(BigDecimal lg0701) {
		this.lg0701 = lg0701;
	}

	public Lg03 getLg03() {
		return this.lg03;
	}

	public void setLg03(Lg03 lg03) {
		this.lg03 = lg03;
	}

	public String getLg0702() {
		return this.lg0702;
	}

	public void setLg0702(String lg0702) {
		this.lg0702 = lg0702;
	}

	public String getLg0703() {
		return this.lg0703;
	}

	public void setLg0703(String lg0703) {
		this.lg0703 = lg0703;
	}

	public Double getLg0704() {
		return this.lg0704;
	}

	public void setLg0704(Double lg0704) {
		this.lg0704 = lg0704;
	}

	public BigDecimal getLg0705() {
		return this.lg0705;
	}

	public void setLg0705(BigDecimal lg0705) {
		this.lg0705 = lg0705;
	}

	public Timestamp getLg0706() {
		return this.lg0706;
	}

	public void setLg0706(Timestamp lg0706) {
		this.lg0706 = lg0706;
	}

	public String getLg0707() {
		return this.lg0707;
	}

	public void setLg0707(String lg0707) {
		this.lg0707 = lg0707;
	}

	public Timestamp getLg0708() {
		return this.lg0708;
	}

	public void setLg0708(Timestamp lg0708) {
		this.lg0708 = lg0708;
	}

	public Timestamp getLg0709() {
		return this.lg0709;
	}

	public void setLg0709(Timestamp lg0709) {
		this.lg0709 = lg0709;
	}

	public Timestamp getLg0710() {
		return this.lg0710;
	}

	public void setLg0710(Timestamp lg0710) {
		this.lg0710 = lg0710;
	}

	public Set getLg08s() {
		return this.lg08s;
	}

	public void setLg08s(Set lg08s) {
		this.lg08s = lg08s;
	}

}