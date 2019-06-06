<%@ page import="java.util.Date" %>

<jsp:include page="header.jsp"/>

	<% 
		Date d = new Date();
		
		out.print("<h2>benvenuti oggi è il "+d+"</h2>");
		
		String pagina;

		//verifico esistenza parametro pagina
		if(request.getParameter("pagina")!=null)
			pagina = request.getParameter("pagina");
		else
			pagina = "home";

		switch(pagina){
			case "elenco":
				%><jsp:include page="elenco.jsp"/><%
				break;
			case "fumetto":
				%><jsp:include page="fumetto.jsp"/><%
				break;
			case "aggiungi":
				%><jsp:include page="aggiungi.jsp"/><%
				break;
			default:
		%>
			<jsp:include page="benvenuto.jsp"/>
		<%
				break;
		}
	%>

<jsp:include page="footer.jsp"/>