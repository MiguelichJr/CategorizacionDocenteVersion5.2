<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">  
<head>
<title>Evaluacion Administradores</title>

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
			<h1 style="text-align: center">Evaluación Administradores</h1>

		</div>  

	</div>    

	<div style="width: 80%; margin-left: 100px;"
		class="shadow-lg p-3 mb-5 bg-white rounded">


		<div style="margin-bottom: 10px;">Coloque en la tercera columna
			el puntaje de acuerdo al nivel que usted considere conveniente,
			considerando que 0=Nada, 1=Raras veces, 2=A veces, 3=A menudo, 4=Casi
			siempre y 5=Siempre.</div>


		<table class="table table-bordered"
			style="margin-top: 20px; border-radius: 20px">
			<thead>
				<th>N°</th>
				<th style="width: 80%;">Items</th>
				<th>Nivel</th>
			</thead>
			<tbody id="data">
			</tbody>

			<h5>Perspectiva: Misión y visión</h5>
			<th>1</th>
			<th>Tiene la visión clara sobre cómo debe progresar cada vez más
				en su trabajo como docente en los próximos años y sabe que hacer
				para lograrlo.1112</th>
			<th><input class="form-control" type="text" class="validar"           
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode  < 0011|| event.keyCode > 0011) event.returnValue = false;">                              
			</th>        
			<tr>                      
				<th>2</th>      
				<th>Planifica su trabajo y las acciones que realiza están
					alineadas a sus objetivos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>3</th>
				<th>Se involucra en el trabajo de sus colaboradores y/o colegas
					y conoce las metas personales y profesionales de ellos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>4</th>
				<th>Fomenta el trabajo en equipo y escucha la opinión de mis
					colegas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>5</th>
				<th>Asume las consecuencias de las decisiones que toma sin
					culpar a otros de las consecuencias.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>6</th>
				<th>Es un ejemplo de las actitudes y conductas que exijo a mis
					alumnos y colegas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>7</th>
				<th>Expone a sus alumnos lo que espera de cada uno y les
					expresa claramente qué objetivos se deben lograr.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>8</th>
				<th>En las tareas importantes permanece con sus colegas y
					alumnos, y se involucra en el trabajo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>9</th>
				<th>Motiva el desarrollo espiritual de sus alumnos y colegas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>10</th>
				<th>Asume un rol activo en las actividades eclesiales.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th colspan="2">Subtotal</th>
				<th colspan="2"><input class="form-control" readonly="readonly"></th>
			<tr>
		</table>

		<table class="table table-bordered">
			<thead>
				<th>N°</th>
				<th style="width: 80%;">Items</th>
				<th>Nivel</th>
			</thead>
			<h5 style="margin-top: 50px;">Responsabilidad y respeto</h5>
			<th>1</th>
			<th>Sabe defender sus puntos de vista.</th>
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			</th>
			<tr>
				<th>2</th>
				<th>Al tomar una decisión pone por encima de todo los objetivos
					de la UPeU.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>3</th>
				<th>Reconoce y estimula los logros de sus colegas y alumnos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>4</th>
				<th>Al ser convocado(a) a una reunión asiste puntualmente.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>5</th>
				<th>Si comete una injusticia con algún colega o alumno pide
					disculpas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>6</th>
				<th>Escucha y toma en cuenta a todos sin importar su jerarquía.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>7</th>
				<th>Si le comentan una situación es discreto(a).</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>8</th>
				<th>No favorece la crítica dentro de sus colegas o alumnos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>9</th>
				<th>No deja pasar los errores de sus colegas y alumnos y se los
					hace ver con una actitud positiva.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th colspan="2">Subtotal</th>
				<th colspan="2"><input class="form-control" readonly="readonly"></th>
			<tr>
		</table>
		</table>

		<table class="table table-bordered">
			<thead>
				<th>N°</th>
				<th style="width: 80%;">Items</th>
				<th>Nivel</th>
			</thead>
			<h5 style="margin-top: 50px;">Motivación y autoestima</h5>
			<th>1</th>
			<th>Cuando se presenta un problema no se desanima y procura
				motivar a su equipo.</th>
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			</th>
			<tr>
				<th>2</th>
				<th>Al presentarse una dificultad se mantiene en la lucha y
					busca alternativas de solución.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>3</th>
				<th>Si tiene una decisión importante, suele pedir consejo para
					elegir la mejor alternativa.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>4</th>
				<th>Cuando las circunstancias no son perfectas, trata de
					corregir y sacar el mejor provecho sin enojarse.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>5</th>
				<th>Sabe renunciar a sus objetivos cuando considera que no va a
					llevar a ningún resultado.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>6</th>
				<th>Trabaja con sus colegas o alumnos en base a confianza.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>7</th>
				<th>Pone atención a los problemas de los demás antes que a los
					propios.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>8</th>
				<th>Controla su enojo en cualquier situación.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>9</th>
				<th>Permite la expresión de emociones entre sus alumnos o
					colegas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>10</th>
				<th>Tiene presente que es imprescindible descansar físicamente
					y procura hacerlo, y motiva a que sus colegas o alumnos lo hagan.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th colspan="2">Subtotal</th>
				<th colspan="2"><input class="form-control" readonly="readonly"></th>
			<tr>
		</table>

		<table class="table table-bordered">
			<thead>
				<th>N°</th>
				<th style="width: 80%;">Items</th>
				<th>Nivel</th>
			</thead>
			<h5 style="margin-top: 50px;">Equilibrio emocional</h5>
			<th>1</th>
			<th>Respeta el tiempo y el espacio de los demás, y procura no
				interrumpirlos constantemente.</th>
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			</th>
			<tr>
				<th>2</th>
				<th>Controla sus emociones y se muestra sereno(a).</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>3</th>
				<th>Es una persona disciplinada y organizada.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>4</th>
				<th>No justifica la mentira bajo ninguna circunstancia.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>5</th>
				<th>Es puntual en la entrada al trabajo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>6</th>
				<th>Reconoce los sentimientos de sus alumnos o colegas, y trata
					de comprenderlos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>7</th>
				<th>Expresa su punto de vista con respeto.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>8</th>
				<th>Es concreto(a) y preciso(a) en la exposición de sus ideas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>9</th>
				<th>En el trabajo es alegre y disfruta del trabajo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th>10</th>
				<th>Si llama la atención a algún alumno y/o colaborador lo hace
					en privado y con respeto.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
				</th>
			<tr>
				<th colspan="2">Subtotal</th>
				<th colspan="2"><input class="form-control" readonly="readonly"></th>
			<tr>
		</table>     
		<button type="button" class="btn btn-outline-success"
			style="margin-left: 45%;">Registrar Evaluacion</button>
	</div>

<input  type="hidden" value="<%=(Integer) session.getAttribute("idmodulo_menu")%>" id="idmodulooooo" class="form-control" style="width:100px;"/>                      
	 
	</main>

	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/jquery.numeric.js"></script>

	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script> 
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
     

 
</script>   


</body>
</html>
 