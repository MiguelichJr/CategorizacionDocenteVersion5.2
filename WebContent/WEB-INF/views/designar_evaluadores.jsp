<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<title>Designar_Convocatoria</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- CSS -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/alertify.min.css"/>
<!-- Default theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/themes/default.min.css"/>
<!-- Semantic UI theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/themes/semantic.min.css"/>
<!-- Bootstrap theme -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/css/themes/bootstrap.min.css"/>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.2/css/all.css"
	integrity="sha384-/rXc/GQVaYpyDdyxK+ecHPVYJSN9bmVFBvjA/9eOB+pb3F2w2N6fc5qB9Ew5yIns"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url>
<link href="${urlrecursos}/css/template.css" rel="stylesheet">

<!-- Nuevos link -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="../css/estilostablas.css">

    <!---->
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.min.css">
	 <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="${urlrecursos}/css/materialize.min.css">
    <link rel="stylesheet" href="${urlrecursos}/css/material.min.css">
    <link rel="stylesheet" type="text/css" href="../css/materialize.min.css">
    <link rel="stylesheet" href="../styles.css">

</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/cabezera.jsp"></jsp:include>
	<jsp:include page="template/menu.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>Asignar Evaluadores</h1>

		</div>
	</div>
	<%int i=0; %>
	<%int e=0; %>
	<div class="mdl-grid demo-content">

          <div class="demo-graphs mdl-shadow--2dp mdl-color--white mdl-cell mdl-cell--12-col mdl-cell--6-col-tablet  mdl-cell--2-col-phone"  style="height: 100%;border-radius: 10px">
             <div class="mdl-grid">
               <div class="mdl-cell--12-col mdl-cell--6-col-tablet " style="height: 50px">
                 
               </div>
             </div>
             <div class="container" style="">      

             <main class = "mdl-layout__content"  style="width: 1000px">
				<section class="container" >
					<div class="row">    
						<article class="col s2"></article>
						<article class="col s8   mdl-cell--2-col-phone mdl-cell--3-col-tablet ">
							<h3 class="center-align">Evaluadores</h3>
							<div class="row">
								<div class="col s12" style="height: 30px">
								</div>
							</div>
<!-- 							<form method="POST" action=""> -->
								<div class="input-field">
									<i class="material-icons prefix">date_range</i>
									<input type = "date" class = "datepicker" placeholder=""  id="fecha_registro" class="validate"/>
									<label class="active" for="nombre">Fecha Registro</label>
								</div>
						            

						        <div class="input-field"  style="width:300px;">    
						        	<i class="material-icons prefix">date_range</i>     
								    <select class="col-sm-s8 " id="Nombre_evaludor">            
								      <option value="" disabled selected>Seleccionar Evaluador</option>
								      <c:forEach items="${evalua}" var="alm">
										<%i++; %>
									 		<option value="${alm.idpersona}">${alm.nombre} ${alm.apellido}</option>
									  </c:forEach>
								    </select>
								    <label>Nombre del Evaluador</label>
								 </div>
								 <div class="input-field"  style="width:300px; ">      
						        	<i class="material-icons prefix">date_range</i>
								    <select class="col s12"  id="Nombre_plan">    
								      <option value="" disabled selected>Seleccionar Instrumento</option>
								      <c:forEach items="${lista}" var="alm">
										<%i++; %>
									 		<option value="${alm.idinstrumento}">${alm.nombre_plantilla}</option>
									  </c:forEach>
								    </select>    
								    <label>Instrumento</label>
								 </div>

								 <div class="input-field"  style="width:300px;  ">    
						        	<i class="material-icons prefix">date_range</i>
								    <select class="table" id="iddocente">      
								      <option value="" disabled selected>Seleccionar Docente</option>
								      <c:forEach items="${esta}" var="alm">
										<%i++; %>
									 		<option value="${alm.iddocon}">${alm.persona}</option>
									  </c:forEach>
								    </select>
								    <label>Docente</label>  
								 </div>    
								
								<br>
								<div class="row">
								<p class="col s6">
									<button class="btn waves-effect" type="reset" id="limpiar" style="background-color: #C62828"><i class="material-icons right">close</i>Limpiar</button>
								</p>
								<p class="col s6">
									<button class="btn waves-effect" type="submit" id="Guardarevaluador"><i class="material-icons right">send</i>enviar</button>
								</p>	
								</div>								
<!-- 							</form> -->
						</article>   
						<article class="col s2">
						</article>
					</div>
				</section>
             </main>   
             </div>
             <div class="container">
            	<div class="container row" style="margin-top:10px">               
					<table  class="responsive-table" id="tablita">   
						<thead>
							<tr>
							    <th class="left-align">N°</th>
							    <th class="center-align">Nombre del Evaluador</th>
							   	<th class="left-align">Instrumento</th>
							   	<th class="left-align">Docente</th>
							    <th class="center-align">Accion</th>						    
							</tr>
						</thead>
					</table>
				</div>
				</div>	
				<div class="row">
					<div class="col s12" style="">    
						
					</div>
				</div>


				<div class="right-align">
					<p class="right-align">   
<!-- 						<button class="waves-effect waves-light btn" type="reset" style="background-color: #C62828"><i class="material-icons right">close</i>Cancel</button> -->
					</p>
				</div>	   
            </div>
        </div>
        <input  type="hidden" value="<%=(Integer) session.getAttribute("idmodulo_menu")%>" id="idmodulooooo" class="form-control" style="width:100px;"/>
         
       </main> 
	<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>   
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/js/materialize.min.js"></script><script type="text/javascript" src="../materialize.min.js"></script>
      <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
      <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script src="../material.min.js"></script>
    <script src="../script.js"></script>
    <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.11.2/build/alertify.min.js"></script>
	<script src="${urlrecursos}/js/designar_Convocatoria.js" type="text/javascript"></script>
    <script>
		
		  $(document).ready(function(){
    $('select').formSelect();
  });
	</script>
</body>
</html>