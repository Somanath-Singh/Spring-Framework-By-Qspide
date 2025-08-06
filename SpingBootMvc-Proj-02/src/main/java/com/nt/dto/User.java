package com.nt.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class User {
	
	 private String name="Somanath Singh";
	    private String email;
	    private String address;
	    private LocalDate dob;
	    private String language;

}
