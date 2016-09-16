<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="icon" href="img/favicontec.ico">
<title>ITSAV - Principal</title>

<!-- Bootstrap -->
<link href="library/bootstrap/css/bootstrap.css" rel="stylesheet" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid"> 
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false"> <span class="sr-only">Activar Navegación</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
     <a class="navbar-brand" href="#"></a> </image> </div>
    
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Ayuda <span class="sr-only">(current)</span></a> </li>
      </ul>
      
    </div>
    <!-- /.navbar-collapse --> 
  </div>
  <!-- /.container-fluid --> 
</nav>
<!-- FOOTER -->
<div class="container">
  <img width="150" style="padding:20px;" src="img/logoitsav.png" class="img-responsive center-block"/>
  <div class="row">

    <div class="col-lg-offset-3 col-xs-12 col-lg-6">
      <div class="jumbotron">
        <div class="row text-center">
          <div class="text-center col-xs-12 col-sm-12 col-md-12 col-lg-12">
            <h2>Acceso al Sistema</h2> <br/>
          </div>
          <div class="text-center col-lg-12"> 
       
            <form role="form" id="feedbackForm" class="text-center" method="post">
              <div class="form-group">
                <label for="name">Usuario</label>
                 <input type="text" class="form-control" id="txtUsuarioLogin" name="txtUsuarioLogin" placeholder="Usuario" required />
                <span class="help-block" style="display: none;">Por favor ingresa tu usuario.</span></div>
              <div class="form-group">
                <label for="email">Contraseña</label>
                <input type="password" class="form-control" id="txtContrasenaLogin" name="txtContrasenaLogin" placeholder="Contraseña">
                <span class="help-block" style="display: none;">Por favor ingresa tu password.</span></div>
              <button type="submit" id="btnIngresar" class="btn btn-primary btn-lg" style="margin-top: 10px;">Acceder</button>
           <!--    <button type="submit" id="feedbackSubmit" class="btn btn-primary btn-lg" style=" margin-top: 10px;"> Acceder</button>   -->
            </form>
            <br/> <br/>
            <!-- END CONTACT FORM --> 
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<footer class="text-center">
  <div class="container">
    <div class="row">
      <div class="col-xs-12">
      <jsp:include page="/WEB-INF/template/divwait.jspf"></jsp:include>
        <p>Instituto Tecnológico Superior de Alvarado Veracruz 2016</p>
      </div>
    </div>
  </div>
</footer>
<!-- / FOOTER --> 
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) --> 
<!-- <script src="js/jquery-1.11.3.min.js"></script> --> 
<!-- Include all compiled plugins (below), or include individual files as needed --> 
<!--  <script src="js/bootstrap.js"></script>-->
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


