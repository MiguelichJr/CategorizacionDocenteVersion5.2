ik<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<legend style="text-align: center">Publicaciones</legend>
		<hr>  
		<legend>       
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Art�culos
		</legend>
		<hr>
		   
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>A�o Publicaci�n</label> <input id="anio15" style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Tipo de Publicaci�n</label>   
							<div class="select">
								<select style="text-align: center" id="categria_Atributo15" class="form-control">
									<c:forEach items="${lista_tipopublicaciones}" var="pr">

										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>
 
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>T�tulo</label> <input id="titulo15"
								style="text-align: center" type="text" class="form-control">
  
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center;margin-top:-22px">                
							<label>Medio de Comunicaci�n(Nombre)</label><input id="nombremedio15"
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
							<label>Editorial</label> <input id="editorial15" style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>ISBN</label><input  id="isbn15" 
								style="text-align: center" type="text" class="form-control">
							
						</div>
					</div>   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>N� de P�ginas</label> <input id="npaginas15" 
								style="text-align: center" type="text" class="form-control">

						</div>
					</div>  
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label><input id="lugar15" 
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
						<div class="form-group" style="text-align: center"></div>
					</div>
					<div class="col-sm-6 ">
						<div class="row">
							<div class="col-sm-1">
								<div class="form-group" style="text-align: center"></div>
							</div>
							<div class="col-sm-10">
							<form method="post" action="/cat/guardar_img_articuloo" enctype="multipart/form-data">
								<div class="form-group" style="text-align: center">
									<label>Archivo</label> <input id="archi15" name="archi15" style="text-align: center"
										type="file" class="form-control"> 
									<input type="hidden" value="" name="id15" id="id_articulosss">
							<button type="submit" id="enviar_archivo15"  style="display:none;"></button> 
								</div>
							</form> 
							</div>
							<div class="col-sm-1">
								<div class="form-group" style="text-align: center"></div>
							</div>
						</div>


					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center"></div>
					</div>
				</div>

				<div class="col-sm-3">
					<div class="form-group" style="text-align: center"></div>
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

									<button id="registrar_articulos"  class="btn btn-primary btn-block"
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
		<table id="tablearituclos" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>  
					<th scope="col">A�o</th>
					<th scope="col">Tipo</th>
					<th scope="col">T�tulo</th>  
					<th scope="col">Medio Comunicacion</th> 
					<th scope="col">Editorial</th> 
					<th scope="col">ISBN</th>        
					<th scope="col">N� de P�ginas</th>
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
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Libros   
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
							<label>A�o Publicaci�n</label> <input id="anio20" style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Titulo</label> <input id="titulo20" style="text-align: center"
								type="text" class="form-control">

						</div>     
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Tipo de Publicaci�n</label>
							<div class="select">
								<select  id="cate20" style="text-align: center" class="form-control">
									<c:forEach items="${lista_tipopublicaciones_espe}" var="pr">
  
										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Editorial</label>          
							<input id="editorial20"
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
							<label>ISBN</label> <input id="isbn20" style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>N� de P�ginas</label> <input id="npaginas20" style="text-align: center"
								type="text" class="form-control">
   
						</div>     
					</div>
					
					<div class="col-sm-6">
					<form method="post" action="/cat/guardar_img_libros" enctype="multipart/form-data">
						<div class="form-group" style="text-align: center">
							<label>Archivo</label>           
							<input id="archivo20" name="archi20"
								style="text-align: center" type="file" class="form-control">
							 <input type="hidden" value="" name="id20" id="id_libros">
							<button type="submit" id="enviar_archivo20"  style="display:none;"></button>  
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

									<button id="registrar_libros" class="btn btn-primary btn-block"
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
		<table id="tablelibros" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">A�o de Publicaci�n</th>
					<th scope="col">T�tulo</th>
					<th scope="col">Tipo de Publicaci�n</th>
					<th scope="col">Editorial</th>   
					<th scope="col">ISBN</th>   
					<th scope="col">N� de P�ginas</th>   
					<th scope="col">Archivo</th>                 
					<th scope="col" colspan="2">Acci�n</th>  
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>

</div> 

      <input  type="hidden" value="<%=(Integer) session.getAttribute("idmodulo_menu")%>" id="idmodulooooo" class="form-control" style="width:100px;"/>
	  
	<input  type="hidden" id="idprofe" value="<%=(Integer) session.getAttribute("iddocenteconvocatoria")%>">     	
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