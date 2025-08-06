package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.dto.FacultyDTO;
import com.nt.dto.StudentDTO;
import com.nt.entity.Faculty;
import com.nt.entity.Student;
import com.nt.service.FacultyService;
import com.nt.service.StudentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private FacultyService facultyService;

	@GetMapping("/")
	public String showHome() {
		return "Home";
	}

	@GetMapping("/registerStudent")
	public String showStudentRegister(@ModelAttribute StudentDTO studentdto) {
		
		return "StudentRegister";
	}

	@PostMapping("/registerStudent")
	public String processStudentRegister(@ModelAttribute StudentDTO studentdto,HttpSession session) {

		// convert DTO to Entity
		Student student = Student.builder().name(studentdto.getName()).email(studentdto.getEmail())
				.password(studentdto.getPassword()).contectNo(studentdto.getContactNo())
				.address(studentdto.getAddress()).gender(studentdto.getGender()).build();
		
		//store the student data into database
		Boolean result = studentService.registerStudent(student );
		
		if(result) {
			session.setAttribute("message","Student Registration Success ...");
			session.setAttribute("type","alert-success");
		}else {
			session.setAttribute("message","Error in Student Registration ...");
			session.setAttribute("type","alert-danger");
		}

		return "redirect:/registerStudent";
	}

	@GetMapping("/registerFaculty")
	public String showFacultyRegister(@ModelAttribute FacultyDTO facultydto) {
		return "FacultyRegister";
	}
	
	@PostMapping("/registerFaculty")
	public String processFacultyRegister(@ModelAttribute FacultyDTO facultydto,HttpSession session) {

		// convert DTO to Entity
		Faculty faculty = Faculty.builder().name(facultydto.getName()).email(facultydto.getEmail())
				.password(facultydto.getPassword()).contectNo(facultydto.getContactNo())
				.address(facultydto.getAddress()).gender(facultydto.getGender()).branch(facultydto.getBranch()).build();
		
		//store the student data into database
		Boolean result = facultyService.registerFaculty(faculty);
		
		if(result) {
			session.setAttribute("message","Faculty Registration Success ...");
			session.setAttribute("type","alert-success");
		}else {
			session.setAttribute("message","Error in Faculty Registration ...");
			session.setAttribute("type","alert-danger");
		}

		return "redirect:/registerFaculty";
	}

	@GetMapping("/login")
	public String showLogin() {
		return "Login";
	}

}
