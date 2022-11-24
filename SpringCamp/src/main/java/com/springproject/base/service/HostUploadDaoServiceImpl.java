package com.springproject.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.base.dao.HostUploadDao;
import com.springproject.base.model.RegcampDto;

@Service
public class HostUploadDaoServiceImpl implements HostUploadDaoService {
	
	@Autowired
	HostUploadDao dao;

	@Override
	public void uploadRoughMapDao(String newName, int regSeq) throws Exception {
		dao.uploadRoughMapDao(newName, regSeq);
	}

	@Override
	public RegcampDto campImageViewDao(int regSeq) throws Exception {
		return dao.campImageViewDao(regSeq);
	}

	@Override
	public void uploadImage1Dao(String newName, int regSeq) throws Exception {
		dao.uploadImage1Dao(newName, regSeq);
	}

	@Override
	public void uploadImage2Dao(String newName, int regSeq) throws Exception {
		dao.uploadImage2Dao(newName, regSeq);
	}

	@Override
	public void uploadImage3Dao(String newName, int regSeq) throws Exception {
		dao.uploadImage3Dao(newName, regSeq);
	}
	

}
