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
		<a href="#">Home</a> <a href="#">Update Details</a> <a href="#">Result</a> <a href="#">
			All Student</a> <a href="#">Faculty</a> <a href="#">Logout</a>
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
								<li class="nav-item"><a class="nav-link" href="./login">🔒 Logout</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</nav>
		</section>
		
		

	</div>

	<!-- Bootstrap 5 JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
