/** Menu Toggle Script * */
$("#menu-toggle").click(function(e) {
	e.preventDefault();
	$("#wrapper").toggleClass("toggled");
});
/**
 * load default, grupos, usuarios, campus, creditos, periodos, carreras,
 * alumnos, cursos
 */
$('.loadMenu').click(function() {
	var href = $(this).attr('href');
	
	$('#page-content').load(href, function() {

		/** DatePicker * */
		$('#datetimepicker3').datetimepicker({
			format : 'LT'
		});
		/** LoadFunctionInit * */
		loadFunctionInit(href);
	});

	return false;
});

/** load bienvenida * */
$(document).ready(function() {

	$('#page-content').load('default/menu.jsp', function() {
		/** LoadFunctionInit * */
		new FormControllerDefault().init();
	});

});

function loadFunctionInit(href) {
	var itemMenu = href.split('/')[0];

	if ('default' == itemMenu)
		new FormControllerDefault().init();
	if ('grupo' == itemMenu)
		new FormControllerGrupo().init();
	if ('usuario' == itemMenu)
		new FormControllerUsuario().init();
	if ('campus' == itemMenu)
		new FormControllerCampus().init();
	if ('credito' == itemMenu)
		new FormControllerCredito().init();
	if ('periodo' == itemMenu)
		new FormControllerPeriodo().init();
	if ('carrera' == itemMenu)
		new FormControllerCarrera().init();
	if ('alumno' == itemMenu)
		new FormControllerAlumno().init();
	if ('curso' == itemMenu)
		new FormControllerCurso().init();

}
