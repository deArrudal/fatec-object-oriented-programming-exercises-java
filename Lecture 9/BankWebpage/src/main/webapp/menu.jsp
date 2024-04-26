<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Bank WebPage - Menu</title>
</head>
<body>
	<h1>Bank WebPage - Menu</h1>
	<br>
	<form action="account" method="post">
		<label for="accountId">Account:</label> <input type="number"
			id="accountId" name="accountId"> <input type="submit"
			id="submit" name="submit" value="Submit"> <br>
	</form>
	<c:if test="${not empty validAccount and not validAccount}">
		<p>Invalid Account</p>
	</c:if>
</body>
</html>