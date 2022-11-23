package com.springproject.base.dao;

import java.util.List;

import com.springproject.base.model.FacilityDto;
import com.springproject.base.model.KeywordDto;
import com.springproject.base.model.RegcampDto;
import com.springproject.base.model.RoomDto;

public interface HostModifyDao {
	
	public String checkMyCampDao(int hSeq, int regSeq) throws Exception;

	// 캠핑장 정보 수정 전 기존 정보 불러오기
	public RegcampDto myCampInfoDao(int hSeq, int regSeq) throws Exception;
	
	// 현재 등록되어있는 키워드, 편의시설 불러오기
	public List<KeywordDto> myKeywordInfoDao(int hSeq, int regSeq) throws Exception;
	public List<FacilityDto> myFacilityInfoDao(int hSeq, int regSeq) throws Exception;
	
	// 캠핑장 자리 정보 가져오기
	public List<RoomDto> myRoomInfoDao(int hSeq, int regSeq) throws Exception;
	
	// 캠핑장 삭제 전 남은 예약 여부 확인
	public RegcampDto checkRemainingBookDao(int hSeq, int regSeq) throws Exception;
	
	// 캠핑장 영구삭제
	public void campIsDeletedDao(int hSeq, int regSeq) throws Exception;
	
}
