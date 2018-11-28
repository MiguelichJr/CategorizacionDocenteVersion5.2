$(document).ready(function (){
	alertify.success('Cargando');
		listar();
		limpiar_1();
});


function listar(){
    $.get("listarInstrumento",function (data, status){
    $("#tablita").find("tr:gt(0)").remove();
    var u=0;
    for(var i in data){
    	u++;
        $("#tablita tr:last").after("<tr><td>"+u+"</td><td>"+data[i].nombre_plantilla+"</td><td>"+data[i].tipo+"</td><td>"+data[i].porcentaje+
        "</td><td class='center-align'><a href='#' onclick='eliminarDocente("+data[i].idinstrumento+")'><i class='material-icons prefix'>clear</i></a>" +
        		"<a class=' waves-light modal-trigger' href='editarSumill/"+data[i].idinstrumento+"' ><i class='material-icons prefix'>create</i></a></td></tr>");
       }
        
    });
}

$("#GuardarInstrumento").click(function(){
	alertify.confirm('Registrando Instrumento', 'Esta conforme con el registro', function(){  
		var nombre_plantilla = $("#nombre_plantilla").val();
		var tipo = $("#tipo").val();
		var porcentaje = $("#porcentaje").val();
		var idconvoca = $("#idconvoca").val();
		limpiar_1();
		
		$.post("guardarIntrumentos",{nombre_plantilla:nombre_plantilla,tipo:tipo,porcentaje:porcentaje,
			idconvoca:idconvoca},function (data) {
				alert(data)
				if(data==1){
					listar();
					alert('Entro al registro');
					alertify.success('Evaluadores Convocatoria registrada exitosa');
					limpiar_1();
				}else{
					alertify.error("Error en datos ingresados");
					limpiar_1();
				}
			});
	
	}
    , function(){ alertify.error('Registro Cancelado')});
});

$("#limpiar").click(function(){
	$("#nombre_plantilla").val("");
	$("#tipo").val("");
	$("#porcentaje").val("");
});

function limpiar_1(){
	$("#nombre_plantilla").val("");
	$("#tipo").val("");
	$("#porcentaje").val("");
}


function eliminarDocente(id){
	alertify.confirm('Eliminar Instrumento', 'Seguro de Eliminar', function(){  
		var id_secciones = id;
		alert(id_secciones);
		 $.post("eliminarinstrumento", {id_secciones: id_secciones}, function (data, status) {
	          alert(data);
	      	listar();
	            }
	      );
	}
    , function(){ alertify.error('Registro Cancelado')});
}
