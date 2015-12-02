package com.northwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.northwind.service.ItemService;

@Controller
public class IndexController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/index")
	public String index(Model model)
	{
		//return "/WEB-INF/jsp/index.jsp";
		//<definition name=" -->index<-- " extends="common">
		model.addAttribute("items", itemService.getItems());
		return "index";
	}
}
