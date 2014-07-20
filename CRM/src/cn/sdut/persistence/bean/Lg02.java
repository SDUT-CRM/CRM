package cn.sdut.persistence.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Lg02 entity. @author MyEclipse Persistence Tools
 */

public class Lg02 implements java.io.Serializable {

	// Fields

	private BigDecimal lg2101;
	private Lg21 lg21;
	private Lg04 lg04;
	private String lg0202;
	private String lg0203;
	private String lg0204;
	private String lg0205;
	private String lg0206;
	private String lg0207;
	private Timestamp lg0208;
	private Timestamp lg0209;
	private Set lg14s = new HashSet(0);
	private Set lg16s = new HashSet(0);
	private Set lg06s = new HashSet(0);
	private Set lg20s = new HashSet(0);
	private Set lg19s = new HashSet(0);
	private Set lg18s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Lg02() {
	}

	/** minimal constructor */
	public Lg02(BigDecimal lg2101, Lg21 lg21, Lg04 lg04, String lg0202,
			String lg0203, String lg0204, String lg0205, String lg0206,
			String lg0207, Timestamp lg0208, Timestamp lg0209) {
		this.lg2101 = lg2101;
		this.lg21 = lg21;
		this.lg04 = lg04;
		this.lg0202 = lg0202;
		this.lg0203 = lg0203;
		this.lg0204 = lg0204;
		this.lg0205 = lg0205;
		this.lg0206 = lg0206;
		this.lg0207 = lg0207;
		this.lg0208 = lg0208;
		this.lg0209 = lg0209;
	}

	/** full constructor */
	public Lg02(BigDecimal lg2101, Lg21 lg21, Lg04 lg04, String lg0202,
			String lg0203, String lg0204, String lg0205, String lg0206,
			String lg0207, Timestamp lg0208, Timestamp lg0209, Set lg14s,
			Set lg16s, Set lg06s, Set lg20s, Set lg19s, Set lg18s) {
		this.lg2101 = lg2101;
		this.lg21 = lg21;
		this.lg04 = lg04;
		this.lg0202 = lg0202;
		this.lg0203 = lg0203;
		this.lg0204 = lg0204;
		this.lg0205 = lg0205;
		this.lg0206 = lg0206;
		this.lg0207 = lg0207;
		this.lg0208 = lg0208;
		this.lg0209 = lg0209;
		this.lg14s = lg14s;
		this.lg16s = lg16s;
		this.lg06s = lg06s;
		this.lg20s = lg20s;
		this.lg19s = lg19s;
		this.lg18s = lg18s;
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

	public String getLg0202() {
		return this.lg0202;
	}

	public void setLg0202(String lg0202) {
		this.lg0202 = lg0202;
	}

	public String getLg0203() {
		return this.lg0203;
	}

	public void setLg0203(String lg0203) {
		this.lg0203 = lg0203;
	}

	public String getLg0204() {
		return this.lg0204;
	}

	public void setLg0204(String lg0204) {
		this.lg0204 = lg0204;
	}

	public String getLg0205() {
		return this.lg0205;
	}

	public void setLg0205(String lg0205) {
		this.lg0205 = lg0205;
	}

	public String getLg0206() {
		return this.lg0206;
	}

	public void setLg0206(String lg0206) {
		this.lg0206 = lg0206;
	}

	public String getLg0207() {
		return this.lg0207;
	}

	public void setLg0207(String lg0207) {
		this.lg0207 = lg0207;
	}

	public Timestamp getLg0208() {
		return this.lg0208;
	}

	public void setLg0208(Timestamp lg0208) {
		this.lg0208 = lg0208;
	}

	public Timestamp getLg0209() {
		return this.lg0209;
	}

	public void setLg0209(Timestamp lg0209) {
		this.lg0209 = lg0209;
	}

	public Set getLg14s() {
		return this.lg14s;
	}

	public void setLg14s(Set lg14s) {
		this.lg14s = lg14s;
	}

	public Set getLg16s() {
		return this.lg16s;
	}

	public void setLg16s(Set lg16s) {
		this.lg16s = lg16s;
	}

	public Set getLg06s() {
		return this.lg06s;
	}

	public void setLg06s(Set lg06s) {
		this.lg06s = lg06s;
	}

	public Set getLg20s() {
		return this.lg20s;
	}

	public void setLg20s(Set lg20s) {
		this.lg20s = lg20s;
	}

	public Set getLg19s() {
		return this.lg19s;
	}

	public void setLg19s(Set lg19s) {
		this.lg19s = lg19s;
	}

	public Set getLg18s() {
		return this.lg18s;
	}

	public void setLg18s(Set lg18s) {
		this.lg18s = lg18s;
	}

}