$(document).ready(function() {  
	alert("si funciona el script  de actualizacion docente pes owenxd");   
	listarorganizacinodeeventosacademicso();
	listarcapacitacionenladocenciaenlosultimosanios();
	listarponenciasencongresos();
	listarformalcertificadaaaa();    
});


//tabla organizacion de eventos academicos

$("#registrar_eventos_academicos").click(function() {
	alert("si funka el boton de eventos academicos");   
	var a = $("#anio14").val(); 
	var f = $("#fecha14").val();
	var n = $("#nombreevento14").val();
	var i = $("#insti14").val();
	var h = $("#horas14").val();
	var c = $("#creditos14").val();
	var l = $("#lugar14").val();
	var u4 = $("#archi14").val();
	var x = parseInt($("#idprofe").val());
   
	alert(a);
	alert(f);
	alert(n);
	alert(i);
	alert(h);
	alert(c);
	alert(l);
	alert(u4);
	alert(x);       
 
	$.post("guardar_eventosacademicos", {
		a:a,
		f:f,
		n:n,
		i:i,
		h:h,
		c:c,
		l:l,
		u4:u4,     
		x : x
	},function(data){
		
		//listarLeg_Grados();   
	});
	
	
});

function listarorganizacinodeeventosacademicso() {
	var x = parseInt($("#idprofe").val());
	alert(x+" listar eventos academicos pues owen si lista ");  
	//alert("hola si funciona el funciton");
	$.get("listareventosSAcademicos", {idprofe:x}, function(datita) {
		//alert(datita);                                    
		for(var i in datita){                                    
			$("#tableeventosacademicos tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].ANIOS+"</td><td>"+datita[i].FECHA+"</td><td>"+datita[i].NOMBRE_EVENTO+"</td><td>"+datita[i].NOMBRE_INSTITUCION+"</td><td>"+datita[i].HORAS+"</td><td>"+datita[i].CREDITOS+"</td><td>"+datita[i].LUGAR+"</td><td>"+datita[i].URL+"</td><td><button type='button' class='btn btn-danger' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		     
	});      
} 

           
//TABLA EN CAPCAITACION EN LA DOCENCIA EN LOS ULTIMOS 5 AÑOS
 
$("#registrar_capcianios").click(function() {
	alert("si funka el boton de capacitacion en los utimos 5    pues amiguito rick");    
	var i = $("#insti15").val();  
	var ne15 = $("#nombrevento15").val();
	var fi = $("#fi15").val();
	var ff = $("#ff15").val();
	var h = $("#h15").val();
	var c = $("#c15").val();
	var l = $("#l15").val();
	var a15 = $("#archi15").val();
	var x = parseInt($("#idprofe").val());
   
	alert(i);
	alert(ne15);
	alert(fi);
	alert(ff);
	alert(h);    
	alert(c);
	alert(l);
	alert(a15);      
	alert(x);           
                          
               
	$.post("guardar_capacitaciones_aca", {i:i,ne15:ne15,fi:fi,ff:ff,h:h,c:c,l:l,a15:a15,x:x},function(data){
		                    
		//listarLeg_Grados();     
	});  
	                                                            
	  
});

function listarcapacitacionenladocenciaenlosultimosanios() {
	var x = parseInt($("#idprofe").val());
	alert(x+" listar capacitaciones en la docencia en los ultimos 5 anios ");  
	    
	$.get("listarcapacitacionDocencia", {idprofe:x}, function(datita) {
		//alert(datita);                                    
		for(var i in datita){                                      
			$("#tablecapacitaciones5anios tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE_INSTITUCION+"</td><td>"+datita[i].NOMBRE_EVENTO+"</td><td>"+datita[i].FECHA+"</td><td>"+datita[i].FECHA_TERMINO+"</td><td>"+datita[i].HORAS+"</td><td>"+datita[i].CREDITOS+"</td><td>"+datita[i].LUGAR+"</td><td>"+datita[i].URL+"</td><td><button type='button' class='btn btn-danger' ><i class='fa fa-trash-o' style='text-align:center'></i></td></tr>");
		}  
		        
	});      
} 

// tabla capacitacion  en ponencias o en congresos

$("#registrar_ponenciasencongresos").click(function() {
	alert("si funka el boton ponencias en congresos u otras cosas mas");    
	var a = $("#anio18").val();  
	var c = $("#categoria18").val();
	var ne = $("#nombre_even18").val();
	var i = $("#insti18").val();
	var h = $("#h18").val();
	var credi = $("#c18").val();
	var l = $("#l18").val();
	var u = $("#u18").val();  
	var x = parseInt($("#idprofe").val());    
	alert(a);
	alert(c);
	alert(ne);
	alert(i);
	alert(h);    
	alert(credi);
	alert(l);
	alert(u);       
	alert(x);           
                               
                 
	$.post("guardar_ponenecias_congresos", {a:a,c:c,ne:ne,i:i,h:h,credi:credi,l:l,u:u,x:x},function(data){
		                    
		//listarLeg_Grados();     
	});  
	                                                            
	  
});

function listarponenciasencongresos() {
	var x = parseInt($("#idprofe").val());
	alert(x+" listar ponenciasssssssss ");  
	     
	$.get("listarponenciaaaaa", {idprofe:x}, function(datita) {
		//alert(datita);                                    
		for(var i in datita){                                      
			$("#tableponencias tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].ANIO+"</td><td>"+datita[i].NOMBRE_ATRIBUTO+"</td><td>"+datita[i].NOMBRE_EVENTO+"</td><td>"+datita[i].NOMBRE_INSTITUCION+"</td><td>"+datita[i].HORAS+"</td><td>"+datita[i].CREDITOS+"</td><td>"+datita[i].LUGAR+"</td><td>"+datita[i].URL+"</td><td><button type='button' class='btn btn-danger' ><i class='fa fa-trash-o' style='text-align:center'></i></td></tr>");
		}      
		        
	});      
} 


// tabla de formal certificada
 

$("#registrar_formalcertifici").click(function() {
	alert("si funka el boton formal certificadao xd xd xd xd");    
	var a = $("#anio20").val();  
	var c = $("#cate20").val();
	var ne = $("#ne20").val();
	var i = $("#entidad20").val();      
	var h = $("#h20").val();
	var credi = $("#cre20").val();
	var l = $("#l20").val();
	var u = $("#archi20").val();  
	var x = parseInt($("#idprofe").val());    
	alert(a);           
	alert(c);
	alert(ne);
	alert(i);
	alert(h);    
	alert(credi);
	alert(l);
	alert(u);       
	alert(x);           
     
	
                 
	$.post("guardar_formar_certificadas", {a:a,c:c,ne:ne,i:i,h:h,credi:credi,l:l,u:u,x:x},function(data){
		                    
		//listarLeg_Grados();     
	});  
	                                                                          
	  
});
  
function listarformalcertificadaaaa() {
	var x = parseInt($("#idprofe").val());
	alert(x+" listar formal certificadas ");    
	       
	$.get("listarforcertificada", {idprofe:x}, function(datita) {
		//alert(datita);                                    
		for(var i in datita){                                      
			$("#tableforceertiiii tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].ANIO+"</td><td>"+datita[i].NOMBRE_ATRIBUTO+"</td><td>"+datita[i].NOMBRE_EVENTO+"</td><td>"+datita[i].NOMBRE_INSTITUCION+"</td><td>"+datita[i].HORAS+"</td><td>"+datita[i].CREDITOS+"</td><td>"+datita[i].LUGAR+"</td><td>"+datita[i].URL+"</td><td><button type='button' class='btn btn-danger' ><i class='fa fa-trash-o' style='text-align:center'></i></td></tr>");
		}      
		         
	});      
}    


         