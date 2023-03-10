<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
	rel="stylesheet">
<title>${mainTitle }</title>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js">
	
</script>
</head>
<body class="p-3 m-0 border-0 bd-example">
	<div class="container">
		<h3 class="center">${mainHeading }</h3>
		<p class="center">${tagline }</p>
		<form action="submitForm" method="post">
			<div class="mb-3">
				<label for="username" class="form-label"> User Name </label> <input
					type="text" class="form-control" id="username" placeholder="xyz"
					name="username">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label"> Email Address </label> <input
					type="email" class="form-control" id="email" name="email"
					placeholder="name@example.com">
			</div>
			<div class="mb-3">
				<label for="password" class="form-label"> Password </label> <input
					type="password" class="form-control" id="password" name="password">
			</div>
			<div class="col-auto">
				<button type="submit" class="btn btn-primary mb-3">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>