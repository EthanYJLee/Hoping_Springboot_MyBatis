package com.springproject.base.model;

import java.sql.Timestamp;

public class ReviewDto {
	
	int rvSeq;
	String rvCId;
	String rvCName;
	String rvTitle;
	String rvContent;
	int rvStar;
	Timestamp rvTime;
	Timestamp rvMtime;
	Timestamp rvDtime;
	int regcamp_regSeq;
	int regcamp_host_hSeq;
	
	public ReviewDto() {
		// TODO Auto-generated constructor stub
	}

	public ReviewDto(int rvSeq, String rvCId, String rvCName, String rvTitle, String rvContent, int rvStar,
			Timestamp rvTime, Timestamp rvMtime, Timestamp rvDtime, int regcamp_regSeq, int regcamp_host_hSeq) {
		super();
		this.rvSeq = rvSeq;
		this.rvCId = rvCId;
		this.rvCName = rvCName;
		this.rvTitle = rvTitle;
		this.rvContent = rvContent;
		this.rvStar = rvStar;
		this.rvTime = rvTime;
		this.rvMtime = rvMtime;
		this.rvDtime = rvDtime;
		this.regcamp_regSeq = regcamp_regSeq;
		this.regcamp_host_hSeq = regcamp_host_hSeq;
	}

	public int getRvSeq() {
		return rvSeq;
	}

	public void setRvSeq(int rvSeq) {
		this.rvSeq = rvSeq;
	}

	public String getRvCId() {
		return rvCId;
	}

	public void setRvCId(String rvCId) {
		this.rvCId = rvCId;
	}

	public String getRvCName() {
		return rvCName;
	}

	public void setRvCName(String rvCName) {
		this.rvCName = rvCName;
	}

	public String getRvTitle() {
		return rvTitle;
	}

	public void setRvTitle(String rvTitle) {
		this.rvTitle = rvTitle;
	}

	public String getRvContent() {
		return rvContent;
	}

	public void setRvContent(String rvContent) {
		this.rvContent = rvContent;
	}

	public int getRvStar() {
		return rvStar;
	}

	public void setRvStar(int rvStar) {
		this.rvStar = rvStar;
	}

	public Timestamp getRvTime() {
		return rvTime;
	}

	public void setRvTime(Timestamp rvTime) {
		this.rvTime = rvTime;
	}

	public Timestamp getRvMtime() {
		return rvMtime;
	}

	public void setRvMtime(Timestamp rvMtime) {
		this.rvMtime = rvMtime;
	}

	public Timestamp getRvDtime() {
		return rvDtime;
	}

	public void setRvDtime(Timestamp rvDtime) {
		this.rvDtime = rvDtime;
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
