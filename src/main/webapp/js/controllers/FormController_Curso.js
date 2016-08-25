var FormControllerCurso = function(){
	
	this.formModelCurso = new FormModelCurso();
	
	this.btnCrear_clicked = function(){
		alert('btnCrear_clicked');
		
		
	}
	
	this.btnModificar_clicked = function(){
		alert('btnModificar_clicked');
	}

	this.btnEliminar_clicked = function(){
		alert('btnEliminar_clicked');
	}
	
	this.loadCurso = function(){
		alert('loadCurso');
		/*
		 * $('#myPleaseWait').modal('show'); var selectedText =
		 * $('#selectCurso').find("option:selected").text();
		 * if(selectedText.length == 0){ new
		 * FormModelCurso().setCursoApellido_Paterno(''); new
		 * FormModelCurso().setCursoApellido_Materno('');
		 * $('#myPleaseWait').modal('hide'); return false; }
		 * $.post('ServletCursoByApellido_Paterno',{ txtApellido_Paterno:
		 * selectedText }).done(function(data){ new
		 * FormModelCurso().setCursoApellido_Paterno(data.Apellido_Paterno); new
		 * FormModelCurso().setCursoApellido_Materno(data.Apellido_Materno);
		 * }).always(function(){ $('#myPleaseWait').modal('hide'); });
		 */
	}

	this.loadAllCursos = function(){
		alert('loadAllCursos');
		/*
		 * $('#myPleaseWait').modal('show'); $.post('ServletCursofindAll',{
		 * 
		 * }).done(function(data){ var selectCurso ="<select
		 * class=\"form-control\" id=\"selectCurso\">"; selectCurso +="<option></option>";
		 * for(var i = 0; i < data.length; i++){ selectCurso +="<option>"+data[i].Apellido_Paterno+"</option>"; }
		 * selectCurso +="</select>"; new
		 * FormModelCurso().setSelectCurso(selectCurso); }).fail(function(e){
		 * alert("Error: " + e); }).always(function(){
		 * $('#myPleaseWait').modal('hide'); }) }
		 */
	}
};

FormControllerCurso.prototype.init = function(){
	var self = this;
	/*
	 * $('#btnCrearCurso').click(function(event){ event.preventDefault();
	 * self.btnCrear_clicked(); });
	 * $('#btnModificarCurso').click(function(event){ event.preventDefault();
	 * self.btnModificar_clicked(); });
	 * $('#btnEliminarCurso').click(function(event){ event.preventDefault();
	 * self.btnEliminar_clicked(); });
	 * 
	 * $("#selectCurso").change(function () { self.loadCurso(); });
	 */
	self.loadAllCursos();
}

/** LoadFunctionInit * *//*
						 * $(document).ready(function() { new
						 * FormControllerCurso().init(); alert(4); });
						 */