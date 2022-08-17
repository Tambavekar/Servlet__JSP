<%@page import="java.util.Date"%>
<%@page import="javax.xml.crypto.Data"%>
<%@page import="java.awt.geom.Path2D"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP File</title>
</head>
<body>
	<%!String message = "Java is best";%>
	<%!Date date = new Date();%>

	<%
	for (int i = 0; i < 5; i++) {
	%>
	<h2>Jsp Is simple</h2>
	<%=message%>
	<%=date%>


	<%
	}
	%>

</body>
</html>