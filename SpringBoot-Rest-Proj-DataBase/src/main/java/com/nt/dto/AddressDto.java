package com.nt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
	
	private int id;
	private String city;
	private String state;
	private String country;
	private int pin;

}
