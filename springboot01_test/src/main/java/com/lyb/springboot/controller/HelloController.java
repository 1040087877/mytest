package com.lyb.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class HelloController {
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	@Value("${lyb}")
	private String lyb;
	@Autowired
	private Environment environment;
	@GetMapping("/hello")
	@ResponseBody
	public String hello(){
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("url"));
		System.out.println(name);
		System.out.println(lyb);
		System.out.println(url);
		return "hello world;4";
	}
	
	@GetMapping("/user")
	public String user(){
		return "/html/user.html";
	}
}
