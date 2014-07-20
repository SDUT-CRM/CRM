package cn.sdut.persistence.bean;


public class Syscode implements java.io.Serializable {

	// Fields

	private long fid;
	private String fname;
	private String fcode;
	private String fvalue;
	private String pfcode;

	public long getFid() {
		return this.fid;
	}

	public void setFid(long fid) {
		this.fid = fid;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFcode() {
		return this.fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getFvalue() {
		return this.fvalue;
	}

	public void setFvalue(String fvalue) {
		this.fvalue = fvalue;
	}

	public String getPfcode() {
		return this.pfcode;
	}

	public void setPfcode(String pfcode) {
		this.pfcode = pfcode;
	}

}