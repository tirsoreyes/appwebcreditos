var FormControllerCredito = function(){
	
	this.formModelCredito = new FormModelCredito();
	
	this.btnCrear_clicked = function(){
		alert('btnCrear_clicked');
		
		
		
	}
	
	this.btnModificar_clicked = function(){
		alert('btnCrear_clicked');
	}

	this.btnEliminar_clicked = function(){
		alert('btnCrear_clicked');
	}
	
	this.loadCredito = function(){
		alert('loadCredito');
		/*
		$('#myPleaseWait').modal('show');
        var selectedText = $('#selectCredito').find("option:selected").text();
        if(selectedText.length == 0){
        	new FormModelCredito().setCreditoStatus('');
        	new FormModelCredito().setCreditoCLIENTE_IdCliente('');
    		$('#myPleaseWait').modal('hide');
        	return false;
        }
        $.post('ServletCreditoByStatus',{
        	txtStatus: selectedText
        }).done(function(data){
        	new FormModelCredito().setCreditoStatus(data.Status);
        	new FormModelCredito().setCreditoCLIENTE_IdCliente(data.CLIENTE_IdCliente);
        }).always(function(){
    		$('#myPleaseWait').modal('hide');
        });
        */
	}

	this.loadAllCreditos = function(){
		alert('loadAllCreditos');
		/*
		$('#myPleaseWait').modal('show');
		$.post('ServletCreditofindAll',{
			
		}).done(function(data){
			var selectCredito ="<select	class=\"form-control\" id=\"selectCredito\">";
				selectCredito +="<option></option>";
			for(var i = 0; i < data.length; i++){
				selectCredito +="<option>"+data[i].Status+"</option>";
			}
			selectCredito +="</select>";
			 new FormModelCredito().setSelectCredito(selectCredito);
		}).fail(function(e){
			alert("Error: " + e);
		}).always(function(){
			$('#myPleaseWait').modal('hide');
		})
		*/
	}
	
};

FormControllerCredito.prototype.init = function(){
	var self = this;
	/*
	$('#btnCrearCredito').click(function(event){
		event.preventDefault();
		self.btnCrear_clicked();
	});
	$('#btnModificarCredito').click(function(event){
		event.preventDefault();
		self.btnModificar_clicked();
	});
	$('#btnEliminarCredito').click(function(event){
		event.preventDefault();
		self.btnEliminar_clicked();
	});

    $("#selectCredito").change(function () {
    	self.loadCredito();
    });
    */
	self.loadAllCreditos();
}

/** LoadFunctionInit **//*
$(document).ready(function() {
  new FormControllerCredito().init();
  alert(4);
});*/