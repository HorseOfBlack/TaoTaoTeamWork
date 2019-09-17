package com.mvc.controller;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.pojo.User;

@Controller
public class UserController {
	
	public ModelAndView login(User user) {
		ModelAndView modelAndView = null;
		if (user.getUsername().trim().equals("111")&&user.getPassword().trim().equals("111")) {
			modelAndView.addObject("user", user);
		}
		return null;
		
	}
}
