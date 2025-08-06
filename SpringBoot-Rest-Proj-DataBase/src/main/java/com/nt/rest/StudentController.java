package com.nt.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Exception.UserNotFoundException;
import com.nt.dto.IdDto;
import com.nt.dto.LoginDto;
import com.nt.dto.MailDto;
import com.nt.dto.StudentDto;
import com.nt.entity.Student;
import com.nt.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private JavaMailSender mailSender;

	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody StudentDto studentDto) {
		try {
			// convert dto to entity
			Student student = modelMapper.map(studentDto, Student.class);
			// call the service save method
			String result = studentService.addStudent(student);

			return new ResponseEntity<String>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody StudentDto studentDto) {
		try {
			// convert dto to entity
			Student student = modelMapper.map(studentDto, Student.class);
			// call the service save method
			String result = studentService.updateStudent(student);

			return new ResponseEntity<String>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteStudent(@RequestBody IdDto idDto) {
		try {
			// get the id
			int id = idDto.getId();
			// call the service delete method
			String result = studentService.deleteStudentById(id);

			return new ResponseEntity<String>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/all")
	public ResponseEntity<?> findAllStudent() {
		try {
			// call the service findAll method
			List<Student> student = studentService.getAllStudent();
			// convert the entity to dto
			List<StudentDto> studentDto = student.stream().map(stu -> modelMapper.map(stu, StudentDto.class))
					.collect(Collectors.toList());

			return new ResponseEntity<List<StudentDto>>(studentDto, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/find/id")
	public ResponseEntity<?> findStudentById(@RequestBody IdDto idDto) {
		try {
			// get the id
			int id = idDto.getId();
			// call the service findById method
			Student student = studentService.getStudentById(id);

			return new ResponseEntity<Student>(student, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/login")
	public ResponseEntity<?> getUserByEmailAndPassword(@RequestBody LoginDto dto) {
		try {
			// get the student object through the email and password
			Student student = studentService.loginStudent(dto.getEmail(), dto.getPassword());
			if (student == null) {
				throw new UserNotFoundException("Student doesn't exist with this email id " + dto.getEmail()
						+ " and password " + dto.getPassword() + " try with valid email and password .");
			} else {
				return new ResponseEntity<Student>(student, HttpStatus.ACCEPTED);
			}
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/mail")
	public ResponseEntity<?> sendEmail(@RequestBody MailDto dto) {
		try {
			// set the sender and message
			SimpleMailMessage message = new SimpleMailMessage();
			message.setTo(dto.getTo());
			message.setSubject(dto.getSubject());
			message.setText(dto.getMessage());
			message.setFrom("somanathsingh531@gmail.com");
			mailSender.send(message);
			System.out.println(message);

			return new ResponseEntity<String>("Mail send successfully to this mail id : " + dto.getTo(), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("faild");
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
