package com.springproject.base.service;

import java.util.List;

import com.springproject.base.model.FacilityDto;
import com.springproject.base.model.KeywordDto;
import com.springproject.base.model.RegcampDto;
import com.springproject.base.model.RoomDto;

public interface HostModifyDaoService {
	public String checkMyCampDao(int hSeq, int regSeq) throws Exception;

	public RegcampDto myCampInfoDao(int hSeq, int regSeq) throws Exception;
	
	public List<KeywordDto> myKeywordInfoDao(int hSeq, int regSeq) throws Exception;
	public List<FacilityDto> myFacilityInfoDao(int hSeq, int regSeq) throws Exception;
	
	public List<RoomDto> myRoomInfoDao(int hSeq, int regSeq) throws Exception;
	
	public RegcampDto checkRemainingBookDao(int hSeq, int regSeq) throws Exception;
	
	public void campIsDeletedDao(int hSeq, int regSeq) throws Exception;




}
