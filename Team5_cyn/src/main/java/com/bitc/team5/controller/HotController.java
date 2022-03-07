package com.bitc.team5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bitc.team5.dto.HotDto;
import com.bitc.team5.service.hot.HotService;



@Controller
public class HotController {
	
	@Autowired
	private HotService hotService;
	
///////////////****************관광지 리스트 페이지*****************///////////////////
	@RequestMapping(value="/hotplace")
	public ModelAndView hotplace() throws Exception {
		ModelAndView mv = new ModelAndView("/hot/hotmain");
		
		List<HotDto> hotList = hotService.selectHotList();
		mv.addObject("hotList", hotList);
		
		return mv;
	}
	
	
///////////////****************관광지 등록 페이지*****************///////////////////
	//상품등록 페이지
		@RequestMapping(value="/hotinsert")
		public String hotinsert() throws Exception {
		
		return "/hot/hotinsert";
		}
		
		//상품 정보 입력
		@RequestMapping(value="/hotinsert/hotRegister")
		public String proregister(HotDto hotPlace) throws Exception {
			hotService.hotinsert(hotPlace);
		
			return "redirect:/hotplace";
		}
	
	

}
