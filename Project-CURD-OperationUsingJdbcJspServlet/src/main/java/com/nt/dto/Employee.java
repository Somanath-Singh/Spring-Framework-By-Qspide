package com.nt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private int id;
	private String name;
	private String joiningDate;
	private double salary;
	private String email;
	private String phoneNumber;
	private String role;

}