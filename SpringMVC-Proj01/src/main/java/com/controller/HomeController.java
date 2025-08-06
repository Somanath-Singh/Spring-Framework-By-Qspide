package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.dto.LoginDTO;
import com.nt.dto.RegisterDTO;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@ModelAttribute
	public void alwaysExecuteMethod() {
		System.out.println("HomeController.alwaysExecuteMethod()");
	}

	// show register page
	@GetMapping("/register")
	public String showRegister() {

		System.out.println("HomeController.showRegister()");

		return "register.jsp";
	}

	// show login page
	@GetMapping("/loginform")
	public String showLogin(LoginDTO data) {

		System.out.println("HomeController.showLogin()");

		return "formLogin.jsp";
	}

	// process the register data
	@PostMapping("/register")
	public String doRegister(@ModelAttribute RegisterDTO register, HttpSession session) {

		System.out.println("HomeController.doRegister()");
		System.out.println(register.toString());

		// store the data to session
		session.setAttribute("data", register);

		return "redirect:/loginform";
	}

	// process the login data
	@PostMapping("/loginsubmit")
	public String doLogin(LoginDTO login, HttpSession session, Model m) {

		System.out.println("HomeController.doLogin()");

		System.out.println(login.getEmail() + ".............." + login.getPassword());

		// store the session data to access it
		RegisterDTO dto = (RegisterDTO) session.getAttribute("data");

		System.out.println(dto);

		// store the data to model(I)
		m.addAttribute("dto", dto);

		if (dto != null) {
			if (login.getEmail().equalsIgnoreCase(dto.getEmail())
					&& login.getPassword().equalsIgnoreCase(dto.getPassword())) {

				System.out.println("HomeController.doLogin() - Successfully Login");
				return "view/show.jsp";
			}
		} else {
			return "redirect:/loginform";
		}

		return "redirect:/loginform";
	}

	// process the logout
	@GetMapping("/logout")
	public String processLogout(HttpSession session) {

		System.out.println("HomeController.processLogout()");

		session.removeAttribute("data");

		System.out.println("User logout successfully ..");

		return "redirect:/loginform";
	}

}
