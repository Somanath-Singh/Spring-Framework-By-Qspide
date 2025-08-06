<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ page import="java.util.List"%>
<%@ page import="com.nt.entity.Student"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="./save" modelAttribute="student" method="POST">
	
	<form:hidden path="id" />
	
		<div>
			<label>Student name</label>
			<form:input path="name" />
		</div>

		<div>
			<label>Student email</label>
			<form:input path="email" />
		</div>

		<div>
			<label>Student phone No</label>
			<form:input path="phone" />
		</div>

		<div>
			<label>Student Salary</label>
			<form:input path="sal" />
		</div>

		<div>
			<label>Student Salary</label> <input type="submit" value="Register" />
		</div>

	</form:form>
	<h2>${msg}</h2>
	<hr>

	<h1>All student details</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone No</th>
			<th>Salary</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%
		if (request.getAttribute("students") != null) {
			List<Student> student = (List<Student>) request.getAttribute("students");
			for (Student s : student) {
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getName()%></td>
			<td><%=s.getEmail()%></td>
			<td><%=s.getPhone()%></td>
			<td><%=s.getSal()%></td>
			<td><a href="./edit/<%=s.getId() %>">edit</a></td>
			<td><a href="./delete/<%=s.getId() %>">delete</a></td>
		</tr>
		<%
}
}
%>

	</table>
	
	<hr>
	
	<form action="./save" method="post">
	<input type="hidden" name="id" value="${student.id }" />
	<div>
			<label>Student name</label>
			<input type="text" value="${student.name}" name="name" />
		</div>

		<div>
			<label>Student email</label>
			<input type="text" value="${student.email}" name="email" />
		</div>

		<div>
			<label>Student phone No</label>
			<input type="text" value="${student.phone}" name="phone" />
		</div>

		<div>
			<label>Student Salary</label>
			<input type="text" value="${student.sal}" name="sal" />
		</div>

		<div>
			<label>Student Salary</label> <input type="submit" value="Register" />
		</div>
	</form>
	
	<hr>
	
	<h1>All student details</h1>
	<%-- <table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone No</th>
			<th>Salary</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="s" items="${students }">
		<tr>
			<td>${s.id }</td>
			<td>${s.name }</td>
			<td>${s.email }</td>
			<td>${s.phone }</td>
			<td>${s.sal }</td>
			<td><a href="./edit/${s.id }">edit</a></td>
			<td><a href="./delete/${s.id }">delete</a></td>
		</tr>
		</c:forEach>
		
	</table> --%>
	
</body>
</html>