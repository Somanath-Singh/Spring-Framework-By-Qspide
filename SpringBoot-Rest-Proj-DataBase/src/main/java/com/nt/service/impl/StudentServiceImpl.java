package com.nt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Exception.StudentNotFoundException;
import com.nt.Exception.UserNotFoundException;
import com.nt.entity.Student;
import com.nt.repository.StudentRepository;
import com.nt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public String addStudent(Student student) {
		int id = studentRepo.save(student).getId();
		return "Student saved with id " + id;
	}

	@Override
	public String updateStudent(Student student) {
		// get the existing student object by id
		Student existStudent = studentRepo.findById(student.getId())
				.orElseThrow(() -> new UserNotFoundException("Student doesn't exist with this id " + student.getId()));
		// set the updated student address into existing student address
		student.getAddress().setId(existStudent.getAddress().getId());
		int id = studentRepo.save(student).getId();
		return "Student updated with id " + id;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		Student student = studentRepo.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("User with this id " + id + " is not present"));
		return student;
	}

	@Override
	public String deleteStudentById(int id) {
		// check the student is exist or not
		studentRepo.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("User with this id " + id + " is not present"));
		studentRepo.deleteById(id);
		return "Student with id " + id + " is deleted";
	}

	@Override
	public Student loginStudent(String email, String password) {
		Student student = studentRepo.findByEmailAndPassword(email, password);
		return student;
	}

}
