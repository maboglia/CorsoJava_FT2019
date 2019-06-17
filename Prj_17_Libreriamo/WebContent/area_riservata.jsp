<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Area admin Libreriamo</h1>
	<h2><%= request.getParameter("username") %></h2>
	<h2><%= request.getAttribute("logged") %></h2>

	<% if (session.getAttribute("logged").equals(true) ){
		
	%>
		
		<form method="post" action="sezioni">
		
			<input type="text" name="titolo" placeholder="titolo"> 
			<input type="text" name="prezzo" placeholder="prezzo"> 
			<input type="submit"  value="aggiungi libro"> 
		
		</form>
		
	<% 	
	} %>

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
alert();
$.ajax( "http://localhost:8080/Libreriamo/sezioni?libri=all" )
.done(function(pippo) {
	console.log( pippo );
}).fail(function(error){
	console.log(error);
})
</script>

</body>
</html>