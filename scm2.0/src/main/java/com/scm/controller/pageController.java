package com.scm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.scm.entities.User;
import com.scm.forms.UserForm;
import com.scm.helper.Message;
import com.scm.helper.MessageType;
import com.scm.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class pageController {

  @Autowired
  private UserService service;

  @GetMapping("/home")
  public String home() {
    return "home";
  }

  @GetMapping("/about")
  public String about() {
    return "about";
  }

  @GetMapping("/services")
  public String services() {
    return "services";
  }

  @GetMapping("/")
  public String index() {

    return "redirect:/home";
  }

  @GetMapping("/contact")
  public String contact() {

    return "contact";
  }

  @GetMapping("/login")
  public String login() {

    return "login";
  }

  @GetMapping("/register")
  public String register(Model model) {
    UserForm userForm = new UserForm();
    model.addAttribute("userForm", userForm);
    return "register";
  }

@PostMapping("/do-register")
  public String ProcessingRegister(@Valid @ModelAttribute UserForm userForm,BindingResult rBindingResult, HttpSession session) {
/*
System.out.println(user);
User newUser = service.saveUser(user);
if (newUser != null) {
   session.setAttribute("msg", "User Registration Successfully");
  
}
else {
 session.setAttribute("msg", "Internal Server Error");
}
 
*/
    
//validate the form
if (rBindingResult.hasErrors()) {
  return "register";
}

User user = new User();
    user.setName(userForm.getName());
    user.setEmail(userForm.getEmail());
    user.setAbout(userForm.getAbout());
    user.setPassword(userForm.getPassword());
    user.setPhoneNumber(userForm.getPhoneNumber());
    user.setProfilePic("null");
    User saveUser = service.saveUser(user);
    if (saveUser != null) {
     Message msg=Message.builder().content("Registration Successful").type(MessageType.green).build();
        session.setAttribute("msg", msg);
        
      }
      else {
      session.setAttribute("msg", "Internal Server Error");
      }

          return "redirect:/register";
  }
}
