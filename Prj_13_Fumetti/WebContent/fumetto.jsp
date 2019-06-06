<%@ page import="model.Fumetto, controller.FumettoController" %>

<div id="schedaFumetto">
	<%
	
		int idFumetto = Integer.parseInt(request.getParameter("idFumetto"));

	
		Fumetto f = FumettoController.getFumettoById(idFumetto);
			
			
			out.print("<h2>"+ f.getNumero() +"</h2>");
			out.print("<h2>"+ f.getTitolo() +"</h2>");
			out.print("<h2>"+ f.getCollana() +"</h2>");
			out.print("<h2>"+ f.getEditore() +"</h2>");
			out.print("<h2>"+ f.getAnno() +"</h2>");
			
		
	
	
	%>
</div>

