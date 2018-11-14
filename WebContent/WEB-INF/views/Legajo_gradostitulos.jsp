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
			<h1>Formación Académica Profesional y Docente</h1>

		</div>
	</div>

	<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center"> Grados, Títulos y
			Estudios </legend>
		<hr>  
		<!-- Text input-->
		
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Grado</label>
							<div class="select">
								<select style="text-align: center" class="form-control" id="grado1">
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
								<select style="text-align: center" class="form-control" id="espe1"> 
									<c:forEach items="${lista_especialidad}" var="pr">
 
										<option value="${pr.idespc}" style="text-align: center">${pr.nombre_especialidad}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Institución</label>
							<div class="select">
								<select style="text-align: center" class="form-control" id="insti1">
									<c:forEach items="${lista_institucion}" var="pr">

										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>
  
									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Término</label> <input style="text-align: center"
								type="date" class="form-control" id="f_t1">

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
										type="file" class="form-control" id="url1">

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
								<select style="text-align: center" class="form-control" id="tesis1">
									<option value="NO" style="text-align: center">NO</option>
									<option value="SI" style="text-align: center">SI</option>
								</select>
							</div>  
						</div>
					</div>
					<div class="col-sm-6">
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input style="text-align: center"
								type="file" class="form-control" id="url2">       

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

									<button id="registrar_grados"  class="btn btn-primary btn-block"
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
			style="max-width: 100%; text-align: center; margin-bottom: 5%" id="tblXD">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Grado</th>
					<th scope="col">Especialidad</th>
					<th scope="col">Institución</th>
					<th scope="col">Fecha Término</th>
					<th scope="col">Archivo</th>
					<th scope="col">Tesis</th>
					<th scope="col">Archivo</th>
					<th scope="col" >Acción</th>  
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
		
		<div class="row">    
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Institución</label>
							<div class="select">
								<select style="text-align: center" class="form-control" id="insti2">
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
								type="text" class="form-control" id="cargo2"> 

						</div>
					</div>  
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Tipo de Dedicación</label>
							<div class="select">
								<select style="text-align: center" class="form-control" id="td2">
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
								type="date" class="form-control" id="fi2">

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
							<label>Fecha Término</label> <input style="text-align: center"
								type="date" class="form-control" id="ft2">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>Años</label> <input style="text-align: center" type="text"
								class="form-control" id="aos2">

						</div>
					</div> 
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>Meses</label> <input style="text-align: center"
								type="text" class="form-control" id="meses2">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>Días</label> <input style="text-align: center" type="text"
								class="form-control" id="dias2">

						</div>    
					</div>
					<div class="col-sm-6">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input  style="text-align: center"
								type="text" class="form-control" id="lugar2">   

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
										type="file" class="form-control" id="archi2">

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

									<button id="registrar_experiencia_profesional" class="btn btn-primary btn-block"
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
		<table id="tablaexpe" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>            
				<tr>
					<th scope="col">#</th>
					<th scope="col">Institución</th>
					<th scope="col">Cargo</th>
					<th scope="col">Tipo de Dedicación</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Término</th>
					<th scope="col">Años</th>
					<th scope="col">Meses</th>
					<th scope="col">Días</th>
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>
					<th scope="col">Acción</th>
				</tr>
			</thead>
			<tbody>
      
			</tbody>  
		</table>
	</div>





	<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center"> Categoría Docente </legend>
		<hr>
		<!-- Text input-->
		<div class="row">
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Institución</label>
							<div class="select">
								<select style="text-align: center" class="form-control" id="insti4">
									<c:forEach items="${lista_institucion}" var="pr">

										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach> 
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Categoría</label>
							<div class="select">
								<select style="text-align: center" class="form-control" id="cate4">
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
								type="date" class="form-control" id="fi4">

						</div>
					</div>
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Fecha Término</label> <input style="text-align: center"
								type="date" class="form-control" id="ft4">

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
							<label>Años</label> <input style="text-align: center" type="text"
								class="form-control" id="a4">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>Meses</label> <input style="text-align: center"
								type="text" class="form-control" id="m4">

						</div>
					</div>
					<div class="col-sm-1">
						<div class="form-group" style="text-align: center">
							<label>Días</label> <input style="text-align: center" type="text"
								class="form-control" id="d4">

						</div>
					</div>
					<div class="col-sm-4">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input style="text-align: center"
								type="text" class="form-control" id="l4">

						</div>
					</div>
					<div class="col-sm-5">
						<div class="form-group" style="text-align: center">
							<label>Archivo</label> <input style="text-align: center"
								type="file" class="form-control" id="archivo4">  
 
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

									<button id="registrar_categoriadocente" class="btn btn-primary btn-block"
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
					<th scope="col">Institución</th>
					<th scope="col">Categoría</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Término</th>
					<th scope="col">Años</th>
					<th scope="col">Meses</th>
					<th scope="col">Días</th>
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acción</th>
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
							<label>Institución</label>
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
							<label>Años</label> <input style="text-align: center" type="text"
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
							<label>Días</label> <input style="text-align: center" type="text"
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
					<th scope="col">Institución</th>
					<th scope="col">Categoría</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Fin</th>
					<th scope="col">Años</th>
					<th scope="col">Meses</th>
					<th scope="col">Días</th>    
					<th scope="col">Lugar</th>    
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acción</th>
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
							<label>Institución</label>  
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
							<label>Años</label> <input style="text-align: center" type="text"
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
							<label>Días</label> <input style="text-align: center" type="text"
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
					<th scope="col">Institución</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Fin</th>    
					<th scope="col">Años</th>
					<th scope="col">Meses</th>
					<th scope="col">Días</th>
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acción</th>
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
							<label>Institución</label>
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
					<th scope="col">Institución</th>
					<th scope="col">Cargo</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Fin</th>          
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>     


	</div>


	<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center"> Experiencia Académico-Administrativa</legend>
		<hr>   
		<!-- Text input-->
		
		<div class="row">  
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-3">
						<div class="form-group" style="text-align: center">
							<label>Institución</label>
							<div class="select">
								<select style="text-align: center" class="form-control" id="insti3">
									<c:forEach items="${lista_institucion}" var="pr">
 
										<option value="${pr.idint}" style="text-align: center">${pr.nombre_institucion}</option>

									</c:forEach>
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">  
						<div class="form-group" style="text-align: center">
							<label>Cargo/Función</label>
							<div class="select">
								<select style="text-align: center" class="form-control" id="cargo3">
									
										<option value="Ayudador" style="text-align: center">Ayudador</option>
										<option value="Colaborador" style="text-align: center">Colaborador</option>
										<option value="Director de proyecto" style="text-align: center">Director de proyecto</option>
   
									    
								</select>
							</div>
						</div>
					</div>
					<div class="col-sm-3">   
						<div class="form-group" style="text-align: center">
							<label>Régimen</label>
							<div class="select">
								<select style="text-align: center" class="form-control" id="regimen3">
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
								type="date" class="form-control" id="fi3">

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
								class="form-control" id="ff3">

						</div>
					</div>
					<div class="col-sm-4">     
						<div class="form-group" style="text-align: center">
							<label>Resolución</label> <input style="text-align: center"
								type="text" class="form-control" id="reso3">

						</div>
					</div>
					<div class="col-sm-5">
						<div class="form-group" style="text-align: center">
							<label>Lugar</label> <input style="text-align: center"
								type="text" class="form-control" id="lugar3">

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
										type="file" class="form-control" id="url3">  

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
  
									<button id="registrar_experiencia_academico_profesional" class="btn btn-primary btn-block"
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
		<table id="tableacademico4" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Institucion</th>
					<th scope="col">Cargo/Función</th>
					<th scope="col">Régimen</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha Fin</th>
					<th scope="col">Resolución</th>
					<th scope="col">Lugar</th>   
					<th scope="col">Archivo</th>    
					<th scope="col" colspan="2">Acción</th>
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
							<label>Institución</label>  
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
							<label>Año</label> <input style="text-align: center"
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
					<th scope="col">Institución</th>
					<th scope="col">Año</th>   
					<th scope="col">Archivo</th>    
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
	</div>   


		<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center">Dominios de las Tecnologias de la Información y comunicación</legend>
		<legend style="text-align: center">para la Educación Universitaria</legend>
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
							<label>Institución</label>     
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
					<th scope="col">Institución</th>
					<th scope="col">Año</th>   
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
	<script src="${urlrecursos}/js/script_expediente.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->       
	<!-- Google analytics script-->
	<script type="text/javascript">
		   
		
	</script>
</body>
</html>
