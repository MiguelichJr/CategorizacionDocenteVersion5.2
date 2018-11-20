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
			<h1>Auto-Evaluación</h1>

		</div>

	</div>


	   
	<div style="width: 80%; margin-left: 100px;"   
		class="shadow-lg p-3 mb-5 bg-white rounded">

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
			<th><input class="form-control"></th>
			    
			<tr>
				<th>2</th>
				<th>Planifico mi trabajo y las acciones que se realizan están
					alineadas a los objetivos.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>3</th>
				<th>Me involucro en el trabajo de mis colaboradores y/o
					colegas, y conozco sus metas personales y profesionales.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>4</th>
				<th>Fomento el trabajo en equipo y escucho la opinión de mis
					colegas.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>5</th>
				<th>Asumo las consecuencias de las decisiones que tomo sin
					culpar a otros de las consecuencias.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>6</th>
				<th>Soy un ejemplo de las actitudes y conductas que exijo a mis
					alumnos y colegas.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>7</th>
				<th>Expongo a mis alumnos lo que espero de cada uno y les
					expreso claramente qué objetivos se deben lograr.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>8</th>
				<th>En las tareas importantes permanezco con mis colegas y
					alumnos, y me involucro en el trabajo.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>9</th>
				<th>Motivo el desarrollo espiritual de mis alumnos y colegas.</th>
				<th><input class="form-control"></th>
				   
			<tr>
				<th>10</th>
				<th>Asumo un rol activo en las actividades eclesiales.</th>
				<th><input class="form-control"></th>
				  
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
			<th><input class="form-control"></th>
			
			<tr>
				<th>2</th>
				<th>Al tomar una decisión pongo por encima de todo los
					objetivos de la UPeU.</th>
				<th><input class="form-control"></th>
				        
			<tr>
				<th>3</th>
				<th>Reconozco y estimulo los logros de mis colegas y alumnos.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>4</th>
				<th>Al ser convocado(a) a una reunión asisto puntualmente.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>5</th>
				<th>Si cometo una injusticia con algún colega o alumno pido
					disculpas.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>6</th>
				<th>Escucho y tomo en cuenta a todos sin importar su jerarquía.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>7</th>
				<th>Si me comentan una situación soy discreto(a).</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>8</th>
				<th>No favorezco la crítica dentro de mis colaboradores.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>9</th>
				<th>No dejo pasar los errores de mis colegas y alumnos, y se
					los hago ver con una actitud positiva.</th>
				<th><input class="form-control"></th>
				
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
			<th><input class="form-control"></th>
			
			<tr>
				<th>2</th>
				<th>Al presentarse una dificultad me mantengo en la lucha y
					busco alternativas de solución.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>3</th>
				<th>Si tengo una decisión importante, suelo pedir consejo para
					elegir la mejor alternativa.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>4</th>
				<th>Cuando las circunstancias no son perfectas, trato de
					corregir y sacar el mejor provecho sin enojarme.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>5</th>
				<th>Sé renunciar a mis objetivos cuando considero que no van a
					llevar a ningún resultado.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>6</th>
				<th>Trabajo con mis colegas y alumnos en base a confianza.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>7</th>
				<th>Pongo atención a los problemas de los demás antes que a los
					propios.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>8</th>
				<th>Controlo mi enojo en cualquier situación.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>9</th>
				<th>Permito la expresión de emociones entre mis alumnos y
					colegas.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>10</th>
				<th>Tengo presente que es imprescindible descansar físicamente
					y procuro hacerlo, y motivo a que mis colegas y alumnos lo hagan.</th>
				<th><input class="form-control"></th>
				
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
			<th><input class="form-control"></th>
			
			<tr>
				<th>2</th>
				<th>Controlo mis emociones y me muestro sereno.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>3</th>
				<th>Soy una persona disciplinada y organizada.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>4</th>
				<th>No justifico la mentira bajo ninguna circunstancia.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>5</th>
				<th>Soy puntual en la entrada al trabajo.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>6</th>
				<th>Reconozco los sentimientos de mis alumnos y colegas y trato
					de comprenderlos.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>7</th>
				<th>Expreso mi punto de vista con respeto.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>8</th>
				<th>Soy concreto y preciso en la exposición de mis ideas.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>9</th>
				<th>En el trabajo estoy alegre y disfruto.</th>
				<th><input class="form-control"></th>
				
			<tr>
				<th>10</th>
				<th>Si le llamo la atención a algún alumno y/o colaborador lo
					hago en privado y con respeto.</th>
				<th><input class="form-control"></th>
				
			<tr>
		</table>
	</div>           
	   


	</main>





	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		
		if (document.location.hostname == 'pratikborsadiya.in') {
			(function(i, s, o, g, r, a, m) {
				i['GoogleAnalyticsObject'] = r;
				i[r] = i[r] || function() {
					(i[r].q = i[r].q || []).push(arguments)
				}, i[r].l = 1 * new Date();
				a = s.createElement(o), m = s.getElementsByTagName(o)[0];
				a.async = 1;
				a.src = g;
				m.parentNode.insertBefore(a, m)
			})(window, document, 'script',
					'//www.google-analytics.com/analytics.js', 'ga');
			ga('create', 'UA-72504830-1', 'auto');
			ga('send', 'pageview');
		}
	</script>
</body>
</html>