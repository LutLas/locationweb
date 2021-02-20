<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: 1px solid blue;
}
</style>
<meta charset="ISO-8859-1">
<title>Display Location</title>
</head>
<body>
	<h2>Locations:</h2>
	<table>
		<tr>
			<th style="padding: 10px">ID</th>
			<th style="padding: 10px">CODE</th>
			<th style="padding: 10px">NAME</th>
			<th style="padding: 10px">TYPE</th>
			<th style="padding: 10px" colspan="2">ACTIONS</th>
		</tr>
		<c:forEach items="${allLocations}" var="location">
			<tr>
				<td style="padding: 10px">${location.id}</td>
				<td style="padding: 10px">${location.code}</td>
				<td style="padding: 10px">${location.name}</td>
				<td style="padding: 10px">${location.type}</td>
				<td style="padding: 10px"><a
					href="deleteLocation?id=${location.id}">DELETE</a></td>
				<td style="padding: 10px"><a
					href="showUpdate?id=${location.id}">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="showCreate">Add Location</a>
</body>
</html>