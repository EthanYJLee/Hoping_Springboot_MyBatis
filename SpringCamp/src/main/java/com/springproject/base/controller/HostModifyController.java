package com.springproject.base.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springproject.base.model.FacilityDto;
import com.springproject.base.model.KeywordDto;
import com.springproject.base.model.RegcampDto;
import com.springproject.base.model.RoomDto;
import com.springproject.base.service.HostModifyDaoService;

@Controller
public class HostModifyController {
	
	@Autowired
	HostModifyDaoService service;
	
	// 캠핑장 수정 메인화면 띄우기
	@RequestMapping("/modify_camp")
	public String modifyCamp(HttpServletRequest request, HttpSession session, Model model) throws Exception {
		int hSeq = (int)session.getAttribute("HSEQ");
		int regSeq = Integer.parseInt(request.getParameter("regSeq"));
		String regName = service.checkMyCampDao(hSeq, regSeq);
		if (regName != null) {
			session.setAttribute("REGSEQ", regSeq);
			model.addAttribute("regName", regName);
			return "host/ModifyCampMain";
		} else {
			return "redirect:host/HostMain";
		}
	}
	
	// 기존 정보 보기
	@RequestMapping("/my_camp_info")
	public String myCampInfo(HttpSession session, Model model) throws Exception {
		int hSeq = (int) session.getAttribute("HSEQ");
		int regSeq = (int) session.getAttribute("REGSEQ");
		RegcampDto campInfo = service.myCampInfoDao(hSeq, regSeq);
		model.addAttribute("campInfo", campInfo);
		
		// 키워드, 편의시설 정보 가져오기
		List<KeywordDto> myKeywordInfo = service.myKeywordInfoDao(hSeq, regSeq);
		model.addAttribute("keywordInfo", myKeywordInfo);
		List<FacilityDto> myFacilityInfo = service.myFacilityInfoDao(hSeq, regSeq);
		model.addAttribute("facilityInfo", myFacilityInfo);
		
		// 자리 정보 가져오기
		List<RoomDto> myRoomInfo = service.myRoomInfoDao(hSeq, regSeq);
		model.addAttribute("roomInfo", myRoomInfo);
		
		return "host/HostInfoCamp";
	}
	
	// 캠핑장 삭제 가능 여부 확인 (남은 예약이 있는지)
	@RequestMapping("/delete_camp")
	public String checkDeleteCamp(HttpSession session, Model model, HttpServletResponse response) throws Exception {
		int hSeq = (int)session.getAttribute("HSEQ");
		int regSeq = (int)session.getAttribute("REGSEQ");
		
		// 1. 예약내역 (pay table에 정보가 한 건이라도 있는지) 확인
		Integer chkPayment = service.checkPaymentRecordDao(regSeq);
		// 0값이면 결제가 한 건도 없는 것
		
		// 2. 예약내역 있다면 현재 기준 미처리된 체크인이 남았는지 확인
		RegcampDto chkCheckin = service.checkRemainingBookDao(hSeq, regSeq);
		// null값이면 잔여 예약 있는 것
		
		if (chkCheckin != null && chkPayment!=0) {
			model.addAttribute("CHECKDELETE", chkCheckin);
			return "host/HostMakeSureToDelete";
		
		} else if (chkPayment == 0)	{
			return "host/NoPaymentRecord";
		} else {
			return "host/CheckRemainingReservation";
		}
		
	}
	
	// 캠핑장 정보 삭제
	@RequestMapping("/camp_is_deleted")
	public void campIsDeleted(HttpSession session, HttpServletResponse response) throws Exception {
		int hSeq = (int)session.getAttribute("HSEQ");
		int regSeq = (int)session.getAttribute("REGSEQ");
		
		// Ddate 업데이트
		service.campIsDeletedDao(hSeq, regSeq);
		// 세션 제거
		session.removeAttribute("REGSEQ");
		
		// Alert
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('정상적으로 삭제되었습니다'); location.href='host_main'; </script>");
		out.flush();
	}
	
	@RequestMapping("/camp_location_view")
	public String campLocationView(HttpSession session, Model model) throws Exception {
		int regSeq = (int)session.getAttribute("REGSEQ");
		
		RegcampDto dto = service.campLocationViewDao(regSeq);
		model.addAttribute("campLocationList", dto);
		return "host/ModifyCampLocation";
	}
	
	@RequestMapping("/modify_camp_location")
	public String campLocationView(HttpServletRequest request, HttpSession session) throws Exception {
		int regSeq = (int)session.getAttribute("REGSEQ");
		String regDetailaddress = request.getParameter("regDetailaddress");
		String regSummary = request.getParameter("regSummary");
		
		service.modifyCampLocationDao(regDetailaddress, regSummary, regSeq);
		
		return "redirect:modify_camp";
	}
	
	@RequestMapping("/camp_name_view")
	public String campNameView(HttpSession session, Model model) throws Exception {
		int regSeq = (int)session.getAttribute("REGSEQ");
		RegcampDto dto = service.campNameViewDao(regSeq);
		model.addAttribute("campNameList", dto);
		return "host/ModifyCampName";
	}
	
	@RequestMapping("/modify_camp_name")
	public String modifyCampName(HttpServletRequest request, HttpSession session) throws Exception {
		int regSeq = (int)session.getAttribute("REGSEQ");
		String regName = request.getParameter("regName");
		String regCategory = request.getParameter("regCategory");
		String regTel = request.getParameter("regTel");
		
		service.modifyCampNameDao(regName, regCategory, regTel, regSeq);
		
		return "redirect:modify_camp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
