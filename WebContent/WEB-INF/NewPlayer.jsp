<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Player</title>
</head>
<body>
	<form action="Players" method="post">
		<h1>
			Add a new Player to
			<c:forEach var="team" items="${lista}">
				<c:out value="${team.name}" />
			</c:forEach>
		</h1>
		<label>First Name: </label> <input type="text" name="txtNamePlayer"> <br> <br> 
		<label>Last Name: </label> <input type="text" name="txtLastPlayer"> <br> <br>
		<label>Age: </label> <input type="text" name="txtAge"> <br> <br> 
		<input type="submit" name="btnSubmitPlayerNew" value="Create Player">
	</form>
</body>
</html>