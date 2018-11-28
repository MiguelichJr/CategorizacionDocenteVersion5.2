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
    <style type="text/css">
    html, body {
  font-family: 'Roboto', 'Helvetica', sans-serif;
}
.demo-avatar {
  width: 48px;
  height: 48px;
  border-radius: 24px;
}
.demo-layout .mdl-layout__header .mdl-layout__drawer-button {
  color: rgba(0, 0, 0, 0.54);
}
.mdl-layout__drawer .avatar {
  margin-bottom: 16px;
}
.demo-drawer {
  border: none;
}
/* iOS Safari specific workaround */
.demo-drawer .mdl-menu__container {
  z-index: -1;
}
.demo-drawer .demo-navigation {
  z-index: -2;
}
/* END iOS Safari specific workaround */
.demo-drawer .mdl-menu .mdl-menu__item {
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  -webkit-align-items: center;
      -ms-flex-align: center;
          align-items: center;
}
.demo-drawer-header {
  box-sizing: border-box;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  -webkit-flex-direction: column;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-justify-content: flex-end;
      -ms-flex-pack: end;
          justify-content: flex-end;
  padding: 16px;
  height: 151px;
}
.demo-avatar-dropdown {
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  position: relative;
  -webkit-flex-direction: row;
      -ms-flex-direction: row;
          flex-direction: row;
  -webkit-align-items: center;
      -ms-flex-align: center;
          align-items: center;
  width: 100%;
}

.demo-navigation {
  -webkit-flex-grow: 1;
      -ms-flex-positive: 1;
          flex-grow: 1;
}
.demo-layout .demo-navigation .mdl-navigation__link {
  display: -webkit-flex !important;
  display: -ms-flexbox !important;
  display: flex !important;
  -webkit-flex-direction: row;
      -ms-flex-direction: row;
          flex-direction: row;
  -webkit-align-items: center;
      -ms-flex-align: center;
          align-items: center;
  color: rgba(255, 255, 255, 0.56);
  font-weight: 500;
}
.demo-layout .demo-navigation .mdl-navigation__link:hover {
  background-color: #00BCD4;
  color: #37474F;
}
.demo-navigation .mdl-navigation__link .material-icons {
  font-size: 24px;
  color: rgba(255, 255, 255, 0.56);
  margin-right: 32px;
}

.demo-content {
  max-width: 1080px;
}

.demo-charts {
  -webkit-align-items: center;
      -ms-flex-align: center;
          align-items: center;
}
.demo-chart:nth-child(1) {
  color: #ACEC00;
}
.demo-chart:nth-child(2) {
  color: #00BBD6;
}
.demo-chart:nth-child(3) {
  color: #BA65C9;
}
.demo-chart:nth-child(4) {
  color: #EF3C79;
}
.demo-graphs {
  padding: 16px 32px;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  -webkit-flex-direction: column;
      -ms-flex-direction: column;
          flex-direction: column;
  -webkit-align-items: stretch;
      -ms-flex-align: stretch;
          align-items: stretch;
}
/* TODO: Find a proper solution to have the graphs
 * not float around outside their container in IE10/11.
 * Using a browserhacks.com solution for now.
 */
_:-ms-input-placeholder, :root .demo-graphs {
  min-height: 664px;
}
_:-ms-input-placeholder, :root .demo-graph {
  max-height: 300px;
}
/* TODO end */
.demo-graph:nth-child(1) {
  color: #00b9d8;
}
.demo-graph:nth-child(2) {
  color: #d9006e;
}

.demo-cards {
  -webkit-align-items: flex-start;
      -ms-flex-align: start;
          align-items: flex-start;
  -webkit-align-content: flex-start;
      -ms-flex-line-pack: start;
          align-content: flex-start;
}
.demo-cards .demo-separator {
  height: 32px;
}
.demo-cards .mdl-card__title.mdl-card__title {
  color: white;
  font-size: 24px;
  font-weight: 400;
}
.demo-cards ul {
  padding: 0;
}
.demo-cards h3 {
  font-size: 1em;
}
.demo-updates .mdl-card__title {
  min-height: 200px;
  background-image: url('images/dog.png');
  background-position: 90% 100%;
  background-repeat: no-repeat;
}
.demo-cards .mdl-card__actions a {
  color: #00BCD4;
  text-decoration: none;
}

.demo-options h3 {
  margin: 0;
}
.demo-options .mdl-checkbox__box-outline {
  border-color: rgba(255, 255, 255, 0.89);
}
.demo-options ul {
  margin: 0;
  list-style-type: none;
}
.demo-options li {
  margin: 4px 0;
}
.demo-options .material-icons {
  color: rgba(255, 255, 255, 0.89);
}
.demo-options .mdl-card__actions {
  height: 64px;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
  box-sizing: border-box;
  -webkit-align-items: center;
      -ms-flex-align: center;
          align-items: center;
}
    #view-source {
      position: fixed;
      display: block;
      right: 0;
      bottom: 0;
      margin-right: 40px;
      margin-bottom: 40px;
      z-index: 900;
    }
    </style>
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/header.jsp"></jsp:include>
	<main class="app-content">
	<div class="app-title">
		<div>
			<h1>Asignar Evaluadores</h1>

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
							<form:form method="POST" action="/CategorizacionDocente/buscar/buscarPreg/updatepreguntas/updatepr">
								<h3 class="center-align">Preguntas</h3>
								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="descripcion">Nombre Items</label>
									<form:input type="text" name="descripcion"  path="descripcion"/>
								</div>
								<div class="input-field">
									<i class="material-icons prefix">perm_identity</i>
									<label for="valor_maximo">Nivel de Items</label>
									<form:input type="text" name="valor_maximo" path="valor_maximo" />
								</div>
								<form:input type="hidden" path="idsecciones"  class="form-control" name="idsecciones" />
								<form:input type="hidden" path="idpreguntas"  class="form-control" name="idpreguntas" />								
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
             </div>	
			    </div>
			  </div>
			  </div>
            </div>
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