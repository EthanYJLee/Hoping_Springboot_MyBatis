package com.springproject.base.model;

public class KeywordDto {
	int kIndex;
	String kName;
	int regcamp_regSeq;
	int regcamp_host_hSeq;
	
	public KeywordDto() {
		// TODO Auto-generated constructor stub
	}

	public KeywordDto(int kIndex, String kName, int regcamp_regSeq, int regcamp_host_hSeq) {
		super();
		this.kIndex = kIndex;
		this.kName = kName;
		this.regcamp_regSeq = regcamp_regSeq;
		this.regcamp_host_hSeq = regcamp_host_hSeq;
	}

	public int getkIndex() {
		return kIndex;
	}

	public void setkIndex(int kIndex) {
		this.kIndex = kIndex;
	}

	public String getkName() {
		return kName;
	}

	public void setkName(String kName) {
		this.kName = kName;
	}

	public int getRegcamp_regSeq() {
		return regcamp_regSeq;
	}

	public void setRegcamp_regSeq(int regcamp_regSeq) {
		this.regcamp_regSeq = regcamp_regSeq;
	}

	public int getRegcamp_host_hSeq() {
		return regcamp_host_hSeq;
	}

	public void setRegcamp_host_hSeq(int regcamp_host_hSeq) {
		this.regcamp_host_hSeq = regcamp_host_hSeq;
	}
	

}
