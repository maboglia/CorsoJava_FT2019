<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="utf-8">
<title>Libreriamo</title>
</head>
<body>

	<h1>Libreriamo</h1>
	
	<% if (session.getAttribute("logged") != null){
		
			 if (session.getAttribute("logged").equals(true) ){		
				out.println("l'utente è già loggato");
			} else 
				out.println("l'utente NON è loggato");
	} else {
		out.println("non esiste la var di sessione: logged");
		response.sendRedirect("login.html");	 
	} 
			 %>
</body>
</html>