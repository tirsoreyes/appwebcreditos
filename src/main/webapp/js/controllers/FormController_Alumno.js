var FormControllerAlumno = function() {

	this.formModelAlumno = new FormModelAlumno();

	this.resetForm = function() {

		new FormModelAlumno().setMatricula('');
		new FormModelAlumno().setNombre('');
		new FormModelAlumno().setPaterno('');
		new FormModelAlumno().setMaterno('');
		new FormModelAlumno().setSexoMasculino(false);
		new FormModelAlumno().setSexoFemenino(false);
		new FormModelAlumno().setActivo(false);
		new FormModelAlumno().setBajaTemporal(false);
		new FormModelAlumno().setBajaDefinitiva(false);
		new FormModelAlumno().setSistemaEscolarizado(false);
		new FormModelAlumno().setSistemaSemi(false);
		new FormModelAlumno().setStatusLiberado(false);
		new FormModelAlumno().setStatusNoLiberado(false);
		new FormModelAlumno().setFechaLiberacion('');
		new FormModelAlumno().setEMail('');

	}

	this.loadAllCarreras = function() {

		self = this;

		$('#myPleaseWait').modal('show');
		$
				.post('ServletCarreraFindAll', {

				})
				.done(
						function(data) {
							var selectCarrera = "<select	class=\"form-control\" id=\"AlumnoSelectCarrera\">";
							selectCarrera += "<option value='0'></option>";
							for (var i = 0; i < data.length; i++) {
								selectCarrera += "<option value="
										+ data[i].idCarrera + ">"
										+ data[i].nombre + "</option>";
							}
							selectCarrera += "</select>";
							new FormModelAlumno()
									.setSelectCarrera(selectCarrera);

						}).fail(function(e) {
					alert("Error: " + e);
				}).always(function() {
					$('#myPleaseWait').modal('hide');
				});
		var selectAlumnos = "<select class='form-control' id='AlumnoSelectAlumnos'>"
			+ "<option value='0'></option></select>"

	   new FormModelAlumno().setSelectAlumno(selectAlumnos);
		self.resetForm();

	}

	this.loadAlumnos_x_carrera = function() {
		self = this;

		$('#myPleaseWait').modal('show');
		var selectedCarrera = $('#AlumnoSelectCarrera').find("option:selected")
				.val();

		var selectAlumnos = "<select class='form-control' id='AlumnoSelectAlumnos'>" +
				"<option value='0'></option>";

		if (selectedCarrera == 0) {
			$('#myPleaseWait').modal('hide');
			self.resetForm();
			return false;
		}
		$.post('ServletAlumnoByCarrera', {
			idCarrera : selectedCarrera
		}).done(function(data) {
			
			for (var i = 0; i < data.length; i++) {
				
				selectAlumnos+="<option value="+data[i].matricula+">"+data[i].matricula+" "+data[i].apellidoPaterno+" "+
				data[i].apellidoMaterno+" "+data[i].nombre+"</option>";

			}
			selectAlumnos+="</select>";
			new FormModelAlumno().setSelectAlumno(selectAlumnos);
			self.resetForm();

		}).always(function() {
			$('#myPleaseWait').modal('hide');
		});

	}

	this.loadAlumno = function() {
		self = this;

		$('#myPleaseWait').modal('show');
		var selectedAlumno = $('#AlumnoSelectAlumnos').find("option:selected")
				.val();

		
		if (selectedAlumno == 0) {
			$('#myPleaseWait').modal('hide');
			return false;
		}
		$.post('ServletAlumnoFindByMatricula', {
			Matricula : selectedAlumno
		}).done(function(data) {
				
			new FormModelAlumno().setMatricula(data.matricula);
			new FormModelAlumno().setPaterno(data.apellidoPaterno);
			new FormModelAlumno().setMaterno(data.apellidoMaterno);
			new FormModelAlumno().setNombre(data.nombre);
			
			if(data.sexo == 'M'){
				new FormModelAlumno().setSexoMasculino(true);
				new FormModelAlumno().setSexoFemenino(false);
			}else{

				new FormModelAlumno().setSexoMasculino(false);
				new FormModelAlumno().setSexoFemenino(true);
			}
			
			if(data.estatus == 1){
				new FormModelAlumno().setActivo(true);
				new FormModelAlumno().setBajaTemporal(false);
				new FormModelAlumno().setBajaDefinitiva(false);
			}else if (estatus==2){
				new FormModelAlumno().setActivo(false);
				new FormModelAlumno().setBajaTemporal(true);
				new FormModelAlumno().setBajaDefinitiva(false);	
			}else{

				new FormModelAlumno().setActivo(false);
				new FormModelAlumno().setBajaTemporal(false);
				new FormModelAlumno().setBajaDefinitiva(true);
				
			}

			
			if(data.sistema == 'S'){
				new FormModelAlumno().setSistemaEscolarizado(false);
				new FormModelAlumno().setSistemaSemi(true);
			}else{

				new FormModelAlumno().setSistemaEscolarizado(true);
				new FormModelAlumno().setSistemaSemi(false);
			}
			
			if(data.liberado == 1){
				new FormModelAlumno().setStatusLiberado(true);
				new FormModelAlumno().setStatusNoLiberado(false);
				new FormModelAlumno().setFechaLiberacion(data.fehcaLiberacion);
			}else{

				new FormModelAlumno().setStatusLiberado(false);
				new FormModelAlumno().setStatusNoLiberado(true);
				new FormModelAlumno().setFechaLiberacion('No liberado');
					
			}
			
			new FormModelAlumno().setEMail(data.email);
			
			
		}).always(function() {
			$('#myPleaseWait').modal('hide');
		});

	}

	
	this.btnCrear_clicked = function() {
		self = this;
		$('#myPleaseWait').modal('show');

		var selectedCarrera = $('#AlumnoSelectCarrera').find("option:selected").val();
		var selectedAlumno = $('#AlumnoSelectAlumnos').find("option:selected").val();
		var Matricula = this.formModelAlumno.getMatricula();
		var Paterno = this.formModelAlumno.getPaterno();
		var Materno = this.formModelAlumno.getMaterno();
		var Nombre = this.formModelAlumno.getNombre();
		
		var Sexo=-1;
		
		if(this.formModelAlumno.getSexoMasculino()==true){
			Sexo='M';
		}
		if(this.formModelAlumno.getSexoFemenino()==true){
			Sexo='F';
		}
		var Status=-1;
		if(this.formModelAlumno.getActivo()==true){
			Status=1;
		}
		if(this.formModelAlumno.getBajaTemporal()==true){
			Status=2;
		}
		if(this.formModelAlumno.getBajaDefinitiva()==true){
			Status=3;
		}
		var Sistema=-1;
		if(this.formModelAlumno.getSistemaEscolarizado()==true){
			Sistema='E';
		}
		if(this.formModelAlumno.getSistemaSemi()==true){
			Sistema="S";
		}
		var Liberado=-1;
		if(this.formModelAlumno.getStatusLiberado()==true){
			Liberado=1;
		}
		if(this.formModelAlumno.getStatusNoLiberado()==true){
			Liberado=0;
		}
		var Email = this.formModelAlumno.getEMail();
		
		
		
		
		if(selectedCarrera==0){
			$('#myPleaseWait').modal('hide');
			alert('No hay empresa seleccionada:');
			return false;
		}
	
		if(selectedAlumno!=0){
			$('#myPleaseWait').modal('hide');
			alert('Tiene un alumno seleccionado:');
			return false;
		}
	
		if(Matricula==0){
			$('#myPleaseWait').modal('hide');
			alert('Debe escribir una Matrícula:');
			return false;
		}
		
		if(Paterno==0){
			$('#myPleaseWait').modal('hide');
			alert('Debe escribir un Apellido Paterno:');
			return false;
		}
		
		if(Nombre==0){
			$('#myPleaseWait').modal('hide');
			alert('Debe escribir un Nombre:');
			return false;
		}
		
		if(Sexo == -1){
			$('#myPleaseWait').modal('hide');
			alert('Falta indicar el sexo del alumno:');
			return false;
		}
	
		if(Status == -1){
			$('#myPleaseWait').modal('hide');
			alert('Falta indicar el Status del alumno:');
			return false;
		}
		
		if(Sistema == -1){
			$('#myPleaseWait').modal('hide');
			
			alert('Falta indicar el Sistema:');
			return false;
		}
		
		
		  if (!/[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/.test(Email)){
			    $('#myPleaseWait').modal('hide');
					alert('Dirección de email no es valida');
					return false;
			   }
		  
		
		$.post('ServletAlumnoInsert', {
			
			idCarrera:selectedCarrera,
			txtMatricula:Matricula,
			txtPaterno:Paterno,
			txtMaterno:Materno,
			txtNombre:Nombre,
			txtSexo:Sexo,
			txtStatus:Status,
			txtSistema:Sistema,
			txtEmail:Email
			
			
		}).done(function(data) {
           if(data.resultado==true){
			self.resetForm();
			self.loadAlumnos_x_carrera();
           }
			alert(data.mensaje);
			
			
		}).always(function() {
			$('#myPleaseWait').modal('hide');
		});


	}

	this.btnModificar_clicked = function() {
		self = this;
		$('#myPleaseWait').modal('show');

		var selectedCarrera = $('#AlumnoSelectCarrera').find("option:selected").val();
		var selectedAlumno = $('#AlumnoSelectAlumnos').find("option:selected").val();
		var Matricula = this.formModelAlumno.getMatricula();
		var Paterno = this.formModelAlumno.getPaterno();
		var Materno = this.formModelAlumno.getMaterno();
		var Nombre = this.formModelAlumno.getNombre();
		
		var Sexo=-1;
		
		if(this.formModelAlumno.getSexoMasculino()==true){
			Sexo='M';
		}
		if(this.formModelAlumno.getSexoFemenino()==true){
			Sexo='F';
		}
		var Status=-1;
		if(this.formModelAlumno.getActivo()==true){
			Status=1;
		}
		if(this.formModelAlumno.getBajaTemporal()==true){
			Status=2;
		}
		if(this.formModelAlumno.getBajaDefinitiva()==true){
			Status=3;
		}
		var Sistema=-1;
		if(this.formModelAlumno.getSistemaEscolarizado()==true){
			Sistema='E';
		}
		if(this.formModelAlumno.getSistemaSemi()==true){
			Sistema="S";
		}
		var Liberado=-1;
		if(this.formModelAlumno.getStatusLiberado()==true){
			Liberado=1;
		}
		if(this.formModelAlumno.getStatusNoLiberado()==true){
			Liberado=0;
		}
		var Email = this.formModelAlumno.getEMail();
		
		
		
		
		if(selectedCarrera==0){
			$('#myPleaseWait').modal('hide');
			alert('No hay empresa seleccionada:');
			return false;
		}
	
		if(selectedAlumno==0){
			$('#myPleaseWait').modal('hide');
			alert('Seleccione un alumno:');
			return false;
		}
	
		if(Matricula!=selectedAlumno){
			$('#myPleaseWait').modal('hide');
			alert('La matrícula es un dato único que no debe ser modificado:');
			return false;
		}
		
		if(Paterno==0){
			$('#myPleaseWait').modal('hide');
			alert('Debe escribir un Apellido Paterno:');
			return false;
		}
		
		if(Nombre==0){
			$('#myPleaseWait').modal('hide');
			alert('Debe escribir un Nombre:');
			return false;
		}
		
		if(Sexo == -1){
			$('#myPleaseWait').modal('hide');
			alert('Falta indicar el sexo del alumno:');
			return false;
		}
	
		if(Status == -1){
			$('#myPleaseWait').modal('hide');
			alert('Falta indicar el Status del alumno:');
			return false;
		}
		
		if(Sistema == -1){
			$('#myPleaseWait').modal('hide');
			
			alert('Falta indicar el Sistema:');
			return false;
		}
		
		
		  if (!/[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?/.test(Email)){
			    $('#myPleaseWait').modal('hide');
					alert('Dirección de email no es valida');
					return false;
			   }
		  
		
		$.post('ServletAlumnoUpdate', {
			
			idCarrera:selectedCarrera,
			txtMatricula:selectedAlumno,
			txtPaterno:Paterno,
			txtMaterno:Materno,
			txtNombre:Nombre,
			txtSexo:Sexo,
			txtStatus:Status,
			txtSistema:Sistema,
			txtEmail:Email
			
			
		}).done(function(data) {
           if(data.resultado==true){
			self.resetForm();
			self.loadAlumnos_x_carrera();
           }
			alert(data.mensaje);
			
			
		}).always(function() {
			$('#myPleaseWait').modal('hide');
		});


		
		
		
	}

	

};

FormControllerAlumno.prototype.init = function() {
	var self = this;

	$("#AlumnoSelectCarrera").change(function(event) {
		event.preventDefault();
		self.loadAlumnos_x_carrera();
	});
	
	$("#AlumnoSelectAlumnos").change(function(event) {
		event.preventDefault();
		self.loadAlumno();
	});
	
	
	$('#AlumnobtnAgregar').click(function(event){ 
	  event.preventDefault();
	  self.btnCrear_clicked(); 
	  });
	  
	$('#AlumnobtnModificar').click(function(event){ 
		event.preventDefault();
		self.btnModificar_clicked(); 
	  });
	  
	
	/*
	 * 
	 * 
	 * $('#btnEliminarAlumno').click(function(event){ event.preventDefault();
	 * self.btnEliminar_clicked(); });
	 * 
	 * $("#selectAlumno").change(function () { self.loadAlumno(); });
	 */
	self.loadAllCarreras();
}

/** LoadFunctionInit * */
/*
 * $(document).ready(function() { new FormControllerAlumno().init(); alert(4);
 * });
 */