package com.scm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.scm.entities.User;
import com.scm.helper.Helper;
import com.scm.services.UserService;

@ControllerAdvice
public class RootController {
	
	
	private Logger logger=LoggerFactory.getLogger(RootController.class);
	
	@Autowired
	private UserService service;
	
	@ModelAttribute
	public void addLoggedInUserInformation(Model model,Authentication authentication) {
		
		if(authentication==null) {
			return ;
		}
		
		String name=Helper.getEmailOfLoggedInUser(authentication);
		  logger.info("User logger in:: {}", name);
		  User user=service.getUserByEmail(name);
		  System.out.println(user);
		  
		  System.out.println(user.getName());
		  System.out.println(user.getEmail());
		  
		  model.addAttribute("loggedUser", user);
		
	}

}
