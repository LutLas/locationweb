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
<title>Create Location</title>
</head>
<body>
	<form action="updateLoc" method="post">
		<table>
			<tr>
				<th style="padding:10px">ID:</th>
				<td style="padding:10px"><input type="text" name="id" value="${location.id}" readonly/></td>
			</tr>
			<tr>
				<th style="padding:10px">CODE:</th>
				<td style="padding:10px"><input type="text" name="code" value="${location.code}"/></td>
			</tr>
			<tr>
				<th style="padding:10px">NAME:</th>
				<td style="padding:10px"><input type="text" name="name" value="${location.name}"/></td>
			</tr>
			<tr>
				<th style="padding:10px">TYPE:</th>
				<td style="padding:10px">Urban <input type="radio" name="type" value="URBAN" ${location.type == 'URBAN'?'checked':''}/>Rural <input
					type="radio" name="type" value="RURAL" ${location.type == 'RURAL'?'checked':''}/></td>

			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="SAVE" /></th>
			</tr>
		</table>
	</form>
</body>
</html>