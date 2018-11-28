<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/" var="urlRoot" />
<!DOCTYPE html>
<html lang="es">  
  <head>
    <title>Menu Estatico</title>   
    <meta charset="utf-8">     
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.2/css/all.css" integrity="sha384-/rXc/GQVaYpyDdyxK+ecHPVYJSN9bmVFBvjA/9eOB+pb3F2w2N6fc5qB9Ew5yIns" crossorigin="anonymous">   
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <spring:url value="/recursos" var="urlrecursos"></spring:url>
	<link href="${urlrecursos}/css/template.css" rel="stylesheet">    
  </head> 
  <body class="app sidebar-mini rtl">   
  <!-- Navbar-->        
         <header class="app-header" style="background-color:#992e45">      	                                    
     <!-- Sidebar toggle button--><img alt="" src="./recursos/img/upeu.jpg" style="margin-left:4px;margin-top:3px;margin-bottom:5px;border-radius:10px"      >  
                
    <a class="app-header__logo" href="#" style="width:30%;background-color:#992e45">Categorización Docente Upeu</a>
       <!-- Navbar Right Menu-->   
      <ul class="app-nav">
       
        
        <!-- User Menu-->
        <li class="dropdown"><a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Open Profile Menu"><i class="fa fa-user fa-lg"></i></a>
          <ul class="dropdown-menu settings-menu dropdown-menu-right">
            <li><a class="dropdown-item" href="page-user.html"><i class="fa fa-user fa-lg"></i>Perfil</a></li>
            <li><a class="dropdown-item" href="#"><i class="fa fa-sign-out fa-lg"></i>Cerrar Sesión</a></li>
          </ul>
        </li>
      </ul>    
    </header>    
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>        
    <aside class="app-sidebar">                        
      <div class="app-sidebar__user"><img class="app-sidebar__user-avatar" src="./recursos/img/sisi.jpg" alt="User Image">
        <div>     
          <p class="app-sidebar__user-name">Owen Mejia</p>  
          <p class="app-sidebar__user-designation">Alumno</p>   
        </div>     
      </div>                        
      <ul class="app-menu">      
                          
      	<li class="treeview"  class="collapsed active"><a class="app-menu__item"  href="#" data-toggle="treeview"><i class="fa fa-pencil-square-o"></i><span class="app-menu__label" style="margin-left:4%">Convocatoria</span></a>
        	<li><a class="treeview-item" href="crearconvo"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Crear Convocatoria</a></li>    
            <li><a class="treeview-item" href="#"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Configurar Docentes</a></li>   
            <li><a class="treeview-item" href="#"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Configurar Instrumento</a></li>  
            <li><a class="treeview-item" href="#"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Designación de Evaluaciones</a></li>
            <li><a class="treeview-item" href="#"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Extension Cultural y Proyección Social</a></li>
            <li><a class="treeview-item" href="#"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Filosofía y Misión</a></li>
            <li><a class="treeview-item" href="#"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Logros Extras</a></li> 
                       
        </li>
      
  		                                   
        <li class="treeview"  class="collapsed active"><a class="app-menu__item"  href="#" data-toggle="treeview"><i class="app-menu__icon fas fa-book"></i><span class="app-menu__label">Convocatoria Docente</span></a>
        	<li><a class="treeview-item" href="docpersonal"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Documentos Personales</a></li>
            <li><a class="treeview-item" href="gra"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Formación Académica Profesional y Docente</a></li>
            <li><a class="treeview-item" href="actua"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Actualización Docente Profesional</a></li>
            <li><a class="treeview-item" href="investi"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Investigación y aporte al Conocimiento</a></li>
            <li><a class="treeview-item" href="exten"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Extension Cultural y Proyección Social</a></li>
            <li><a class="treeview-item" href="filo"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Filosofía y Misión</a></li>
            <li><a class="treeview-item" href="ex"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Logros Extras</a></li> 
               
        </li>
        	                
           
        <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-pie-chart"></i><span class="app-menu__label">Evaluaciones</span></a>
          
            <li><a class="treeview-item" href="auto"><i class="fa fa-chevron-right" style="margin-left:3%"></i>Auto-Evaluación</a></li>         
                                                   
        </li>  
        
        
                           
      </ul>
    </aside>
                        
    
      
    
      
    
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
      if(document.location.hostname == 'pratikborsadiya.in') {
      	(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
      	(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
      	m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      	})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
      	ga('create', 'UA-72504830-1', 'auto');
      	ga('send', 'pageview');
      }
    </script>
  </body>
</html>