<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Prototype Roster</h1>
	<a href="Teams">New Team</a>
	<br>
	<table>
		<tr>
			<td>Id</td>
			<td>Team</td>
			<td>Players</td>
			<td>Action</td>
		</tr>
		<c:forEach var="team" items="${lista}">
			<tr>
				<td><c:out value="${team.id}" /></td>
				<td><c:out value="${team.name}" /></td>
				<td>0</td>
				<!-- Va al servlet Teams y a la vista NewTeam.jsp -->
				<td><a href="Teams?id=<c:out value='${team.id}' />">Details</a> | <a href="Teams">Delete</a></td>
			</tr>
		</c:forEach>
		<tr>
		</tr>
	</table>
</body>
</html>