var FormModelAlumno = function(){};


/* inicia la sección de altas y modificaciones de alumnos */

FormModelAlumno.prototype.getSelectCarrera = function(){
	return $('#AlumnoSelectCarrera').val();
}

FormModelAlumno.prototype.setSelectCarrera = function(valor){
	$('#AlumnoSelectCarrera').html(valor);
	
}

FormModelAlumno.prototype.getSelectAlumno = function(){
	return $('#AlumnoSelectAlumnos').val();
}

FormModelAlumno.prototype.setSelectAlumno = function(valor){
	$('#AlumnoSelectAlumnos').html(valor);
	
}

FormModelAlumno.prototype.getMatricula = function(){
	return $('#AlumnoTxtMatricula').val();
}

FormModelAlumno.prototype.setMatricula = function(valor){
	$('#AlumnoTxtMatricula').val(valor);
	
}


FormModelAlumno.prototype.getPaterno = function(){
	return $('#AlumnoTxtPaterno').val();
}

FormModelAlumno.prototype.setPaterno = function(valor){
	$('#AlumnoTxtPaterno').val(valor);
	
}

FormModelAlumno.prototype.getMaterno = function(){
	return $('#AlumnoTxtMaterno').val();
}

FormModelAlumno.prototype.setMaterno = function(valor){
	$('#AlumnoTxtMaterno').val(valor);
	
}

FormModelAlumno.prototype.getNombre = function(){
	return $('#AlumnoTxtNombre').val();
}

FormModelAlumno.prototype.setNombre = function(valor){
	$('#AlumnoTxtNombre').val(valor);
	
}

FormModelAlumno.prototype.getSexoMasculino = function(){
	return $('#AlumnoSexoM').is(':checked');
}

FormModelAlumno.prototype.setSexoMasculino = function(valor){
	$('#AlumnoSexoM').prop("checked",valor);
	
}

FormModelAlumno.prototype.getSexoFemenino = function(){
	return $('#AlumnoSexoF').is(':checked');
}

FormModelAlumno.prototype.setSexoFemenino = function(valor){
	$('#AlumnoSexoF').prop("checked",valor);
	
}


FormModelAlumno.prototype.getActivo = function(){
	return $('#AlumnoActivo').is(':checked');
}

FormModelAlumno.prototype.setActivo = function(valor){
	$('#AlumnoActivo').prop("checked",valor);
	
}

FormModelAlumno.prototype.getBajaTemporal = function(){
	return $('#AlumnoBajaTemporal').is(':checked');
}

FormModelAlumno.prototype.setBajaTemporal = function(valor){
	$('#AlumnoBajaTemporal').prop("checked",valor);
	
}

FormModelAlumno.prototype.getBajaDefinitiva = function(){
	return $('#AlumnoBajaDefinitiva').is(':checked');
}

FormModelAlumno.prototype.setBajaDefinitiva = function(valor){
	$('#AlumnoBajaDefinitiva').prop("checked",valor);
	
}


FormModelAlumno.prototype.getSistemaEscolarizado = function(){
	return $('#AlumnoEscolarizado').is(':checked');
}

FormModelAlumno.prototype.setSistemaEscolarizado = function(valor){
	$('#AlumnoEscolarizado').prop("checked",valor);
	
}

FormModelAlumno.prototype.getSistemaSemi = function(){
	return $('#AlumnoSemiEscolarizado').is(':checked');
}

FormModelAlumno.prototype.setSistemaSemi = function(valor){
	$('#AlumnoSemiEscolarizado').prop("checked",valor);
	
}


FormModelAlumno.prototype.getStatusLiberado = function(){
	return $('#AlumnoStatus1').is(':checked');
}

FormModelAlumno.prototype.setStatusLiberado = function(valor){
	$('#AlumnoStatus1').prop("checked",valor);
	
}

FormModelAlumno.prototype.getStatusNoLiberado = function(){
	return $('#AlumnoStatus0').is(':checked');
}

FormModelAlumno.prototype.setStatusNoLiberado = function(valor){
	$('#AlumnoStatus0').prop("checked",valor);
	
}

FormModelAlumno.prototype.getFechaLiberacion = function(){
	return $('#AlumnoTxtFechaLib').val();
}

FormModelAlumno.prototype.setFechaLiberacion = function(valor){
	$('#AlumnoTxtFechaLib').val(valor);
	
}

FormModelAlumno.prototype.getEMail = function(){
	return $('#AlumnoTxtEmail').val();
}

FormModelAlumno.prototype.setEMail = function(valor){
	$('#AlumnoTxtEmail').val(valor);
	
}


/* temina la sección de altas y modificaciones de alumnos
 * inicia la sección de busqueda
 * */

FormModelAlumno.prototype.getSelectAlumnosBusqueda = function(){
	return $('#AlumnoSelectBusqueda').val();
}

FormModelAlumno.prototype.setSelectAlumnosBusqueda = function(valor){
	$('#AlumnoSelectBusqueda').html(valor);
	
}

/* termina la sección de busqueda e inici la sección de historial de alumno*/
FormModelAlumno.prototype.setTablaHistorial = function(valor){
	$('#tbodyHistorial').html(valor);
	
}

