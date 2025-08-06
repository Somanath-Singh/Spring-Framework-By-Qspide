package com.aashdit.assosiation.mapping.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "AM_PERSON_DETAILS")
@Getter
@Setter
public class Person implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;

	@Column(length = 20)
	private String email;

	@Column(length = 20)
	private String password;

	@Column(length = 20)
	private String pname;

	@Column(length = 20)
	private String paddrs;

//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = PhoneNumber.class)
//	@JoinColumn(name = "PRIMARY_NUMBER_ID", referencedColumnName = "pnoid")
//	private PhoneNumber primaryNumber;

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@JoinColumn(name = "person_id", referencedColumnName = "pid") // Correct FK mapping
//	private List<PhoneNumber> numbers;
	
//	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<PhoneNumber> numbers;



}
