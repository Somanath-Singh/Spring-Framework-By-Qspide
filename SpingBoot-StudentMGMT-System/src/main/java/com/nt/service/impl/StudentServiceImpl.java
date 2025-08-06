package com.nt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repository.StudentRepository;
import com.nt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public boolean registerStudent(Student student) {

		student.setRole("Student");
		student.setBranch("Sarang");
		student.setCordinator("Head sir");
		student.setInstitute("Indira Gandhi Institute of technology");
		student.setSemester("First");
		
		Student stu=studentRepo.save(student);
		
		if(stu != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		
		Student stu=studentRepo.save(student);
		
		if(stu != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteStudent(int id) {
		studentRepo.deleteById(id);
		return false;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> studentList = studentRepo.findAll();
		return studentList;
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepo.findById(id).get();
	}

}
