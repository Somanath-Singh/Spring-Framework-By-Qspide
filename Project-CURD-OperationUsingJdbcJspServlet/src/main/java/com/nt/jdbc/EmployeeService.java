package com.nt.jdbc;

import java.util.List;

import com.nt.dto.Employee;

public interface EmployeeService {
	
	public boolean saveEmployee(Employee emp);

	public boolean deleteById(int id);

	public List<Employee> findAllEmployees();

	public Employee findEmployeeById(int id);

	public boolean updateSalary(int id, double sal);

}
