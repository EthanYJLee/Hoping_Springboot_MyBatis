package com.springproject.base.dao;

import com.springproject.base.model.RegcampDto;

public interface HostUploadDao {
	
	public void uploadRoughMapDao(String newName, int regSeq) throws Exception;
	
	// 초기 설정된 디폴트 이미지 보여주기
	public RegcampDto campImageViewDao(int regSeq) throws Exception;
	
	// 캠핑장 이미지 설정 (업데이트)
	public void uploadImage1Dao(String newName, int regSeq) throws Exception;
	public void uploadImage2Dao(String newName, int regSeq) throws Exception;
	public void uploadImage3Dao(String newName, int regSeq) throws Exception;
	

}
