package com.springproject.base.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.base.dao.HostDao;
import com.springproject.base.model.RegcampDto;

@Service
public class HostDaoServiceImpl implements HostDaoService {
	
	@Autowired
	HostDao dao;

	@Override
	public Integer checkDao(HttpServletRequest request) throws Exception {
		String cId = request.getParameter("cId");
		String cPw = request.getParameter("cPw");
		Integer chk = -2;
		chk = dao.checkDao(cId, cPw);
		if (chk == null) {
			chk = 0;
		}
		return chk;
	}

	@Override
	public List<RegcampDto> myCampDao(int hSeq) throws Exception {
		return dao.myCampDao(hSeq);
	}
	

	
}
