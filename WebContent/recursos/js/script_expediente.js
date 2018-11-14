$(document).ready(function() {
	//alert("si funciona el script pe xd");
	// $("#valor_tesis").attr('disabled','true');
	listarLeg_Grados();
	listarExperienciaProfesional();
	listarExperienciaAcademico();
});

//tabla de grados y estudios
$("#registrar_grados").click(function() {
	alert("si funka el boton");
	var g = $("#grado1").val();
	var e = $("#espe1").val();
	var i = $("#insti1").val();
	var ft = $("#f_t1").val();
	var u1 = $("#url1").val();
	var t = $("#tesis1").val();
	var u2 = $("#url1").val();
	var x = parseInt($("#idprofe").val());

	alert(g);
	alert(e);
	alert(i);
	alert(ft);
	alert(u1);
	alert(t);
	alert(u2);
	alert("El id del profesor es: "+x)     

	$.post("guardar_grados_titulos", {
		g : g,
		e : e,
		i : i,
		ft : ft,
		u1 : u1,
		t : t,
		u2 : u2,
		x : x
	},function(data){
		
		//listarLeg_Grados();   
	});
	
	
});
 
function listarLeg_Grados() {
	var x = parseInt($("#idprofe").val());
	//alert("hola si funciona el funciton");
	$.get("listarLeg_Grados", {idprofe:x}, function(datita) {
		//alert(datita);
		for(var i in datita){     
			$("#tblXD tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE_GRADO+"</td><td>"+datita[i].NOMBRE_ESPECIALIDAD+"</td><td>"+datita[i].NOMBRE_INSTITUCION+"</td><td>"+datita[i].FECHA_TERMINO+"</td><td>"+datita[i].URL+"</td><td>"+datita[i].TESIS+"</td><td>"+datita[i].URL_2_2+"</td><td><button type='button' class='btn btn-danger' ><i class='fa fa-trash-o'></i></td></tr>");
		} 
		
	});
}


/*

//tabla experiencia profesional

$("#registrar_experiencia_profesional").click(function() {
	alert("si funka el boton de experiencia profesional");
	var i = $("#insti2").val();
	var c = $("#cargo2").val();
	var td = $("#td2").val();
	var fi = $("#fi2").val();
	var ft = $("#ft2").val();
	var a = $("#aos2").val();
	var m = $("#meses2").val();
	var d = $("#dias2").val();
	var l = $("#lugar2").val(); 
	var a2 = $("#archi2").val();
 
	var x = parseInt($("#idprofe").val()); 

	alert(i);
	alert(c);
	alert(td);
	alert(fi);
	alert(ft);
	alert(a);
	alert(m);
	alert(d);
	alert(l);
	alert(a2);
	
	
	$.post("guardar_experiencia_profesional", {
		i : i,
		c:c,
		td:td,
		fi:fi,
		ft:ft,
		a:a,
		m:m,
		d:d,
		l:l, 
		a2:a2,
		x:x
		
	},function(data){
		alert(data);
		alert("si devuelve del controlador");    
		//listarLeg_Grados();   
	});
	
	
});
 


/*
function listarExperienciaProfesional() {
	var x = parseInt($("#idprofe").val());
	alert(x);
	//alert("hola si funciona el funciton");
	$.get("listarExProfe", {idprofe:x}, function(datita) {
		//alert(datita);   
		for(var i in datita){          
			$("#tablaexpe tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE_INSTITUCION+"</td><td>"+datita[i].CARGO+"</td><td>"+datita[i].NOMBRE_ATRIBUTO+"</td><td>"+datita[i].FECHA_INICIO+"</td><td>"+datita[i].FECHA_TERMINO+"</td><td>"+datita[i].ANIOS+"</td><td>"+datita[i].MESES+"</td><td>"+datita[i].DIAS+"</td><td>"+datita[i].LUGAR+"</td><td>"+datita[i].URL+"</td><td><button type='button' class='btn btn-danger' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		
	}); 
}
  




//tabla experiencia academico administrativa

$("#registrar_experiencia_academico_profesional").click(function() {
	alert("si funka el boton academico admin");
	var i = $("#insti3").val();
	var c = $("#cargo3").val();
	var r = $("#regimen3").val();
	var fi = $("#fi3").val();
	var ft = $("#ff3").val();
	var re = $("#reso3").val();
	var l = $("#lugar3").val();  
	var u3 = $("#url3").val();
  
	var x = parseInt($("#idprofe").val()); 

	alert(i);
	alert(c);
	alert(r);
	alert(fi);
	alert(ft);
	alert(re);
	alert(l);
	alert(u3);
	      
	
	alert("el id del prode es: "+x);
	
	
	$.post("guardar_experiencia_academico", {
		i : i,
		c:c,
		r:r,
		fi:fi,
		ft:ft,
		re:re,
		l:l,
		u3:u3,
		x:x
		             
	},function(data){
		alert(data);  
		//listarLeg_Grados();   
	});
	
	
});

function listarExperienciaAcademico() {
	var x = parseInt($("#idprofe").val());
	alert(x);
	//alert("hola si funciona el funciton");
	$.get("listarExProfe", {idprofe:x}, function(datita) {
		//alert(datita);       
		for(var i in datita){               
			$("#tableacademico tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].NOMBRE_INSTITUCION+"</td><td>"+datita[i].CARGO+"</td><td>"+datita[i].NOMBRE_ATRIBUTO+"</td><td>"+datita[i].FECHA_INICIO+"</td><td>"+datita[i].FECHA_TERMINO+"</td><td>"+datita[i].RESOLUCION+"</td><td>"+datita[i].LUGAR+"</td><td>"+datita[i].URL+"</td><td><button type='button' class='btn btn-danger' ><i class='fa fa-trash-o'></i></td></tr>");
		}  
		
	}); 
}



//tabla categoria docente
  

$("#registrar_categoriadocente").click(function() {
	alert("si funka el boton categoria academico");
	var i = $("#insti4").val();
	var c = $("#cate4").val();
	var fi = $("#fi4").val();
	var ft = $("#ft4").val();
	var a = $("#a4").val();
	var m = $("#m4").val();
	var d = $("#d4").val();
	var l = $("#l4").val();
	var u4 = $("#archivo4").val();
  
	var x = parseInt($("#idprofe").val()); 

	alert(i);
	alert(c);
	alert(fi);
	alert(ft);
	alert(a);
	alert(m);
	alert(d);
	alert(l);
	alert(u4); 
	      
	
	alert("el id del prode es: "+x);
	 
	
	$.post("guardar_categoriadocente", {
		i : i,
		c:c,
		fi:fi,
		ft:ft,
		a:a,
		m:m,
		d:d,
		l:l,
		u4:u4,
		x:x  
		             
	},function(data){
		
		//listarLeg_Grados();   
	}); 
	 
	
}); 
*/   