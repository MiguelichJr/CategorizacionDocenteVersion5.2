$(document).ready(function (){
	alertify.success('Cargando');
	listar();
	limpiar_1();
});



function listar(){
    $.get("listarDesignadores",function (data, status){
    $("#tablita").find("tr:gt(0)").remove();
    var u=0;
    for(var i in data){
    	u++;
        $("#tablita tr:last").after("<tr><td>"+u+"</td><td>"+data[i].EVALUADOR+"</td><td>"+data[i].INSTRUMENTO+"</td><td>"+data[i].DOCENTE+
        "</td><td class='center-align'><a href='#' onclick='eliminarDocente("+data[i].ID_DSGEVA+")'><i class='material-icons prefix'>clear</i></a></td></tr>");
       }
        
    });
}

$("#Guardarevaluador").click(function(){
	alertify.confirm('Registrando Evaluadores Convocatoria', 'Esta conforme con el registro', function(){  
		var fecha_registro = $("#fecha_registro").val();
		var Nombre_evaludor = $("#Nombre_evaludor").val();
		var Nombre_plan = $("#Nombre_plan").val();
		var iddocente = $("#iddocente").val();
		
		$.post("guardarEvaluadores",{fecha_registro:fecha_registro,iddocente:iddocente,Nombre_evaludor:Nombre_evaludor,
			Nombre_plan:Nombre_plan},function (data) {
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
	$("#fecha_registro").val("");
	$("#Nombre_evaludor").val("");
	$("#Nombre_plan").val("");
	$("#iddocente").val("");
});

function limpiar_1(){
	$("#fecha_registro").val("");
	$("#Nombre_evaludor").val("");
	$("#Nombre_plan").val("");
	$("#iddocente").val("");
}


function eliminarDocente(id){
	alertify.confirm('Eliminar Evaluador', 'Seguro de Eliminar', function(){  
		var id_secciones = id;
		alert(id_secciones);
		 $.post("eliminarevaluador", {id_secciones: id_secciones}, function (data, status) {
	          alert(data);
	      	listar();
	            }
	      );
		
	}
    , function(){ alertify.error('Registro Cancelado')});
}