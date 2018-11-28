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
			<form:form>
				<form:label path="nombre" ><form:input path="nombre" disabled="true" style="font-size:20px"/></form:label>
			</form:form>
		</div>
	</div>
	<%int e=0; %>
	<%int g=0; %>
	<!-- Entrad -->
	<div class="demo-graphs mdl-shadow--2dp mdl-color--white mdl-cell mdl-cell--12-col mdl-grid"  style="height: 100%;border-radius: 10px">
             <div class="mdl-grid">
               <div class="mdl-cell--12-col" style="height: 20px">
                 
               </div>
             </div>
             <div class="container">
			    <div class="row">
			    <div class="col s12" style="">
			      <ul class="tabs" style="overflow-x:hidden;">
			        <li class="tab col s6 "><a href="#test1" class="a">Vistas del Items</a></li>
			        <li class="tab col s6"><a class="active" href="#test2" class="a">Crud de Items</a></li>
			      </ul>
			    </div>
			    </div>
			    <div class="row">
			    <div id="test1" class="col s12">
			    	<div class="row">
			    		<div  class="col s12" style="height: 30px">
			    			
			    		</div>
			    	</div>
			    	<div class="container">
					<table class="">
						<thead>
							<tr>
							    <th class="left-align">N°</th>
							    <th class="left-align">Items</th>
							    <th class="left-align">Nivel</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${lista}" var="ha">
								<%g++; %>
								<tr>
									<th scope="row"><%=g %></th>
									<td>${ha.descripcion}</td>
									<td>${ha.valor_maximo}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>	    	
			    </div>
			    <div id="test2" class="col s6">
			    	<div class="" style="justify-content: center">

             <main class = "mdl-layout__content"  style="width: 100%">
				<section class="container">
					<div class="row">
						<article class="col 2"></article>
						<article class="col s8">
							<form:form method="POST" action="/CategorizacionDocente/buscar/buscarPreg/GuardarPreguntas">
								<h3 class="center-align">Preguntas</h3>
								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="descripcion">Nombre Items</label>
									<input type="text" name="descripcion" required>
								</div>
								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="valor_maximo">Nivel de Items</label>
									<input type="text" name="valor_maximo" required>
								</div>
								<form:input type="hidden" path="idsc"  class="form-control" name="idsecciones" />
								<br>
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
             <div class="container">
					<table class="responsive-table">
						<thead>
							<tr>
							    <th class="left-align">N°</th>
							    <th class="left-align">Items</th>
							    <th class="left-align">Nivel</th>
							    <th style="width: 10px" class="center-align">Mostrar</th>
							    <th class="center-align">Accion</th>						    
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${lista}" var="as">
								<%e++; %>
								<tr>
									<th scope="row"><%=e %></th>
									<td>${as.descripcion}</td>
									<td>${as.valor_maximo}</td>
									<td style="margin-right: 5px">
								   <form class="" action="#">
								   	<p>
								      <input type="checkbox" class="filled-in" id="${as.idpreguntas}" checked="checked" />
								      <label for="${as.idpreguntas}"></label>
    								</p>
								   </form>
								</td>
								<td class="center-align"><a href="updatepreguntas/${as.idpreguntas}"><i class="material-icons prefix">create</i></a></td>     
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>	
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