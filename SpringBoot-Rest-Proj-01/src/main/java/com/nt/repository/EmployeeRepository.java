package com.nt.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;

@Repository
public class EmployeeRepository {

	private List<Employee> employeesList = new ArrayList<>();

	{
		employeesList.add(new Employee(1, "Rajesh", "Rajesh_123", "rajesh@gmail.com", "123"));
		employeesList.add(new Employee(2, "Ramesh", "Ramesh_123", "ramesh@gmail.com", "123"));
		employeesList.add(new Employee(3, "Suresh", "Suresh_123", "suresh@gmail.com", "123"));
		employeesList.add(new Employee(4, "Ganesh", "Ganesh_123", "ganesh@gmail.com", "123"));
	}

	public List<Employee> getEmployeesList() {
		return employeesList;
	}

	public Employee saveEmployee(Employee emp) {
		employeesList.add(emp);
		return emp;
	}

	public Employee updateEmployee(Employee emp) {
		Employee orElse = findEmployeeById(emp.getId());
		if (orElse != null) {
			int indexOf = employeesList.indexOf(orElse);
			employeesList.set(indexOf, emp);
		}
		return emp;
	}

	public Employee findEmployeeById(int id) {
		return employeesList.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
	}

	public List<Employee> findAllEmployees() {
		return employeesList;
	}

	public boolean deleteEmployeeById(int id) {
		Employee employee = findEmployeeById(id);
		return employeesList.remove(employee);
	}

}
