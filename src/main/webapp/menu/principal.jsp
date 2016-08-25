<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Control Cr&acute;editos es una plataforma para administrar otros cr&acute;editos de los Alumnos">
<meta name="author" content="Tirso Reyes Hernández">
<link rel="icon" href="img/favicontec.ico">

<title>Cr&eacute;ditos</title>

<!-- Bootstrap Core CSS -->
<link href="library/bootstrap/css/bootstrap.min.css" rel="stylesheet">


<!-- Custom CSS -->
<link href="css/simple-sidebar.css" rel="stylesheet">
<link href="css/principal.css" rel="stylesheet">
<!-- DatePicker -->
<link href="library/datepicker/css/bootstrap-datetimepicker.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
	<jsp:include page="/WEB-INF/template/header.jspf"></jsp:include>
	<div id="wrapper">
		<jsp:include page="/WEB-INF/template/sidebar.jspf"></jsp:include>

		<!-- Page Content -->
		<div id="page-content-wrapper">
	<div id="page-content">
	</div>
			<hr>
			<jsp:include page="/WEB-INF/template/footer.jspf"></jsp:include>
		</div>

		<!-- /#page-content-wrapper -->

	</div>
	
<jsp:include page="/WEB-INF/template/divwait.jspf"></jsp:include>
	<!-- /#wrapper -->

	<!-- jQuery -->

    <script src="library/jquery/1.11.3/jquery.min.js"></script>  
	
	 <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>  --> 

	<!-- Bootstrap Core JavaScript -->
	<script src="library/bootstrap/js/bootstrap.min.js"></script>
	
	<!-- DatePicker -->
	<script src="library/datepicker/js/moment-with-locales.js"></script>
	<script src="library/datepicker/js/bootstrap-datetimepicker.js"></script>
	
	<!-- Menu Toggle Script -->
	<script src="js/principal.js"></script>
	
	
    <!-- Custom js  Pendiente de configurar-->
    
    <script src="js/models/FormModel_Default.js"></script>
    <script src="js/controllers/FormController_Default.js"></script>
    <script src="js/models/FormModel_Grupo.js"></script>
    <script src="js/controllers/FormController_Grupo.js"></script>
   <script src="js/models/FormModel_Usuario.js"></script>
    <script src="js/controllers/FormController_Usuario.js"></script>
    <script src="js/models/FormModel_Campus.js"></script>
    <script src="js/controllers/FormController_Campus.js"></script>
    <script src="js/models/FormModel_Credito.js"></script>
    <script src="js/controllers/FormController_Credito.js"></script>
    <script src="js/models/FormModel_Periodo.js"></script>
    <script src="js/controllers/FormController_Periodo.js"></script>
    <script src="js/models/FormModel_Carrera.js"></script>
    <script src="js/controllers/FormController_Carrera.js"></script>
    <script src="js/models/FormModel_Alumno.js"></script>
    <script src="js/controllers/FormController_Alumno.js"></script>
    <script src="js/models/FormModel_Curso.js"></script>
    <script src="js/controllers/FormController_Curso.js"></script>
    
</body>

</html>
