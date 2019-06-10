<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="utf-8">
<title>SlotMachine</title>
<style>
.container {width:90%; margin:0 auto;padding:0 auto;}
.consolle { padding:2em;border:3px solid green; width: 60%; height: 400px; text-align:center; }
#immagini i.fas {font-size:3em; color: #c00; }
button {margin-top:3em;}
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.css" />
</head>
<body>

	<h1>slot machine</h1>

	<div class="container">
	
		<div class="consolle">
		
			<div id="immagini">
		
			<%! String[] simboli = {
					"fa-fish",
					"fa-ice-cream",
					"fa-pizza-slice",
					"fa-drumstick-bite",
					"fa-lemon",
			};
				int punteggio = 0;
			%>
		
		
			<%! public String gioca(){
				int random = (int) (Math.random() * simboli.length);
				
				String s = "<i class='fas "+simboli[random]+"'></i>";
				return s;
			} %>
		
			
			<%
			
				String ico1 = gioca();	
				String ico2 = gioca();	
				String ico3 = gioca();	
			
				if (ico1.equals(ico2) && ico2.equals(ico3))
					punteggio += 100;
				
				out.print(ico1);				
				out.print(ico2);				
				out.print(ico3);	
			
			%>
			
			</div>
		
		<button id="btnPlay" onclick="location.reload()">play</button>
		<div class="punteggio">
			<% out.print(punteggio); %>
		</div>
		
		</div>
	
	
	
	</div>


</body>
</html>