package com.springsecuritytest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/welcome")
	public void welcome() {

	}

	@RequestMapping("/admin")
	public void admin() {

	}
}
