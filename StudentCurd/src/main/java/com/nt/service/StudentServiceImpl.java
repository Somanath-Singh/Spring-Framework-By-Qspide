package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo repo;

	@Override
	public String saveStudent(Student student) {
		int id=repo.save(student).getId();
		return "Student saved with id "+id;
	}

	@Override
	public String updateStudent(Student student) {
		int id=repo.save(student).getId();
		return "Student updated with id "+id;
	}

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public String deleteStudent(int id) {
		repo.deleteById(id);
		return "Student deleted with id "+id;
	}

}
