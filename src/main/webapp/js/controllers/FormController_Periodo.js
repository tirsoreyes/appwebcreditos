var FormControllerPeriodo = function(){
	
	this.formModelPeriodo = new FormModelPeriodo();
	
	this.btnCrear_clicked = function(){
		alert('btnCrear_clicked');
				
	}
	
	this.btnModificar_clicked = function(){
		alert('btnCrear_clicked');
	}

	this.btnEliminar_clicked = function(){
		alert('btnCrear_clicked');
	}
	
	this.loadPeriodo = function(){
		alert('loadPeriodo');
		/*
		$('#myPleaseWait').modal('show');
        var selectedText = $('#selectHorario').find("option:selected").text();
        if(selectedText.length == 0){
        	new FormModelHorario().setHorarioHora('');
        	new FormModelHorario().setHorarioEMPRESA_IdEmpresa('');
    		$('#myPleaseWait').modal('hide');
        	return false;
        }
        $.post('ServletHorarioByHora',{
        	txtHora: selectedText
        }).done(function(data){
        	new FormModelHorario().setHorarioHora(data.Hora);
        	new FormModelHorario().setHorarioEMPRESA_IdEmpresa(data.EMPRESA_IdEmpresa);
        }).always(function(){
    		$('#myPleaseWait').modal('hide');
        });
        */
	}

	this.loadAllPeriodos = function(){
		alert('loadAllPeriodos');
		/*
		$('#myPleaseWait').modal('show');
		$.post('ServletHorariofindAll',{
			
		}).done(function(data){
			var selectHorario ="<select	class=\"form-control\" id=\"selectHorario\">";
				selectHorario +="<option></option>";
			for(var i = 0; i < data.length; i++){
				selectHorario +="<option>"+data[i].Hora+"</option>";
			}
			selectHorario +="</select>";
			 new FormModelHorario().setSelectHorario(selectHorario);
		}).fail(function(e){
			alert("Error: " + e);
		}).always(function(){
			$('#myPleaseWait').modal('hide');
		})
		*/
	}
	
};

FormControllerPeriodo.prototype.init = function(){
	var self = this;
	/*
	$('#btnCrearHorario').click(function(event){
		event.preventDefault();
		self.btnCrear_clicked();
	});
	$('#btnModificarHorario').click(function(event){
		event.preventDefault();
		self.btnModificar_clicked();
	});
	$('#btnEliminarHorario').click(function(event){
		event.preventDefault();
		self.btnEliminar_clicked();
	});

    $("#selectHorario").change(function () {
    	self.loadHorario();
    });
    */
	self.loadAllPeriodos();
}

/** LoadFunctionInit **//*
$(document).ready(function() {
  new FormControllerHorario().init();
  alert(4);
});*/