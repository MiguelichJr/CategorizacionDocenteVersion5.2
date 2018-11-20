<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">  
  <head>   
    <title>Header Cabezera</title>      
    <meta charset="utf-8">     
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.2/css/all.css" integrity="sha384-/rXc/GQVaYpyDdyxK+ecHPVYJSN9bmVFBvjA/9eOB+pb3F2w2N6fc5qB9Ew5yIns" crossorigin="anonymous">   
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <spring:url value="/recursos" var="urlrecursos"></spring:url>
	<link href="${urlrecursos}/css/template.css" rel="stylesheet">    
  </head>           
  <body class="app sidebar-mini rtl"> 

     
<header class="app-header" style="background-color:#992e45">      	                                    
     <!-- Sidebar toggle button--><img alt="" src="./recursos/img/upeu.jpg" style="margin-left:4px;margin-top:3px;margin-bottom:5px;border-radius:10px"      >  
                
    <a class="app-header__logo" href="#" style="width:30%;background-color:#992e45">Categorización Docente Upeu</a>
       <!-- Navbar Right Menu-->   
      <ul class="app-nav">
       
        
        <!-- User Menu-->
        <li class="dropdown"><a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Open Profile Menu"><i class="fa fa-user fa-lg"></i></a>
          <ul class="dropdown-menu settings-menu dropdown-menu-right">
            <li><a class="dropdown-item" href="#"><i class="fa fa-user fa-lg"></i>Perfil</a></li>
            <li><a class="dropdown-item" href="#"><i class="fa fa-sign-out fa-lg"></i>Modulos</a></li>
            <li><a class="dropdown-item" href="#"><i class="fa fa-sign-out fa-lg"></i>Cerrar Sesión</a></li> 
          </ul>
        </li>
      </ul>    
  
   </header>   
   
        
    
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
        
    </script>
  </body>
</html> 