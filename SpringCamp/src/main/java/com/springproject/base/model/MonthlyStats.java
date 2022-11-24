package com.springproject.base.model;

public class MonthlyStats {
	int Jan;
	int Feb;
	int Mar;
	int Apr;
	int May;
	int Jun;
	int Jul;
	int Aug;
	int Sep;
	int Oct;
	int Nov;
	int Dec;
	int total_yearly;

	public MonthlyStats() {
		// TODO Auto-generated constructor stub
	}

	public MonthlyStats(int jan, int feb, int mar, int apr, int may, int jun, int jul, int aug, int sep, int oct,
			int nov, int dec, int total_yearly) {
		super();
		Jan = jan;
		Feb = feb;
		Mar = mar;
		Apr = apr;
		May = may;
		Jun = jun;
		Jul = jul;
		Aug = aug;
		Sep = sep;
		Oct = oct;
		Nov = nov;
		Dec = dec;
		this.total_yearly = total_yearly;
	}

	public int getJan() {
		return Jan;
	}

	public void setJan(int jan) {
		Jan = jan;
	}

	public int getFeb() {
		return Feb;
	}

	public void setFeb(int feb) {
		Feb = feb;
	}

	public int getMar() {
		return Mar;
	}

	public void setMar(int mar) {
		Mar = mar;
	}

	public int getApr() {
		return Apr;
	}

	public void setApr(int apr) {
		Apr = apr;
	}

	public int getMay() {
		return May;
	}

	public void setMay(int may) {
		May = may;
	}

	public int getJun() {
		return Jun;
	}

	public void setJun(int jun) {
		Jun = jun;
	}

	public int getJul() {
		return Jul;
	}

	public void setJul(int jul) {
		Jul = jul;
	}

	public int getAug() {
		return Aug;
	}

	public void setAug(int aug) {
		Aug = aug;
	}

	public int getSep() {
		return Sep;
	}

	public void setSep(int sep) {
		Sep = sep;
	}

	public int getOct() {
		return Oct;
	}

	public void setOct(int oct) {
		Oct = oct;
	}

	public int getNov() {
		return Nov;
	}

	public void setNov(int nov) {
		Nov = nov;
	}

	public int getDec() {
		return Dec;
	}

	public void setDec(int dec) {
		Dec = dec;
	}

	public int getTotal_yearly() {
		return total_yearly;
	}

	public void setTotal_yearly(int total_yearly) {
		this.total_yearly = total_yearly;
	}
	
}
