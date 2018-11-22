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
           
       
    <!-- Sidebar menu--> 
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>        
    <aside class="app-sidebar">                        
                               
      <ul class="app-menu">           
                           
      	    
      
  		                                   
        
        	<li><a class="treeview-item" href="docpersonal"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Documentos Personales</a></li>
            <li><a class="treeview-item" href="gra"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Formación Académica Profesional y Docente</a></li>
            
            <li><a class="treeview-item" href="actua"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Capacitacion y Perfeccionamiento</a></li>
            <li><a class="treeview-item" href="capadocencia"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Capacitacion en la Docencia</a></li>
               
            <li><a class="treeview-item" href="investi"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Investigación</a></li>
            <li><a class="treeview-item" href="publiii"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Publicaciones</a></li>
            <li><a class="treeview-item" href="asesoratesis"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Asesoria de Tesis</a></li>
            
            <li><a class="treeview-item" href="exten"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Extension Cultural y Proyección Social</a></li>
            <li><a class="treeview-item" href="premios"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Premios y Reconocimientos</a></li>
            
            <li><a class="treeview-item" href="filo"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Cosmovision</a></li>
            <li><a class="treeview-item" href="integraaa"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Integracion Fe-Enseñanza</a></li>
            <li><a class="treeview-item" href="serviii"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Servicio Aprendizaje</a></li>
            
            <li><a class="treeview-item" href="ex"><i class="app-menu__icon fas fa-book" style="margin-left:3%"></i>Logros Extras</a></li>   
               
          
        	                 
      
        
        
                           
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