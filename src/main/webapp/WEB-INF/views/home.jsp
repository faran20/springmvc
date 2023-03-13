<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="<c:url value="/resources/css/style.css" />" />
<script src="<c:url value="/resources/js/script.js" />">
	
</script>

<%
String name = (String) request.getAttribute("name");
%>
<title><%=name%></title>
</head>
<body>
	<img src='<c:url value="resources/images/wallpaper.jpeg" />' />
</body>
</html>