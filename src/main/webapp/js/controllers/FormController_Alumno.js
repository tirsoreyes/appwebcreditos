var FormControllerAlumno = function(){
	
	this.formModelAlumno = new FormModelAlumno();
	
	this.btnCrear_clicked = function(){
		alert('btnCrear_clicked');
		
		
	}
	
	this.btnModificar_clicked = function(){
		alert('btnModificar_clicked');
	}

	this.btnEliminar_clicked = function(){
		alert('btnEliminar_clicked');
	}
	
	this.loadAlumno = function(){
		laert ('loadAlumno');
		
		$('#myPleaseWait').modal('show');
        var selectedText = $('#selectAlumno').find("option:selected").text();
        if(selectedText.length == 0){
        	new FormModelAlumno().setAlumnoApellido_Paterno('');
        	new FormModelAlumno().setAlumnoApellido_Materno('');
    		$('#myPleaseWait').modal('hide');
        	return false;
        }
        $.post('ServletAlumnoByMatricula',{
        	txtMatricula: selectedText
        }).done(function(data){
        	new FormModelAlumno().setAlumnoApellido_Paterno(data.Apellido_Paterno);
        	new FormModelAlumno().setAlumnoApellido_Materno(data.Apellido_Materno);
        }).always(function(){
    		$('#myPleaseWait').modal('hide');
        });
        
        
	}

	this.loadAllAlumnos = function(){
		alert('loadAllAlumnos');
		/*
		$('#myPleaseWait').modal('show');
		$.post('ServletAlumnofindAll',{
			
		}).done(function(data){
			var selectAlumno ="<select	class=\"form-control\" id=\"selectAlumno\">";
				selectAlumno +="<option></option>";
			for(var i = 0; i < data.length; i++){
				selectAlumno +="<option>"+data[i].Apellido_Paterno+"</option>";
			}
			selectAlumno +="</select>";
			 new FormModelAlumno().setSelectAlumno(selectAlumno);
		}).fail(function(e){
			alert("Error: " + e);
		}).always(function(){
			$('#myPleaseWait').modal('hide');
		})
		*/
	}
	
};

FormControllerAlumno.prototype.init = function(){
	var self = this;
	/*
	$('#btnCrearAlumno').click(function(event){
		event.preventDefault();
		self.btnCrear_clicked();
	});
	$('#btnModificarAlumno').click(function(event){
		event.preventDefault();
		self.btnModificar_clicked();
	});
	$('#btnEliminarAlumno').click(function(event){
		event.preventDefault();
		self.btnEliminar_clicked();
	});

    $("#selectAlumno").change(function () {
    	self.loadAlumno();
    });
    */
	self.loadAllAlumnos();
}

/** LoadFunctionInit **//*
$(document).ready(function() {
  new FormControllerAlumno().init();
  alert(4);
});*/