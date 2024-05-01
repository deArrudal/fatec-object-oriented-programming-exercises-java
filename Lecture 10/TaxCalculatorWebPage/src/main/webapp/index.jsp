<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tax Calculator Webpage</title>
</head>
<body>
	<h1>Tax Calculator</h1>
	<h2>Select City: </h2>
	<form action="setcity" method="post">
		<input type="radio" id="sp" name="cityname" value="Sao Paulo">
		<label for="sp">Sao Paulo</label><br>
		<input type="radio" id="mg"	name="cityname" value="Belo Horizonte">
		<label for="mg">Belo Horizonte</label><br>
		<input type="radio" id="rs" name="cityname" value="Porto Alegre">
		<label for="rs">Porto Alegre</label><br>
		<input type="radio" id="pr" name="cityname" value="Curitiba">
		<label for="pr">Curitiba</label><br>	
		<br>
		<input type="submit" id="submitcityname" name="submitcityname" value="Submit">
	</form>
	<br>
	<c:if test="${not empty applicationScope['city']}">
		<h2><c:out value="City: ${applicationScope['city']}"></c:out></h2>
		<h3>Fill the form: </h3>
		<form action="setinput" method="post">
			<label for="areatotal">Total Area:</label>
			<input type="number" id="areatotal" name="areatotal" placeholder="Area [m^2]"><br>
			<c:if test="${applicationScope['city'].equals('Sao Paulo')}">
			<label for="roomnumber">Room Number:</label>
			<input type="number" id="roomnumber" name="roomnumber" placeholder="0"><br>
			</c:if>
			<c:if test="${applicationScope['city'].equals('Belo Horizonte')}">
			<label for="bedroomnumber">Bedroom Number:</label>
			<input type="number" id="bedroomnumber" name="bedroomnumber" placeholder="0"><br>
			</c:if>
			<c:if test="${applicationScope['city'].equals('Porto Alegre')}">
			<label for="areagarage">Garage Area:</label>
			<input type="number" id="areagarage" name="areagarage" placeholder="Area [m^2]"><br>
			</c:if>
			<c:if test="${applicationScope['city'].equals('Curitiba')}">
			<label for="estateage">Estate Age:</label>
			<input type="number" id="estateage" name="estateage" placeholder="0"><br>
			</c:if>
			<br>
			<input type="submit" id="submitinput" name="submitinput" value="Submit">
		</form>
	</c:if>
	<br>
	<c:if test="${not empty taxvalue}">
		<h3><c:out value="Total tax: R$ = ${taxvalue}"></c:out></h3>
	</c:if>
</body>
</html>