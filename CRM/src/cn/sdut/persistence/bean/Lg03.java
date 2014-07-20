package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg03 entity. @author MyEclipse Persistence Tools
 */

public class Lg03 implements java.io.Serializable {

	// Fields

	private BigDecimal lg2101;
	private Lg21 lg21;
	private Lg04 lg04;
	private String lg0302;
	private String lg0303;
	private String lg0304;
	private String lg0305;
	private String lg0306;
	private String lg0307;
	private Timestamp lg0308;
	private Timestamp lg0309;
	private Set lg14s = new HashSet(0);
	private Set lg09s = new HashSet(0);
	private Set lg16s = new HashSet(0);
	private Set lg07s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Lg03() {
	}

	/** minimal constructor */
	public Lg03(BigDecimal lg2101, Lg21 lg21, Lg04 lg04, String lg0302,
			String lg0303, String lg0304, String lg0305, String lg0306,
			String lg0307, Timestamp lg0308, Timestamp lg0309) {
		this.lg2101 = lg2101;
		this.lg21 = lg21;
		this.lg04 = lg04;
		this.lg0302 = lg0302;
		this.lg0303 = lg0303;
		this.lg0304 = lg0304;
		this.lg0305 = lg0305;
		this.lg0306 = lg0306;
		this.lg0307 = lg0307;
		this.lg0308 = lg0308;
		this.lg0309 = lg0309;
	}

	/** full constructor */
	public Lg03(BigDecimal lg2101, Lg21 lg21, Lg04 lg04, String lg0302,
			String lg0303, String lg0304, String lg0305, String lg0306,
			String lg0307, Timestamp lg0308, Timestamp lg0309, Set lg14s,
			Set lg09s, Set lg16s, Set lg07s) {
		this.lg2101 = lg2101;
		this.lg21 = lg21;
		this.lg04 = lg04;
		this.lg0302 = lg0302;
		this.lg0303 = lg0303;
		this.lg0304 = lg0304;
		this.lg0305 = lg0305;
		this.lg0306 = lg0306;
		this.lg0307 = lg0307;
		this.lg0308 = lg0308;
		this.lg0309 = lg0309;
		this.lg14s = lg14s;
		this.lg09s = lg09s;
		this.lg16s = lg16s;
		this.lg07s = lg07s;
	}

	// Property accessors

	public BigDecimal getLg2101() {
		return this.lg2101;
	}

	public void setLg2101(BigDecimal lg2101) {
		this.lg2101 = lg2101;
	}

	public Lg21 getLg21() {
		return this.lg21;
	}

	public void setLg21(Lg21 lg21) {
		this.lg21 = lg21;
	}

	public Lg04 getLg04() {
		return this.lg04;
	}

	public void setLg04(Lg04 lg04) {
		this.lg04 = lg04;
	}

	public String getLg0302() {
		return this.lg0302;
	}

	public void setLg0302(String lg0302) {
		this.lg0302 = lg0302;
	}

	public String getLg0303() {
		return this.lg0303;
	}

	public void setLg0303(String lg0303) {
		this.lg0303 = lg0303;
	}

	public String getLg0304() {
		return this.lg0304;
	}

	public void setLg0304(String lg0304) {
		this.lg0304 = lg0304;
	}

	public String getLg0305() {
		return this.lg0305;
	}

	public void setLg0305(String lg0305) {
		this.lg0305 = lg0305;
	}

	public String getLg0306() {
		return this.lg0306;
	}

	public void setLg0306(String lg0306) {
		this.lg0306 = lg0306;
	}

	public String getLg0307() {
		return this.lg0307;
	}

	public void setLg0307(String lg0307) {
		this.lg0307 = lg0307;
	}

	public Timestamp getLg0308() {
		return this.lg0308;
	}

	public void setLg0308(Timestamp lg0308) {
		this.lg0308 = lg0308;
	}

	public Timestamp getLg0309() {
		return this.lg0309;
	}

	public void setLg0309(Timestamp lg0309) {
		this.lg0309 = lg0309;
	}

	public Set getLg14s() {
		return this.lg14s;
	}

	public void setLg14s(Set lg14s) {
		this.lg14s = lg14s;
	}

	public Set getLg09s() {
		return this.lg09s;
	}

	public void setLg09s(Set lg09s) {
		this.lg09s = lg09s;
	}

	public Set getLg16s() {
		return this.lg16s;
	}

	public void setLg16s(Set lg16s) {
		this.lg16s = lg16s;
	}

	public Set getLg07s() {
		return this.lg07s;
	}

	public void setLg07s(Set lg07s) {
		this.lg07s = lg07s;
	}

}