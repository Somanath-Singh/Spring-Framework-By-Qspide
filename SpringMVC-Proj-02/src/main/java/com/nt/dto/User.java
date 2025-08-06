package com.nt.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class User {
	
	 private String name;
	    private String email;
	    private String address;
	    //@DateTimeFormat(pattern = "yyyy-MM-dd")
	    private LocalDate dob;
	    private String language;

}
