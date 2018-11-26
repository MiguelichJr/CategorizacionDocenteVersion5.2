
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>Servicio Aprendizaje</title>
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
<style>
body {
	margin-top: 40px;
}
  
.stepwizard-step p {
	margin-top: 10px;
}

.stepwizard-row {
	display: table-row;
}

.stepwizard {
	display: table;
	width: 70%;       
	position: relative;
}

.stepwizard-step button[disabled] {
	color:black;  
}

.stepwizard-row:before {
	top: 14px;
	bottom: 0;  
	position: absolute;
	content: " ";
	width: 100%;
	height: 1px;
	background-color: #ccc;  
	z-order: 0;
}

.stepwizard-step {
	display: table-cell;
	text-align: center;
	position: relative;
}

.btn-circle {
	width: 30px;
	height: 30px;
	text-align: center;
	padding: 6px 0;
	font-size: 12px;
	line-height: 1.428571429;
	border-radius: 15px;
}
</style>
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/cabezera.jsp"></jsp:include>
	<jsp:include page="template/menu.jsp"></jsp:include>
	<main class="app-content">  
	<div class="app-title">
		<div>
			<h1>Filosofía y Misión</h1>

		</div>
	</div>
	
	
     
	 
	
	<div 
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center">Servicio Aprendizaje</legend>      
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
					
					<div class="col-sm-8">         
						<div class="form-group" style="text-align: center">
							<label>Servicio</label> <input id="servicio"
								style="text-align: center" type="text" class="form-control">

						</div>
					</div>    
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
						<div class="select">
								<label>Formación</label>         
								<select id="formacion34" style="text-align: center" class="form-control">

     
									<option value="SI" style="text-align: center">SI</option>
									<option value="NO" style="text-align: center">NO</option>

								</select>  
							</div>	    
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
							<form method="post" action="/cat/guardar_img_cosmovision" enctype="multipart/form-data">
								<div class="form-group" style="text-align: center">
									<label>Archivo</label> <input id="archi98" name="archi98" style="text-align: center"
										type="file" class="form-control"> 
									<input type="hidden" value="" name="id98" id="id_logro_extra98">  
										<button type="submit" id="enviar_archivo98" style="display:none;"></button>
								
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

									<button id="registrar_servicio" class="btn btn-primary btn-block"
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
		<table id="tableserviciope"  class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>   
					<th scope="col">#</th>
					<th scope="col">Servicio</th>   
					<th scope="col">Formación</th>      
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
		
		
		    
		
		  
	</div>    

	<input  type="hidden" value="<%=(Integer) session.getAttribute("idmodulo_menu")%>" id="idmodulooooo" class="form-control" style="width:100px;"/>
	 
  <input type="hidden" id="idprofe" value="<%=(Integer) session.getAttribute("iddocenteconvocatoria")%>"> 
  <input  type="hidden" id="idultimoid" > 
  </main>     

     
	<%--    
	<div             
		style="border-radius: 20px; background-color: white; padding: 10px; ">
		<!-- Form Name -->
		<legend style="text-align: center">Cosmovisión</legend>
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
					
					<div class="col-sm-8">       
						<div class="form-group" style="text-align: center">
							<label>Declaración</label> <input id="decla"
								style="text-align: center" type="text" class="form-control">
  
						</div>
					</div>    
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
						<div class="select">
								<label>Documento</label>     
								<select style="text-align: center" id="documento33" class="form-control">

     
									<option value="SI" style="text-align: center">SI</option>
									<option value="NO" style="text-align: center">NO</option>

								</select>
							</div>	    
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
									<label>Archivo</label> <input  id="archi33" style="text-align: center"
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

									<button id="registrar_cosmovision" class="btn btn-primary btn-block"
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
		<table id="tablecosmoooooo" class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>   
					<th scope="col">#</th>
					<th scope="col">Declaración</th>
					<th scope="col">Documento</th>   
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
		
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
								<div class="form-group" style="text-align: center">

									
								</div>  
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center">
									<button class="btn btn-primary nextBtn btn-lg pull-right" type="button">Next</button>     
								</div>
							</div>    
							<div class="col-sm-4">
								 
							</div>  
						</div>
						    

					</div> 
				</div>

			</div>
			<div class="col-1"></div>
		</div> 
	</div>
	 
	
	
	 
	<div 
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center">Integración Fe-Enseñanza</legend>
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
					  
					<div class="col-sm-8">       
						<div class="form-group" style="text-align: center">
							<label>IFE</label> <input id="ifee"
								style="text-align: center" type="text" class="form-control">

						</div>
					</div>    
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
						<div class="select">
								<label>Formación</label>     
								<select id="formacion" style="text-align: center" class="form-control">

     
									<option value="SI" style="text-align: center">SI</option>
									<option value="NO" style="text-align: center">NO</option>

								</select>
							</div>	    
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
									<label>Archivo</label> <input id="archi45" style="text-align: center"
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

									<button id="registrar_ife" class="btn btn-primary btn-block"
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
		<table id="tableifeee"   class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>   
					<th scope="col">#</th>  
					<th scope="col">IFE</th>     
					<th scope="col">Formación</th>      
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
		
		
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
								<div class="form-group" style="text-align: center">

									<input type="submit" class="btn btn-primary btn-block" name="prev" class="prev acao" style="background-color: #992e45; border-top: #992e45; border-right: #992e45; border-bottom: #992e45; border-left: #992e45"  value="ANTERIORo"/>
									
								</div>  
							</div>
							<div class="col-sm-4">
								   
							</div>    
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center">
									<input type="submit" class="btn btn-primary btn-block" name="next" class="next acao" style="background-color: #992e45; border-top: #992e45; border-right: #992e45; border-bottom: #992e45; border-left: #992e45"  value="SIGUIENTEe"/>
									
								</div>
							</div>  
						</div>
						    

					</div> 
				</div>

			</div>
			<div class="col-1"></div>
		</div>
		
		  
	</div >
	
	
	
	
	<div 
		style="border-radius: 20px; background-color: white; padding: 10px; margin-top: 20px">
		<!-- Form Name -->
		<legend style="text-align: center">Servicio Aprendizaje</legend>      
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
					
					<div class="col-sm-8">         
						<div class="form-group" style="text-align: center">
							<label>Servicio</label> <input id="servicio"
								style="text-align: center" type="text" class="form-control">

						</div>
					</div>    
					<div class="col-sm-2">
						<div class="form-group" style="text-align: center">
						<div class="select">
								<label>Formación</label>         
								<select id="formacion34" style="text-align: center" class="form-control">

     
									<option value="SI" style="text-align: center">SI</option>
									<option value="NO" style="text-align: center">NO</option>

								</select>  
							</div>	    
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
									<label>Archivo</label> <input id="archi98" style="text-align: center"
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

									<button id="registrar_servicio" class="btn btn-primary btn-block"
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
		<table id="tableserviciope"  class="table table-bordered"
			style="max-width: 100%; text-align: center; margin-bottom: 5%">
			<thead>
				<tr>   
					<th scope="col">#</th>
					<th scope="col">Servicio</th>   
					<th scope="col">Formación</th>      
					<th scope="col">Archivo</th>
					<th scope="col" colspan="2">Acción</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
		
		
		
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
								   
							</div>
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center">
									<input type="submit" class="btn btn-primary btn-block" name="prev" class="prev acao" style="background-color: #992e45; border-top: #992e45; border-right: #992e45; border-bottom: #992e45; border-left: #992e45"  value="ANTERIORo"/>
									  
								</div> 
							</div>    
							<div class="col-sm-4">
								<div class="form-group" style="text-align: center">

									
								</div>
							</div>  
						</div>
						    

					</div> 
				</div>

			</div>
			<div class="col-1"></div>
		</div>    
		
		  
	</div>       
	  --%> 
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<script src="${urlrecursos}/js/script_expediente_filosofiamision.js"></script>
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
	$(document).ready(function () {
		  var navListItems = $('div.setup-panel div a'),
		          allWells = $('.setup-content'),
		          allNextBtn = $('.nextBtn'),
		  		  allPrevBtn = $('.prevBtn');

		  allWells.hide();

		  navListItems.click(function (e) {
		      e.preventDefault();
		      var $target = $($(this).attr('href')),
		              $item = $(this);

		      if (!$item.hasClass('disabled')) {
		          navListItems.removeClass('btn-primary').addClass('btn-default');
		          $item.addClass('btn-primary');
		          allWells.hide();
		          $target.show();
		          $target.find('input:eq(0)').focus();
		      }
		  });
		  
		  allPrevBtn.click(function(){
		      var curStep = $(this).closest(".setup-content"),
		          curStepBtn = curStep.attr("id"),
		          prevStepWizard = $('div.setup-panel div a[href="#' + curStepBtn + '"]').parent().prev().children("a");

		          prevStepWizard.removeAttr('disabled').trigger('click');
		  });

		  allNextBtn.click(function(){
		      var curStep = $(this).closest(".setup-content"),
		          curStepBtn = curStep.attr("id"),
		          nextStepWizard = $('div.setup-panel div a[href="#' + curStepBtn + '"]').parent().next().children("a"),
		          curInputs = curStep.find("input[type='text'],input[type='url']"),
		          isValid = true;

		      $(".form-group").removeClass("has-error");
		      for(var i=0; i<curInputs.length; i++){
		          if (!curInputs[i].validity.valid){
		              isValid = false;
		              $(curInputs[i]).closest(".form-group").addClass("has-error");
		          }
		      }

		      if (isValid)
		          nextStepWizard.removeAttr('disabled').trigger('click');
		  });

		  $('div.setup-panel div a.btn-primary').trigger('click');
		});
		
	</script>
</body>
</html>