var FormModelLogin = function(){};

FormModelLogin.prototype.getUsuario = function(){
	return $('#txtUsuarioLogin').val();
}

FormModelLogin.prototype.getContrasena = function(){
	return $('#txtContrasenaLogin').val();
}

FormModelLogin.prototype.setUsuario = function(usuario){
	 $('#txtUsuarioLogin').val(usuario);
}

FormModelLogin.prototype.setContrasena = function(contrasena){
	 $('#txtContrasenaLogin').val(contrasena);
}