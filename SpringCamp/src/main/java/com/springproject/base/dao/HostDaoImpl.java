package com.springproject.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springproject.base.model.RegcampDto;

public class HostDaoImpl implements HostDao {
	
	SqlSession sqlSession;
	public static String nameSpace = "com.springproject.base.dao.HostDao";

	@Override
	public Integer checkDao(String cId, String cPw) throws Exception {
		Integer result = -2;
		result = sqlSession.selectOne(nameSpace + ".checkDao");
		if (result == null) {
			result = 0;
		}
		return result;
	}

	@Override
	public List<RegcampDto> myCampDao(int hSeq) throws Exception {
		return sqlSession.selectList(nameSpace + ".myCampDao");
	}

}
