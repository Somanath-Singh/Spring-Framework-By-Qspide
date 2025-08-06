package com.nt.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.entity.Employee;

public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {	
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		//Employee employee

	}

}
