$(document).ready(function() {
	//alert("si funciona el contolador de js de main de metodos");
	listar_modulos_por_rol();  
});

function listar_modulos_por_rol() {
	//alert("si entra en la funcion de listar todos los modulos"); 
	var a = $("#iddocenteconvo").val();
	var b = $("#roles").val();

	//alert("El id del docente por convocatoria es: " + a);
	//alert("El id de los roles de la persona es: " + b);

	$.post("listar_modulos_rol", {
		b : b
	}, function(data) {
		//alert(data);
		var s=" ";         
		if (data.length > 0) {
			for (var i = 0; i < data.length; i++) {
				//alert("si entra en el for de listar modulos");    
				var idmodulo = data[i].ID_MODULO;
				var nombremodulo = data[i].NOMBRE_MO;
				var iconomodulo = data[i].ICONO_MO;
				var colormodulo = data[i].COLOR_MO; 
				var urlmodulo = data[i].RUTA_MO;
				s += MostrarModulos(idmodulo, nombremodulo, iconomodulo,
						colormodulo, urlmodulo);
			}

			$("#contenidoModulos").empty();     
			$("#contenidoModulos").append(s);
		}
	});
    
}  

function MostrarModulos(idmodulo, nombremodulo, iconomodulo, colormodulo,
		urlmodulo) {
	var s = '<div class="circulo waves-effect waves-light"  id="' + idmodulo
			+ '" onclick="DirigiralMenu(this.id)"></a>';           
        
	s += '<div class="circulo2">';   
	s += '<i class=" ' + iconomodulo      
			+ ' size-icon" style="color:' + colormodulo + ';margin-left:40px;font-size:30px"></i>';
	s += '<h6 style="font-family:Freestyle Script;text-align:center;color:white">' + nombremodulo + '</h6>';    
	s += '</div>';        
                     
	s += '</div>';
	s += '</div>';  
	return s;
}


