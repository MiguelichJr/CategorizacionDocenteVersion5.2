       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>AutoEvaluacion</title>  
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.2/css/all.css"
	integrity="sha384-/rXc/GQVaYpyDdyxK+ecHPVYJSN9bmVFBvjA/9eOB+pb3F2w2N6fc5qB9Ew5yIns"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/cabezera.jsp"></jsp:include>
	<jsp:include page="template/menu.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title"> 
		<div>
			<h1>AutoEvaluacion</h1>
  
		</div>   
	</div> 
	    
    
	<div
		style="border-radius: 20px; background-color: white; padding: 10px ">
		<!-- Form Name -->
		<legend style="text-align: center">AutoEvaluacion</legend>
		<hr>          
		<!--lista de todo los registros -->
		<h5>Perspectiva: Misión y visión</h5>  
<hr>   
		<table class="table table-bordered" style="text-align:center;border-radius:20px">         
			<thead>
				<th>N°</th>
				<th>Items</th>
				<th>Nivel</th>    
				
			</thead>
			<tbody id="data">    
			</tbody>

			
			<th>1</th>
			<th>Tengo la visión clara sobre cómo debe progresar cada vez más
				mi trabajo docente en los próximos años y qué debo hacer para
				lograrlo.</th>
			<th><input class="form-control" id="autom1"></th>
			    
			<tr>
				<th>2</th>
				<th>Planifico mi trabajo y las acciones que se realizan están
					alineadas a los objetivos.</th>
				<th><input class="form-control" id="autom2"></th>
				
			<tr>
				<th>3</th>
				<th>Me involucro en el trabajo de mis colaboradores y/o
					colegas, y conozco sus metas personales y profesionales.</th>
				<th><input class="form-control" id="autom3"></th>
				
			<tr>
				<th>4</th>
				<th>Fomento el trabajo en equipo y escucho la opinión de mis
					colegas.</th>
				<th><input class="form-control" id="autom4"></th>
				
			<tr>
				<th>5</th>
				<th>Asumo las consecuencias de las decisiones que tomo sin
					culpar a otros de las consecuencias.</th>
				<th><input class="form-control" id="autom5"></th>
				
			<tr>
				<th>6</th>
				<th>Soy un ejemplo de las actitudes y conductas que exijo a mis
					alumnos y colegas.</th>
				<th><input class="form-control" id="autom6"></th>
				
			<tr>
				<th>7</th>
				<th>Expongo a mis alumnos lo que espero de cada uno y les
					expreso claramente qué objetivos se deben lograr.</th>
				<th><input class="form-control" id="autom7"></th>
				
			<tr>
				<th>8</th>
				<th>En las tareas importantes permanezco con mis colegas y
					alumnos, y me involucro en el trabajo.</th>
				<th><input class="form-control" id="autom8"></th>
				
			<tr>
				<th>9</th>
				<th>Motivo el desarrollo espiritual de mis alumnos y colegas.</th>
				<th><input class="form-control" id="autom9"></th>
				   
			<tr>
				<th>10</th>
				<th>Asumo un rol activo en las actividades eclesiales.</th>
				<th><input class="form-control" id="autom10"></th>
				           
			<tr>
		</table>

		<table class="table table-bordered">
			<thead>
				<th>N°</th>
				<th>Items</th>
				<th>Nivel</th>
			</thead>
			<h5 style="margin-top: 50px;">Responsabilidad y respeto</h5>
			<th>1</th>
			<th>Sostengo mis puntos de vista.</th>
			<th><input class="form-control" id="autor1"></th>
			
			<tr>
				<th>2</th>
				<th>Al tomar una decisión pongo por encima de todo los
					objetivos de la UPeU.</th>
				<th><input class="form-control" id="autor2"></th>
				        
			<tr>
				<th>3</th>
				<th>Reconozco y estimulo los logros de mis colegas y alumnos.</th>
				<th><input class="form-control" id="autor3"></th>
				
			<tr>
				<th>4</th>
				<th>Al ser convocado(a) a una reunión asisto puntualmente.</th>
				<th><input class="form-control" id="autor4"></th>
				
			<tr>
				<th>5</th>
				<th>Si cometo una injusticia con algún colega o alumno pido
					disculpas.</th>
				<th><input class="form-control" id="autor5"></th>
				
			<tr>
				<th>6</th>
				<th>Escucho y tomo en cuenta a todos sin importar su jerarquía.</th>
				<th><input class="form-control" id="autor6"></th>
				
			<tr>
				<th>7</th>
				<th>Si me comentan una situación soy discreto(a).</th>
				<th><input class="form-control" id="autor7"></th>
				
			<tr>
				<th>8</th>
				<th>No favorezco la crítica dentro de mis colaboradores.</th>
				<th><input class="form-control" id="autor8"></th>
				
			<tr>
				<th>9</th>
				<th>No dejo pasar los errores de mis colegas y alumnos, y se
					los hago ver con una actitud positiva.</th>
				<th><input class="form-control" id="autor9"></th>
				
			<tr>
		</table>  
		</table>

		<table class="table table-bordered">
			<thead>
				<th>N°</th>
				<th>Items</th>
				<th>Nivel</th>
			</thead>
			<h5 style="margin-top: 50px;">Motivación y autoestima</h5>
			<th>1</th>
			<th>Cuando se presenta un problema no me desanimo y procuro
				motivar a mi equipo.</th>
			<th><input class="form-control" id="autoau1"></th>
			
			<tr>
				<th>2</th>
				<th>Al presentarse una dificultad me mantengo en la lucha y
					busco alternativas de solución.</th>
				<th><input class="form-control" id="autoau2"></th>
				
			<tr>
				<th>3</th>
				<th>Si tengo una decisión importante, suelo pedir consejo para
					elegir la mejor alternativa.</th>
				<th><input class="form-control" id="autoau3"></th>
				
			<tr>
				<th>4</th>
				<th>Cuando las circunstancias no son perfectas, trato de
					corregir y sacar el mejor provecho sin enojarme.</th>
				<th><input class="form-control" id="autoau4"></th>
				
			<tr>
				<th>5</th>
				<th>Sé renunciar a mis objetivos cuando considero que no van a
					llevar a ningún resultado.</th>
				<th><input class="form-control" id="autoau5"></th>
				
			<tr>
				<th>6</th>
				<th>Trabajo con mis colegas y alumnos en base a confianza.</th>
				<th><input class="form-control" id="autoau6"></th>
				
			<tr>
				<th>7</th>
				<th>Pongo atención a los problemas de los demás antes que a los
					propios.</th>
				<th><input class="form-control" id="autoau7"></th>
				
			<tr>
				<th>8</th>
				<th>Controlo mi enojo en cualquier situación.</th>
				<th><input class="form-control" id="autoau8"></th>
				
			<tr>
				<th>9</th>
				<th>Permito la expresión de emociones entre mis alumnos y
					colegas.</th>
				<th><input class="form-control" id="autoau9"></th>
				
			<tr>
				<th>10</th>
				<th>Tengo presente que es imprescindible descansar físicamente
					y procuro hacerlo, y motivo a que mis colegas y alumnos lo hagan.</th>
				<th><input class="form-control" id="autoau10"></th>
				
			<tr>
		</table>

		<table class="table table-bordered">
			<thead>
				<th>N°</th>
				<th>Items</th>
				<th>Nivel</th>
			</thead>
			<h5 style="margin-top: 50px;">Equilibrio emocional</h5>
			<th>1</th>
			<th>Respeto el tiempo y el espacio de los demás y procuro no
				interrumpirlos constantemente.</th>
			<th><input class="form-control" id="autoequi1"></th>
			
			<tr>
				<th>2</th>
				<th>Controlo mis emociones y me muestro sereno.</th>
				<th><input class="form-control" id="autoequi2"></th>
				
			<tr>
				<th>3</th>
				<th>Soy una persona disciplinada y organizada.</th>
				<th><input class="form-control" id="autoequi3"></th>
				
			<tr>
				<th>4</th>
				<th>No justifico la mentira bajo ninguna circunstancia.</th>
				<th><input class="form-control" id="autoequi4"></th>
				
			<tr>
				<th>5</th>
				<th>Soy puntual en la entrada al trabajo.</th>
				<th><input class="form-control" id="autoequi5"></th>
				
			<tr>
				<th>6</th>
				<th>Reconozco los sentimientos de mis alumnos y colegas y trato
					de comprenderlos.</th>
				<th><input class="form-control" id="autoequi6"></th>
				
			<tr>
				<th>7</th>
				<th>Expreso mi punto de vista con respeto.</th>
				<th><input class="form-control" id="autoequi7"></th>
				
			<tr>
				<th>8</th>
				<th>Soy concreto y preciso en la exposición de mis ideas.</th>
				<th><input class="form-control" id="autoequi8"></th>
				
			<tr>
				<th>9</th>
				<th>En el trabajo estoy alegre y disfruto.</th>
				<th><input class="form-control" id="autoequi9"></th>
				
			<tr>
				<th>10</th>
				<th>Si le llamo la atención a algún alumno y/o colaborador lo
					hago en privado y con respeto.</th>
				<th><input class="form-control" id="autoequi10"></th>
				
			<tr>   
		</table>
				
				<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center"></div>
					</div>
					<div class="col-sm-6 ">
						<div class="row">
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center"></div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center">
  
									<button   onclick="calcular();" class="btn btn-primary btn-block" style="background-color: #992e45; border-top: #992e45; border-right: #992e45; border-bottom: #992e45; border-left: #992e45">Registrar</button>
		       
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="form-group" style="text-align: center"></div>
						</div>
    
					</div>
				</div>

				<div class="col-sm-3">
					<div class="form-group" style="text-align: center"></div>
				</div>
			</div>
		</div>    	         
			</div>  
	        
	   
<input type="hidden"     id="guardarvalores">      	  
 <input  type="hidden" value="<%=(Integer) session.getAttribute("idmodulo_menu")%>" id="idmodulooooo" class="form-control" style="width:100px;"/>
           
  
<input  type="hidden" id="idprofe" value="<%=(Integer) session.getAttribute("iddocenteconvocatoria")%>">   
	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>      
	<script src="${urlrecursos}/js/main.js"></script>
	<script src="${urlrecursos}/js/script_autoevaluacion.js"></script>   
	      
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
	$(document).ready(function() {
		alert("si funciona el script de autoevaluacion pepepepepepepepe solo dentro");  
	});
	
	function calcular(){
		alert("si funka la opcino calcular"); 
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
		alert(resultado);      
		$("#guardarvalores").val(resultado);
		var idprofe=$("#idprofe").val();
		alert(idprofe);   
		var nota=$("#guardarvalores").val();
		alert("si guarda los valores"); 
		
		$.post("registrarauto", {
			
			idprofe:idprofe,
			nota:nota,
			           
			               
		},function(data){ 
			//$("#tablelogrosextraspe tbody tr").remove();
			//listarLogrosExtrasaas();       
		});         
	}
	</script>
</body>
</html>         