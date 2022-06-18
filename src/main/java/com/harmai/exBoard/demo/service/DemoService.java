package com.harmai.exBoard.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	@Autowired
	private PostService postService;
	
	
	public String getDemon(String name) {
		
		System.out.println("getDemon 서비스 실행!!");
		System.out.println(postService.postServiceTest("갈비"));
		
		
		return name;
	}
	
	
}