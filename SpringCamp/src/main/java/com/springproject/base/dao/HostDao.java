package com.springproject.base.dao;

import java.util.List;

import com.springproject.base.model.RegcampDto;

public interface HostDao {
	
	public Integer checkDao(String cId, String cPw) throws Exception;
	public List<RegcampDto> myCampDao(int hSeq) throws Exception;

}
