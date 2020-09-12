package com.gerrit.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "demo";
	}
	
	@GetMapping("/demo")
	public ModelAndView getDemo() {
		ModelAndView mv = new ModelAndView();
		log.info(" 12212 ");
		mv.setViewName("home/demo");
		return mv;
	}

}
