package com.aashdit.assosiation.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aashdit.assosiation.mapping.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person	, Integer> {

}
