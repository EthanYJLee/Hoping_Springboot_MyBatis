package com.springproject.base.dao;

import java.util.List;

import com.springproject.base.model.HostReplyReviewDto;

public interface HostManageDao {
	
	// 리뷰 리스트 출력
	public List<HostReplyReviewDto> reviewListDao (int hSeq) throws Exception;

	// 리뷰 content view
	public HostReplyReviewDto reviewContentDao (int rvSeq) throws Exception;

	// 답변 작성 정보
	public HostReplyReviewDto reviewInfoDao (int rvSeq) throws Exception;
	
	// 리뷰 답변 작성하기
	public void replyReviewDao(String replyContent, int rvSeq, String rvCId, int regSeq, int hSeq) throws Exception;
	
	// 후기에 대한 댓글, 대댓글 그룹 지정 (업데이트)
	public void updateReviewGroupDao() throws Exception;
	
	// 검색 콤보박스용 캠핑장 이름 목록
	public List<String> campNameDao(int hSeq) throws Exception;
	
	// 추가할 캠핑장의 위치, 설명, 이름, 전화번호, 카테고리 등록
	public void addCampLocationDao(String regDetailaddress, String regSummary, String regName, String regTel, String regCategory, int hSeq) throws Exception;
	
	// 현재 페이지에서 생성된 캠핑장 번호 가져오기 (세션용)
	public int myNewRegseqDao(int hSeq) throws Exception;
	
	// 편의시설 등록
	public void addCampFacilityDao(String fName, int regSeq, int hSeq) throws Exception;
	
	// 키워드 등록
	public void addCampKeywordDao(String kName, int regSeq, int hSeq) throws Exception;
	
	// default 약도 보여주기
	public String showDefaultMapDao(int regSeq) throws Exception;
	
	
	
	
}
