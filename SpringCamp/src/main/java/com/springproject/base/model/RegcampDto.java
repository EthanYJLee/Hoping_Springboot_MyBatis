package com.springproject.base.model;

import java.sql.Timestamp;

public class RegcampDto {
	
	int regSeq;
	String regTel;
	String regCategory;
	String regDetailaddress;
	String regName;
	Timestamp regDate;
	Timestamp regMdate;
	Timestamp regDdate;
	String regSummary;
	String regImage1;
	String regImage2;
	String regImage3;
	String regImage4;
	int host_hSeq;
	
	public RegcampDto() {
		// TODO Auto-generated constructor stub
	}

	public RegcampDto(int regSeq, String regTel, String regCategory, String regDetailaddress, String regName,
			Timestamp regDate, Timestamp regMdate, Timestamp regDdate, String regSummary, String regImage1,
			String regImage2, String regImage3, String regImage4, int host_hSeq) {
		super();
		this.regSeq = regSeq;
		this.regTel = regTel;
		this.regCategory = regCategory;
		this.regDetailaddress = regDetailaddress;
		this.regName = regName;
		this.regDate = regDate;
		this.regMdate = regMdate;
		this.regDdate = regDdate;
		this.regSummary = regSummary;
		this.regImage1 = regImage1;
		this.regImage2 = regImage2;
		this.regImage3 = regImage3;
		this.regImage4 = regImage4;
		this.host_hSeq = host_hSeq;
	}

	public RegcampDto(String regImage1, String regName, String regDetailaddress, int regSeq) {
		super();
		this.regImage1 = regImage1;
		this.regName = regName;
		this.regDetailaddress = regDetailaddress;
		this.regSeq = regSeq;
	}
	
	public RegcampDto(String regTel, String regCategory, String regDetailaddress, String regName, String regImage1,
			String regImage2, String regImage3, String regImage4) {
		super();
		this.regTel = regTel;
		this.regCategory = regCategory;
		this.regDetailaddress = regDetailaddress;
		this.regName = regName;
		this.regImage1 = regImage1;
		this.regImage2 = regImage2;
		this.regImage3 = regImage3;
		this.regImage4 = regImage4;
	}

	public RegcampDto(String regName, String regTel, String regDetailaddress, String regSummary, String regImage1,
			String regImage2, String regImage3, String regImage4, Timestamp regDate) {
		super();
		this.regName = regName;
		this.regTel = regTel;
		this.regDetailaddress = regDetailaddress;
		this.regSummary = regSummary;
		this.regImage1 = regImage1;
		this.regImage2 = regImage2;
		this.regImage3 = regImage3;
		this.regImage4 = regImage4;
		this.regDate = regDate;
	}
	
	// 검색시 콤보박스용
	public RegcampDto(String regName) {
		super();
		this.regName = regName;
	}
	
	// 캠핑장 소개 이미지 검색, 입력용
	public RegcampDto(String regImage1, String regImage2, String regImage3) {
		super();
		this.regImage1 = regImage1;
		this.regImage2 = regImage2;
		this.regImage3 = regImage3;
	}
	
	public RegcampDto(String regDetailaddress, String regSummary) {
		super();
		this.regDetailaddress = regDetailaddress;
		this.regSummary = regSummary;
	}

	public int getRegSeq() {
		return regSeq;
	}

	public void setRegSeq(int regSeq) {
		this.regSeq = regSeq;
	}

	public String getRegTel() {
		return regTel;
	}

	public void setRegTel(String regTel) {
		this.regTel = regTel;
	}

	public String getRegCategory() {
		return regCategory;
	}

	public void setRegCategory(String regCategory) {
		this.regCategory = regCategory;
	}

	public String getRegDetailaddress() {
		return regDetailaddress;
	}

	public void setRegDetailaddress(String regDetailaddress) {
		this.regDetailaddress = regDetailaddress;
	}

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public Timestamp getRegMdate() {
		return regMdate;
	}

	public void setRegMdate(Timestamp regMdate) {
		this.regMdate = regMdate;
	}

	public Timestamp getRegDdate() {
		return regDdate;
	}

	public void setRegDdate(Timestamp regDdate) {
		this.regDdate = regDdate;
	}

	public String getRegSummary() {
		return regSummary;
	}

	public void setRegSummary(String regSummary) {
		this.regSummary = regSummary;
	}

	public String getRegImage1() {
		return regImage1;
	}

	public void setRegImage1(String regImage1) {
		this.regImage1 = regImage1;
	}

	public String getRegImage2() {
		return regImage2;
	}

	public void setRegImage2(String regImage2) {
		this.regImage2 = regImage2;
	}

	public String getRegImage3() {
		return regImage3;
	}

	public void setRegImage3(String regImage3) {
		this.regImage3 = regImage3;
	}

	public String getRegImage4() {
		return regImage4;
	}

	public void setRegImage4(String regImage4) {
		this.regImage4 = regImage4;
	}

	public int getHost_hSeq() {
		return host_hSeq;
	}

	public void setHost_hSeq(int host_hSeq) {
		this.host_hSeq = host_hSeq;
	}

}
