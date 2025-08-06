<%@ page isELIgnored="false"%>
<html>
<head>
<title>Success</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body align="center">

	<table class="table">
		<caption class="text-primary">${message}</caption>
		<tbody>
			<tr>
				<td>First Name: ${student.firstName}</td>
			</tr>
						<tr>
				<td>Last Name: ${student.lastName}</td>
			</tr>
			<tr>
				<td>Email: ${student.email}</td>
			</tr>
				<tr>
				<td>Password: ${student.password}</td>
			</tr>
			<tr>
				<td>Phone Number: ${student.phno}</td>
			</tr>
			<tr>
				<td>Address: ${student.address}</td>
			</tr>
		</tbody>
	</table>

</body>
</html>
