$(document).ready(function (){
	alertify.success('Cargando');
//		listar();
		limpiar_1();
});


$("#eliminar").click(function(){
	var id=$("").val();
});

function limpiar_1(){
	$("#nombre").val("");
	$("#porcentaje").val("");
	$("#tipo").val("");
	$("#valor_maximo").val("");
}


function eliminarDocente(id){
	alertify.confirm('Eliminar Secciones', 'Seguro de Eliminar', function(){  
		var id_secciones = id;
		alert(id_secciones);
		 $.post("eliminar", {id_secciones: id_secciones}, function (data) {
	          alert(data);       
	            }         
	      );
		
	}
    , function(){ alertify.error('Registro Cancelado')});
}
