package com.northwind.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.northwind.entity.User;
import com.northwind.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private UserService userService;

	
	@ModelAttribute("user")
	private User constructUser()
	{
		return new User();
	}
	
	//@RequestMapping("/register")
	@RequestMapping
	public String showRegister()
	{
		return "user-register";
	}

	//@RequestMapping(value="/register", method=RequestMethod.POST)
	@RequestMapping(method=RequestMethod.POST)
	public String doRegister(@Valid @ModelAttribute("user") User user, BindingResult result)
	{
		if (result.hasErrors()){
			return "user-register";
		}
		userService.save(user);
		//return "user-register";
		return "redirect:/register.html?success=true";
	}
	
	@RequestMapping("/available")
	@ResponseBody
	public String available(@RequestParam String username){
		Boolean available = userService.findOne(username) == null;
		return available.toString();
	}

}
