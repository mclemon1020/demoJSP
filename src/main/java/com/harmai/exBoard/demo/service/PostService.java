package com.harmai.exBoard.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	public String postServiceTest(String menu) {
		
		System.out.println("postService 실행");
		return menu;
	}
}
