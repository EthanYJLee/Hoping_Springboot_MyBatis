package com.springproject.base.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.springproject.base.model.RegcampDto;
import com.springproject.base.service.HostUploadDaoService;

@Controller
public class HostUploadController {

	@Autowired
	HostUploadDaoService service;

	// 호스트 이미지 넣기
		@RequestMapping("/upload_rough_map")
		public String uploadRoughMap(HttpSession session, MultipartHttpServletRequest request, @RequestParam("uploadFile") MultipartFile file) throws Exception {
			String originalName = "";
			int regSeq = (int)session.getAttribute("REGSEQ");
			
			if (!(file == null)) {
				// 파일을 uid로 만들기 위한 기초단계
				String path = System.getProperty("user.dir") + "//src//main//webapp//images";
				
				// 확장자 가져오기
				originalName = file.getOriginalFilename();
				
				// 새로운 이름 지정 (랜덤값)
				UUID uuid = UUID.randomUUID();
				String newName = uuid.toString() + "_" + originalName;
				
				// 패스에 "name" 으로 saveFile을 만들 빈 껍데기를 생성해 준다.
				File saveFile = new File(path, newName);
				// file을 saveFile이름과 path로 지어서 넣기
				file.transferTo(saveFile);

				
				service.uploadRoughMapDao(newName, regSeq);
			}
			
			return "redirect:show_rough_map";
		}
		
		@RequestMapping("/images_view")
		public String imagesView(HttpSession session, Model model) throws Exception {
			int regSeq = (int)session.getAttribute("REGSEQ");
			RegcampDto dto = service.campImageViewDao(regSeq);
			model.addAttribute("imagelist", dto);
			return "host/AddCamp6";
			
		}
		
		// image 1 업로드
		@RequestMapping("/upload_image1")
		public String uploadImage1(HttpSession session, MultipartHttpServletRequest request, @RequestParam("uploadFile1") MultipartFile file) throws Exception {
			String originalName = "";
			int regSeq = (int)session.getAttribute("REGSEQ");
			
			if (!(file == null)) {
				// 파일을 uid로 만들기 위한 기초단계
				String path = System.getProperty("user.dir") + "//src//main//webapp//images";
				
				// 확장자 가져오기
				originalName = file.getOriginalFilename();
				
				// 새로운 이름 지정 (랜덤값)
				UUID uuid = UUID.randomUUID();
				String newName = uuid.toString() + "_" + originalName;
				
				// 패스에 "name" 으로 saveFile을 만들 빈 껍데기를 생성해 준다.
				File saveFile = new File(path, newName);
				// file을 saveFile이름과 path로 지어서 넣기
				file.transferTo(saveFile);
				
				service.uploadImage1Dao(newName, regSeq);
			}
			
			return "redirect:images_view";
		}
		
		// image 2 업로드
		@RequestMapping("/upload_image2")
		public String uploadImage2(HttpSession session, MultipartHttpServletRequest request, @RequestParam("uploadFile2") MultipartFile file) throws Exception {
			String originalName = "";
			int regSeq = (int)session.getAttribute("REGSEQ");
			
			if (!(file == null)) {
				// 파일을 uid로 만들기 위한 기초단계
				String path = System.getProperty("user.dir") + "//src//main//webapp//images";
				
				// 확장자 가져오기
				originalName = file.getOriginalFilename();
				
				// 새로운 이름 지정 (랜덤값)
				UUID uuid = UUID.randomUUID();
				String newName = uuid.toString() + "_" + originalName;
				
				// 패스에 "name" 으로 saveFile을 만들 빈 껍데기를 생성해 준다.
				File saveFile = new File(path, newName);
				// file을 saveFile이름과 path로 지어서 넣기
				file.transferTo(saveFile);
				
				service.uploadImage2Dao(newName, regSeq);
			}
			
			return "redirect:images_view";
		}
		
		// image 3 업로드
		@RequestMapping("/upload_image3")
		public String uploadImage3(HttpSession session, MultipartHttpServletRequest request, @RequestParam("uploadFile3") MultipartFile file) throws Exception {
			String originalName = "";
			int regSeq = (int)session.getAttribute("REGSEQ");
			
			if (!(file == null)) {
				// 파일을 uid로 만들기 위한 기초단계
				String path = System.getProperty("user.dir") + "//src//main//webapp//images";
				
				// 확장자 가져오기
				originalName = file.getOriginalFilename();
				
				// 새로운 이름 지정 (랜덤값)
				UUID uuid = UUID.randomUUID();
				String newName = uuid.toString() + "_" + originalName;
				
				// 패스에 "name" 으로 saveFile을 만들 빈 껍데기를 생성해 준다.
				File saveFile = new File(path, newName);
				// file을 saveFile이름과 path로 지어서 넣기
				file.transferTo(saveFile);
				
				service.uploadImage3Dao(newName, regSeq);
			}
			
			return "redirect:images_view";
		}
		
		
		
		
		
}
