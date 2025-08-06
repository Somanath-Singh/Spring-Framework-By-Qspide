<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Registration Page</title>
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

	<h2 class="text-center text-primary mt-3 mb-3">Login Page</h2>

	<div>
		<div class="row justify-content-center">
			<div class="col-3 border border-primary rounded p-4">
				<form action="register"method="post">

					<div class="mb-3">
						<label for="emailinput" class="form-label">Email Id</label>
						<input path="email" type="email"
							class="form-control border border-info" id="emailinput"
							placeholder="Enter yoyr email" />
					</div>
					<div class="mb-3">
						<label for="passwordinput" class="form-label">Password</label>
						<input path="password" type="text"
							class="form-control border border-info" id="passwordinput"
							placeholder="Enter yoyr password" />
					</div>
					<div class="d-grid">
					<button type="button" class="btn btn-outline-primary">Login</button>
				</div>
				</form>
			</div>
		</div>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>
