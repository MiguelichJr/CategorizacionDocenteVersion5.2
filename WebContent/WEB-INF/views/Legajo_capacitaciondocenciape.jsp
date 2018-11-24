<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>  
<html lang="es"> 
<head>
<title>Capacitacion en la Docencia</title> 
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
			<h1>Actualizacion Docente Profesional</h1>

		</div>    
	</div>
	  
	<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center">Capacitacion en la
			Docencia en los últimos 5 años</legend>
		<hr>
		<!-- Text input-->
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Entidad Organizadora</label>          
							<div class="select">
								<select style="text-align: center" class="form-control" id="insti15">
									<c:forEach items="${lista_institucion}" var="pr">
  
										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach>
								</select>
							</div>
						</div> 
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Nombre del Evento</label> <input id="nombrevento15" style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Inicio</label> <input id="fi15"
								style="text-align: center" type="date" class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Fin</label> <input  id="ff15" 
								style="text-align: center" type="date" class="form-control">

						</div>
					</div>
				</div>
			</div>
			<div class="col-1"></div>

		</div>
		   
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
							<label>Horas</label> <input  id="h15" style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
							<label>Creditos</label> <input id="c15" style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input id="l15"
								style="text-align: center" type="text" class="form-control">

						</div>          
					</div>
					<div class="col-sm-5">  
					<form method="post" action="/cat/guardar_img_capcitaciondocenciasjdn" enctype="multipart/form-data">   
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input  id="archi15" name="archi15"        
								style="text-align: center" type="file" class="form-control">
							<input type="hidden" value="" name="id15" id="id_capcitaciondocenciaasj">
							<button type="submit" id="enviar_archivo15" style="display:none;"></button>     
							
						</div>
					</form>
					</div>
				</div>
			</div>
			<div class="col-1"></div>

		</div>          

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
 
									<button id="registrar_capcianios" class="btn btn-primary btn-block"
										style="background-color: #992e45; border-top: #992e45; border-right: #992e45; border-bottom: #992e45; border-left: #992e45">
										REGISTRAR</button>
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
		<div class="col-1"></div>

		<!--lista de todo los registros -->
		<table id="tablecapacitaciones5anios" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th> 
					<th scope="col">Entidad Organizadora</th>
					<th scope="col">Nombre del Evento</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Fin</th>
					<th scope="col">Horas</th>
					<th scope="col">Creditos</th>
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>     
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>
 
			</tbody>
		</table>
	</div>  	
	<input  id="idprofe" value="1"/>
           
	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>   
	<script src="${urlrecursos}/js/main.js"></script>            
	<script src="${urlrecursos}/js/script_expediente_actualizaciondocente.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		   
	</script>
</body>
</html>