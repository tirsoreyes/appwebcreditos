var FormControllerUsuario = function(){
	
	this.formModelUsuario = new FormModelUsuario();
	
	this.btnCrear_clicked = function(){
		alert('btnCrear_clicked');
		
	}
	
	this.btnModificar_clicked = function(){
		alert('btnModificar_clicked');
	}

	this.btnEliminar_clicked = function(){
		alert('btnEliminar_clicked');
	}
	
	this.loadUsuario = function(){
		alert('loadUsuario');
		/*
		$('#myPleaseWait').modal('show');
        var selectedText = $('#selectUsuario').find("option:selected").text();
        if(selectedText.length == 0){
        	new FormModelUsuario().setUsuarioApellido_Paterno('');
        	new FormModelUsuario().setUsuarioApellido_Materno('');
    		$('#myPleaseWait').modal('hide');
        	return false;
        }
        $.post('ServletUsuarioByApellido_Paterno',{
        	txtApellido_Paterno: selectedText
        }).done(function(data){
        	new FormModelUsuario().setUsuarioApellido_Paterno(data.Apellido_Paterno);
        	new FormModelUsuario().setUsuarioApellido_Materno(data.Apellido_Materno);
        }).always(function(){
    		$('#myPleaseWait').modal('hide');
        });
        */
	}

	this.loadAllUsuarios = function(){
		alert('loadAllUsuarios');
	}
		/*
		$('#myPleaseWait').modal('show');
		$.post('ServletUsuariofindAll',{
			
		}).done(function(data){
			var selectUsuario ="<select	class=\"form-control\" id=\"selectUsuario\">";
				selectUsuario +="<option></option>";
			for(var i = 0; i < data.length; i++){
				selectUsuario +="<option>"+data[i].Apellido_Paterno+"</option>";
			}
			selectUsuario +="</select>";
			 new FormModelUsuario().setSelectUsuario(selectUsuario);
		}).fail(function(e){
			alert("Error: " + e);
		}).always(function(){
			$('#myPleaseWait').modal('hide');
		})
	}
	*/
	
};

FormControllerUsuario.prototype.init = function(){
	var self = this;
	/*
	$('#btnCrearUsuario').click(function(event){
		event.preventDefault();
		self.btnCrear_clicked();
	});
	$('#btnModificarUsuario').click(function(event){
		event.preventDefault();
		self.btnModificar_clicked();
	});
	$('#btnEliminarUsuario').click(function(event){
		event.preventDefault();
		self.btnEliminar_clicked();
	});

    $("#selectUsuario").change(function () {
    	self.loadUsuario();
    });
    */
	self.loadAllUsuarios();
}

/** LoadFunctionInit **//*
$(document).ready(function() {
  new FormControllerUsuario().init();
  alert(4);
});*/