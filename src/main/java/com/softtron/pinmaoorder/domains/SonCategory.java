package com.softtron.pinmaoorder.domains;

public class SonCategory {
	private String scategoryname;
	private int sparentId;
	private int scategoryId;
	public String getScategoryname() {
		return scategoryname;
	}
	public void setScategoryname(String scategoryname) {
		this.scategoryname = scategoryname;
	}
	public int getSparentId() {
		return sparentId;
	}
	public void setSparentId(int sparentId) {
		this.sparentId = sparentId;
	}
	public int getScategoryId() {
		return scategoryId;
	}
	public void setScategoryId(int scategoryId) {
		this.scategoryId = scategoryId;
	}
	
}
