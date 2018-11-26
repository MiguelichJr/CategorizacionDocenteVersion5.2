<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">
<head>
<title>CategorizaciónDocente</title>
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
.circulo {
	width: 200px;
	height: 200px;  
	border-radius: 20%;  
	display: inline-block;
	cursor: pointer;
	background: #992e45;       
	margin-left:7%;                     
}

.circulo:hover {
	-webkit-transform: scale(1.3);
	-ms-transform: scale(1.3);
	transform: scale(1.3);
	position: relative;
	z-index: 1;    
	background: #992e45;            
}

         

.circulo2 {
	width: 100px; 
	height: 100px;
	-moz-border-radius: 50%;
	-webkit-border-radius: 50%;
	border-radius: 50%;
	margin: 25%;                       
}

.size-icon{  
	margin-top: 25px;
	margin-right: 5px;
	margin-left: 5px;
	margin-bottom: 25px;
} 

i:hover{
	color:white;                 
} 


    
 </style>
</head>
<body class="app sidebar-mini rtl">
	<!-- Navbar-->
	<jsp:include page="template/cabezera.jsp"></jsp:include> 
       
	  <div                    
		style="margin-left: 10%; margin-right: 1%; height: 100px;width: 1000px; margin-top: 15%; border-radius: 20px">
		<input type="hidden" id="iddocenteconvo" 
			value="<%=(Integer) session.getAttribute("iddocenteconvocatoria")%>"  style="text-align: center; text-transform: uppercase; font-family: serif; width: 200px"
			class="form-control" /> 
			<input type="hidden" id="roles"
			value="<%=(Integer) session.getAttribute("roles")%>" style="text-align: center; text-transform: uppercase; font-family: serif; width: 200px"
			class="form-control" /> 
			<input type="hidden" value="<%=(String) session.getAttribute("nombre") + " " + (String) session.getAttribute("apellido")%>" style="text-align: center; text-transform: uppercase; font-family: serif; width: 200px"
			class="form-control" />
  
		<div style="margin-left:28%" id="contenidoModulos"></div>    
     <form method="post" action="/cat/enviarelidmodulopepepe">    
	<input type="hidden" id="valormo" name="valormo" class="form-control" style="width:100px;"/>
	<button type="submit" id="dirigirpe" style="display:none"></button>        
	 </form>             
	</div>  
 
        
   

  
         
	<!-- Essential javascripts for application to work-->
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>
	<script src="${urlrecursos}/js/main.js"></script>
	<script src="${urlrecursos}/js/metodosmain.js"></script> 
	
	<script src="${urlrecursos}/js/privilegio.js"></script>           
	<!-- The javascript plugin to display page loading on top-->
	<script src="${urlrecursos}/js/plugins/pace.min.js"></script>
	<!-- Page specific javascripts-->
	<!-- Google analytics script-->
	<script type="text/javascript">
		
	</script>
</body>
</html>