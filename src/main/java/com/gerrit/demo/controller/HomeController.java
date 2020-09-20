package com.gerrit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gerrit.demo.service.SampleService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class HomeController {
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/")
	public String home() {
		return "demo";
	}
	
	@GetMapping("/demo")
	public ModelAndView getDemo() {
		ModelAndView mv = new ModelAndView();
		log.info(" 2121212 ");
		mv.setViewName("home/demo");
		return mv;
	}
	
	@GetMapping("/setPeform")
	public String setPerformTest() {
		try {
			sampleService.setPeformTest();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.toString());
		}
		
		return "Peform";
	}

}
