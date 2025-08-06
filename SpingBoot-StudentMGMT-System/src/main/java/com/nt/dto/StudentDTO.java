package com.nt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDTO {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String contactNo;
	private String address;
	private String gender;
	private String role;
	private String branch;
	private String institute;
	private String cordinator;
	private String semester;
}
