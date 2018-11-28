<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat"%>
<%
   Date dNow = new Date();
   SimpleDateFormat ft = 
   new SimpleDateFormat ("yyyy");
   String currentDate = ft.format(dNow);
%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<title>Crear_Convocatoria</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">


<!-- CSS -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/alertify.min.css"/>
<!-- Default theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/themes/default.min.css"/>
<!-- Semantic UI theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/themes/semantic.min.css"/>
<!-- Bootstrap theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/themes/bootstrap.min.css"/>

<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/materializeMessages.css" rel="stylesheet">
<link href="${urlrecursos}/css/template.css" rel="stylesheet">

<!-- Nuevos link -->

    <!---->
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.min.css">
	 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">

    	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>Crear Convocatoria</h1>

		</div>
	</div>
	<div class="mdl-grid">

          <div class="demo-graphs mdl-shadow--2dp mdl-color--white mdl-cell mdl-cell--12-col"  style="height: 100%;border-radius: 10px">
             <div class="mdl-grid">
               <div class="mdl-cell--12-col" style="height: 50px">
                 
               </div>
             </div>
             <div class="" style="justify-content:center">

             <main class = "mdl-layout__content"  style="width: 100%">
				<section class="container">
					<div class="row">
					<br>
						<article class="col s3"></article>
						<article class="col s6" style=" width: 100px">
							<h3 class="center-align">CONVOCATORIA <%=currentDate%>
							</h3>
							<div class="row">
								<div class="col s12" style="height: 30px">
								</div>
							</div>
<!-- 							<form method="POST" action="guardarConvocatoria">  -->
								<div class="input-field">
									<i class="material-icons prefix">date_range</i>
									<input type = "date" class = "datepicker" placeholder="Placeholder" id="fecha_inicio"  name="fecha_inicio" />
									<label class="active" for="nombre">Fecha Inicio</label>
								</div>
								<div class="input-field">
									<i class="material-icons prefix">date_range</i>
									<input type = "date" placeholder="Placeholder" class = "datepicker" id="fecha_fin" name="fecha_fin" />
									<label class="activator" >Fecha Fin</label>
						        </div>
								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="perido">Periodo</label>
									<input type="text" name="perido" id="perido" >
								</div>
								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="nombre">Nombre de periodo</label>
									<input type="text" name="nombre" id="nombre" >
								</div>
<!-- 								<div class="input-field"> -->
<!-- 									<i class="material-icons prefix">date_range</i> -->
<!-- 									<label for="nombre">Fecha Registro</label> -->
<!-- 									<input type = "date" placeholder="Placeholder" class = "datepicker" id="nombre" class="validate"/> -->
<!-- 								</div> -->

								<div class="input-field">
									<i class="material-icons prefix">date_range</i>
									<label for="apellido">Fecha inicio recepcion legajo</label>
									<input type = "date" placeholder="Placeholder" class = "datepicker" id="Fecha_inici_legajo" name="Fecha_inici_legajo" />
								</div>

								<div class="input-field">
									<i class="material-icons prefix">date_range</i>
									<label for="apellido">Fecha fin recepcion legajo</label>
									<input type = "date" placeholder="Placeholder" class = "datepicker" id="fecha_fin_legajo"  name="fecha_fin_legajo" />
								</div>
								<br>
								
								<div class="row">
								<p class="col s6">
									<button class="btn waves-effect" type="reset" id="Limpiar" style="background-color: #C62828"><i class="material-icons right">close</i>Limpiar</button>
								</p>
								<p class="col s6">
									<button class="btn waves-effect" id="enviarcon"><i class="material-icons right">send</i>enviar</button>
								</p>
								</div>
						</article>
						<article class="col s3">
							<div class="">
								<a href="#modal1" class="waves-effect waves-light btn modal-trigger">Ver Convocaotia</a>
								<div class="modal modal-fixed-footer" id="modal1">
									<div class="modal-content">
								      <h4>Lista de Convocatorias</h4>
								      <%int i=0;%>
								      <table class="">
										<thead>
											<tr>
											    <th class="left-align">N°</th>
											    <th class="center-align">Nombre de la Sumilla</th>
											    <th class="left-align">Nombre del Periodo</th>
											   	<th class="left-align">Porcentaje</th>	
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${list}" var="ins">
												<%i++; %>
												<tr>
													<th scope="row"><%=i %></th>
													<td>${ins.nombre}</td>
													<td>${ins.fecha_inicio}</td>
													<td>${ins.fecha_fin}</td>		
												</tr>
											</c:forEach>
										</tbody>
									</table>
								    </div>
								    <div class="modal-footer">
								      <a href="#!" class="modal-close waves-effect waves-green btn-flat">Salir</a>
								    </div>
								</div>
							</div>    
						</article>
					</div>
				</section>
             </main>
             </div>	
            </div>
        </div>
       </main>
    <script src="https://code.jquery.com/jquery-2.2.4.min.js" ></script>    
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
   	<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
    <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script src="${urlrecursos}/js/jquery-3.2.1.min.js" type="text/javascript"></script>
    
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
   	<script src="${urlrecursos}/js/materializeMessages.js" type="text/javascript"></script>
	
    <!-- JavaScript -->
	<script src="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/alertify.min.js"></script>
	<script type="text/javascript">
// 	$('.modal-trigger').leanModal();
	 document.addEventListener('DOMContentLoaded', function() {
		    var elems = document.querySelectorAll('.modal');
		    var instances = M.Modal.init(elems);
		  });
	</script>
	<script src="${urlrecursos}/js/convocatoria.js" type="text/javascript"></script>
	
</body>
</html>