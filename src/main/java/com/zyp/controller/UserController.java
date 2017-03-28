package com.zyp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zyp.model.User;
import com.zyp.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController 
{
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model)
	{
		int userid = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userid);
	    model.addAttribute("user", user);  
	    return "showUser";
	}
	
}
