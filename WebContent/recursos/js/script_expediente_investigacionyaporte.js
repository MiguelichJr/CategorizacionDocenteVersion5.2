$(document).ready(function() {  
	alert("si funciona el script  de investigacion y aporte al conocimiento xd");
	listarInvestiaciones();
	listarArticulos();
	listarLibros();
	listarasesorameinto(); 
});
    

//tabla investigaciones en los ultimos 5 anios

$("#registrar_Investigaciones_anios").click(function() {
	alert("si funka el boton de invetsigaciones en los ultimos 5 años");   
	var anios = $("#anios13").val();  
	var t=$("#titulo13").val();
	var resolu = $("#resolucion13").val();
	var u4 = $("#archi13").val();
                
	var x = parseInt($("#idprofe").val()); 

	alert(anios);
	alert(t);
	alert(resolu);  
	alert(u4);    
	      
	
	alert("el id del prode es: "+x);
	   
	    
	$.post("guardar_investigaciones_aniossssss", {
		anios : anios,
		t:t,
		resolu:resolu,
		u4:u4,
		x:x       
		               
	},function(data){
		if(data!=null){
			alert("registro exitoso");     
			//swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                      
			//listarLogrosExtrasaas();                
			var id=data;        
			$("#id_pinvestigacionesetr").val(data);     
			$("#enviar_archivo13").click();  
 
			                   
		}else{   
			alert("Ops ocurrio un error"); 
		}  
		//listarLeg_Grados();   
	}); 
	   
	   
});

function listarInvestiaciones() {
	var x = parseInt($("#idprofe").val());
	alert(x+"listar einvestigaciones en los ultimos 5 anios");
	//alert("hola si funciona el funciton");
	$.get("listarcinevstigaaaa", {idprofe:x}, function(datita) {
		//alert(datita);                                    
		for(var i in datita){                                      
			$("#tableinvestiiii ").append("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].ANIO+"</td><td>"+datita[i].TITULO+"</td><td>"+datita[i].NUMERO_RESOLUCION+"</td><td>"+datita[i].URL+"</td><td><button type='button' class='btn btn-danger' onclick='CambiarEstadoInvestigaciones("+datita[i].ID_LEG_INVESTIGACIONES+")' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		    
	});    
} 


function CambiarEstadoInvestigaciones(id){
	alert("si entra en el cambiar de estado en investigaciones: "+id);  
	   
	$.post("cambiarestado_investigaciones", {
		     
		id:id         
		                 
	},function(data){  
		$("#tableinvestiiii tbody tr").remove();
		listarInvestiaciones();      
		//listarasesorameinto();         
		//listarLogrosExtrasaas();       
	}); 
	                   
}  



// tabla publicaciones articulos

$("#registrar_articulos").click(function() {
	alert("si funka el boton  de articulos");   
	var anio = $("#anio15").val();
	var cate = $("#categria_Atributo15").val();
	var titulo = $("#titulo15").val();   
	var nombremedio = $("#nombremedio15").val();   
	var edito=$("#editorial15").val();
	var isbn=$("#isbn15").val();
	var npagi=$("#npaginas15").val();
	var lugar = $("#lugar15").val();
	var archi = $("#archi15").val(); 
                   
	var x = parseInt($("#idprofe").val()); 

	alert(anio);
	alert(cate);
	alert(titulo);  
	alert(nombremedio);
	alert(edito); 
	alert(isbn); 
	alert(npagi); 
	alert(lugar); 
	alert(archi);        
	      
	 
	alert("el id del prode es: "+x);
	   
	   
	$.post("guardar_articulos", {
		anio : anio,
		cate:cate,
		titulo:titulo,
		nombremedio:nombremedio,
		edito:edito,
		isbn:isbn,
		npagi:npagi,
		lugar:lugar,
		archi:archi,
		x:x       
		               
	},function(data){
		if(data!=null){
			alert("registro exitoso");     
			//swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                      
			//listarLogrosExtrasaas();                
			var id=data;       
			$("#id_articulosss").val(data);     
			$("#enviar_archivo15").click();  

			                   
		}else{   
			alert("Ops ocurrio un error"); 
		}  
		//listarLeg_Grados();   
	}); 
	       
	   
});     
function listarArticulos() {
	var x = parseInt($("#idprofe").val());
	alert(x+"listar articulos");
	//alert("hola si funciona el funciton");
	$.get("listararticulos", {idprofe:x}, function(datita) {
		//alert(datita);                                       
		for(var i in datita){                                          
			$("#tablearituclos").append("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].ANIO_PUBLICACION+"</td><td>"+datita[i].NOMBRE_ATRIBUTO+"</td><td>"+datita[i].NOMBRE_PUBLICACION+"</td><td>"+datita[i].NOMBRE_MEDIO_COMUNICACION+"</td><td>"+datita[i].EDITORIAL+"</td><td>"+datita[i].ISBN+"</td><td>"+datita[i].NPAGINAS+"</td><td>"+datita[i].LUGAR+"</td><td>"+datita[i].URL+"</td><td><button type='button' class='btn btn-danger' onclick='CambiarEstadoglobalpublicaiones("+datita[i].IDPUB+")'  ><i class='fa fa-trash-o'></i></td></tr>");
		}      
		    
	});          
} 

    


//tabla publicaciones libros  

$("#registrar_libros").click(function() {
	alert("si funka el boton  de libros");   
	var anio = $("#anio20").val();
	var cate = $("#cate20").val();
	var titulo = $("#titulo20").val();    
	var edito=$("#editorial20").val();
	var isbn=$("#isbn20").val();
	var npagi=$("#npaginas20").val();
	var archi = $("#archivo20").val();      
                   
	var x = parseInt($("#idprofe").val()); 

	alert(anio);
	alert(cate);
	alert(titulo);  
	alert(edito); 
	alert(isbn); 
	alert(npagi);  
	alert(archi);        
	      
	 
	alert("el id del prode es: "+x);
	   
	   
	$.post("guardar_libros", {
		anio : anio,
		cate:cate,
		titulo:titulo,
		edito:edito,
		isbn:isbn,
		npagi:npagi,                 
		archi:archi,
		x:x       
		               
	},function(data){
		if(data!=null){
			alert("registro exitoso");     
			//swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                      
			//listarLogrosExtrasaas();                
			var id=data;       
			$("#id_libros").val(data);      
			$("#enviar_archivo20").click();  
              
			                   
		}else{   
			alert("Ops ocurrio un error"); 
		}  
		//listarLeg_Grados();   
	}); 
	       
	   
}); 


function listarLibros() {
	var x = parseInt($("#idprofe").val());
	alert(x+"listar libros");
	//alert("hola si funciona el funciton");
	$.get("listarlibrosss", {idprofe:x}, function(datita) {
		//alert(datita);                                       
		for(var i in datita){                                        
			$("#tablelibros").append("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].ANIO_PUBLICACION+"</td><td>"+datita[i].NOMBRE_PUBLICACION+"</td><td>"+datita[i].NOMBRE_ATRIBUTO+"</td><td>"+datita[i].EDITORIAL+"</td><td>"+datita[i].ISBN+"</td><td>"+datita[i].NPAGINAS+"</td><td>"+datita[i].URL+"</td><td><button type='button' class='btn btn-danger' onclick='CambiarEstadoglobalpublicaiones("+datita[i].IDPUB+")' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		     
	});             
}
 

function CambiarEstadoglobalpublicaiones(id){
	alert("si entra en el cambiar de estado en publicaciones en global: "+id);  

	$.post("cambiarestado_globalpubli", {
		
		id:id             
		                 
	},function(data){  
		$("#tablelibros tbody tr").remove();
		$("#tablearituclos tbody tr").remove();
		listarLibros();     
		listarArticulos();
		
		//listartipsreconocmieintos();        
		//listarLogrosExtrasaas();       
	});                   
}




// tabla asesora tesis


$("#registrar_asesoramiento").click(function() {
	alert("si funka el boton  de asesoramiento");   
	var anio = $("#anio21").val();
	var cate = $("#cate21").val();
	var titulo = $("#nombre21").val();
	var autor=$("#autor21").val();
	var espe=$("#espe21").val();
	var anio2=$("#anio212").val();    
	var reso=$("#reso21").val();
	var archi = $("#archi21").val();      
                      
	var x = parseInt($("#idprofe").val()); 

	alert(anio);
	alert(cate);
	alert(titulo);  
	alert(autor); 
	alert(espe);   
	alert(anio2);
	alert(reso);   
	alert(archi);        
	      
	 
	alert("el id del prode es: "+x);
	   
	   
	$.post("guardar_asesoramiento", {
		anio : anio,
		cate:cate,
		titulo:titulo,
		autor:autor,
		espe:espe,
		anio2:anio2,
		reso:reso,        
		archi:archi, 
		x:x       
		               
	},function(data){
		if(data!=null){
			alert("registro exitoso");     
			//swal("Registro Exitoso", "", "success");    
			//limpiarLegExtras();                      
			//listarLogrosExtrasaas();                
			var id=data;     
			$("#id_asesoriatesis").val(data);     
			$("#enviar_archivo21").click();  

			                   
		}else{   
			alert("Ops ocurrio un error"); 
		}  
		//listarLeg_Grados();   
	}); 
	       
	   
}); 
 
function listarasesorameinto() {
	var x = parseInt($("#idprofe").val());
	alert(x+"listar asesoramiento"); 
	//alert("hola si funciona el funciton");
	$.get("listarasesoramiento", {idprofe:x}, function(datita) {
		//alert(datita);                                       
		for(var i in datita){                                         
			$("#tableasesoramiento").append("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].ANIO+"</td><td>"+datita[i].NOMBRE_ATRIBUTO+"</td><td>"+datita[i].TITULO+"</td><td>"+datita[i].AUTOR+"</td><td>"+datita[i].NOMBRE_ESPECIALIDAD+"</td><td>"+datita[i].ANIO_1+"</td><td>"+datita[i].RESOLUCION+"</td><td>"+datita[i].URL+"</td><td><button style='text-align:center' type='button' class='btn btn-danger' onclick='CambiarEstadoAsesoriaTesis("+datita[i].IDLGTESIS+")' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		       
	});          
} 

function CambiarEstadoAsesoriaTesis(id){
	alert("si entra en el cambiar de estado en reconocimientos: "+id);  
	
	$.post("cambiarestado_asesoriatesis", {
		     
		id:id         
		                 
	},function(data){  
		$("#tableasesoramiento tbody tr").remove();
		listarasesorameinto();         
		//listarLogrosExtrasaas();       
	}); 
	                   
}    
