package com.scm.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//private Logger logger=LoggerFactory.getLogger(UserController.class);
	

	
	

  @RequestMapping(value= "/dashboard")
  public String userDashboard() {
    System.out.println("UserController.userDashboard()");
    return "user/dashboard";
  }
  @RequestMapping(value= "/profile")
  public String userProfile(Authentication authentication,Model model) {
	  
	  
	  
    return "user/profile";
  }

}
