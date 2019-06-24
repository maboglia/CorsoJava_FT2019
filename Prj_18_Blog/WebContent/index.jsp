<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Blog su Java</title>
</head>
<body>

	<h1>Blog su Java</h1>



<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>

$.getJSON( "json", function( data ) {
	  var items = [];
	  $.each( data, function( key, val ) {
	    items.push( "<li id='" + key + "'>" + val.title.toUpperCase() + "</li>" );
	  });
	 
	  $( "<ul/>", {
	    "class": "my-new-list",
	    html: items.join( "" )
	  }).appendTo( "body" );
	});

</script>

</body>
</html>