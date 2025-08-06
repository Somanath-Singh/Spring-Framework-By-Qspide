<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

	<h1 style="color: red">Register Page</h1>

	<form action="./register" method="POST">
		<label>Enater your name</label> <input type="text" name="name"><br>
		<label>Enater your email</label> <input type="email" name="email"><br>
		<label>Enater your password</label> <input type="password"
			name="password"><br> <label>Enater your age</label> <input
			type="number" name="age"><br> <label>Select your
			gender</label> <input type="radio" name="gender" value="Male">Male <input
			type="radio" name="gender" value="Female">Female<br>
		<button>Register</button>
	</form>
</body>
</html>