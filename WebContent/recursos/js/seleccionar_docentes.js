$(document).ready(function (){
	alertify.success('Cargando');
	listar();
});




function listar(){
    $.get("ListarDocentes",function (data, status){
    $("#tablita").find("tr:gt(0)").remove();
    var u=0;
    
    for(var i in data){
    	alert(data);
    	u++;
        $("#tablita tr:last").after("<tr><td>"+u+"</td><td>"+data[i].PERSONA+"</td><td>"+data[i].REGIMEN_DOCENTE+"</td><td>"+data[i].NOMBRE_CATEGORIA+
        "</td><td class='center-align'><a href='#' onclick='eliminarDocente("+data[i].IDDOCON+")'><i class='material-icons prefix'>clear</i></a></td></tr>");
       }
        
    });
}

$("#GuardarDocente").click(function(){
	alertify.confirm('Registrando Docentes Convocatoria', 'Esta conforme con el registro', function(){  
		var fecha_registro = $("#fecha_registro").val();
		var regimen_docen = $("#regimen_docen").val();
		var idPersona = $("#idPersona").val();
		var idcategoria = $("#idcategoria").val();
		var idconvocatoeri = $("#idconvocatoeri").val();
		$.post("guardarDocen_Convoca",{regimen_docen:regimen_docen,idconvocatoeri:idconvocatoeri,idcategoria:idcategoria,
			idPersona:idPersona},function (data) {
				alert(data)
				if(data==1){
					listar();
					alert('Entro al registro');
					alertify.success('Docente Convocatoria registrada exitosa');
					limpiar_1();
				}else{
					alertify.error("Error en datos ingresados");
					limpiar_1();
				}
			});
	
	}
    , function(){ alertify.error('Registro Cancelado')});
});


function limpiar_1(){
	$("#idPersona").val("");
	$("#idcategoria").val("");
	$("#regimen_docen").val("");
	$("#nomnbre").val("");
}


function eliminarDocente(id){
	alertify.confirm('Eliminar Docentes', 'Seguro de Eliminar', function(){  
		var id_secciones = id;
		alert(id_secciones);
		 $.post("eliminarDoncetes", {id_secciones: id_secciones}, function (data, status) {
	          alert(data);
	      	listar();
	            }
	      );
	}
    , function(){ alertify.error('Registro Cancelado')});
}