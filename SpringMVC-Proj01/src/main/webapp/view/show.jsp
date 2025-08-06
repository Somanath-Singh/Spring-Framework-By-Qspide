<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
	<h1 style="color: red">Register Successfully</h1>
	<h3>Showing the data through session</h3>

	<h2 style="color: blue">
		Welcome,<%= session.getAttribute("data") != null ? session.getAttribute("data").toString() : "Guest" %>
	</h2>

	<h3>Showing the data through Model</h3>
	<center>User Data is</center>

	<ul style="list-style-type:void">
		<li>User Name : ${dto.name}</li>
		<li>User Email : ${dto.email}</li>
		<li>User Password : ${dto.password}</li>
		<li>User Age : ${dto.age}</li>
		<li>User Gender : ${dto.gender}</li>
	</ul>


	<a href="./logout">Logout</a>

</body>
</html>