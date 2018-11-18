$(document).ready(function() {  
	alert("si funciona el script  de filosfia y mision piii xd");
	listarCOSMO();
	listarIFE();
	listarServicioApre();
}); 
 

// tabla filsofia misio pero en cosmovision
$("#registrar_cosmovision").click(function() {
	alert("si funka el boton de cosmovision");   
	var decla = $("#decla").val();   
	var docu=$("#documento33").val();
	var archi=$("#archi33").val();
	
                  
	var x = parseInt($("#idprofe").val()); 

	alert(decla);
	alert(docu);
	alert(archi); 
	      
	 
	alert("el id del prode es: "+x);   
	   
	          
	$.post("guardar_cosmovision", {
		decla:decla,
		docu:docu,
		archi:archi,      
		x:x       
		               
	},function(data){
		
		//listarLeg_Grados();   
	}); 
	   
	   
});   
  
function listarCOSMO() {
	var x = parseInt($("#idprofe").val()); 
	alert(x+"listar tipos cosmovision");  
	//alert("hola si funciona el funciton");
	$.get("listarcosmovision", {idprofe:x}, function(datita) {
		//alert(datita);                                          
		for(var i in datita){                                            
			$("#tablecosmoooooo tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE+"</td><td>"+datita[i].DOCUMENTO_SI_NO+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		    
	});  
	        
} 

// tabla integracion fe enseñanza

$("#registrar_ife").click(function() {
	alert("si funka el boton de integracion dfe enseñanza");   
	var decla = $("#ifee").val();   
	var docu=$("#formacion").val();
	var archi=$("#archi45").val();
	
                  
	var x = parseInt($("#idprofe").val()); 

	alert(decla);
	alert(docu);
	alert(archi); 
	      
	 
	alert("el id del prode es: "+x);   
	          
	          
	$.post("guardar_ife", {
		decla:decla,
		docu:docu,
		archi:archi,      
		x:x       
		               
	},function(data){
		
		//listarLeg_Grados();   
	}); 
	   
	   
}); 


function listarIFE() {
	var x = parseInt($("#idprofe").val()); 
	alert(x+"listar ifeeeeeeeeeeee");   
	//alert("hola si funciona el funciton");
	$.get("listarife", {idprofe:x}, function(datita) {
		//alert(datita);                                          
		for(var i in datita){                                            
			$("#tableifeee tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE+"</td><td>"+datita[i].DOCUMENTO_SI_NO+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		        
	});  
	        
} 

// tabla servicios aprendeizaje

$("#registrar_servicio").click(function() {
	alert("si funka el boton de servicio");   
	var decla = $("#servicio").val();   
	var docu=$("#formacion34").val();
	var archi=$("#archi98").val();
	
                  
	var x = parseInt($("#idprofe").val()); 

	alert(decla);   
	alert(docu);
	alert(archi); 
	      
	 
	alert("el id del prode es: "+x);   
	          
	          
	$.post("guardar_servicio", {
		decla:decla,
		docu:docu,
		archi:archi,        
		x:x       
		               
	},function(data){
		
		//listarLeg_Grados();   
	}); 
	   
	    
});

function listarServicioApre() {
	var x = parseInt($("#idprofe").val());  
	alert(x+"listar serviciooooo");   
	//alert("hola si funciona el funciton");
	$.get("listarserviii", {idprofe:x}, function(datita) {
		//alert(datita);                                          
		for(var i in datita){                                            
			$("#tableserviciope tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE+"</td><td>"+datita[i].DOCUMENTO_SI_NO+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		        
	});  
	        
}  

//termien todo pe ajja xd
