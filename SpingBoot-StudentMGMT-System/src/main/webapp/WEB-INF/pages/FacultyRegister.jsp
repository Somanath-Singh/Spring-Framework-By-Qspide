<%@ page isELIgnored="false" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration Page</title>
<link rel="stylesheet" href="./css/style.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<section>
		<nav
			class="navbar navbar-expand-lg bg-body-tertiary bg-primary bg-dark"
			data-bs-theme="dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Student-Management-System</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="./">Home</a></li>
					</ul>
					<div class="d-flex">
						<ul class="navbar-nav me-auto ">
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" href="#" role="button"
								data-bs-toggle="dropdown" aria-expanded="false"> Register </a>
								<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="./registerStudent">Student
											Register</a></li>
									<li><a class="dropdown-item" href="./registerFaculty">Faculty
											Register</a></li>
								</ul></li>
							<li class="nav-item"><a class="nav-link" href="./login">Login</a>
							</li>
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="#">Contact Us</a></li>

						</ul>
					</div>
				</div>
			</div>
		</nav>
	</section>

	<h2 class="text-center text-primary mt-3 mb-3">Faculty
		Registration</h2>

	<div>
		<div class="row justify-content-center m-4">
			<div class="col-4 border border-primary rounded p-4">
			
			<%
				String message = (String) session.getAttribute("message");
				if (message != null) {
				%>
				<div class="alert text-center <%=session.getAttribute("type")%>" role="alert"><%=session.getAttribute("message")%></div>
				<%
				session.removeAttribute("message"); // Remove after displaying
				}
				%>
				
				<form:form action="./registerFaculty" modelAttribute="facultyDTO"
					method="post">

					<div class="mb-3">
						<label for="nameinput" class="form-label">Name</label>
						<form:input path="name" type="text"
							class="form-control border border-info" id="nameinput"
							placeholder="Enter your name" />
					</div>
					<div class="mb-3">
						<label for="emailinput" class="form-label">Email Id</label>
						<form:input path="email" type="email"
							class="form-control border border-info" id="emailinput"
							placeholder="Enter yoyr email" />
					</div>
					<div class="mb-3">
						<label for="passwordinput" class="form-label">Password</label>
						<form:input path="password" type="text"
							class="form-control border border-info" id="passwordinput"
							placeholder="Enter yoyr password" />
					</div>
					<div class="mb-3">
						<label for="contectNoinput" class="form-label">Contact
							Number</label>
						<form:input path="contactNo"
							class="form-control border border-info" id="contectNoinput"
							placeholder="Enter yoyr contact No" />
					</div>
					<div class="mb-3">
						<label for="addressinput" class="form-label">Enter your
							address</label>
						<form:textarea path="address"
							class="form-control border border-info" id="addressinput"
							rows="3" />
					</div>
					<div class="mb-3">
						<form:select path="branch" class="form-select border border-info">
							<option value=" " selected disabled>Select your branch</option>
							<option value="Bhubaneswara">Bhubaneswara</option>
							<option value="Pune">Pune</option>
							<option value="Bengaluru">Bengaluru</option>
							<option value="Noida">Noida</option>
						</form:select>

					</div>

					<div class="form-check">
						<form:radiobutton path="gender" value="Male"
							class="form-check-input" name="flexRadioDefault"
							id="genderinput1" />
						<label class="form-check-label" for="genderinput1"> Male </label>
					</div>
					<div class="form-check">
						<form:radiobutton path="gender" value="Female"
							class="form-check-input" name="flexRadioDefault"
							id="genderinput2" />
						<label class="form-check-label" for="genderinput2"> Female
						</label>
					</div>

					<div class="d-grid">
						<button type="submit" class="btn btn-outline-primary">Register</button>
					</div>

				</form:form>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
