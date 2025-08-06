package com.nt.dto;

import com.nt.helper.PhoneNumber;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private PhoneNumber phno;
	private String address;
	

}
