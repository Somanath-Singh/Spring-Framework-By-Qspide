<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
    pageEncoding="UTF-8"%>
=======
	pageEncoding="UTF-8" isELIgnored="false"%>
>>>>>>> e1c4418 (commit the code)
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<<<<<<< HEAD
<body>
<h1 style="color: red; text-align: center;">Register Successfully</h1>

 <h2>Welcome,<%= session.getAttribute("session").toString() %></h2>
    <a href="<%= session.removeAttribute("session")%>">Logout</a>
=======
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
>>>>>>> e1c4418 (commit the code)

</body>
</html>