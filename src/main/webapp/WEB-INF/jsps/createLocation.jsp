<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
	<form action="" method="">
		<table>
			<tr>
				<th>ID:</th>
				<td><input type="text" name="id" /></td>
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
				<td>Urban <input type="radio" name="type" />Rural <input
					type="radio" name="type" /></td>

			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="SAVE" /></th>
			</tr>
		</table>
	</form>
</body>
</html>