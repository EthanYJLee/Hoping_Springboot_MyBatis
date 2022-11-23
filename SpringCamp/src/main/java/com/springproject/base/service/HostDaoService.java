package com.springproject.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.springproject.base.model.RegcampDto;

public interface HostDaoService {
	
	public Integer checkDao(HttpServletRequest request) throws Exception;
	public List<RegcampDto> myCampDao(int hSeq) throws Exception;



}
