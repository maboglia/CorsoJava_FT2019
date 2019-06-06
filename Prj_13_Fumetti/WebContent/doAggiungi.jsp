<%@page import="controller.FumettoController"%>
<%


String titolo = request.getParameter("titolo");
String editore = request.getParameter("autore");
String collana = request.getParameter("collana");

int numero = Integer.valueOf(request.getParameter("numero"));
int anno = Integer.valueOf(request.getParameter("anno"));

if (FumettoController.aggiungiFumetto(titolo, collana, editore, numero, anno))

	out.print("fumetto inserito!");
else
	out.print("fumetto NON inserito!");
	





%>