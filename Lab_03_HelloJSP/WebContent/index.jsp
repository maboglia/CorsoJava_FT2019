<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Lab Java JSP</h1>
	<%
	
	for(int i = 0; i<10;i++){
		
		out.println("<h2>è ora di andare a mangiare " + i + "</h2>");
		
	}
	
	
	
	%>
	
</body>
</html>