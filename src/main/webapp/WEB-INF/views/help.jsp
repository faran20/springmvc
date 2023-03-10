<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>
	<h3>How can we help you? ${name}</h3>

	<c:forEach var="item" items="${marks}">
		<p>
			<%-- ${item } --%>
			OR
			<c:out value="${item }"></c:out>
		</p>
	</c:forEach>
</body>
</html>