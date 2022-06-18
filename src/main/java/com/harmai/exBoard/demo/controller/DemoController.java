package com.harmai.exBoard.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.harmai.exBoard.demo.service.DemoService;

@Controller
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	
	
	@GetMapping("/index")
	public String demoTest(Model model) {
		System.out.println("demoTestController==>");
		System.out.println(demoService.getDemon("송채은"));
		
		return "/index";
	}
	

}
