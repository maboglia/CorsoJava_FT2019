<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Blog su Java</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<h1>Blog su Java</h1>


</div>

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<script>

$.getJSON( "json", function( data ) {
	  var items = [];
	  $.each( data, function( key, val ) {
	    items.push( "<tr><td>" + val.title.toUpperCase() + "</td></tr>" );
	  });
	 
	  $( "<table/>", {
	    "class": "table table-striped table-dark",
	    html: items.join( "" )
	  }).appendTo( ".container" );
	});

</script>

</body>
</html>