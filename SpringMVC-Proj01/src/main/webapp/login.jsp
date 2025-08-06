<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

	<h1 style="color:red">Login Page</h1>

	<h1 style="color:blue">Send the data to ServletRequest</h1>
	<form action="./login" method="POST">
		<input type="email" name="email"><br> <input type="password"
			name="password"><br>
		<button>Login</button>
	</form>
	
	<h1 style="color:blue">Send the data to RequestParam</h1>
	<form action="./login2" method="POST">
		<input type="email" name="email"><br> <input type="password"
			name="password"><br>
		<button>Login</button>
	</form>
	
	
	<h1 style="color:blue">Send the data to DTO</h1>
	<form action="./login3" method="POST">
		<input type="email" name="email"><br> <input type="password"
			name="password"><br>
		<button>Login</button>
	</form>

</body>
</html>