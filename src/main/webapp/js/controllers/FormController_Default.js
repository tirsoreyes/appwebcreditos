var FormControllerDefault = function() {

	this.formModelDefault = new FormModelDefault();

	this.btnCrear_clicked = function() {
		alert('btnCrear_clicked');

	}

	this.btnModificar_clicked = function() {
		alert('btnModificar_clicked');
	}

	this.btnEliminar_clicked = function() {
		alert('btnEliminar_clicked');
	}

	this.loadDefault = function() {
		/*
		 * $('#myPleaseWait').modal('show'); var selectedText =
		 * $('#selectDefault').find("option:selected").text();
		 * if(selectedText.length == 0){ new
		 * FormModelDefault().setDefaultApellido_Paterno(''); new
		 * FormModelDefault().setDefaultApellido_Materno('');
		 * $('#myPleaseWait').modal('hide'); return false; }
		 * $.post('ServletDefaultByApellido_Paterno',{ txtApellido_Paterno:
		 * selectedText }).done(function(data){ new
		 * FormModelDefault().setDefaultApellido_Paterno(data.Apellido_Paterno);
		 * new
		 * FormModelDefault().setDefaultApellido_Materno(data.Apellido_Materno);
		 * }).always(function(){ $('#myPleaseWait').modal('hide'); });
		 */
	}

	this.loadAllDefaults = function() {
		alert('loadAllDefault');
		/*
		 * $('#myPleaseWait').modal('show'); $.post('ServletDefaultfindAll',{
		 * 
		 * }).done(function(data){ var selectDefault ="<select
		 * class=\"form-control\" id=\"selectDefault\">"; selectDefault +="<option></option>";
		 * for(var i = 0; i < data.length; i++){ selectDefault +="<option>"+data[i].Apellido_Paterno+"</option>"; }
		 * selectDefault +="</select>"; new
		 * FormModelDefault().setSelectDefault(selectDefault);
		 * }).fail(function(e){ alert("Error: " + e); }).always(function(){
		 * $('#myPleaseWait').modal('hide'); })
		 */
	}

};

FormControllerDefault.prototype.init = function() {
	var self = this;

	/*
	 * $('#btnCrearDefault').click(function(event){ event.preventDefault();
	 * self.btnCrear_clicked(); });
	 * $('#btnModificarDefault').click(function(event){ event.preventDefault();
	 * self.btnModificar_clicked(); });
	 * $('#btnEliminarDefault').click(function(event){ event.preventDefault();
	 * self.btnEliminar_clicked(); });
	 * 
	 * $("#selectDefault").change(function () { self.loadDefault(); });
	 */
	self.loadAllDefaults();
}

/** LoadFunctionInit * */
/*
 * $(document).ready(function() { new FormControllerDefault().init(); alert(4);
 * });
 */