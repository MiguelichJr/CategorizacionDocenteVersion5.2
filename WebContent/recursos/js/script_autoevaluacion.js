(function() {
	'use strict';
	window.addEventListener('load', function() {
		// Fetch all the forms we want to apply custom Bootstrap validation
		// styles to
		var forms = document.getElementsByClassName('nas');
		// Loop over them and prevent submission
		var validation = Array.prototype.filter.call(forms, function(form) {
			form.addEventListener('submit', function(event) {
				if (form.checkValidity() === false) {
					event.preventDefault();
					event.stopPropagation();
					alert("Falta rellenar algun campo");
				}
				form.classList.add('was-validated');
			}, false);
		});
		alert("Kaido kun onewamaru 3");     
	}, false);        
                 
})();          
    
$(document).ready(function() {
			$("#Agregar2").click(function(e) {
						var mat = $("#autom1").val();
			  			var mat1 = $("#autom2").val();
						var mat2 = $("#autom3").val();
						var mat3 = $("#autom4").val();
						var mat4 = $("#autom5").val();
						var mat5 = $("#autom6").val();
						var mat6 = $("#autom7").val();
						var mat7 = $("#autom8").val();
						var mat8 = $("#autom9").val();                       
						var mat9 = $("#autom10").val();
//						
						var mate1 = $("#autor1").val();
						var mate2 = $("#autor2").val();
						var mate3 = $("#autor3").val();
						var mate4 = $("#autor4").val();
						var mate5 = $("#autor5").val();
						var mate6 = $("#autor6").val();           
						var mate7 = $("#autor7").val();         
						var mate8 = $("#autor8").val();     
						var mate9 = $("#autor9").val();  

						 
						var mates1 = $("#autoau1").val();
						var mates2 = $("#autoau2").val();       
						var mates3 = $("#autoau3").val();   
						var mates4 = $("#autoau4").val();
						var mates5 = $("#autoau5").val();        
						var mates6 = $("#autoau6").val();
						var mates7 = $("#autoau7").val();
						var mates8 = $("#autoau8").val();
						var mates9 = $("#autoau9").val();
						var mates10 = $("#autoau10").val()
						
						var matem1 = $("#autoequi1").val();
						var matem2 = $("#autoequi2").val();
						var matem3 = $("#autoequi3").val();     
						var matem4 = $("#autoequi4").val();
						var matem5 = $("#autoequi5").val();
						var matem6 = $("#autoequi6").val();
						var matem7 = $("#autoequi7").val();       
						var matem8 = $("#autoequi8").val();
						var matem9 = $("#autoequi9").val();
						var matem10 = $("#autoequi10").val();
//

						
						var resultado = parseFloat(mat) * 0.0256410256410256
						+ parseFloat(mat1) * 0.0256410256410256
						+ parseFloat(mat2) * 0.0256410256410256  
						+ parseFloat(mat3) * 0.0256410256410256
						+ parseFloat(mat4) * 0.0256410256410256
						+ parseFloat(mat5) * 0.0256410256410256 
						+ parseFloat(mat6) * 0.0256410256410256
						+ parseFloat(mat7) * 0.0256410256410256
						+ parseFloat(mat8) * 0.0256410256410256     
						+ parseFloat(mat9) * 0.0256410256410256       
						  
					    + parseFloat(mate1) * 0.0256410256410256
						+ parseFloat(mate2) * 0.0256410256410256
						+ parseFloat(mate3) * 0.0256410256410256
						+ parseFloat(mate4) * 0.0256410256410256
						+ parseFloat(mate5) * 0.0256410256410256
						+ parseFloat(mate6) * 0.0256410256410256
						+ parseFloat(mate7) * 0.0256410256410256              
						+ parseFloat(mate8) * 0.0256410256410256
						+ parseFloat(mate9) * 0.0256410256410256          
			       			
						+ parseFloat(mates1) * 0.0256410256410256     
						+ parseFloat(mates2) * 0.0256410256410256
						+ parseFloat(mates3) * 0.0256410256410256
						+ parseFloat(mates4) * 0.0256410256410256
						+ parseFloat(mates5) * 0.0256410256410256
						+ parseFloat(mates6) * 0.0256410256410256
						+ parseFloat(mates7) * 0.0256410256410256
						+ parseFloat(mates8) * 0.0256410256410256
						+ parseFloat(mates9) * 0.0256410256410256
						+ parseFloat(mates10) * 0.0256410256410256
					 	            
						+ parseFloat(matem1) * 0.0256410256410256     
						+ parseFloat(matem2) * 0.0256410256410256    
						+ parseFloat(matem3) * 0.0256410256410256          
					    + parseFloat(matem4) * 0.0256410256410256
						+ parseFloat(matem5) * 0.0256410256410256
						+ parseFloat(matem6) * 0.0256410256410256
						+ parseFloat(matem7) * 0.0256410256410256
						+ parseFloat(matem8) * 0.0256410256410256
						+ parseFloat(matem9) * 0.0256410256410256        
						+ parseFloat(matem10) * 0.0256410256410256
						;                              
                                   
						                                                                 
//						 var resultado = resultado;        
						 alert(resultado);                             
						$("#Resultado").val(resultado);
					});
		}); 

$("#Agregar2").click(function(){ 
	alert("boton en acccion");
	
	var  result=$("#Resultado").val;
	var x=parseInt($("#idprofe").val());
	var y=parseInt($("#idpersona").val());
	var z=parseInt($("#idinstrumento").val());
	alert("nota final :"+ resul);
	alert("el id del profe es:"+x );
	/*
	     $.post("guardar_autoevaluacion"),{ 
	    	 resul:resul,
	    	 x:x,
	    	 y:y,
	    	 z:z
 	    	  
     } 
//	     ,function(data){
//	    	 swal("registro Exitos","","success");
//	    	 var kaido 
//	    	  
//	    	 
//	     }
	     
	 */          
}) ;