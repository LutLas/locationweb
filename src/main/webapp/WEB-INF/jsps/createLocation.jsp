<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<form action="saveLoc" method="post">
		<table>
			<tr>
				<th style="padding:10px">ID:</th>
				<td style="padding:10px"><input type="text" name="id" disabled/></td>
			</tr>
			<tr>
				<th style="padding:10px">CODE:</th>
				<td style="padding:10px"><input type="text" name="code" /></td>
			</tr>
			<tr>
				<th style="padding:10px">NAME:</th>
				<td style="padding:10px"><input type="text" name="name" /></td>
			</tr>
			<tr>
				<th style="padding:10px">TYPE:</th>
				<td style="padding:10px">Urban <input type="radio" name="type" value="URBAN"/>Rural <input
					type="radio" name="type" value="RURAL"/></td>

			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="SAVE" /></th>
			</tr>
		</table>
	</form>
	<a href="displayLocations">View All</a>
	${msg}
</body>
</html>