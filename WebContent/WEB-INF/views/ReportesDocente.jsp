<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>  
<title>ReportesDocente</title>      
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
			<h1>Reportes Total</h1>

		</div>
	</div>

	<div
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center"> Grados, T�tulos y
			Estudios </legend>
		<hr>  
		<!-- Text input-->
		
		          

		<!--lista de todo los registros -->
		<table class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%" id="tblXD">
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
					<th scope="col" >Acci�n</th>  
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
		
		
		<legend style="text-align: center"> Experiencia Profesional </legend>
		<hr> 
		
		<table id="tablaexpe" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>            
				<tr>
					<th scope="col">#</th>
					<th scope="col">Instituci�n</th>
					<th scope="col">Cargo</th>
					<th scope="col">Tipo de Dedicaci�n</th>
					<th scope="col">Fecha Inicio</th>
					<th scope="col">Fecha T�rmino</th>
					<th scope="col">A�os</th>
					<th scope="col">Meses</th>
					<th scope="col">D�as</th>
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>
					<th scope="col">Acci�n</th>
				</tr>
			</thead>
			<tbody>
      
			</tbody>  
		</table>
		
		<legend style="text-align: center"> Categor�a Docente </legend>
		<hr> 
		
		<!--lista de todo los registros -->
		<table id="tablecategoria"  class="table table-bordered"
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
		
		
		<legend style="text-align: center">Experiencia en la Docencia
			Universitaria</legend>
		<hr>
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Experiencia
			en la Docencia Universitaria en Programa Presenciales
		</legend>
		<hr>
		
		<!--lista de todo los registros -->
		<table id="tablepresenciales" class="table table-bordered"
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
		
		
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Experiencia
			en la Docencia Universitaria en Entornos Virtuales
		</legend>

		<hr>
		
		<!--lista de todo los registros -->
		<table id="tablevirtual"   class="table table-bordered"
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
		
		
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Actividad
			Docente Complementaria
		</legend>
		<hr> 
		
		<!--lista de todo los registros -->
		<table  id="tablecomplementaria" class="table table-bordered"
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
		
		
		<legend style="text-align: center"> Experiencia Acad�mico-Administrativa</legend>
		<hr> 
		
		<!--lista de todo los registros -->
		<table id="tableacademico4" class="table table-bordered"
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
		<!-- 
		<legend style="text-align: center">Idiomas: Extranjeros y/o Nativos</legend>
		<hr> 
		
		 
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
		
		
		
		<legend style="text-align: center">Dominios de las Tecnologias de la Informaci�n y comunicaci�n</legend>
		<legend style="text-align: center">para la Educaci�n Universitaria</legend>
		<hr> 
		
		
		
		       
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
		</table> -->
		  
		
		<legend style="text-align: center">Capacitacion y
			Perfeccionamiento Profesional en los �ltimos 5 a�os</legend>
		<hr>
		<legend>    
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Ponencias
			en Congresos, Seminarios u Otros
		</legend>
		
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
		
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Organizaci�n
			de Eventos Acad�micos
		</legend>
		<hr> 
		
		
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
		
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Capacitaci�n
			Formal Certificada
		</legend>
		<hr>  
		
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
		
		
		
		<legend style="text-align: center">Capacitacion en la
			Docencia en los �ltimos 5 a�os</legend>
		<hr> 
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
					<th scope="col" colspan="2">Acci�n</th>
				</tr>
			</thead>
			<tbody>
 
			</tbody>
		</table>
		  
		
		<legend style="text-align: center">Investigaciones en los �ltimos 5 a�os</legend>
		<hr> 
		
		<table id="tableinvestiiii" class="table table-bordered"
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
		
		
		
		<legend style="text-align: center">Publicaciones</legend>
		<hr>  
		<legend>       
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Art�culos
		</legend>
		<hr> 
		
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
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Libros   
		</legend>
		<hr>
		
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
		<legend style="text-align: center">Asesoria de Tesis y Trabajos de Investigaci�n</legend>
		<hr>
		
		<table id="tableasesoramiento" class="table table-bordered"
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
		
		
		<legend style="text-align: center">Organizaci�n y/o Ponente
			en Eventos de Extensi�n</legend>
		<legend style="text-align: center">Cultural y Proyecci�n
			Cultural</legend>
		<hr>
		<legend>
			<i class="icon fas fa-caret-right" style="margin-left: 3%"></i>Proyectos
			de Proyecci�n Social/Extensi�n Cultural/Clubes Socios Humanitarios
		</legend>
		<hr>
		
		
		<!--lista de todo los registros -->
		<table  id="tabletiposproyeccionsocial" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>  
				<tr>
					<th scope="col">#</th>
					<th scope="col">Programa</th>
					<th scope="col">Titulo del Programa</th>
					<th scope="col">Poblaci�n Objetiva</th>
					<th scope="col">Lugar</th>
					<th scope="col">A�o</th>
					<th scope="col">N� Participantes</th>
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acci�n</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
		 
		<legend style="text-align: center">Premios o Reconocimientos</legend>
		<hr>      
		
		<!--lista de todo los registros -->
		<table id="tablereconocimientosss"  class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Tipo</th>
					<th scope="col">A�o</th>  
					<th scope="col">Fecha</th>
					<th scope="col">Instituci�n</th>      
					<th scope="col">Cargo</th>
					<th scope="col">Reconocimiento</th>
					<th scope="col">Lugar</th>
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acci�n</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>     
		
		<legend style="text-align: center">Cosmovisi�n</legend>
		<hr> 
		
		<!--lista de todo los registros -->
		<table id="tablecosmoooooo" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>   
					<th scope="col">#</th>
					<th scope="col">Declaraci�n</th>
					<th scope="col">Documento</th>   
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acci�n</th>
				</tr>
			</thead>
			<tbody> 

			</tbody>
		</table> 
		
		
		<legend style="text-align: center">Integraci�n Fe-Ense�anza</legend>
		<hr>
		
		<!--lista de todo los registros -->
		<table id="tableifeee"   class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>   
					<th scope="col">#</th>  
					<th scope="col">IFE</th>     
					<th scope="col">Formaci�n</th>      
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acci�n</th>
				</tr>
			</thead>
			<tbody> 

			</tbody>
		</table>  
		
		<legend style="text-align: center">Servicio Aprendizaje</legend>      
		<hr>
		<!--lista de todo los registros -->
		<table id="tableserviciope"  class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>   
					<th scope="col">#</th>
					<th scope="col">Servicio</th>   
					<th scope="col">Formaci�n</th>      
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
	<script src="${urlrecursos}/js/script_expediente_formacionacademica.js"></script>
	<script src="${urlrecursos}/js/script_expediente_actualizaciondocente.js"></script>
	<script src="${urlrecursos}/js/script_expediente_extensioncultural.js"></script>
	<script src="${urlrecursos}/js/script_expediente_investigacionyaporte.js"></script>
	<script src="${urlrecursos}/js/script_expediente_filosofiamision.js"></script>
	
	
	      
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->       
	<!-- Google analytics script-->
	<script type="text/javascript">
		   
		
	</script>
</body>
</html>
