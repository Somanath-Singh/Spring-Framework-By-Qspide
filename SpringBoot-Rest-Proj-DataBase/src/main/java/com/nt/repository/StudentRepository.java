package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	//abstract method for getting the student data using email and password
	public Student findByEmailAndPassword(String email,String password);

}
