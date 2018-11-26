<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login SCD</title>   
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<spring:url value="/recursos" var="urlrecursos"></spring:url> 
<link href="${urlrecursos}/css/template.css" rel="stylesheet">
   
</head>
<body>  
	<section class="material-half-bg" >  
		<div class="cover" style="background-color:#992e45"></div>     
	</section>                           
	<section class="login-content" >  
		<div class="logo">   
			<h1>Categorización Docente Upeu</h1>
		</div>        
		<div class="login-box" style="border-radius:20px"       >  
			<form class="login-form" action="home" method="POST">
				<h3 class="login-head" style="text-align:center"> 
					<i class="fa fa-lg fa-fw fa-user" style="color:#992e45"></i>Login SCD      
				</h3>
				<div class="form-group" style="text-align:center"> 
					<label class="control-label" >USUARIO</label> 
					<input	class="form-control" type="text" name="nom_user" style="text-align:center">
				</div>            
				<div class="form-group" style="text-align:center">   
					<label class="control-label">CONTRASEÑA</label> <input         
						class="form-control" type="password" name="clave" style="text-align:center">    
				</div>
				  <hr style="margin-top:10px">          
				<div class="form-group btn-container" style="background-color:#992e45">
					<button type="submit" class="btn btn-primary btn-block" style="background-color:#992e45;border-top:#992e45;border-right:#992e45;border-bottom:#992e45;border-left:#992e45" >
						<i class="fa fa-sign-in fa-lg fa-fw" ></i>Ingresar 
					</button>         
				</div>
			</form>
			 
		</div>
	</section>     
	<script src="${urlrecursos}/js/jquery-3.2.1.min.js"></script>
	<script src="${urlrecursos}/js/popper.min.js"></script>
	<script src="${urlrecursos}/js/bootstrap.min.js"></script>    
	<script src="${urlrecursos}/js/login.js"></script>    
</body>   
</html>