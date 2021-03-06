package com.qlarslrs.memo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/signin_view")
	public String signInView() {
		return "user/signin";
	}
	
	@GetMapping("/signup_view")
	public String signUpView() {
		return "user/signup";
	}
}