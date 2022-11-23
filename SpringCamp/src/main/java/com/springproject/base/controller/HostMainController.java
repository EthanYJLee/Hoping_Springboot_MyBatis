package com.springproject.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springproject.base.model.RegcampDto;
import com.springproject.base.service.HostDaoService;
import com.springproject.base.service.MainStatusDaoService;

@Controller
public class HostMainController {

	@Autowired
	HostDaoService service;
	
	@Autowired
	MainStatusDaoService mainService;
	
	@RequestMapping("/host_login")
	public String hostLogin() throws Exception {
		return "host/HostLogin";
	}
	
	@RequestMapping("/host_check")
	public String hostCheck(HttpServletRequest request, HttpSession session, Model model, HttpServletResponse response) throws Exception {
		Integer chk = service.checkDao(request);
		if (chk != 0) {
			String hId = request.getParameter("cId");
			session = request.getSession();
			session.setAttribute("HSEQ", chk);
			session.setAttribute("HID", hId);
			return "host/HostOk";
		} else {
			return "host/HostNo";
		}
	}
	
	@RequestMapping("/host_main")
	public String hostMain(HttpServletRequest request, Model model, HttpSession session) throws Exception {
		int chk = (int)session.getAttribute("HSEQ");
		List<RegcampDto> myCamp = service.myCampDao(chk);
		request.setAttribute("myCamp", myCamp);
		
		// 신규예약
		Integer nr = mainService.newReservationDao(chk);
		model.addAttribute("nr", nr);
		
		// 금일 체크인 예정
		Integer todayIn = mainService.newCheckinDao(chk);
		model.addAttribute("todayIn", todayIn);
		
		// 금일 체크아웃 예정
		Integer todayOut = mainService.newCheckoutDao(chk);
		model.addAttribute("todayOut", todayOut);
		
		// 신규문의
		Integer newInquiry = mainService.newInquiryDao(chk);
		model.addAttribute("tq", newInquiry);
				
		// 답변완료
		Integer repliedInquiry = mainService.repliedInquiryDao(chk);
		model.addAttribute("trq", repliedInquiry);
		
		// 답변미완료
		Integer notRepliedInquiry = newInquiry-repliedInquiry;
		model.addAttribute("tnrq", notRepliedInquiry);
		
		
		// 신규후기
		Integer newReview = mainService.newReviewDao(chk);
		model.addAttribute("tr", newReview);
		
		// 답변완료
		Integer repliedReview = mainService.repliedReviewDao(chk);
		model.addAttribute("trr", repliedReview);
		
		// 답변미완료
		Integer notRepliedReview = newReview - repliedReview;
		model.addAttribute("tnrr", notRepliedReview);
		
		return "host/HostMain";
		
	}
	
}
