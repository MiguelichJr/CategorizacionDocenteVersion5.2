$(document).ready(function() {  
	alert("si funciona el script  de extension cultural piii xd");
	listartipsproyeccionscial();
	listartipsreconocmieintos();
}); 
 
// tabla de proyeccions social tipos 
$("#registrar_proyectosdeproyeccion").click(function() {
	alert("si funka el boton de extension cultural en la parte de los tipos");   
	var tp = $("#tipo_proyeccion22").val();   
	var t=$("#titulo22").val();
	var po=$("#poblacion_objetiva22").val();
	var l=$("#lugar22").val();
	var anio=$("#anio22").val();  
	var nparticipantes = $("#nparticipantes22").val();
	var u4 = $("#archivo22").val();
                  
	var x = parseInt($("#idprofe").val()); 

	alert(tp);
	alert(t);
	alert(po);  
	alert(l);
	alert(anio);
	alert(nparticipantes);   
	alert(u4);      
	      
	 
	alert("el id del prode es: "+x);   
	   
	          
	$.post("guardar_tiposdeproyeccionsocial", {
		tp:tp,
		t:t,
		po:po,
		l:l,
		anio:anio,
		nparticipantes:nparticipantes,
		u4:u4,    
		x:x       
		               
	},function(data){
		if(data!=null){
			alert("registro exitoso");     
			//swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                       
			//listarLogrosExtrasaas();                
			var id=data;              
			$("#id_proyeccionsocial").val(data);     
			$("#enviar_archivo22").click();  

			                   
		}else{   
			alert("Ops ocurrio un error"); 
		} 
		//listarLeg_Grados();   
	}); 
	   
	   
});   
   
function listartipsproyeccionscial() {
	var x = parseInt($("#idprofe").val()); 
	alert(x+"listar tipos de proyeccions social"); 
	//alert("hola si funciona el funciton");
	$.get("listartiposproyeccion", {idprofe:x}, function(datita) {
		//alert(datita);                                          
		for(var i in datita){                                          
			$("#tabletiposproyeccionsocial tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].TIPO+"</td><td>"+datita[i].TITULO+"</td><td>"+datita[i].POBLACION_OBJETIVA+"</td><td>"+datita[i].LUGAR+"</td><td>"+datita[i].ANIO+"</td><td>"+datita[i].NPARTICIPANTES+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		    
	});          
}  


// tabla  reconocimientos

$("#registrar_reconociemitnos").click(function() {
	alert("si funka el boton de reconocimientos");   
	var t = $("#tipo24").val();     
	var a=$("#anio24").val();
	var f=$("#fecha24").val();
	var i=$("#isntitucion24").val(); 
	var c=$("#cargo24").val();  
	var r = $("#reconocimientos24").val();
	var l = $("#lugar24").val();
	var u4 = $("#archivo24").val();
                  
	var x = parseInt($("#idprofe").val()); 

	alert(t);   
	alert(a);
	alert(f);  
	alert(i);
	alert(c);
	alert(r);
	alert(l); 
	alert(u4);      
	      
	 
	alert("el id del prode es: "+x);   
	   
	          
	$.post("guardar_reconocimientos", {
		t:t,
		a:a,
		f:f,
		i:i,
		c:c,
		r:r,
		l:l,
		u4:u4,        
		x:x       
		               
	},function(data){
		if(data!=null){
			alert("registro exitoso");     
			//swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                      
			//listarLogrosExtrasaas();                
			var id=data;          
			$("#id_reconocimientos").val(data);     
			$("#enviar_archivo24").click();  

			                   
		}else{   
			alert("Ops ocurrio un error"); 
		}  
		//listarLeg_Grados();   
	}); 
	   
	   
}); 

       
function listartipsreconocmieintos() {
	var x = parseInt($("#idprofe").val()); 
	alert(x+"listar reconocimientos");  
	//alert("hola si funciona el funciton");
	$.get("listarreconooo", {idprofe:x}, function(datita) {
		//alert(datita);                                             
		for(var i in datita){                                          
			$("#tablereconocimientosss tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].TIPO+"</td><td>"+datita[i].ANIO+"</td><td>"+datita[i].FECHA+"</td><td>"+datita[i].NOMBRE_INSTITUCION+"</td><td>"+datita[i].LABOR+"</td><td>"+datita[i].RECONOCIMIENTO_DESCRIPCION+"</td><td>"+datita[i].LUGAR+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		    
	});          
}  
