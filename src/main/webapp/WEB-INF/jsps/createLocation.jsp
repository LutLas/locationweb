<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
	<form action="saveLoc" method="post">
		<table>
			<tr>
				<th>ID:</th>
				<td><input type="text" name="id" disabled/></td>
			</tr>
			<tr>
				<th>CODE:</th>
				<td><input type="text" name="code" /></td>
			</tr>
			<tr>
				<th>NAME:</th>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<th>TYPE:</th>
				<td>Urban <input type="radio" name="type" value="URBAN"/>Rural <input
					type="radio" name="type" value="RURAL"/></td>

			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="SAVE" /></th>
			</tr>
		</table>
	</form>
	${msg}
</body>
</html>