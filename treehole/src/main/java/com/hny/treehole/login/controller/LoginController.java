package com.hny.treehole.login.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@PostConstruct
	public void init() {
		System.out.println("加载成功");
	}
	
	@RequestMapping(value = {"/test"}, method = RequestMethod.GET)
	public @ResponseBody String test(HttpServletResponse response, HttpServletRequest request) throws IOException {
		return "测试";
	}
	
}
