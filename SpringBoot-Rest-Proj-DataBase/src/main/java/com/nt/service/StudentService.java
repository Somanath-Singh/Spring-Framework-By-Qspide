package com.nt.service;

import java.util.List;

import com.nt.entity.Student;

public interface StudentService {
		
	public String addStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	public String deleteStudentById(int id);
	
	public String updateStudent(Student student);
	
	public Student loginStudent(String email,String password);

}
