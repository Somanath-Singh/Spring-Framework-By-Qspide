package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
