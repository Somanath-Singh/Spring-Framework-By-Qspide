package com.aashdit.assosiation.mapping.service;

import java.util.List;

import com.aashdit.assosiation.mapping.entity.Person;

public interface IPersonService {
	
	public Person addPerson(Person person);
	
	public List<Person> getAllPerson();

}
