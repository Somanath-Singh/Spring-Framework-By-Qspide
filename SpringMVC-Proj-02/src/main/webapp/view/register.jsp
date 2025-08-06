<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>User Registration Form</title>
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
				<h2 class="text-danger">User Registration</h2>

				<form:form modelAttribute="user" action="register" method="post"
					width="100%">
					<table>
						<tr>
							<td>Name:</td>
							<td><form:input path="name" class="form-control" /></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><form:input path="email" class="form-control" /></td>
						</tr>
						<tr>
							<td>Address:</td>
							<td><form:textarea path="address" class="form-control" /></td>
						</tr>
						<tr>
							<td>Date of Birth:</td>
							<td><form:input path="dob" type="date" class="form-control" /></td>
							<td><form:errors path="dob" class="text-danger"></form:errors></td>
						</tr>
						<tr>
							<td>Preferred Language:</td>
							<td><form:select path="language" class="form-select">
									<form:option value="Java">Java</form:option>
									<form:option value="Python">Python</form:option>
									<form:option value="JavaScript">JavaScript</form:option>
								</form:select></td>
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
