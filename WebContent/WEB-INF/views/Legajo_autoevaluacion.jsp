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
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.16.0/jquery.validate.js"></script>
	
  
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.2/css/all.css"
	integrity="sha384-/rXc/GQVaYpyDdyxK+ecHPVYJSN9bmVFBvjA/9eOB+pb3F2w2N6fc5qB9Ew5yIns"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
</head>
<style>
#items {
	width: 80%;
}
</style>
<body class="app sidebar-mini rtl">
	<!-- Navbar--> 
	<jsp:include page="template/cabezera.jsp"></jsp:include>
	<jsp:include page="template/menu.jsp"></jsp:include>  
	<main class="app-content">
	<div class="app-title">
		<div>   
			<h1>Auto-Evaluación</h1>

		</div>

	</div>


      
	<div style="width: 80%; margin-left: 100px;"
		class="shadow-lg p-3 mb-5 bg-white rounded"    >
		<div style="margin-bottom: 10px;">Coloque en la tercera columna
			el puntaje de acuerdo al nivel que usted considere conveniente,
			considerando que 0=Nada, 1=Raras veces, 2=A veces, 3=A menudo, 4=Casi
			siempre y 5=Siempre.</div>
			
		<h5>Perspectiva: Misión y visión</h5>  
  

		<hr>
		<form class="nas" novalidate>  
		
		<table class="table table-bordered" style="border-radius: 20px">
			<thead>
				<th>N°</th>
				<th id="items">Items</th>
				<th>Nivel</th> 

			</thead>   
			<tbody id="data">
			</tbody>


			<th>1</th>
			<th>Tengo la visión clara sobre cómo debe progresar cada vez más
				mi trabajo docente en los próximos años y qué debo hacer para
				lograrlo ok ? que paso ?   .</th>         
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;" 
				onKeypress="if (event.keyCode < 97 || event.keyCode > 101) event.returnValue = true;" id="autom1" required="required">
				<div class="valid-feedback">      
        			          
             </div>       
             <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
			</th>               
			<tr>                                                          
				<th>2</th>                       
				<th>Planifico mi trabajo y las acciones que se realizan están
					alineadas a los objetivos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autom2" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>3</th>
				<th>Me involucro en el trabajo de mis colaboradores y/o
					colegas, y conozco sus metas personales y profesionales.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autom3"  required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>4</th>
				<th>Fomento el trabajo en equipo y escucho la opinión de mis
					colegas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autom4" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div>  
				</th>
			<tr>
				<th>5</th>
				<th>Asumo las consecuencias de las decisiones que tomo sin
					culpar a otros de las consecuencias.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = true;" id="autom5" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>6</th>
				<th>Soy un ejemplo de las actitudes y conductas que exijo a mis
					alumnos y colegas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = true;" id="autom6" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>7</th>
				<th>Expongo a mis alumnos lo que espero de cada uno y les
					expreso claramente qué objetivos se deben lograr.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = true;" id="autom7" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>8</th>
				<th>En las tareas importantes permanezco con mis colegas y
					alumnos, y me involucro en el trabajo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = true;" id="autom8" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>9</th>
				<th>Motivo el desarrollo espiritual de mis alumnos y colegas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = true;" id="autom9" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>10</th>
				<th>Asumo un rol activo en las actividades eclesiales.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = true;" id="autom10" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
		</table>

		<table class="table table-bordered">
			<thead>
				<th>N°</th>
				<th id="items">Items</th>
				<th>Nivel</th>
			</thead>  
			<h5 style="margin-top: 50px;">Responsabilidad y respeto</h5>
			<th>1</th>
			<th>Sostengo mis puntos de vista.</th>
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = true;" id="autor1" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
			</th>
			<tr>    
				<th>2</th> 
				<th>Al tomar una decisión pongo por encima de todo los
					objetivos de la UPeU.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autor2" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>3</th>
				<th>Reconozco y estimulo los logros de mis colegas y alumnos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autor3" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>4</th>
				<th>Al ser convocado(a) a una reunión asisto puntualmente.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autor4" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>5</th>
				<th>Si cometo una injusticia con algún colega o alumno pido
					disculpas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autor5" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>6</th>
				<th>Escucho y tomo en cuenta a todos sin importar su jerarquía.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autor6" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>7</th>
				<th>Si me comentan una situación soy discreto(a).</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autor7" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>8</th>
				<th>No favorezco la crítica dentro de mis colaboradores.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autor8" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>9</th>
				<th>No dejo pasar los errores de mis colegas y alumnos, y se
					los hago ver con una actitud positiva.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autor9" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
		</table>
		

		<table class="table table-bordered">
			<thead>
				<th>N°</th>
				<th id="items">Items</th>
				<th>Nivel</th>
			</thead>
			<h5 style="margin-top: 50px;">Motivación y autoestima</h5>
			<th>1</th>
			<th>Cuando se presenta un problema no me desanimo y procuro
				motivar a mi equipo.</th>
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau1" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
			</th>
			<tr>
				<th>2</th>
				<th>Al presentarse una dificultad me mantengo en la lucha y
					busco alternativas de solución.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau2" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>3</th>
				<th>Si tengo una decisión importante, suelo pedir consejo para
					elegir la mejor alternativa.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau3" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>4</th>
				<th>Cuando las circunstancias no son perfectas, trato de
					corregir y sacar el mejor provecho sin enojarme.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau4" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>5</th>
				<th>Sé renunciar a mis objetivos cuando considero que no van a
					llevar a ningún resultado.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau5" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>6</th>
				<th>Trabajo con mis colegas y alumnos en base a confianza.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau6" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>7</th>
				<th>Pongo atención a los problemas de los demás antes que a los
					propios.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau7" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>8</th>
				<th>Controlo mi enojo en cualquier situación.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau8" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>9</th>
				<th>Permito la expresión de emociones entre mis alumnos y
					colegas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau9" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>  
				<th>10</th>
				<th>Tengo presente que es imprescindible descansar físicamente
					y procuro hacerlo, y motivo a que mis colegas y alumnos lo hagan.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoau10" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
		</table>

		<table class="table table-bordered">
			<thead>
				<th>N°</th>
				<th id="items">Items</th>
				<th>Nivel</th>
			</thead>
			<h5 style="margin-top: 50px;">Equilibrio emocional</h5>
			<th>1</th>
			<th>Respeto el tiempo y el espacio de los demás y procuro no
				interrumpirlos constantemente.</th>
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi1" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
			</th>
			<tr>
				<th>2</th>
				<th>Controlo mis emociones y me muestro sereno.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi2" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>3</th>
				<th>Soy una persona disciplinada y organizada.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi3" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>4</th>
				<th>No justifico la mentira bajo ninguna circunstancia.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi4" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>5</th>
				<th>Soy puntual en la entrada al trabajo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi5" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>6</th>
				<th>Reconozco los sentimientos de mis alumnos y colegas y trato
					de comprenderlos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi6" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
				
			<tr>
				<th>7</th>
				<th>Expreso mi punto de vista con respeto.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi7" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>8</th>
				<th>Soy concreto y preciso en la exposición de mis ideas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi8" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>9</th>
				<th>En el trabajo estoy alegre y disfruto.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi9" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>
				<th>10</th>
				<th>Si le llamo la atención a algún alumno y/o colaborador lo
					hago en privado y con respeto.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 49 || event.keyCode > 53) event.returnValue = false;" id="autoequi10" required="required">
				  <div class="invalid-feedback">
          Por favor introduzca un valor.
        </div> 
				</th>
			<tr>    
		</table>                  
<!-- 	  	<button  type="submit" class="btn btn-outline-success"   -->
<!-- 			style="margin-left: 45%;" id="regis_eva_auto" id="Agregar">      -->
 			<button type="submit" id="Agregar2"  class="btn btn-outline-success" style=" ">Registrar Evaluacion</button>                 
<!-- <input type="submit" value="Registrar  Autoevaluacion"  class="btn btn-outline-success" id="Agregar2"/>       Registrar Autoevaluacion</button>  -->
<!-- 			<button type="submit" id="enviar   _archivo" style="display:none;"></button> -->
			                       
	</form>
	 
	<input  type="hidden" value="<%=(Integer) session.getAttribute("idmodulo_menu")%>" id="idmodulooooo" class="form-control" style="width:100px;"/>                      
	</div> 
	<div>            
	    
Resultado: <input type="text" value="" id="Resultado" name="Resultado" />
<br /> 
</div>  
<!-- <button type="submit" value="Agregar2"  class="btn btn-outline-success" id="Agregar">nose</button>   -->
                    
                          
                             
	</main>       
  
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>  
		<script src="${urlrecursos}/js/script_autoevaluacion.js"></script>     
	   
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<%-- 		<script src="${urlrecursos}/js/jquery.numeric.js"></script> --%>
	<script src="${urlrecursos}/jquery.numeric.js"></script>
	<script type="text/javascript">
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
	                                   
							                                                                 
//							 var resultado = resultado;        
							 alert(resultado);                             
							$("#Resultado").val(resultado);
						});
			});   
	
	
	</script>
	
</body>
</html>