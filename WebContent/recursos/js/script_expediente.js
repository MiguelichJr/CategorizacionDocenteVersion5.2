$(document).ready(function() {
	alert("si funciona el script pe xd");
	// $("#valor_tesis").attr('disabled','true');
	listarLeg_Grados();
});
$("#registrar_grados").click(function() {
	alert("si funka el boton");
	var g = $("#grado1").val();
	var e = $("#espe1").val();
	var i = $("#insti1").val();
	var ft = $("#f_t1").val();
	var u1 = $("#url1").val();
	var t = $("#tesis1").val();
	var u2 = $("#url1").val();

	alert(g);
	alert(e);
	alert(i);
	alert(ft);
	alert(u1);
	alert(t);
	alert(u2);

	$.post("guardar_grados_titulos", {
		g : g,
		e : e,
		i : i,
		ft : ft,
		u1 : u1,
		t : t,
		u2 : u2
	});
	
	listarLeg_Grados();
});

function listarLeg_Grados() {
	var x = parseInt($("#idprofe").val());
	alert("hola si funciona el funciton");
	$.get("listarLeg_Grados", {idprofe:x}, function(datita) {
		alert(datita);
		for(var i in datita){
			$("#tblXD tr:last").after("<tr><td>"+(parseInt(i)+1)+"</td><td>"+datita[i].GRADO_IDGRD+"</td></tr>");
		} 
		
	});
}