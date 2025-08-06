package com.aashdit.assosiation.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aashdit.assosiation.mapping.entity.PhoneNumber;


@Repository
public interface PhoneDetailsRepository extends JpaRepository<PhoneNumber, Integer> {

}
