package com.northwind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index()
	{
		//return "/WEB-INF/jsp/index.jsp";
		//<definition name=" -->index<-- " extends="common">
		return "index";
	}
}
