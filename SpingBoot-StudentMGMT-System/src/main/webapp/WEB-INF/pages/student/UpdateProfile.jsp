<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sidebar Menu</title>

<!-- Bootstrap 5 CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

<style>
body {
	display: flex;
}

.sidebar {
	width: 250px;
	height: 100vh;
	background: #343a40;
	color: white;
	padding-top: 20px;
	position: fixed;
}

.sidebar a {
	display: block;
	padding: 10px 20px;
	color: white;
	text-decoration: none;
}

.sidebar a:hover {
	background: #495057;
}

.content {
	margin-left: 250px;
	padding: 20px;
	width: 100%;
}
</style>
</head>
<body>



	<!-- Sidebar -->
	<div class="sidebar">
		<h4 class="text-center text-warning">STMGSM</h4>
		<a href="#">Home</a> <a href="#">Update Details</a> <a href="#">Result</a>
		<a href="#"> All Student</a> <a href="#">Faculty</a> <a href="#">Logout</a>
	</div>

	<!-- Page Content -->
	<div class="content">
		<section>
			<nav
				class="navbar navbar-expand-lg bg-body-tertiary bg-primary bg-dark"
				data-bs-theme="dark">
				<div class="container-fluid">
					<button class="navbar-toggler" type="button"
						data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav me-auto mb-2 mb-lg-0">
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="#">📞 Contact Us</a></li>
						</ul>
						<div class="d-flex">
							<ul class="navbar-nav me-auto ">
								<li class="nav-item"><a class="nav-link" href="./login">🔒
										Logout</a></li>
							</ul>
						</div>
					</div>
				</div>
			</nav>
		</section>

		<h2 class="text-center text-primary mt-3 mb-3">Update Your
			Details</h2>

		<%
				String message = (String) session.getAttribute("message");
				if (message != null) {
				%>
		<div class="alert text-center <%=session.getAttribute("type")%>" role="alert"><%=session.getAttribute("message")%></div>
		<%
				session.removeAttribute("message"); // Remove after displaying
				}
				%>

		<div class="m-4">

			<form:form action="../update" modelAttribute="studentDTO"
				method="post">
				<div class="row justify-content-center">
					<div class="col-5">

						<div class="mb-3">
							<label for="Nameinput" class="form-label">Name</label>
							<form:input path="name" type="text"
								class="form-control border border-info" id="Nameinput"
								disabled="true" />
						</div>

						<div class="mb-3">
							<label for="emailinput" class="form-label">Email Id</label>
							<form:input path="email" type="email"
								class="form-control border border-info" id="emailinput"
								placeholder="Enter your email" />
						</div>
						<div class="mb-3">
							<label for="passwordinput" class="form-label">Password</label>
							<form:input path="password" type="password"
								class="form-control border border-info" id="passwordinput"
								placeholder="Enter your password" />
						</div>
						<div class="mb-3">
							<label for="contectNoinput" class="form-label">Contact
								Number</label>
							<form:input path="contactNo"
								class="form-control border border-info" id="contectNoinput"
								placeholder="Enter your contect No" />
						</div>
						<div class="mb-3">
							<label for="Instituteinput" class="form-label">Institute</label>
							<form:input path="institute" type="text"
								class="form-control border border-info" id="Instituteinput"
								placeholder="Enter your Institute Name" disabled="true" />
						</div>
					</div>

					<div class="col-5">
						<div class="mb-3">
							<label for="Branchinput" class="form-label">Branch</label>
							<form:input path="branch" type="text"
								class="form-control border border-info" id="Branchinput"
								placeholder="Enter your Branch" />
						</div>

						<div class="mb-3">
							<label for="Cordinatorinput" class="form-label">Cordinator</label>
							<form:input path="cordinator" type="text"
								class="form-control border border-info" id="Cordinatorinput"
								placeholder="Enter your Cordinator Name" />
						</div>

						<div class="mb-3">
							<label for="Semesterinput" class="form-label">Semester</label>
							<form:input path="semester" type="text"
								class="form-control border border-info" id="Semesterinput"
								placeholder="Enter your Semester No" disabled="true" />
						</div>

						<div class="mb-3">
							<label for="addressinput" class="form-label">Update your
								address</label>
							<form:textarea path="address"
								class="form-control border border-info" id="addressinput"
								rows="3" />
						</div>

						<div>
							<form:input path="id" type="hidden" />
						</div>

					</div>

					<div class="text-center m-4">
						<button type="submit" class="btn btn-outline-primary">Update</button>
					</div>
				</div>
			</form:form>

		</div>

	</div>

	<!-- Bootstrap 5 JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
