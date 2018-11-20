$("#ValidarLogin").click(function() {
	var x=$("#usuario").val();
	var y=$("#clave").val();   
	alert("el usuario es:"+x);
	alert("la clave es:"+y);   
	$.get("cargarmodulos", function(datita) {
		
	 	
	});     
});


$(document).ready(function() {
	//alert("si funciona el script del login xd");      
	// $("#valor_tesis").attr('disabled','true');
	    
});