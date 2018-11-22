<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es"> 
<head>
<title>Investigacion</title>  
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
			<h1>Investigacion y Aporte al Conocimiento</h1>

		</div>           
	</div>
	
	
	 
<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center">Asesoria de Tesis y Trabajos de Investigación</legend>
		<hr>
		<!-- Text input-->
		 <div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Año Inicio</label> <input id="anio21" style="text-align: center" type="text"
								class="form-control">
  
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Nivel de Asesoria</label>
							<div class="select">
								<select id="cate21" style="text-align: center" class="form-control">
									<c:forEach items="${lista_nivelasesoria}" var="pr">
   
										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
								</select>
							</div>       
						</div>     
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Nombre de la Tesis</label>
							 <input   id="nombre21"
								style="text-align: center" type="text" class="form-control">
							     
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Autor</label>              
							<input id="autor21"
								style="text-align: center" type="text" class="form-control">
							  
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
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Especialidad</label>
							<div class="select">
								<select id="espe21" style="text-align: center" class="form-control">
									<c:forEach items="${lista_especialidad}" var="pr"> 
  
										<option value="${pr.idespc}" style="text-align: center">${pr.nombre_especialidad}</option>

									</c:forEach>
								</select>
							</div>  
  
						</div>
					</div>
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
							<label>Año</label> <input id="anio212" style="text-align: center"
								type="text" class="form-control">
      
						</div>     
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Resolución</label>   
							<input id="reso21"
								style="text-align: center" type="text" class="form-control">
							
						</div>
					</div>
					<div class="col-sm-4">
					<form method="post" action="/cat/guardar_img_asesoriatesis" enctype="multipart/form-data">         
						<div class="form-group" style="text-align: center">
							<label>Archivo</label>           
							<input id="archi21" name="archi21"       
								style="text-align: center" type="file"  class="form-control">
							 <input type="hidden" value="" name="id21" id="id_asesoriatesis">
							<button type="submit" id="enviar_archivo21" style="display:none;"></button> 
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
 
									<button id="registrar_asesoramiento" class="btn btn-primary btn-block"
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
		<table id="tableasesoramiento" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th> 
					<th scope="col">Año Inicio</th>
					<th scope="col">Nivel de Asesoria</th>
					<th scope="col">Nombre de la Tesis</th>    
					<th scope="col">Autor</th>
					<th scope="col">Especialidad</th>
					<th scope="col">Año</th>
					<th scope="col">Resolución</th>
					<th scope="col">Archivo</th>           
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
	</div>      
	<input type="text" id="idprofe" value="1">     	
	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>            
	<script src="${urlrecursos}/js/script_expediente_investigacionyaporte.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		
	</script>
</body>
</html>