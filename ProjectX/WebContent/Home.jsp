<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<%
		if (session.getAttribute("username") == null) {
			response.sendRedirect("Login.jsp");
		}
	%>

	<div align="center">
		<h1>Welcome ${username}!!!</h1>
		<br>
		<h4>To add a user:</h4>
		<a href="Add.jsp">Click here</a>
		<h4>To display the Data:</h4>
		<a href="Display.jsp">Click here</a>
		<form action="Logout">
			<input type="submit" value="Logout">
		</form>
	</div>
</body>
</html>