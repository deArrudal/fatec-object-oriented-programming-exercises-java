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
		<form action="player" method="post">
			<p class="title">
				<b>Player</b>
			</p>
			<table>
				<tr>
					<td colspan="2"><input class="id_input_data" type="number"
						min="0" step="1" id="playerId" name="playerId" placeholder="Id"
						value='<c:out value="${player.playerId}"></c:out>'></td>
					<td colspan="2"><input type="submit" id="button" name="button"
						value="Search"></td>
				</tr>
				<tr>
					<td colspan="4"><input class="input_data" type="text"
						id="playerName" name="playerName" placeholder="Name"
						value='<c:out value="${player.playerName}"></c:out>'></td>
				</tr>
				<tr>
					<td colspan="2"><input class="input_data" type="date"
						id="playerBirthDate" name="playerBirthDate"
						placeholder="Birth Date"
						value='<c:out value="${player.playerBirthDate}"></c:out>'></td>
					<td colspan="1"><input class="input_data" type="number"
						min="0" step="0.01" id="playerHeight" name="playerHeight"
						placeholder="Height"
						value='<c:out value="${player.playerHeight}"></c:out>'></td>
					<td colspan="1"><input class="input_data" type="number"
						min="0" step="0.01" id="playerWeight" name="playerWeight"
						placeholder="Weight"
						value='<c:out value="${player.playerWeight}"></c:out>'></td>
				</tr>
				<tr>
					<td colspan="4"><select class="id_input_data"
						id="playerTeamId" name="playerTeamId">
							<option value="0">Select a Team</option>
							<c:forEach var="t" items="${teams}">
								<c:if
									test="${(empty player) || (t.teamId ne player.playerTeam.teamId)}">
									<option value="${t.teamId}">
										<c:out value="${t}"></c:out></option>
								</c:if>
								<c:if test="${t.teamId eq player.playerTeam.teamId}">
									<option value="${t.teamId}" selected="selected">
										<c:out value="${t}"></c:out></option>
								</c:if>
							</c:forEach>
					</select></td>
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
		<c:if test="${not empty players}">
			<table>
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Birth Date</th>
						<th>Height</th>
						<th>Weight</th>
						<th>Team</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="p" items="${players}">
						<tr>
							<td style="align: center"><c:out value="${p.playerId}"></c:out></td>
							<td style="align: center"><c:out value="${p.playerName}"></c:out></td>
							<td style="align: center"><c:out value="${p.playerBirthDate}"></c:out></td>
							<td style="align: center"><c:out value="${p.playerHeight}"></c:out></td>
							<td style="align: center"><c:out value="${p.playerWeight}"></c:out></td>
							<td style="align: center"><c:out value="${p.playerTeam.teamName}"></c:out></td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
	</div>

</body>
</html>