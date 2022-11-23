package com.springproject.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.base.dao.MainStatusDao;

@Service
public class MainStatusDaoServiceImpl implements MainStatusDaoService {
	
	@Autowired
	MainStatusDao dao;

	@Override
	public Integer newReservationDao(int hSeq) throws Exception {
		return dao.newReservationDao(hSeq);
	}

	@Override
	public Integer newCheckinDao(int hSeq) throws Exception {
		return dao.newCheckinDao(hSeq);
	}

	@Override
	public Integer newCheckoutDao(int hSeq) throws Exception {
		return dao.newCheckoutDao(hSeq);
	}

	@Override
	public Integer newInquiryDao(int hSeq) throws Exception {
		return dao.newInquiryDao(hSeq);
	}

	@Override
	public Integer repliedInquiryDao(int hSeq) throws Exception {
		return dao.repliedInquiryDao(hSeq);
	}

	@Override
	public Integer newReviewDao(int hSeq) throws Exception {
		return dao.newReviewDao(hSeq);
	}

	@Override
	public Integer repliedReviewDao(int hSeq) throws Exception {
		return dao.repliedReviewDao(hSeq);
	}



	
	
}
