package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.dto.LoginDTO;
import com.nt.dto.User;

@Controller
public class MyController {

	@GetMapping("/")
	public String defaultPage() {
		System.out.println("MyController.defaultPage()");
		return "index";
	}

	@GetMapping("/login")
	public String showLoginPage() {
		System.out.println("MyController.showLoginPage()");
		return "login";
	}

	@PostMapping("/login")
	public String processLoginPage(@ModelAttribute("dto") LoginDTO login) {
		System.out.println("MyController.processLoginPage()");

		// collect the data from the login page
		String email =login.getEmail();
		String password =login.getPassword();

		System.out.println(email + ".........." + password);

		return "details";
	}
	
	
	@GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute User user, Model model) {
        System.out.println(user);
        model.addAttribute("user", user);
        model.addAttribute("message", "User Registration is Success ..");
        return "success";
    }

}
