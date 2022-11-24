package com.springproject.base.service;

import com.springproject.base.model.RegcampDto;

public interface HostUploadDaoService {
	
	public void uploadRoughMapDao(String newName, int regSeq) throws Exception;
	
	public RegcampDto campImageViewDao(int regSeq) throws Exception;
	
	public void uploadImage1Dao(String newName, int regSeq) throws Exception;
	public void uploadImage2Dao(String newName, int regSeq) throws Exception;
	public void uploadImage3Dao(String newName, int regSeq) throws Exception;


}
