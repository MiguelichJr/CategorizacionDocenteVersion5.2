<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>  
<title>Gradostitulos</title>   
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
			<h1>Formaci�n Acad�mica Profesional y Docente</h1>

		</div>
	</div>

	<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center"> Grados, T�tulos y
			Estudios </legend>
		<hr>  
		<!-- Text input-->
		<form action="crearLegGrados" method="POST">
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Grado</label>
							<div class="select">
								<select style="text-align: center" class="form-control" name="grado">
									<c:forEach items="${lista_grados}" var="pr">
              
										<option value="${pr.idgrd}" style="text-align: center">${pr.nombre_grado}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Especialidad</label>
							<div class="select">
								<select style="text-align: center" class="form-control" name="especialidad">
									<c:forEach items="${lista_especialidad}" var="pr">
 
										<option value="${pr.idespc}" style="text-align: center">${pr.nombre_especialidad}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Instituci�n</label>
							<div class="select">
								<select style="text-align: center" class="form-control" name="institucion">
									<c:forEach items="${lista_institucion}" var="pr">

										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>
  
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha T�rmino</label> <input style="text-align: center"
								type="date" class="form-control" name="fecha_termino">

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
										type="file" class="form-control" name="url">

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
			<div class="col-2"></div>
			<div class="col-8">
				<div class="row">
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center"></div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center"></div>
					</div>
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
							<label>Tesis</label>
							<div class="select" style="text-align: center" id="valor_tesis">   
								<select style="text-align: center" class="form-control" name="tesis">
									<option value="NO" style="text-align: center">NO</option>
									<option value="SI" style="text-align: center">SI</option>
								</select>
							</div>  
						</div>
					</div>
					<div class="col-sm-6">
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input style="text-align: center"
								type="file" class="form-control" name="url2" >       

						</div>
					</div>
				</div>
			</div>
			<div class="col-2"></div>

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

									<button type="submit"  class="btn btn-primary btn-block"
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
		</form>  

		<!--lista de todo los registros -->
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Grado</th>
					<th scope="col">Especialidad</th>
					<th scope="col">Instituci�n</th>
					<th scope="col">Fecha T�rmino</th>
					<th scope="col">Archivo</th>
					<th scope="col">Tesis</th>
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
		<legend style="text-align: center"> Experiencia Profesional </legend>
		<hr>
		<!-- Text input-->
		<form action="crearLegExperienciaProfe" method="POST">
		<div class="row">    
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Instituci�n</label>
							<div class="select">
								<select style="text-align: center" class="form-control" name="institucion">
									<c:forEach items="${lista_institucion}" var="pr">

										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>
       
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Cargo</label> <input style="text-align: center"
								type="text" class="form-control" name="cargo"> 

						</div>
					</div>  
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Tipo de Dedicaci�n</label>
							<div class="select">
								<select style="text-align: center" class="form-control" name="categoria">
									<c:forEach items="${lista_tipodedicacion}" var="pr">
   
										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Inicio</label> <input style="text-align: center"
								type="date" class="form-control" name="fecha_inicio">

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
							<label>Fecha T�rmino</label> <input style="text-align: center"
								type="date" class="form-control" name="fecha_fin">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>A�os</label> <input style="text-align: center" type="text"
								class="form-control" name="a�os">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>Meses</label> <input style="text-align: center"
								type="text" class="form-control" name="meses">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>D�as</label> <input style="text-align: center" type="text"
								class="form-control" name="dias">

						</div>
					</div>
					<div class="col-sm-6">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input id="sisisi" style="text-align: center"
								type="text" class="form-control" name="lugar">   

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
										type="file" class="form-control" name="url">

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

									<button type="submit" class="btn btn-primary btn-block"
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
		</form>

		<!--lista de todo los registros -->
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Instituci�n</th>
					<th scope="col">Cargo</th>
					<th scope="col">Tipo de Dedicaci�n</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha T�rmino</th>
					<th scope="col">Tesis</th>
					<th scope="col">A�os</th>
					<th scope="col">Meses</th>
					<th scope="col">D�as</th>
					<th scope="col">Lugar</th>
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
		<legend style="text-align: center"> Categor�a Docente </legend>
		<hr>
		<!-- Text input-->
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Instituci�n</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_institucion}" var="pr">

										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach> 
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Categor�a</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_tipocategoria}" var="pr">
  
										<option value="${pr.idcate}" style="text-align: center">${pr.nombre_categoria}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Inicio</label> <input style="text-align: center"
								type="date" class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha T�rmino</label> <input style="text-align: center"
								type="date" class="form-control">

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

					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>A�os</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>Meses</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>D�as</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-5">
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input style="text-align: center"
								type="file" class="form-control">

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
			<div class="col-1"></div>
		</div>


		<!--lista de todo los registros -->
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Instituci�n</th>
					<th scope="col">Categor�a</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha T�rmino</th>
					<th scope="col">A�os</th>
					<th scope="col">Meses</th>
					<th scope="col">D�as</th>
					<th scope="col">Lugar</th>
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
		<legend style="text-align: center">Experiencia en la Docencia
			Universitaria</legend>
		<hr>
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Experiencia
			en la Docencia Universitaria en Programa Presenciales
		</legend>
		<hr>
		<!-- Text input-->

		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Instituci�n</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_institucion}" var="pr">

										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach>
								</select>
							</div>
						</div> 
					
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Categoria</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_tipocategoria}" var="pr">
  
										<option value="${pr.idcate}" style="text-align: center">${pr.nombre_categoria}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>   
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Inicio</label> <input  
								style="text-align: center" type="date" class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Fin</label> <input     
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

					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>A�os</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>Meses</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>D�as</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-5">
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input style="text-align: center"
								type="file" class="form-control">

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
			<div class="col-1"></div>
		</div>



		<!--lista de todo los registros -->
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Instituci�n</th>
					<th scope="col">Categor�a</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Fin</th>
					<th scope="col">A�os</th>
					<th scope="col">Meses</th>
					<th scope="col">D�as</th>    
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
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Experiencia
			en la Docencia Universitaria en Entornos Virtuales
		</legend>

		<hr>
		<!-- Text input-->

		<div class="row">
			<div class="col-2"></div>
			<div class="col-10">     
				<div class="row">   
					<div class="col-sm-1">          
						<div class="form-group" style="text-align: center">
						</div>
					</div>  
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Instituci�n</label>  
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_institucion}" var="pr">

										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach> 
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Inicio</label> <input
								style="text-align: center" type="date" class="form-control">

						</div>  
					</div>
					<div class="col-sm-3">   
						<div class="form-group" style="text-align: center">
							<label>Fecha Fin</label> <input
								style="text-align: center" type="date" class="form-control">

						</div>  
					</div>  
					<div class="col-sm-1">     
						<div class="form-group" style="text-align: center">
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

					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>A�os</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>Meses</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>D�as</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-5">
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input style="text-align: center"
								type="file" class="form-control">

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
			<div class="col-1"></div>
		</div>



		<!--lista de todo los registros -->
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Instituci�n</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Fin</th>    
					<th scope="col">A�os</th>
					<th scope="col">Meses</th>
					<th scope="col">D�as</th>
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
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Actividad
			Docente Complementaria
		</legend>
		<hr>
		<!-- Text input-->

		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Instituci�n</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_institucion}" var="pr">
 
										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Cargo</label> <input style="text-align: center" type="text"
								class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Inicio</label> <input
								style="text-align: center" type="date" class="form-control">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Fin</label> <input
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
						</div>
					</div>
					
					<div class="col-sm-4">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-5">
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input style="text-align: center"
								type="file" class="form-control">

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
			<div class="col-1"></div>
		</div>



		<!--lista de todo los registros -->
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Instituci�n</th>
					<th scope="col">Cargo</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Fin</th>          
					<th scope="col">Lugar</th>
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
		<legend style="text-align: center"> Experiencia Acad�mico-Administrativa</legend>
		<hr>   
		<!-- Text input-->
		<form action="crearLegExperienciaAcademicoAdnimin" method="POST">
		<div class="row">  
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Instituci�n</label>
							<div class="select">
								<select style="text-align: center" class="form-control" name="institucion">
									<c:forEach items="${lista_institucion}" var="pr">
 
										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">  
						<div class="form-group" style="text-align: center">
							<label>Cargo/Funci�n</label>
							<div class="select">
								<select style="text-align: center" class="form-control" name="cargo">
									
										<option value="Ayudador" style="text-align: center">Ayudador</option>
										<option value="Colaborador" style="text-align: center">Colaborador</option>
										<option value="Director de proyecto" style="text-align: center">Director de proyecto</option>
   
									    
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">   
						<div class="form-group" style="text-align: center">
							<label>R�gimen</label>
							<div class="select">
								<select style="text-align: center" class="form-control" name="categoria">
									<c:forEach items="${lista_tipodedicacion}" var="pr">

										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>  
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Inicio</label> <input style="text-align: center"
								type="date" class="form-control" name="fecha_inicio">

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
							<label>Fecha Fin</label> <input style="text-align: center" type="date"   
								class="form-control" name="fecha_fin">

						</div>
					</div>
					<div class="col-sm-4">     
						<div class="form-group" style="text-align: center">
							<label>Resoluci�n</label> <input style="text-align: center"
								type="text" class="form-control" name="resolucion">

						</div>
					</div>
					<div class="col-sm-5">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input style="text-align: center"
								type="text" class="form-control" name="lugar">

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
										type="file" class="form-control" name="url">

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

									<button type="submit" class="btn btn-primary btn-block"
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
		</form>  

		<!--lista de todo los registros -->
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Institucion</th>
					<th scope="col">Cargo/Funci�n</th>
					<th scope="col">R�gimen</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Fin</th>
					<th scope="col">Resoluci�n</th>
					<th scope="col">Lugar</th>   
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
		<legend style="text-align: center">Idiomas: Extranjeros y/o Nativos</legend>
		<hr>     
		<!-- Text input-->
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Idioma</label>    
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_tipoidioma}" var="pr">

										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
								</select>   
							</div>
						</div>
					</div>
					<div class="col-sm-3">  
						<div class="form-group" style="text-align: center">
							<label>Nivel</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_nivelidioma}" var="pr">
 
										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
										
									    
								</select>
							</div>
						</div>
					</div>  
					<div class="col-sm-3">   
						<div class="form-group" style="text-align: center">
							<label>Dominio</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
								<c:forEach items="${lista_dominioidioma}" var="pr">

										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
								
								</select>   
							</div>
						</div>
					</div>  
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Instituci�n</label>  
							<div class="select">
								<select style="text-align: center" class="form-control">
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
					<div class="col-sm-4">
						<div class="form-group" style="text-align: center">   
						</div>
					</div>
					   
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
							<label>A�o</label> <input style="text-align: center"
								type="text" class="form-control">

						</div>
					</div>
					<div class="col-sm-5">
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input style="text-align: center"
								type="file" class="form-control">

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
			<div class="col-1"></div>
		</div>


		<!--lista de todo los registros -->
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Idioma</th>
					<th scope="col">Nivel</th>
					<th scope="col">Dominio</th>
					<th scope="col">Instituci�n</th>
					<th scope="col">A�o</th>   
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
		<legend style="text-align: center">Dominios de las Tecnologias de la Informaci�n y comunicaci�n</legend>
		<legend style="text-align: center">para la Educaci�n Universitaria</legend>
		<hr>          
		<!-- Text input-->
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Curso</label>    
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_tipocurso}" var="pr">

										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
								</select>   
							</div> 
						</div>
					</div>
					<div class="col-sm-3">  
						<div class="form-group" style="text-align: center">
							<label>Nivel</label>
							<div class="select">
								<select style="text-align: center" class="form-control">
									<c:forEach items="${lista_nivelidioma}" var="pr">

										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
												    
								</select>
							</div>
						</div>
					</div>  
					<div class="col-sm-3">   
						<div class="form-group" style="text-align: center">
							<label>Modalidad de Estudio</label>
							<select style="text-align: center" class="form-control">
							<c:forEach items="${lista_tipomodalidadeducativa}" var="pr">

										<option value="${pr.idatri}" style="text-align: center">${pr.nombre_atributo}</option>

									</c:forEach>
							</select> 
						</div>
					</div>  
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Instituci�n</label>     
							<div class="select">  
								<select style="text-align: center" class="form-control">
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
					<th scope="col">Curso</th>  
					<th scope="col">Nivel</th>
					<th scope="col">Modalidad de Estudio</th>
					<th scope="col">Instituci�n</th>
					<th scope="col">A�o</th>   
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
		/*if (document.location.hostname == 'pratikborsadiya.in') {
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
		     
		             
		
		$("#sisisi").keyup(function(){
			var aaa=$("#sisisi").val;   
			alert("ainsoabs");       
		});  */     
		/*
		$(document).ready(function (){
			//alert("si funciona el script");
			//$("#valor_tesis").attr('disabled','true');  
		});              
		$("#valor_tesis").change( function() {
	        if ($(this).val() === "SI") {
	            $("#valor_tesis").prop("disabled", false);
	        } else {
	            $("#valor_tesis").prop("disabled", true);  
	        }
	    }); */
	</script>
</body>
</html>
