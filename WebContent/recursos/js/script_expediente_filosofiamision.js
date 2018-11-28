$(document).ready(function() {  
	//alert("si funciona el script  de filosfia y mision piii xd");
	listarCOSMO();
	listarIFE();
	listarServicioApre();
	listarLogrosExtrasaas(); 
});           
 

// tabla filsofia misio pero en cosmovision
$("#registrar_cosmovision").click(function() {
	//alert("si funka el boton de cosmovision sin acciones");   
	var decla = $("#decla").val();      
	var docu=$("#documento33").val();
	var archi=$("#archi33").val();
	
                  
	var x = parseInt($("#idprofe").val()); 

//	alert(decla);
//	alert(docu);
//	alert(archi); 
	        
	 
	//alert("el id del prode es: "+x);   
	   
	          
	$.post("guardar_cosmovision", {
		decla:decla,
		docu:docu,
		archi:archi,      
		x:x       
		               
	},function(data){
		if(data!=null){
			alert("registro exitoso");     
			//swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                      
			//listarLogrosExtrasaas();                
			var id=data;    
			$("#id_cosmovisionpeeee").val(data);     
			$("#enviar_archivo33").click();  

			                   
		}else{   
			alert("Ops ocurrio un error"); 
		}
	}); 
	    
	   
});   
  
function listarCOSMO() {
	var x = parseInt($("#idprofe").val()); 
	//alert(x+"listar tipos cosmovision");  
	//alert("hola si funciona el funciton");
	$.get("listarcosmovision", {idprofe:x}, function(datita) {
		//alert(datita);                                          
		for(var i in datita){                                            
			$("#tablecosmoooooo").append("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE+"</td><td>"+datita[i].DOCUMENTO_SI_NO+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' onclick='CambiarEstadoServicioAprendizaje("+datita[i].ID_FILOSOFIA+")'  ><i class='fa fa-trash-o'></i></td></tr>");
		}    
		    
	});  
	        
} 

// tabla integracion fe enseñanza

$("#registrar_ife").click(function() {
	//alert("si funka el boton de integracion dfe enseñanza");   
	var decla = $("#ifee").val();   
	var docu=$("#formacion").val();
	var archi=$("#archi45").val();
	
                  
	var x = parseInt($("#idprofe").val()); 

//	alert(decla);
//	alert(docu);
//	alert(archi); 
	      
	 
	//alert("el id del prode es: "+x);   
	          
	          
	$.post("guardar_ife", {
		decla:decla,
		docu:docu,
		archi:archi,      
		x:x       
		               
	},function(data){
		if(data!=null){
			alert("registro exitoso");     
			//swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                      
			//listarLogrosExtrasaas();                
			var id=data;    
			$("#id_logro_feintegracion").val(data);     
			$("#enviar_archivo45").click();  

			               
		}else{   
			alert("Ops ocurrio un error"); 
		}
		
		
		//listarLeg_Grados();   
	}); 
	   
	   
}); 


function listarIFE() {
	var x = parseInt($("#idprofe").val()); 
	//alert(x+"listar ifeeeeeeeeeeee");   
	//alert("hola si funciona el funciton");
	$.get("listarife", {idprofe:x}, function(datita) {
		//alert(datita);                                          
		for(var i in datita){                                            
			$("#tableifeee").append("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE+"</td><td>"+datita[i].DOCUMENTO_SI_NO+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' onclick='CambiarEstadoServicioAprendizaje("+datita[i].ID_FILOSOFIA+")'  ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		         
	});  
	        
} 

// tabla servicios aprendeizaje

$("#registrar_servicio").click(function() {
	//alert("si funka el boton de servicio");   
	var decla = $("#servicio").val();   
	var docu=$("#formacion34").val();
	var archi=$("#archi98").val();
	
                  
	var x = parseInt($("#idprofe").val()); 

//	alert(decla);   
//	alert(docu);
//	alert(archi); 
//	      
//	 
//	alert("el id del prode es: "+x);   
//	          
	          
	$.post("guardar_servicio", {
		decla:decla,
		docu:docu,
		archi:archi,        
		x:x       
		               
	},function(data){ 
		if(data!=null){
			alert("registro exitoso");     
			//swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                      
			//listarLogrosExtrasaas();                
			var id=data;    
			$("#id_logro_extra98").val(data);     
			$("#enviar_archivo98").click();

			               
		}else{   
			alert("Ops ocurrio un error"); 
		}
		
		//listarLeg_Grados();   
	}); 
	   
	    
});

function listarServicioApre() {
	var x = parseInt($("#idprofe").val());  
	//alert(x+"listar serviciooooo");   
	//alert("hola si funciona el funciton");
	$.get("listarserviii", {idprofe:x}, function(datita) {
		//alert(datita);                                          
		for(var i in datita){                                             
			$("#tableserviciope").append("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE+"</td><td>"+datita[i].DOCUMENTO_SI_NO+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' onclick='CambiarEstadoServicioAprendizaje("+datita[i].ID_FILOSOFIA+")' ><i class='fa fa-trash-o'></i></td></tr>");
		}        
		        
	});  
	        
}

     

function CambiarEstadoServicioAprendizaje(id){       
	//alert("si entra en el cambiar de estado de filosofia global pe: "+id);  
$.post("cambiarestado_globalfilo", { 
		 
		id:id           
		               
	},function(data){ 
		$("#tableserviciope tbody tr").remove();
		$("#tableifeee tbody tr").remove();                       
		$("#tablecosmoooooo tbody tr").remove();
		listarCOSMO();
		listarIFE();
		listarServicioApre();
		//listarLogrosExtrasaas();       
	});
}             
    
//termien todo pe ajja xd	

// table de logros extras peeee aca nomas jajajja xd
 
$("#registrar_extras").click(function() {
	//alert("si funka el boton de logros extras");     
	  
	var docu=$("#declaextra").val();
	var archi=$("#urlextra").val();
	var form=$("#formid")[0];
	var data = new FormData(form);  
                              
	var x = parseInt($("#idprofe").val()); 

  
//	alert(docu);
//	alert(archi); 
//	      
//	 
//	alert("el id del prode es: "+x);   
	            
	          
	$.post("guardar_extras", {
		
		docu:docu,
		archi:archi,        
		x:x         
		                 
	},function(data){ 
		if(data!=null){     
			swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                      
			//listarLogrosExtrasaas();                
			var id=data;  
			$("#id_logro_extra").val(data);     
			$("#enviar_archivo").click();

			   
		}else{   
			alert("Ops ocurrio un error"); 
		}
		
	
		    
	});    
	
	
	   
	      
});
function listarLogrosExtrasaas() {
	 
	var x = parseInt($("#idprofe").val());  
	//alert(x+"listar logros extras solo cuando el estado es completado");      
	//alert("hola si funciona el funciton");  
	$.get("listarextrasssssssssssssssssss", {idprofe:x}, function(datita) {
		//alert(datita);                                            
		for(var i in datita){                                            
			$("#tablelogrosextraspe").append("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].DECLARACION+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' onclick='CambiarEstadoLogrosExtras("+datita[i].IDLOGROS+")' ><i class='fa fa-trash-o'></i></td></tr>");
		}             
		        
	});  
	        
}       



function limpiarLegExtras(){       
	$("#tablelogrosextraspe tbody tr").remove();   	
}



function CambiarEstadoLogrosExtras(id){
	//alert("si entra en el cambiar de estado: "+id);  
$.post("cambiarestado_extra", {
		
		id:id         
		               
	},function(data){ 
		$("#tablelogrosextraspe tbody tr").remove();
		listarLogrosExtrasaas();       
	});
}


