<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Student Registration Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>



	<div class="container" width="100%">

		<div class="row justify-content-center">
			<div class="col-10">
				<h2 class="text-danger">Student Registration</h2>

				<form:form modelAttribute="student" action="./register"
					method="post" width="100%">
					<table>
						<tr>
							<td>First Name:</td>
							<td><form:input path="firstName" class="form-control" /></td>
						</tr>
						<tr>
							<td>Last Name:</td>
							<td><form:input path="lastName" class="form-control" /></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><form:input path="email" class="form-control" /></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><form:input path="password" class="form-control" /></td>
						</tr>
						<tr>
							<td>Phone Number:</td>
							<td><form:input path="phno"  class="form-control" /></td>
							<td><form:errors path="phno" ></form:errors></td>
						</tr>
						<tr>
							<td>Address:</td>
							<td><form:textarea path="address" class="form-control" /></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Submit"
								class="btn btn-primary" /></td>
						</tr>
					</table>
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>
