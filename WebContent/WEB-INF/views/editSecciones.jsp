<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<title>Instrumento</title>
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
			<%int e=0;%>
					<%int i=0;%>
			
	<!-- Entrad -->
	<div class="demo-graphs mdl-shadow--2dp mdl-color--white mdl-cell mdl-cell--12-col mdl-grid"  style="height: 100%;border-radius: 10px">
             <div class="mdl-grid">
               <div class="mdl-cell--12-col" style="height: 20px">
                 
               </div>
             </div>
             <div class="container">
			    <div class="row">
			    <div class="col s12" style="">
			      
			    </div>
			    </div>
			    <div class="row">
			   
			    <div id="test2" class="col s12">
			    	<div class="" style="justify-content: center">

             <main class = "mdl-layout__content"  style="width: 100%">
				<section class="container">
					<div class="row">
						<article class="col 2"></article>
						<article class="col s8">
							<form:form method="POST" action="/CategorizacionDocente/buscar/updatesec/GurdarSecc">
								<h3 class="center-align">SECCIONES</h3>
								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="nombre">Nombre de la Seccion</label>
									<form:input type="text" name="nombre" path="nombre"/>
								</div>
								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="porcentaje">Porcentaje</label>
									<form:input type="text" name="porcentaje" path="porcentaje"/>
								</div>

								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="tipo">Tipo de Evaluacion</label>
									<form:input type="text" name="tipo" path="tipo"/>
								</div>
								
								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="valor_maximo">Valor Maximo</label>
									<form:input type="text" name="valor_maximo" path="valor_maximo"/>
								</div>
								
								<form:input type="hidden" path="idinstrumento"  class="form-control" name="idinstrumento" />
								<form:input type="hidden" path="idsc"  class="form-control" name="idsc" />
								<br>
								
								<div class="row">
								<p class="col s6">
									<button class="waves-effect waves-light btn" type="reset" style="background-color: #C62828"><i class="material-icons right">close</i>Cancel</button>
								</p>
								<p class="col s6">
									<button class="waves-effect waves-light btn" type="submit"><i class="material-icons right">send</i>enviar</button>
								</p>	
								</div>

							</form:form>

						</article>
						<article class="col 2"></article>
					</div>
				</section>
             </main>
             </div>	
			    </div>
			  </div>
			  </div>
            </div>
            <input  type="hidden" value="<%=(Integer) session.getAttribute("idmodulo_menu")%>" id="idmodulooooo" class="form-control" style="width:100px;"/>
             
       </main> 
	<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/js/materialize.min.js"></script><script type="text/javascript" src="js/materialize.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/js/materialize.min.js"></script><script type="text/javascript" src="../materialize.min.js"></script>
      <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js'></script>
      <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    <script src="../material.min.js"></script>
    <script src="../script.js"></script>
</body>
</html>