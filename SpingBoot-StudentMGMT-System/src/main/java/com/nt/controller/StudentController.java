package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.StudentDTO;
import com.nt.entity.Student;
import com.nt.repository.StudentRepository;
import com.nt.service.StudentService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/student")
@Slf4j
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/dashboard")
	public String showHome() {
		return "/student/DashBoard";
	}

//	@GetMapping("/update")
//	public String showUpdateData(@ModelAttribute StudentDTO studentdto) {
//
//		return "/student/UpdateProfile";
//	}

	@GetMapping("/update/{id}")
	public String showUpdateStiudentData(@PathVariable("id") int id, Model m) {

		// get the student data
		Student student = studentService.getStudentById(id);

		log.info("Student :: " + student);

		// convert to DTO
		StudentDTO studentdto = StudentDTO.builder().id(student.getSid()).name(student.getName())
				.email(student.getEmail()).password(student.getPassword()).address(student.getAddress())
				.contactNo(student.getContectNo()).gender(student.getGender()).role(student.getRole())
				.branch(student.getBranch()).cordinator(student.getCordinator()).institute(student.getInstitute())
				.semester(student.getSemester()).build();

		log.info("Student DTO :: " + studentdto);

		m.addAttribute("studentDTO", studentdto);

		return "/student/UpdateProfile";
	}

	@PostMapping("/update")
	public String processUpdateData(@ModelAttribute StudentDTO studentdto, Model m, HttpSession session) {

		// get the existing student data
		
		Student student = studentRepo.findById(studentdto.getId()).get();

		// convert DTO to Entity
		student.setEmail(studentdto.getEmail());
		student.setPassword(studentdto.getPassword());
		student.setContectNo(studentdto.getContactNo());
		student.setAddress(studentdto.getAddress());
		student.setSemester(studentdto.getSemester());
		student.setBranch(studentdto.getBranch());
		student.setCordinator(studentdto.getCordinator());

		log.info("Student  data after update:: " + student + "  " + studentdto);

		// store the student data into database
		Boolean result = studentService.updateStudent(student);

		if (result) {
			session.setAttribute("message", "Student Data Updated Successfully ...");
			session.setAttribute("type", "alert-success");
		} else {
			session.setAttribute("message", "Error in Student Data Updation ...");
			session.setAttribute("type", "alert-danger");
		}

		return "redirect:/student/update/" + student.getSid();
	}

	@GetMapping("/all")
	public String showAllStudent(Model m) {
		
		//get all Student data
		List<Student> list = studentService.getAllStudent();
		
		//add the data to model
		m.addAttribute("list", list);
		
		return "/student/AllStudent";
	}

	@GetMapping("/all/fbatch")
	public String showAllFaculty() {
		return "/student/AllFaculty";
	}

}
