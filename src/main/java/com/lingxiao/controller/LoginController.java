package com.lingxiao.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lingxiao.pojo.user.User;

@RestController
@Cacheable(value = "user-key")
public class LoginController {

	@GetMapping("/login.html")
	public User getLoginInfo() {
		User user = new User();
		return user;
	}
}
