<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insertion</title>
</head>
<body>
<%
	if(session.getAttribute("username") == null){
		response.sendRedirect("Login.jsp");
	}
%>

<form action="Append" method="get">
	Username : <input type="text" name="uname"/><br>
	Email ID : <input type="text" name="email"/><br>
	Country : <input type="text" name="country"/><br>
	<input type="submit" value="Go"/>
</form>

</body>
</html>