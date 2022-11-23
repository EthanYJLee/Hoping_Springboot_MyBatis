package com.springproject.base.model;

public class CheckDto {
	String cId;
	String cPw;
	String hId;
	int hSeq;
	
	public CheckDto() {
		// TODO Auto-generated constructor stub
	}

	public CheckDto(String cId, String cPw, String hId, int hSeq) {
		super();
		this.cId = cId;
		this.cPw = cPw;
		this.hId = hId;
		this.hSeq = hSeq;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcPw() {
		return cPw;
	}

	public void setcPw(String cPw) {
		this.cPw = cPw;
	}

	public String gethId() {
		return hId;
	}

	public void sethId(String hId) {
		this.hId = hId;
	}

	public int gethSeq() {
		return hSeq;
	}

	public void sethSeq(int hSeq) {
		this.hSeq = hSeq;
	}

	
}
