package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.dto.StudentDTO;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/register")
	public String viewStudentregister(Model m) {
		System.out.println("StudentController.viewStudentregister()");
		StudentDTO student = new StudentDTO();
		student.setId(1);
		m.addAttribute("student", student);
		return "StudentView/register";
	}

	@PostMapping("/register")
	public String processRegister(@ModelAttribute StudentDTO student, BindingResult result, Model m) {
		System.out.println("StudentController.processRegister()");
		m.addAttribute("student", student);
		
		
		
		if (result.hasErrors()) {
			System.out.println("StudentController.processRegister():Has Errors");
			result.getAllErrors().forEach(System.out::println);
			return "StudentView/register";
		}
		m.addAttribute("message", "Student Registration Success ");
		System.out.println(student);

		return "StudentView/success";
	}
	
	@GetMapping("/viewPath")
	public String showPathVariavleData() {
		System.out.println("StudentController.showPathVariavleData()");
		return "StudentView/pathData";
	}
	
	@GetMapping("/pathData/{name}/{age}")
	public String sendPathVariavleData1(@PathVariable("name") String name,@PathVariable("age") int age,Model m) {
		System.out.println("StudentController.sendDataInPathVariavle() : "+name+"...."+age);
		m.addAttribute("sname", name);
		m.addAttribute("sage", age);
		return "StudentView/showpathdata";
	}
	
	@GetMapping("/pathData")
	public String sendPathVariavleData2(@RequestParam("name") String name,@RequestParam("age") int age,Model m) {
		System.out.println("StudentController.sendDataInPathVariavle() : "+name+"...."+age);
		m.addAttribute("sname", name);
		m.addAttribute("sage", age);
		
		//exception cause
		System.out.println(12/0);
		
		return "StudentView/showpathdata";
	}
	
	@ExceptionHandler(Exception.class)
	public String defaultExceptionCaller() {
		System.out.println("StudentController.defaultExceptionCaller()");
		return "StudentView/error";
	}
	

}
