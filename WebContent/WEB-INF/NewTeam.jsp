<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Team</title>
</head>
<body>

<!-- CREAR NUEVO TEAM -->
	<%
	if (request.getParameter("id") == null) {
	%>
	<form action="Teams" method="post">
		<h1>Create a new Team</h1>
		<input type="text" name="nameTeamNew"> 
		<input type="submit" name="btnSubmitTeamNew" value="Create Team">
		<input type="hidden" name="action" value="add_team">
	</form>
	<%
	}
	%>

<!-- MOSTRAR TEAM SELECCIONADO -->
	<%
	if (request.getParameter("id") != null) {
	%>
	<h1>
		<c:out value="${team.name}" />
	</h1>
	<a href="Players?id=<c:out value='${player.id}' />">New Player</a>
	<table>
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Age</td>
			<td>Action</td>
		</tr>
		<tr>
			<td><c:out value="${player.namePlayer}"/></td>
			<td><c:out value="${player.lastPlayer}"/></td>
			<td><c:out value="${player.age}"/></td>
		</tr>
		<tr>
		</tr>
	</table>
	<%} %>
</body>
</html>