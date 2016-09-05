var FormControllerCampus = function(){
	
	this.formModelCampus = new FormModelCampus();
	
	this.btnCrear_clicked = function(){
		alert('btnCrear_clicked');
		
	}
	
	this.btnModificar_clicked = function(){
		alert('btnCrear_clicked');
	}

	this.btnEliminar_clicked = function(){
		alert('btnCrear_clicked');
	}
	
	this.loadCampus = function(){
		alert('loadCampus');
		/*
		$('#myPleaseWait').modal('show');
        var selectedText = $('#selectCampus').find("option:selected").text();
        if(selectedText.length == 0){
        	new FormModelCampus().setCampusNombre('');
        	new FormModelCampus().setCampusDireccion('');
    		$('#myPleaseWait').modal('hide');
        	return false;
        }
        $.post('ServletCampusByNombre',{
        	txtNombreComercial: selectedText
        }).done(function(data){
        	new FormModelCampus().setCampusNombre(data.nombre_Comercial);
        	new FormModelCampus().setCampusDireccion(data.direccion);
        }).always(function(){
    		$('#myPleaseWait').modal('hide');
        });
        */
	}

	this.loadAllCampuss = function(){
		alert('loadAllCampus');
		/*
		
		$('#myPleaseWait').modal('show');
		$.post('ServletCampusfindAll',{
			
		}).done(function(data){
			var selectCampus ="<select	class=\"form-control\" id=\"selectCampus\">";
				selectCampus +="<option></option>";
			for(var i = 0; i < data.length; i++){
				selectCampus +="<option value='"+data[i].idCampus+"'>"+data[i].nombre_Comercial+"</option>";
				
			}
			selectCampus +="</select>";
			 new FormModelCampus().setSelectCampus(selectCampus);
		}).fail(function(e){
			alert("Error: " + e);
		}).always(function(){
			$('#myPleaseWait').modal('hide');
		});
		*/
	}
	
};

FormControllerCampus.prototype.init = function(){
	var self = this;
	/*
	$('#btnCrearCampus').click(function(event){
		event.preventDefault();
		self.btnCrear_clicked();
	});
	$('#btnModificarCampus').click(function(event){
		event.preventDefault();
		self.btnModificar_clicked();
	});
	$('#btnEliminarCampus').click(function(event){
		event.preventDefault();
		self.btnEliminar_clicked();
	});

    $("#selectCampus").change(function () {
    	event.preventDefault();
    	self.loadCampus();
    });
    */
	self.loadAllCampuss();
}

/** LoadFunctionInit **//*
$(document).ready(function() {
  new FormControllerCampus().init();
  alert(4);
});*/