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
				<td>Name: ${user.name}</td>
			</tr>
			<tr>
				<td>Email: ${user.email}</td>
			</tr>
			<tr>
				<td>Address: ${user.address}</td>
			</tr>
			<tr>
				<td>Date of Birth: ${user.dob}</td>
			</tr>
			<tr>
				<td>Preferred Language: ${user.language}</td>
			</tr>
		</tbody>
	</table>

</body>
</html>
