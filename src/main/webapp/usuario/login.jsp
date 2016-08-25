<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="Cr&eacute;ditos es una plataforma pensada para apoyar a todas las pymes a gestionar la reservación de algún servicio, bajo la premisa de roles Administradores, Supervisores y Clientes.">
    <meta name="author" content="Tirso Reyes Hernández">
    <link rel="icon" href="img/favicontec.ico">

    <title>Cr&eacute;ditos</title>

    <!-- Bootstrap core CSS -->
    <link href="library/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="library/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/jumbotron.css" rel="stylesheet">
    

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="library/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
    
    
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Cr&eacute;ditos</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" id="txtUsuarioLogin" name ="txtUsuarioLogin" placeholder="Usuario" class="form-control" required>
            </div>
            <div class="form-group">
              <input type="password" id="txtContrasenaLogin" name ="txtContrasenaLogin" placeholder="Contraseña" class="form-control" required>
            </div>
            <button type="submit" id="btnIngresar" class="btn btn-info">Ingresar</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
      
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Bienvenido</h1>
        <p>Cr&eacute;ditos es una plataforma para llever el control de otros cursos de los Alumnos </p>
        <!-- <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p> -->
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      
      <hr>
      <footer>
        <p>&copy; 2016 Instituto Tecnol&oacute;gico Superior de Alvarado Veracruz</p>
      </footer> 
      
		
    </div> <!-- /container -->
<jsp:include page="/WEB-INF/template/divwait.jspf"></jsp:include>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../library/assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="library/bootstrap/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="library/assets/js/ie10-viewport-bug-workaround.js"></script>
    
    <!-- Custom js -->
    <script src="library/redirect/jquery.redirect.js"></script>
    <script src="js/models/FormModel_Login.js"></script>
    <script src="js/controllers/FormController_Login.js"></script>
  </body>
</html>

