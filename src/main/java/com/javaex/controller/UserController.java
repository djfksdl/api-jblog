package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/api/users/join")
	public String join(@ModelAttribute UserVo userVo) {
		System.out.println("UserController.join");
		
		userService.exeJoin(userVo);
		
		return "";
	}
}
