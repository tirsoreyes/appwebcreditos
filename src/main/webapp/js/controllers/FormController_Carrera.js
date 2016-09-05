var FormControllerCarrera = function(){
	
	this.formModelCarrera = new FormModelCarrera();
	
	this.btnCrear_clicked = function(){
		alert('btnCrear_clicked');
		
		
	}
	
	this.btnModificar_clicked = function(){
		alert('btnModificar_clicked');
	}

	this.btnEliminar_clicked = function(){
		alert('btnEliminar_clicked');
	}
	
	this.loadCarrera = function(){
		alert('loadCarrera');
		/*
		$('#myPleaseWait').modal('show');
        var selectedText = $('#selectCarrera').find("option:selected").text();
        if(selectedText.length == 0){
        	new FormModelCarrera().setCarreraApellido_Paterno('');
        	new FormModelCarrera().setCarreraApellido_Materno('');
    		$('#myPleaseWait').modal('hide');
        	return false;
        }
        $.post('ServletCarreraByApellido_Paterno',{
        	txtApellido_Paterno: selectedText
        }).done(function(data){
        	new FormModelCarrera().setCarreraApellido_Paterno(data.Apellido_Paterno);
        	new FormModelCarrera().setCarreraApellido_Materno(data.Apellido_Materno);
        }).always(function(){
    		$('#myPleaseWait').modal('hide');
        });
        */
	}

	this.loadAllCarreras = function(){
		alert('loadAllCarreras');
		/*
		$('#myPleaseWait').modal('show');
		$.post('ServletCarrerafindAll',{
			
		}).done(function(data){
			var selectCarrera ="<select	class=\"form-control\" id=\"selectCarrera\">";
				selectCarrera +="<option></option>";
			for(var i = 0; i < data.length; i++){
				selectCarrera +="<option>"+data[i].Apellido_Paterno+"</option>";
			}
			selectCarrera +="</select>";
			 new FormModelCarrera().setSelectCarrera(selectCarrera);
		}).fail(function(e){
			alert("Error: " + e);
		}).always(function(){
			$('#myPleaseWait').modal('hide');
		})
		*/
	}
	
};

FormControllerCarrera.prototype.init = function(){
	var self = this;
	/*
	$('#btnCrearCarrera').click(function(event){
		event.preventDefault();
		self.btnCrear_clicked();
	});
	$('#btnModificarCarrera').click(function(event){
		event.preventDefault();
		self.btnModificar_clicked();
	});
	$('#btnEliminarCarrera').click(function(event){
		event.preventDefault();
		self.btnEliminar_clicked();
	});

    $("#selectCarrera").change(function () {
    	self.loadCarrera();
    });
    */
	self.loadAllCarreras();
}

/** LoadFunctionInit **//*
$(document).ready(function() {
  new FormControllerCarrera().init();
  alert(4);
});*/