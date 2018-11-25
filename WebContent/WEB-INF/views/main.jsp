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
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.2/css/all.css" integrity="sha384-/rXc/GQVaYpyDdyxK+ecHPVYJSN9bmVFBvjA/9eOB+pb3F2w2N6fc5qB9Ew5yIns" crossorigin="anonymous">   
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <spring:url value="/recursos" var="urlrecursos"></spring:url>
	<link href="${urlrecursos}/css/template.css" rel="stylesheet">    
  </head>  
  <body class="app sidebar-mini rtl">
  <!-- Navbar-->   
  <jsp:include page="template/cabezera.jsp"></jsp:include>
                       
    <div style="margin-left:1%;margin-right:1%;height:570px;background-color:rgba(153, 46, 69,0.3);width:1337px;margin-top: 5%;border-radius:20px">
                                      
          
    </div>        
           
      
    
    
             
    
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