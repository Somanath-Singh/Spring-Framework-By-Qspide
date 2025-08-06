package com.nt.service;

import java.util.List;

import com.nt.entity.Faculty;

public interface FacultyService {
	
	public boolean registerFaculty(Faculty faculty);
	
	public boolean updateFaculty(Faculty faculty);
	
	public boolean deleteFaculty(int id);
	
	public List<Faculty> getAllFaculty();
	
	public Faculty getFacultyById(int id);

}
