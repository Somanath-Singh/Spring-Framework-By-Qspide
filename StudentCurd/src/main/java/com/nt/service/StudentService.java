package com.nt.service;

import java.util.List;

import com.nt.entity.Student;

public interface StudentService {
	
	public String saveStudent(Student student);
	
	public String updateStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	public String deleteStudent(int id);

}
