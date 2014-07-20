package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Lg20 entity. @author MyEclipse Persistence Tools
 */

public class Lg20 implements java.io.Serializable {

	// Fields

	private BigDecimal lg2001;
	private Lg01 lg01;
	private Lg02 lg02;
	private String lg2002;
	private String lg2003;
	private Timestamp lg2004;
	private Timestamp lg2005;
	private BigDecimal lg2006;

	// Constructors

	/** default constructor */
	public Lg20() {
	}

	/** full constructor */
	public Lg20(BigDecimal lg2001, Lg01 lg01, Lg02 lg02, String lg2002,
			String lg2003, Timestamp lg2004, Timestamp lg2005, BigDecimal lg2006) {
		this.lg2001 = lg2001;
		this.lg01 = lg01;
		this.lg02 = lg02;
		this.lg2002 = lg2002;
		this.lg2003 = lg2003;
		this.lg2004 = lg2004;
		this.lg2005 = lg2005;
		this.lg2006 = lg2006;
	}

	// Property accessors

	public BigDecimal getLg2001() {
		return this.lg2001;
	}

	public void setLg2001(BigDecimal lg2001) {
		this.lg2001 = lg2001;
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

	public String getLg2002() {
		return this.lg2002;
	}

	public void setLg2002(String lg2002) {
		this.lg2002 = lg2002;
	}

	public String getLg2003() {
		return this.lg2003;
	}

	public void setLg2003(String lg2003) {
		this.lg2003 = lg2003;
	}

	public Timestamp getLg2004() {
		return this.lg2004;
	}

	public void setLg2004(Timestamp lg2004) {
		this.lg2004 = lg2004;
	}

	public Timestamp getLg2005() {
		return this.lg2005;
	}

	public void setLg2005(Timestamp lg2005) {
		this.lg2005 = lg2005;
	}

	public BigDecimal getLg2006() {
		return this.lg2006;
	}

	public void setLg2006(BigDecimal lg2006) {
		this.lg2006 = lg2006;
	}

}