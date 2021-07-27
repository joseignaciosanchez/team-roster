<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Teams Details</title>
</head>
<body>
	<form action="Teams" method="get">
		<h1>
			<c:out value="${team.name}" />
		</h1>
		<label>Team</label> <label>Players</label> <label>Action</label> <br>
		<c:forEach var="team" items="${lista}">
			<c:out value="${team.name}" />
			<br>
		</c:forEach>
		<label>0</label> <label><a href="Teams?id=0">Details</a></label>
	</form>
</body>
</html>