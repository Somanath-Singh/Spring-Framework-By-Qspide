<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

	<h1 style="color: red">Login Page</h1>

	<h1 style="color: blue">User Login</h1>
	<form action="./loginsubmit" method="POST">
		<input type="email" name="email"><br> <input
			type="password" name="password"><br>
		<button>Login</button>
	</form>
	
	<h2>Don't have account then <a href="./register">register</a></h2>

</body>
</html>