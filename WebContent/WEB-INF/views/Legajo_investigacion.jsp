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
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>Investigacion y Aporte al Conocimiento</h1>

		</div>
	</div>
	
	
	<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center">Investigaciones en los �ltimos 5 a�os</legend>
		<hr>
		<!-- Text input-->
		<div class="row">
			<div class="col-2"></div>
			<div class="col-9">
				<div class="row">
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">          
							<label>A�o</label> <input style="text-align: center"
								type="text" class="form-control">
						</div> 
					</div>
					<div class="col-sm-5">   
						<div class="form-group" style="text-align: center">
							<label>Titulo</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>  
					<div class="col-sm-4">      
						<div class="form-group" style="text-align: center">
							<label>N� Resoluci�n</label> <input
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
								<div class="form-group" style="text-align: center">
									<label>Archivo</label> <input style="text-align: center"
										type="file" class="form-control">

								</div>
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

									<button class="btn btn-primary btn-block"
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
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th> 
					<th scope="col">A�o</th>
					<th scope="col">Titulo</th>
					<th scope="col">N� Resoluci�n</th>    
					<th scope="col">Archivo</th>     
					<th scope="col" colspan="2">Acci�n</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
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
							<label>A�o Publicaci�n</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Tipo de Publicaci�n</label>   
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_tipopublicaciones}" var="pr">

										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>
 
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>T�tulo</label> <input
								style="text-align: center" type="text" class="form-control">
  
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center;margin-top:-22px">                
							<label>Medio de Comunicaci�n(Nombre)</label><input
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
							<label>Editorial</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>ISBN</label><input   
								style="text-align: center" type="text" class="form-control">
							
						</div>
					</div>   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>N� de P�ginas</label> <input
								style="text-align: center" type="text" class="form-control">

						</div>
					</div>  
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label><input
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
								<div class="form-group" style="text-align: center">
									<label>Archivo</label> <input style="text-align: center"
										type="file" class="form-control">

								</div>
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

									<button class="btn btn-primary btn-block"
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
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>  
					<th scope="col">A�o Publicaci�n</th>
					<th scope="col">Tipo de Publicaci�n</th>
					<th scope="col">T�tulo</th>
					<th scope="col">Medio de Comunicaci�n(Nombre)</th>
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
							<label>A�o Publicaci�n</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Titulo</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>     
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Tipo de Publicaci�n</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
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
							<input
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
							<label>ISBN</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>N� de P�ginas</label> <input style="text-align: center"
								type="text" class="form-control">
   
						</div>     
					</div>
					
					<div class="col-sm-6">   
						<div class="form-group" style="text-align: center">
							<label>Archivo</label>          
							<input
								style="text-align: center" type="file" class="form-control">
							  
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
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center"></div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center">

									<button class="btn btn-primary btn-block"
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
		<table class="table table-bordered"
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


<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center">Asesoria de Tesis y Trabajos de Investigaci�n</legend>
		<hr>
		<!-- Text input-->
		 <div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>A�o Inicio</label> <input style="text-align: center" type="text"
								class="form-control">
  
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Nivel de Asesoria</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
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
							 <input   
								style="text-align: center" type="text" class="form-control">
							     
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Autor</label>              
							<input
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
								<select style="text-align: center" class="form-control">
									<c:forEach items="${listacategoria}" var="pr">
  
										<option value="${pr.idcategoria}" style="text-align: center">${pr.nom_categoria}</option>

									</c:forEach>
								</select>
							</div>  
  
						</div>
					</div>
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
							<label>A�o</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>     
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Resoluci�n</label>   
							<input
								style="text-align: center" type="text" class="form-control">
							
						</div>
					</div>
					<div class="col-sm-4">         
						<div class="form-group" style="text-align: center">
							<label>Archivo</label>          
							<input
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
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center"></div>
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center">

									<button class="btn btn-primary btn-block"
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
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th> 
					<th scope="col">A�o Inicio</th>
					<th scope="col">Nivel de Asesoria</th>
					<th scope="col">Nombre de la Tesis</th>    
					<th scope="col">Autor</th>
					<th scope="col">Especialidad</th>
					<th scope="col">A�o</th>
					<th scope="col">Resoluci�n</th>
					<th scope="col">Archivo</th>           
					<th scope="col" colspan="2">Acci�n</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
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