<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">        
<head>
<title>Evaluacion PARES</title>
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

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.2/css/all.css"
	integrity="sha384-/rXc/GQVaYpyDdyxK+ecHPVYJSN9bmVFBvjA/9eOB+pb3F2w2N6fc5qB9Ew5yIns"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
<link href="${urlrecursos}/js/jquery.numeric.js">

</head>

<body>
	<jsp:include page="template/cabezera.jsp"></jsp:include>
	<jsp:include page="template/menu.jsp"></jsp:include>   
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>Evaluacion Pares</h1>

		</div>

	</div>
	<div style="width: 80%; margin-left: 100px;"
		class="shadow-lg p-3 mb-5 bg-white rounded">
		<table class="table table-bordered" style="margin-top: 20px;">
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
				su trabajo docente en los próximos años y sabe qué hacer para
				lograrlo.</th>
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 15 || event.keyCode > 57) event.returnValue = false;">
			</th>
			<tr>
				<th>2</th>
				<th>Planifica su trabajo y las acciones que realiza están
					alineadas a sus objetivos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>3</th>
				<th>Se involucra en el trabajo junto con nosotros y conoce
					nuestras metas personales y profesionales de ellos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>4</th>
				<th>Fomenta el trabajo en equipo y escucha nuestras opiniones.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>5</th>
				<th>Asume las consecuencias de las decisiones que toma sin
					culpar a otros de las consecuencias.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>6</th>
				<th>Es un ejemplo de las actitudes y conductas que exige a
					otros.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>7</th>
				<th>Expone o expresa claramente qué objetivos se deben lograr y
					qué se espera de cada uno de nosotros.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>8</th>
				<th>En las tareas importantes permanece con nosotros y se
					involucra en el trabajo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>9</th>
				<th>Motiva nuestro desarrollo espiritual.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>10</th>
				<th>Asume un rol activo en las actividades eclesiales.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th colspan="2  ">Subtotal</th>
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
			<tr>
				<th>2</th>
				<th>Al tomar una decisión pone por encima de todo los objetivos
					de la UPeU.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>3</th>
				<th>Reconoce y estimula nuestros logros y nos felicita.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>4</th>
				<th>Al ser convocado(a) a una reunión asiste puntualmente.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>5</th>
				<th>Si comete una injusticia con alguno de nosotros, se
					disculpa.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>6</th>
				<th>Escucha y toma en cuenta a todos sin importar su jerarquía.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>7</th>
				<th>Si le comentan una situación es discreto(a).</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>8</th>
				<th>No permite la crítica negativa entre nosotros.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>9</th>
				<th>No permite la crítica negativa entre nosotros.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
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
				motivarnos.</th>
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>2</th>
				<th>Ante las dificultades se mantiene en la lucha y busca
					alternativas de solución.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>3</th>
				<th>Sabe pedir consejos y toma en cuenta la mejor alternativa
					frente a decisiones.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>4</th>
				<th>Cuando las cosas no salen como quiere, no se irrita y busca
					alternativas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>5</th>
				<th>Sabe renunciar a una tarea cuando ésta no va a llevar a
					buen resultado.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>6</th>
				<th>Confía en mi trabajo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>7</th>
				<th>Atiende a mis problemas por encima de los suyos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>8</th>
				<th>Sabe controlar su enojo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>9</th>
				<th>Permite la expresión de emociones.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>10</th>
				<th>Sabe equilibrar entre el trabajo y el descanso.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
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
			<th>Respeta el tiempo y el espacio de los demás y procura no
				interrumpirlos constantemente.</th>
			<th><input class="form-control" type="text" class="validar"
				maxlength="1" style="text-align: center;"
				onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>2</th>
				<th>Controla sus emociones y se muestra sereno(a).</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>3</th>
				<th>Es una persona disciplinada y organizada.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>4</th>
				<th>No justifica la mentira bajo ninguna circunstancia.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>5</th>
				<th>Es puntual en la entrada al trabajo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>6</th>
				<th>Entiende nuestros sentimientos y trata de comprenderlos.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>7</th>
				<th>Expresa su punto de vista con respeto.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>8</th>
				<th>Es concreto(a) y preciso(a) en la exposición de sus ideas.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>9</th>
				<th>Es alegre y favorece el buen ambiente en el trabajo.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
			<tr>
				<th>10</th>
				<th>Al llamar la atención lo hace con respeto y en privado.</th>
				<th><input class="form-control" type="text" class="validar"
					maxlength="1" style="text-align: center;"
					onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;">
					<tr>
				<th colspan="2">Subtotal</th>
				<th colspan="2"><input class="form-control" readonly="readonly"></th>
			
			<tr>
		
		</table>
			<button type="button" class="btn btn-outline-success" 
			style="margin-left: 45%;">Registrar Evaluacion </button>
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