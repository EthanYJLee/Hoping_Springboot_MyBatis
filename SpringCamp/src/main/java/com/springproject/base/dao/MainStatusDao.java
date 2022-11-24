package com.springproject.base.dao;

public interface MainStatusDao {
	
	public Integer newReservationDao(int hSeq) throws Exception;
	public Integer newCheckinDao(int hSeq) throws Exception;
	public Integer newCheckoutDao(int hSeq) throws Exception;
	
	public Integer newInquiryDao(int hSeq) throws Exception;
	public Integer repliedInquiryDao(int hSeq) throws Exception;

	public Integer newReviewDao(int hSeq) throws Exception;
	public Integer repliedReviewDao(int hSeq) throws Exception;
	
}
