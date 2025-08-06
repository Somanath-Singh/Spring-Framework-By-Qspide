<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">
	<h1 style="color: red">User Data is</h1>

	<ul>
		<li>User Name : ${dto.email}</li>
		<li>User Email : ${dto.password}</li>
	</ul>
</body>
</html>