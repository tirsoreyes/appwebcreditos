
var FormControllerLogin = function(){
	
	this.formModelLogin = new FormModelLogin();
	
	this.btnIngresar_clicked = function(){
		$('#myPleaseWait').modal('show');
		$.post('ServletUsuarioLogin',{
			txtUsuarioLogin: this.formModelLogin.getUsuario(),
			txtContrasenaLogin: this.formModelLogin.getContrasena()
		}).done(function(data){
			if(data.correcto == "true"){
				window.location.href="ServletMenuPrincipal";
			}else{
				alert(data.mensajeGeneral);
			}
		}).fail(function(e){
			alert("Error: " + e);
		}).always(function(){
			$('#myPleaseWait').modal('hide');
		});
	}
};

FormControllerLogin.prototype.init = function(){

    var self = this;
	$('#btnIngresar').click(function(event){
		event.preventDefault();
		self.btnIngresar_clicked();
	});
}

/** LoadFunctionInit **/
$(document).ready(function() {
  new FormControllerLogin().init();
});