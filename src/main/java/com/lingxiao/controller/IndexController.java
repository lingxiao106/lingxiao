package com.lingxiao.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lingxiao.pojo.user.User;

@Controller
public class IndexController {

	@RequestMapping("/index.html")
	public String index(HttpSession session) {
		List<User> userInfo = new ArrayList<User>();
		for (int i = 1; i < 10; i++) {
			User user = new User();
			user.setUserId(i);
			user.setUserAge(20 + i);
			user.setUserDescription("描述" + i);
			user.setUserEmail(i + "105@qq.com");
			user.setUserPhone("1378651735" + i);
			userInfo.add(user);
		}
		session.setAttribute("user", userInfo);
		return "index";
	}

	@RequestMapping("/test.html")
	public String test() {
		return "test";
	}
}
