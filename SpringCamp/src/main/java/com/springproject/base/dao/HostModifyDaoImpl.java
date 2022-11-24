package com.springproject.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springproject.base.model.FacilityDto;
import com.springproject.base.model.KeywordDto;
import com.springproject.base.model.RegcampDto;
import com.springproject.base.model.RoomDto;

public class HostModifyDaoImpl implements HostModifyDao {
	
	SqlSession sqlSession;
	private static String nameSpace = "com.springproject.base.dao.HostModifyDao";
	
	@Override
	public String checkMyCampDao(int hSeq, int regSeq) throws Exception {
		return sqlSession.selectOne(nameSpace + ".checkMyCampDao");
	}

	@Override
	public RegcampDto myCampInfoDao(int hSeq, int regSeq) throws Exception {
		return sqlSession.selectOne(nameSpace + ".myCampInfoDao");
	}

	@Override
	public List<KeywordDto> myKeywordInfoDao(int hSeq, int regSeq) throws Exception {
		return sqlSession.selectList(nameSpace + ".myKeywordInfoDao");
	}

	@Override
	public List<FacilityDto> myFacilityInfoDao(int hSeq, int regSeq) throws Exception {
		return sqlSession.selectList(nameSpace + ".myFacilityInfoDao");
	}
	
	@Override
	public List<RoomDto> myRoomInfoDao(int hSeq, int regSeq) throws Exception {
		return sqlSession.selectList(nameSpace + ".myRoomInfoDao");
	}

	@Override
	public RegcampDto checkRemainingBookDao(int hSeq, int regSeq) throws Exception {
		return sqlSession.selectOne(nameSpace + ".checkRemainingBookDao");
	}

	@Override
	public void campIsDeletedDao(int hSeq, int regSeq) throws Exception {
		sqlSession.update(nameSpace + ".campIsDeletedDao");
	}

	@Override
	public RegcampDto campLocationViewDao(int regSeq) throws Exception {
		return sqlSession.selectOne(nameSpace + ".campLocationViewDao");
	}

	@Override
	public void modifyCampLocationDao(String regDetailaddress, String regsummary, int regSeq) throws Exception {
		sqlSession.update(nameSpace + ".modifyCampLocationDao");
	}

	@Override
	public RegcampDto campNameViewDao(int regSeq) throws Exception {
		return sqlSession.selectOne(nameSpace + ".campNameViewDao");
	}

	@Override
	public void modifyCampNameDao(String regName, String regCategory, String regTel, int regSeq) throws Exception {
		sqlSession.update(nameSpace + ".modifyCampNameDao");
	}

}
