package com.nt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Faculty;
import com.nt.repository.FacultyRepository;
import com.nt.service.FacultyService;

@Service
public class FacultyServiceImpl implements FacultyService {

	@Autowired
	private FacultyRepository facultyRepo;

	@Override
	public boolean registerFaculty(Faculty faculty) {
		faculty.setRole("FACULTY");
		faculty.setInstitute("Indira Gandhi Institute of technology");
		Faculty fac=  facultyRepo.save(faculty);
		
		if(fac != null) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean updateFaculty(Faculty faculty) {
Faculty fac=  facultyRepo.save(faculty);
		
		if(fac != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteFaculty(int id) {

		facultyRepo.deleteById(id);
		return false;
	}

	@Override
	public List<Faculty> getAllFaculty() {
		List<Faculty> facultyList = facultyRepo.findAll();
		return facultyList;
	}

	@Override
	public Faculty getFacultyById(int id) {
		Faculty faculty = facultyRepo.findById(id).get();
		return faculty;
	}

}
