<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/styles.css">
<title>Team</title>
</head>
<body>
	<div>
		<jsp:include page="menu.jsp"></jsp:include>
	</div>
	<br>
	<div align="center" class="container">
		<form action="team" method="post">
			<p class="title">
				<b>Team</b>
			</p>
			<table>
				<tr>
					<td colspan="2"><input class="id_input_data" type="number"
						min="0" step="1" id="teamId" name="teamId" placeholder="Id"
						value='<c:out value="${team.teamId}"></c:out>'></td>
					<td><input type="submit" id="button" name="button"
						value="Search"></td>
				</tr>
				<tr>
					<td colspan="4"><input class="input_data" type="text"
						id="teamName" name="teamName" placeholder="Name"
						value='<c:out value="${team.teamName}"></c:out>'></td>
				</tr>
				<tr>
					<td colspan="4"><input class="input_data" type="text"
						id="teamCityName" name="teamCityName" placeholder="City"
						value='<c:out value="${team.teamCityName}"></c:out>'></td>
				</tr>
				<tr>
					<td><input type="submit" id="button" name="button"
						value="Register"></td>
					<td><input type="submit" id="button" name="button"
						value="Update"></td>
					<td><input type="submit" id="button" name="button"
						value="Remove"></td>
					<td><input type="submit" id="button" name="button"
						value="List"></td>
				</tr>
			</table>

		</form>
	</div>
	<br>
	<div align="center">
		<c:if test="${not empty consoleError}">
			<h2>
				<b><c:out value="${consoleError}"></c:out></b>
			</h2>
		</c:if>
	</div>
	<div align="center">
		<c:if test="${not empty consoleOutput}">
			<h3>
				<b><c:out value="${consoleOutput}"></c:out></b>
			</h3>
		</c:if>
	</div>
	<div align="center">
		<c:if test="${not empty teams}">
			<table>
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>City Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="t" items="${teams}">
						<tr>
							<td style="align: center"><c:out value="${t.teamId}"></c:out></td>
							<td style="align: center"><c:out value="${t.teamName}"></c:out></td>
							<td style="align: center"><c:out value="${t.teamCityName}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>
</body>
</body>
</html>