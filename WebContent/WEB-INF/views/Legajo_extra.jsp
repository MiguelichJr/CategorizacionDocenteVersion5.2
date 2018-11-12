 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>Logros Extras</title>  
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
			<h1>Logros Extras</h1>

		</div>   
	</div>
	    
  
	<div
		style="border-radius: 20px; background-color: white; padding: 10px ">
		<!-- Form Name -->
		<legend style="text-align: center">Descripción de Logros Extras</legend>
		<hr>
		<!-- Text input-->
		<div class="row">  
			<div class="col-1"></div>
			<div class="col-10">
				<div class="row">
					<div class="col-sm-1">   
						<div class="form-group" style="text-align: center">
							   
						</div>
					</div>
					
					<div class="col-sm-10">         
						<div class="form-group" style="text-align: center">
							<label>Declaración</label> <input
								style="text-align: center" type="text" class="form-control">

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
					<th scope="col">Declaración</th>   
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acción</th>
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