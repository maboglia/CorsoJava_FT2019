<%@ page import="model.Fumetto, controller.FumettoController" %>

<table  class="table table-striped">
	<%

		int i = 0;
		for (Fumetto f : FumettoController.getCollezione()){
			
			
			out.print("<tr>");
			out.print("<td>"+ f.getNumero() +"</td>");
			out.print("<td><a href='?pagina=fumetto&idFumetto="+i+"'>"+ f.getTitolo() +"</a></td>");
			out.print("<td>"+ f.getCollana() +"</td>");
			out.print("<td>"+ f.getEditore() +"</td>");
			out.print("<td>"+ f.getAnno() +"</td>");
			out.print("</tr>");
			i++;
		}
	
	
	%>
</table>

