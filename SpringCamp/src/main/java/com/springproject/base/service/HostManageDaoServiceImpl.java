package com.springproject.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.base.dao.HostManageDao;
import com.springproject.base.model.HostReplyReviewDto;
import com.springproject.base.model.RoomDto;
@Service
public class HostManageDaoServiceImpl implements HostManageDaoService {

	@Autowired
	HostManageDao dao;
	
	@Override
	public List<HostReplyReviewDto> reviewListDao(int hSeq) throws Exception {
		return dao.reviewListDao(hSeq);
	}

	@Override
	public HostReplyReviewDto reviewContentDao(int rvSeq) throws Exception {
		return dao.reviewContentDao(rvSeq);
	}

	@Override
	public HostReplyReviewDto reviewInfoDao(int rvSeq) throws Exception {
		return dao.reviewInfoDao(rvSeq);
	}

	@Override
	public void replyReviewDao(String replyContent, int rvSeq, String rvCId, int regSeq, int hSeq) throws Exception {
		dao.replyReviewDao(replyContent, rvSeq, rvCId, regSeq, hSeq);
	}

	@Override
	public void updateReviewGroupDao() throws Exception {
		dao.updateReviewGroupDao();
	}

	@Override
	public List<String> campNameDao(int hSeq) throws Exception {
		return dao.campNameDao(hSeq);
	}

	@Override
	public void addCampLocationDao(String regDetailaddress, String regSummary, String regName, String regTel,
			String regCategory, int hSeq) throws Exception {
		dao.addCampLocationDao(regDetailaddress, regSummary, regName, regTel, regCategory, hSeq);
	}

	@Override
	public int myNewRegseqDao(int hSeq) throws Exception {
		return dao.myNewRegseqDao(hSeq);
	}

	@Override
	public void addCampFacilityDao(String fName, int regSeq, int hSeq) throws Exception {
		dao.addCampFacilityDao(fName, regSeq, hSeq);
	}

	@Override
	public void addCampKeywordDao(String kName, int regSeq, int hSeq) throws Exception {
		dao.addCampKeywordDao(kName, regSeq, hSeq);
	}

	@Override
	public String showDefaultMapDao(int regSeq) throws Exception {
		return dao.showDefaultMapDao(regSeq);
	}

	@Override
	public List<RoomDto> roomsViewDao(int regSeq, int hSeq) throws Exception {
		return dao.roomsViewDao(regSeq, hSeq);
	}

	@Override
	public void addRoomsDao(int roNum, int roPrice, int roMax, int regSeq, int hSeq) throws Exception {
		dao.addRoomsDao(roNum, roPrice, roMax, regSeq, hSeq);
	}

	@Override
	public void deleteRoomsDao(int roSeq) throws Exception {
		dao.deleteRoomsDao(roSeq);
	}




}
