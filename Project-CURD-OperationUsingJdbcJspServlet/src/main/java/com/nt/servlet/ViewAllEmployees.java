package com.nt.servlet;

import java.io.IOException;
import java.util.List;

import com.nt.dto.Employee;
import com.nt.jdbc.EmpOperation;
import com.nt.jdbc.EmployeeService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ViewAllEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeService empservice = new EmpOperation();
		List<Employee> empList= empservice.findAllEmployees();
		
		 request.setAttribute("employees", empList);
		 RequestDispatcher dispatcher = request.getRequestDispatcher("ViewDetails.jsp");
		 dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
