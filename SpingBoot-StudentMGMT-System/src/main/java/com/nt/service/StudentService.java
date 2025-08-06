package com.nt.service;

import java.util.List;

import com.nt.entity.Student;

public interface StudentService {
	
	public boolean registerStudent(Student student);
	
	public boolean updateStudent(Student student);
	
	public boolean deleteStudent(int id);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(int id);

}
