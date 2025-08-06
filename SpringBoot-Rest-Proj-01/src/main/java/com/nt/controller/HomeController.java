package com.nt.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/msg")
	public String getMessage() {
		return "Hello Somanath Singh how are you ...";
	}
	
//	@GetMapping(value="/msg",produces = "application/xml")
//	public String getMessage() {
//		return "Hello Somanath Singh how are you";
//	}

}
