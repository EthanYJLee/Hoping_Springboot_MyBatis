package com.springproject.base.dao;

import org.apache.ibatis.session.SqlSession;

public class MainStatusDaoImpl implements MainStatusDao {
	
	SqlSession sqlSession;
	public static String nameSpace = "com.springproject.base.dao.MainStatusDao";
	
	@Override
	public Integer newReservationDao(int hSeq) throws Exception {
		Integer nr = 0; 
		nr = sqlSession.selectOne(nameSpace + ".newReservationDao");
		if (nr == null) {
			nr = 0;
		}
		return nr;
	}
	
	@Override
	public Integer newCheckinDao(int hSeq) throws Exception {
		Integer todayIn = 0;
		todayIn = sqlSession.selectOne(nameSpace + ".newCheckinDao");
		if (todayIn == null) {
			todayIn = 0;
		}
		return todayIn;
	}
	
	@Override
	public Integer newCheckoutDao(int hSeq) throws Exception {
		Integer todayOut = 0;
		todayOut = sqlSession.selectOne(nameSpace + ".newCheckoutDao");
		if (todayOut == null) {
			todayOut = 0;
		}
		return todayOut;
	}

	@Override
	public Integer newInquiryDao(int hSeq) throws Exception {
		Integer newInquiry = 0;
		newInquiry = sqlSession.selectOne(nameSpace + ".newInquiryDao");
		if (newInquiry == null) {
			newInquiry = 0;
		}
		return newInquiry;
	}

	@Override
	public Integer repliedInquiryDao(int hSeq) throws Exception {
		Integer repliedInquiry = 0;
		repliedInquiry = sqlSession.selectOne(nameSpace + ".repliedInquiryDao");
		if (repliedInquiry == null) {
			repliedInquiry = 0;
		}
		return repliedInquiry;
	}



	@Override
	public Integer newReviewDao(int hSeq) throws Exception {
		Integer newReview = 0;
		newReview = sqlSession.selectOne(nameSpace + ".newReviewDao");
		if (newReview == null) {
			newReview = 0;
		}
		return newReview;
	}

	@Override
	public Integer repliedReviewDao(int hSeq) throws Exception {
		Integer repliedReview = 0;
		repliedReview = sqlSession.selectOne(nameSpace + ".repliedReviewDao");
		if (repliedReview == null) {
			repliedReview = 0;
		}
		return repliedReview;
	}






}
