package com.springproject.base.dao;

import org.apache.ibatis.session.SqlSession;

import com.springproject.base.model.RegcampDto;

public class HostUploadDaoImpl implements HostUploadDao {
	
	SqlSession sqlSession;
	public static String nameSpace = "com.springproject.base.dao.HostUploadDao";
	
	@Override
	public void uploadRoughMapDao(String newName, int regSeq) throws Exception {
		sqlSession.update(nameSpace + ".uploadRoughMapDao");
	}

	@Override
	public RegcampDto campImageViewDao(int regSeq) throws Exception {
		return sqlSession.selectOne(nameSpace + ".campImageViewDao");
	}

	@Override
	public void uploadImage1Dao(String newName, int regSeq) throws Exception {
		sqlSession.update(nameSpace + ".uploadImage1Dao");
	}

	@Override
	public void uploadImage2Dao(String newName, int regSeq) throws Exception {
		sqlSession.update(nameSpace + ".uploadImage2Dao");
	}

	@Override
	public void uploadImage3Dao(String newName, int regSeq) throws Exception {
		sqlSession.update(nameSpace + ".uploadImage3Dao");
	}

}
