package com.xy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xy.entity.Test;
import com.xy.entity.User;
import com.xy.service.HelloService;

//@RestController  // = @Controller + @ResponseBody
@Controller
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(HttpServletRequest request, ModelMap map) {
		logger.info("begin /hello");
		helloService.sayHello();
		return "hello world";
	}
	
	@RequestMapping("/view")
	public String view(ModelMap map) {
		logger.info("begin /view");
		map.addAttribute("host", "http://blog.didispace.com");
		return "index";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public Test add(Test test) {
		test = helloService.add(test);
		return test;
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<User> findAll() {
		return helloService.getAll();
	}
	
	
	@RequestMapping("/deleteCache")
	@ResponseBody
	public String deleteCache() {
		helloService.deleteCache();
		return "done";
	}
}
