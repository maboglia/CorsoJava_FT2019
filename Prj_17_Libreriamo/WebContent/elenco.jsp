<%@page import="java.util.ArrayList"%>
<%@page import="model.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
	
	<% 
	
		for(Libro l : (ArrayList<Libro>) request.getAttribute("libri")){ 
		%>
			<tr><td><%= l.getTitolo() %></td><td><%= l.getPrezzo() %></td></tr>
		<% 
		}
	
	%>
	
	</table>


</body>
</html>