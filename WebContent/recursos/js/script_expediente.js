$(document).ready(function() {
	//alert("si funciona el script pe xd");
	// $("#valor_tesis").attr('disabled','true');
	listarLeg_Grados();
	listarExperienciaProfesional(); 
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




//tabla experiencia profesional

$("#registrar_experiencia_profesional").click(function() {
	alert("si funka el boton");
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
		
		//listarLeg_Grados();   
	});
	
	
});
 
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


