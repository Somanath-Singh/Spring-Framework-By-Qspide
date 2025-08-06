package com.nt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacultyDTO {
	
	private String name;
	private String email;
	private String password;
	private String contactNo;
	private String address;
	private String branch;
	private String gender;

}
