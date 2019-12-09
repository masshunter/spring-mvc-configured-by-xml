package com.masshunter.springmvcbyxmlconfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		
		return mv;
	}
	
	@RequestMapping("/calc")
	public ModelAndView calc(@RequestParam("n1") int n1, @RequestParam("n2") int n2) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		
		int result = n1 + n2;
		mv.addObject("result", result);
		
		return mv;
	}
}
