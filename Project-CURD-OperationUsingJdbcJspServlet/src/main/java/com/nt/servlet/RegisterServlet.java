package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import com.nt.dto.Employee;
import com.nt.jdbc.EmpOperation;
import com.nt.jdbc.EmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		 PrintWriter out = response.getWriter();
	        
	        // Retrieving form data
	        String name = request.getParameter("name");
	        String joiningDateStr = request.getParameter("joiningDate");
	        String salaryStr = request.getParameter("salary");
	        String email = request.getParameter("email");
	        String phoneNumber = request.getParameter("phoneNumber");
	        String role = request.getParameter("role");
	        
	        // Parsing data
	        double salary = Double.parseDouble(salaryStr);
	        
	        Employee emp = new Employee();
	        
	        emp.setId(new Random().nextInt());
	        emp.setEmail(email);
	        emp.setJoiningDate(joiningDateStr);
	        emp.setName(name);
	        emp.setPhoneNumber(phoneNumber);
	        emp.setRole(role);
	        emp.setSalary(salary);
	        
	        EmployeeService empservice = new EmpOperation();
	        
	        if(empservice.saveEmployee(emp)) {
	        	out.println("Employee Is Registered Successfully .");
	        	 // Displaying the received data
		        out.println("<h2>Employee Details</h2>");
		        out.println("<p>Name: " + name + "</p>");
		        out.println("<p>Joining Date: " + joiningDateStr + "</p>");
		        out.println("<p>Salary: " + salary + "</p>");
		        out.println("<p>Email: " + email + "</p>");
		        out.println("<p>Phone Number: " + phoneNumber + "</p>");
		        out.println("<p>Role: " + role + "</p>");
	        }else {
	        	out.println("Error in Employee Registeration");
	        }	       
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
