$(document).ready(function() {
	//alert("si funcoian en el controlador del privilegio");
	CargarMenu();   
	 
});    
 

function DirigiralMenu(id){
	//alert("si trae el id "+id);    
	var a=(id);
	//alert(a); 
	//alert("si llega");           
	$("#valormo").val(a);
	$("#valormo222").val(a);          
	$("#dirigirpe").click();  
	
	//window.location.replace("menucito");
    
	                            
	/*
	$.post("enviar_vista_menu", {
	}, function(data) {
		alert("si entra osea si devuede per vacio");   
		   
	}); */           
   
}  


  
function CargarMenu(){     
	var x=$("#idmodulooooo").val();
	 //var a=Integer.ParseInt(x);  
	//alert("si llega el id: "+x);
	$.post("listar_menu_modulo", {
		x : x   
	}, function(data) {
		//alert(data);  
		var s=" ";          
		if (data.length > 0) {
			var pri=data[0].NOMBRE_PRI;  
			for (var i = 0; i < data.length; i++) {
				//alert("si entra en el for de listar menus");
				     
				if(i==0){      
					s += '<li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fas fa-book"></i><span class="app-menu__label">'
						+pri+'</span><i class="treeview-indicator fa fa-angle-right"></i></a></li>';
					s += '<li><a class="treeview-item" href="'+data[0].URL_DETAPRI+'"><i class="icon fa fa-circle-o" style="margin-left:3%"></i>'+data[0].NOMBRE_DETAPRI+'</a></li>';
				}else{        
					if(data[i].NOMBRE_PRI==pri){    
						s += '<li><a class="treeview-item" href="'+data[i].URL_DETAPRI+'"><i class="icon fa fa-circle-o" style="margin-left:3%"></i>'+data[i].NOMBRE_DETAPRI+'</a></li>';	         
					}else{ 
						if(pri=data[i].NOMBRE_PRI){                   
							s += '<li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fas fa-book"></i><span class="app-menu__label">'
								+data[i].NOMBRE_PRI+'</span><i class="treeview-indicator fa fa-angle-right"></i></a></li>';            
							s += '<li><a class="treeview-item" href="'+data[i].URL_DETAPRI+'"><i class="icon fa fa-circle-o" style="margin-left:3%"></i>'+data[i].NOMBRE_DETAPRI+'</a></li>';	         
							      
						}                                       
					}           
				} 
			}           
          
			$("#menussssss_cargar").empty();  
			$("#menussssss_cargar").append(s);            
		}     
	});  
}