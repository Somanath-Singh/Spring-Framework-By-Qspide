package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.entity.Student;
import com.nt.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String getAllStudent(Model m) {
		m.addAttribute("student",new Student());
		m.addAttribute("students",service.getAllStudent());
		return "student";
	}
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute Student student,Model m) {
		try {
			String msg=service.saveStudent(student);
			m.addAttribute("msg", msg);
			return "redirect:/";
		}catch(Exception se) {
			m.addAttribute("msg", se.getMessage());
			return "redirect:/";
		}
	}
	
	@GetMapping("/edit/{id}")
	public String updateStudent(@PathVariable int id,Model m) {
		try {
			Student student=service.getStudentById(id);
			m.addAttribute("student",student);
			m.addAttribute("students",service.getAllStudent());
			return "student";
		}catch(Exception se) {
			m.addAttribute("msg", se.getMessage());
			return "redirect:/";
		}
	}

	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id,Model m) {
		try {
			String msg=service.deleteStudent(id);
			m.addAttribute("msg", msg);
			return "redirect:/";
		}catch(Exception se) {
			m.addAttribute("msg", se.getMessage());
			return "redirect:/";
		}
	}

}
