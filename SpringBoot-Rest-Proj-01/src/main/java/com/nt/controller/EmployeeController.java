package com.nt.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dto.EmployeeDto;
import com.nt.dto.IdDto;
import com.nt.dto.ResponseStructureDto;
import com.nt.dto.SignInDto;
import com.nt.entity.Employee;
import com.nt.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository db;

	@PostMapping
	public Employee saveEmployee(@RequestBody EmployeeDto dto) {

		Employee employee = Employee.builder().id(dto.getId()).name(dto.getName()).username(dto.getUsername())
				.email(dto.getEmail()).password(dto.getPassword()).build();
		
		return db.saveEmployee(employee);
	}

	@PutMapping
	public Employee updateEmployee(@RequestBody EmployeeDto dto) {
		
		Employee employee = Employee.builder().id(dto.getId()).name(dto.getName()).username(dto.getUsername())
				.email(dto.getEmail()).password(dto.getPassword()).build();
		
		return db.updateEmployee(employee);
	}

	@DeleteMapping
	public boolean deleteEmployeeById(@RequestBody IdDto dto) {
		return db.deleteEmployeeById(dto.getId());
	}

	@GetMapping
	public Employee findEmployeeById(@RequestBody IdDto dto) {
		return db.findEmployeeById(dto.getId());
	}

	@GetMapping("/all")
	public List<EmployeeDto> findAllEmployees() {
		
//		List<Employee> employee=db.findAllEmployees();
//		EmployeeDto dto = EmployeeDto.builder().id(employee.getId()).name(employee.getName()).username(employee.getUsername())
//				.email(employee.getEmail()).password(employee.getPassword()).build();
		
		return null;//db.findAllEmployees();
	}

	@PostMapping("/login")
	public ResponseStructureDto<Employee> login(@RequestBody SignInDto dto) {

		System.out.println(dto);

		Employee employee = db.getEmployeesList().stream().filter(
				emp -> emp.getUsername().equals(dto.getUsername()) && emp.getPassword().equals(dto.getPassword()))
				.findFirst().orElse(null);

		System.out.println(employee);

		if (employee == null) {
			return new ResponseStructureDto<>(HttpStatus.NOT_FOUND.value(),
					"Username and password are present inside db", null, LocalDateTime.now());
		}
		return new ResponseStructureDto<>(HttpStatus.OK.value(), "Login done successfully", employee,
				LocalDateTime.now());

	}

}
