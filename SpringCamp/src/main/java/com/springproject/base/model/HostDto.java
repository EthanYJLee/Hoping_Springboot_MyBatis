package com.springproject.base.model;

import java.sql.Timestamp;

public class HostDto {
	
	int hSeq;
	String hId;
	Timestamp hDate;
	Timestamp hMdate;
	Timestamp hDdate;
	String hSummary;
	String hImage;
	
	public HostDto() {
		// TODO Auto-generated constructor stub
	}

	public HostDto(int hSeq, String hId, Timestamp hDate, Timestamp hMdate, Timestamp hDdate, String hSummary,
			String hImage) {
		super();
		this.hSeq = hSeq;
		this.hId = hId;
		this.hDate = hDate;
		this.hMdate = hMdate;
		this.hDdate = hDdate;
		this.hSummary = hSummary;
		this.hImage = hImage;
	}

	public int gethSeq() {
		return hSeq;
	}

	public void sethSeq(int hSeq) {
		this.hSeq = hSeq;
	}

	public String gethId() {
		return hId;
	}

	public void sethId(String hId) {
		this.hId = hId;
	}

	public Timestamp gethDate() {
		return hDate;
	}

	public void sethDate(Timestamp hDate) {
		this.hDate = hDate;
	}

	public Timestamp gethMdate() {
		return hMdate;
	}

	public void sethMdate(Timestamp hMdate) {
		this.hMdate = hMdate;
	}

	public Timestamp gethDdate() {
		return hDdate;
	}

	public void sethDdate(Timestamp hDdate) {
		this.hDdate = hDdate;
	}

	public String gethSummary() {
		return hSummary;
	}

	public void sethSummary(String hSummary) {
		this.hSummary = hSummary;
	}

	public String gethImage() {
		return hImage;
	}

	public void sethImage(String hImage) {
		this.hImage = hImage;
	}

	
}
