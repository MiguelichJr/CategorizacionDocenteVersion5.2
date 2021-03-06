<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es"> 
<head>
<title>Perfeccionamiento Profesional</title> 
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
		style="border-radius: 20px; background-color: white; padding: 10px">
		<!-- Form Name -->
		<legend style="text-align: center">Capacitacion y
			Perfeccionamiento Profesional en los �ltimos 5 a�os</legend>
		<hr>
		<legend>    
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Ponencias
			en Congresos, Seminarios u Otros
		</legend>
		<hr>
		<!-- Text input-->
		<%--
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="col-sm-2">
					<div class="form-group">
						<div class="select" style="margin-top: 5px; text-align: center">
							<select style="text-align: center" name="idcategoria"
								class="form-control">
								<c:forEach items="${listacategoria}" var="pr">

									<option value="${pr.idcategoria}" style="text-align: center">${pr.nom_categoria}</option>

								</c:forEach>
							</select>
						</div>   
					</div>
				</div>
				<div class="col-sm-10"></div>


			</div>
			<div class="col-1"></div>


		</div>
		--%>
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>A�o</label> <input id="anio18" style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Ponencia</label>
							<div class="select">
								<select id="categoria18" style="text-align: center" class="form-control">
									<c:forEach items="${lista_tipoponencia}" var="pr">
       
										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Nombre del Evento</label> <input id="nombre_even18"
								style="text-align: center" type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Entidad Organizadora</label>       
							<div class="select">
								<select id="insti18" style="text-align: center" class="form-control">
									<c:forEach items="${lista_institucion}" var="pr">
    
										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach>
								</select>
							</div>
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
							<label>Horas</label> <input id="h18" style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
							<label>Creditos</label> <input id="c18" style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input id="l18"
								style="text-align: center" type="text" class="form-control">

						</div>        
					</div>
					<div class="col-sm-5">
					<form method="post" action="/cat/guardar_img_ponenciascongresos" enctype="multipart/form-data">     
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input    id="u18"   name="archi18"
								style="text-align: center" type="file" class="form-control">
							<input type="hidden" value="" name="id18" id="id_enlasponenecias">
							<button type="submit" id="enviar_archivo18" style="display:none;"></button>     
							 
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
     
									<button id="registrar_ponenciasencongresos" class="btn btn-primary btn-block"
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
			<div class="col-1"></div>
		</div>    
		
	          

		<!--lista de todo los registros -->
		<table id="tableponencias" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>  
					<th scope="col">A�o</th>
					<th scope="col">Ponencia</th>
					<th scope="col">Nombre del Evento</th>
					<th scope="col">Entidad Organizadora</th>
					<th scope="col">Horas</th>
					<th scope="col">Creditos</th>
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>     
					<th scope="col" colspan="2">Acci�n</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>

 

		<%-- EL mismo pero otro subtipo --%>

		<hr>
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Organizaci�n
			de Eventos Acad�micos
		</legend>
		<hr>
		<!-- Text input-->
		  
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>A�o</label> <input id="anio14" style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha</label> <input id="fecha14" style="text-align: center"
								type="date" class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Nombre del Evento</label> <input id="nombreevento14"
								style="text-align: center" type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Entidad Organizadora</label>       
							<div class="select">
								<select style="text-align: center" class="form-control" id="insti14">
									<c:forEach items="${lista_institucion}" var="pr">
    
										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach>
								</select>
							</div>
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
							<label>Horas</label> <input style="text-align: center"
								type="text" class="form-control" id="horas14">

						</div>
					</div>
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
							<label>Creditos</label> <input style="text-align: center"
								type="text" class="form-control" id="creditos14">

						</div>
					</div>   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input id="lugar14"
								style="text-align: center" type="text" class="form-control">

						</div>        
					</div>
					<div class="col-sm-5">
					<form method="post" action="/cat/guardar_img_eventosacademicos" enctype="multipart/form-data"> 
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input id="archi14" name="archi14"         
								style="text-align: center" type="file" class="form-control">
							<input type="hidden" value="" name="id14" id="id_eventosacademicossss">
							<button type="submit" id="enviar_archivo14" style="display:none;"></button>     
							   	
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
     	   
									<button id="registrar_eventos_academicos" class="btn btn-primary btn-block"
										style="background-color: #992e45; border-top: #992e45; border-right: #992e45; border-bottom: #992e45; border-left: #992e45">
										REGISTRAR
										</button>
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
		<table id="tableeventosacademicos"  class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">A�o</th>
					<th scope="col">Fecha</th>
					<th scope="col">Nombre del Evento</th>
					<th scope="col">Entidad Organizadora</th>
					<th scope="col">Horas</th>
					<th scope="col">Creditos</th>
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>                
					<th scope="col" colspan="2">Acci�n</th>  
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table> 





		<hr>
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Capacitaci�n
			Formal Certificada
		</legend>
		<hr>
		<!-- Text input-->
		 
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>A�o</label> <input style="text-align: center" type="text"
								class="form-control" id="anio20">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Tipo Capacitacion</label>          
							<div class="select">
								<select id="cate20" style="text-align: center" class="form-control">
									<c:forEach items="${lista_tipocapacitacion}" var="pr">
  
										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
								</select>
							</div>
						</div> 
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Nombre del Evento</label> <input id="ne20"
								style="text-align: center" type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Entidad Organizadora</label>          
							<div class="select">
								<select id="entidad20" style="text-align: center" class="form-control">
									<c:forEach items="${lista_institucion}" var="pr">
  
										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach>
								</select>
							</div>
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
							<label>Horas</label> <input id="h20" style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
							<label>Creditos</label> <input id="cre20" style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input id="l20"
								style="text-align: center" type="text" class="form-control">

						</div>        
					</div>
					<div class="col-sm-5"> 
					<form method="post" action="/cat/guardar_img_formalcertifi" enctype="multipart/form-data">    
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input id="archi20" name="archi20"      
								style="text-align: center" type="file" class="form-control">
								<input type="hidden" value="" name="id20" id="id_formalcertficada"> 
							<button type="submit" id="enviar_archivo20" style="display:none;"></button>     
							
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

									<button id="registrar_formalcertifici" class="btn btn-primary btn-block"
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
		<table id="tableforceertiiii" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">A�o</th>
					<th scope="col">Tipo de Capacitacion</th>
					<th scope="col">Nombre del Evento</th>
					<th scope="col">Entidad Organizadora</th>
					<th scope="col">Horas</th>
					<th scope="col">Creditos</th>
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>   
					<th scope="col" colspan="2">Acci�n</th>
				</tr>
			</thead>   
			<tbody>

			</tbody>
		</table>

	</div>
    

    
	<input type="hidden"  id="idprofe" value="<%=(Integer) session.getAttribute("iddocenteconvocatoria")%>"/>
    <input type="hidden" value="<%=(Integer) session.getAttribute("idmodulo_menu")%>" id="idmodulooooo" class="form-control" style="width:100px;"/>
	        
	</main>
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>   
	<script src="${urlrecursos}/js/main.js"></script> 
	
    <script src="${urlrecursos}/js/privilegio.js"></script>            
	<script src="${urlrecursos}/js/script_expediente_actualizaciondocente.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		   
	</script>  
</body>
</html>