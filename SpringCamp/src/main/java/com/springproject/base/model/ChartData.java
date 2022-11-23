package com.springproject.base.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="line_chart")
public class ChartData {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hSeq;
	
	@Column
	private Integer monthly;
	
	@Column
	private Integer monthlyProfit;

}
