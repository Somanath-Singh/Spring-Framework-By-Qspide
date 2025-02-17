package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dto.LoginDTO;
import com.nt.dto.RegisterDTO;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Controller
//@RequestMapping("/home-api")
public class MyController {
	
	
	@GetMapping("/")
	public String defaultPage()
	{
		System.out.println("MyController.defaultPage()");
		return "index.jsp";
	}
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public void showHome()
	{
		System.out.println("MyController.showHome()");
	}
	
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String showHomePage()
	{
		System.out.println("MyController.showHomePage()");
		return"home.jsp";
	}
	
	@GetMapping("/login")
	public String showLoginPage()
	{
		System.out.println("MyController.showLoginPage()");
		return"login.jsp";
	}
	
	@PostMapping("/login")
	public String processLoginPage( ServletRequest req,ServletResponse res,Map<String,Object> m)
	{
		System.out.println("MyController.processLoginPage()");
		
		//collect the data from the login page
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		//sending the data to the index page
//		m.put("email", email);
//		m.put("password", password);
		
		System.out.println(email +".........."+password);
		
		return"view/details.jsp";
	}
	
	
	@PostMapping("/login2")
	public String accessRequestParmaData(@RequestParam("email") String email,@RequestParam("password") String password) {
		
		System.out.println("MyController.accessRequestParmaData()");
		
		System.out.println(email +".........."+password);
		
		return "view/detailsRP.jsp";
	}
	
	
	@PostMapping("/login3")
	public String accessDataThroughDTO(LoginDTO data) {
		
		System.out.println("MyController.accessDataThroughDTO()");
		
		System.out.println(data.getEmail()+".........."+data.getPassword());
		
		return "view/detailsDTO.jsp";
	}


}
