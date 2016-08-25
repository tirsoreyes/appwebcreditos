var FormControllerGrupo = function() {

	this.formModelGrupo = new FormModelGrupo();

	/* funciones */

	this.selectloadAllGrupos = function() {
		alert('selectloadAllGrupos');
		/*
		$('#myPleaseWait').modal('show');
		$
				.post('ServletEmpresafindAll', {

				})
				.done(
						function(data) {
							var selectEmpresa = "<select	class=\"form-control\" id=\"selectEmpresa\">";
							selectEmpresa += "<option></option>";
							for (var i = 0; i < data.length; i++) {
								selectEmpresa += "<option value='"+data[i].idEmpresa+"'>"+ data[i].nombre_Comercial
										+ "</option>";
							}
							selectEmpresa += "</select>";
							new FormModelGrupo()
									.setSelectEmpresaGrupo(selectEmpresa);
						}).fail(function(e) {
					alert("Error: " + e);
				}).always(function() {
					$('#myPleaseWait').modal('hide');
				})
				*/
	}

	

	

	this.selectGrupo_load = function() {
		alert('selectGrupo_load');
		/*
		$('#myPleaseWait').modal('show');
		
		
		var selectedText = $('#selectEmpresaGrupo').find("option:selected").text();
		    if(selectedText.length == 0){
        	new FormModelGrupo().setSelectEmpresaGrupo('');
        	return false;
        }
		$.post('ServletGrupofindByEmpresa',{
			txtNombreComercial: selectedText
			
		}).done(function(data){
			var selectGrupo ="<select	class=\"form-control\" id=\"selectGrupo\">";
				selectGrupo +="<option></option>";
			for(var i = 0; i < data.length; i++){
				selectGrupo +="<option>"+data[i].nombre+"</option>";
			}
			selectGrupo +="</select>";
			 new FormModelGrupo().setSelectGrupo(selectGrupo);
		}).fail(function(e){
			alert("Error: " + e);
		}).always(function(){
			$('#myPleaseWait').modal('hide');
		});

		*/
	}

	this.selectGrupo_change = function() {

		alert('selectGrupo_change');

	}

	this.selctUsuariosAsignados_load = function() {
		alert('selectUsuariosAsignados_load');

	}

	this.selectUsuariosSinAsignar_load = function() {
		alert('selectUsuariosSinAsignar_load');

	}

	this.btnAgregarUsuario_clicked = function() {
		alert('btnAgregarUsuario_clicked');

	}

	this.btnQuitarUsuario_clicked = function() {
		alert('btnQuitarUsuario_clicked');
	}

};

/* activando escucha de los controles */

FormControllerGrupo.prototype.init = function() {
	var self = this;
	/*

	$('#selectEmpresaGrupo').change(function(event) {
		event.preventDefault();
		self.selectGrupo_load();
		

	});

	$('#selectGrupo').change(function(event) {
		event.preventDefault();
		self.selectGrupo_change();
	});

	$('#btnAgregarUsuario').click(function(event) {
		event.preventDefault();
		self.btnAgregarUsuario_clicked();
	});
	$('#btnQuitarUsuario').click(function(event) {
		event.preventDefault();
		self.btnQuitarUsuario_clicked();
	});
	*/
	self.selectloadAllGrupos();

}

/** LoadFunctionInit * */
/*
 * $(document).ready(function() { new FormControllerGrupo().init(); alert(4);
 * });
 */