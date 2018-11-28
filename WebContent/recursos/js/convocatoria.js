$(document).ready(function (){

});


$("#enviarcon").click(function(){
	alertify.confirm('Registrando Convocatoria', 'Esta conforme con el registro', function(){  
		var fecha_inicio = $("#fecha_inicio").val();
	var fecha_fin = $("#fecha_fin").val();
	var perido = $("#perido").val();
	var nombre = $("#nombre").val();
	var Fecha_inici_legajo = $("#Fecha_inici_legajo").val();	
	var fecha_fin_legajo = $("#fecha_fin_legajo").val();
	$.post("guardarConvocatoria",{fecha_inicio:fecha_inicio,fecha_fin:fecha_fin,
		perido:perido,nombre:nombre,Fecha_inici_legajo:Fecha_inici_legajo,
		fecha_fin_legajo:fecha_fin_legajo},function (data) {
		alert("Este es el alert"+data);
		if(data==1){
			alert('Entro al registro');
			alertify.success('Convocatoria registrada exitosa');
			limpiar_1();
		}else if(data==0){
			alertify.error("Tienes una convocatoria ya registrada");
			limpiar_1();
		}else{
			alertify.error("Verificar las fechas del legajo");
			alertify.error("Verifique las fechas");
		}
		
	});
		
	}
    , function(){ alertify.error('Registro Cancelado')});
});


$("#Limpiar").click(function limpiar(){
	alertify.confirm('Limpiar Campos', 'Esta conforme', function(){
		$("#fecha_inicio").val("");
		$("#fecha_fin").val("");
		$("#perido").val("");
		$("#nombre").val("");
		$("#Fecha_inici_legajo").val("");
		$("#fecha_fin_legajo").val("");
		alertify.success('Limpieza exitosa');
		}, 
		function(){ alertify.error('Registro Cancelado')});
});

function limpiar_1(){
	$("#fecha_inicio").val("");
	$("#fecha_fin").val("");
	$("#perido").val("");
	$("#nombre").val("");
	$("#Fecha_inici_legajo").val("");
	$("#fecha_fin_legajo").val("");
}
