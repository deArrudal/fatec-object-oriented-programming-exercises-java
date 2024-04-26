<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Webpage - Special Account</title>
</head>
<body>
	<h1>Bank Webpage - Special Account</h1>
	<br>
	<form action="special" method="post">
		<table>
			<tr>
				<th>Operation</th>
				<th></th>
			</tr>
			<tr>
				<td>Deposit</td>
				<td><input type="number" id="valueDeposit" name="valueDeposit">
					<input type="submit" id="transaction" name="transaction"
					value="Deposit"></td>
			</tr>
			<tr>
				<td>Withdraw</td>
				<td><input type="number" id="valueWithdraw"
					name="valueWithdraw"> <input type="submit" id="transaction"
					name="transaction" value="Withdraw">
			</tr>
			<tr>
				<td>
				<td>Balance</td>
				<td><input type="submit" id="transaction" name="transaction"
					value="Balance"></td>
			</tr>
		</table>
	</form>
	<br>
	<c:if test="${not empty accountBalance}">
		<c:out value="${accountBalance}"></c:out>
	</c:if>
</body>
</html>