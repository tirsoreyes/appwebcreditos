<div class="container-fluid">
	<div class="row">
		<div class="panel panel-info">
			<div class="panel-heading">
				<span class="glyphicon glyphicon-book"> Cursos</span>
			</div>
			<div class="panel-body">
				<form role="form">

					<div class="form-group">
						<label for="selectCurso">Seleccionar Curso:</label> <select
							class="form-control" id="selectCurso">
							<option>Curso A</option>
							<option>Curso B</option>
						</select>
					</div>

					<div class="form-group">
						<label for="selectCampus">Seleccionar Campus:</label> <select
							class="form-control" id="selectCampus">
							<option>Campus A</option>
							<option>Campus B</option>
						</select>
					</div>
					<div class="form-group">
						<label for="selectCredito">Seleccionar Credito:</label> <select
							class="form-control" id="selectCredito">
							<option>Credito A</option>
							<option>Credito B</option>
						</select>
					</div>
					<div class="form-group">
						<label for="selectProfesor">Seleccionar Profesor:</label> <select
							class="form-control" id="selectProfesor">
							<option>Profesor A</option>
							<option>Profesor B</option>
						</select>
					</div>
					<div class="form-group">
						<label for="selectPeriodo">Seleccionar Periodo:</label> <select
							class="form-control" id="selectPeriodo">
							<option>Periodo A</option>
							<option>Periodo B</option>
						</select>
					</div>

					<div class="form-group">
						<label for="txtFechaInicio">Fecha de Inicio</label> <input
							type="text" class="form-control" id="txtFechaInicio"
							placeholder="Ingrese la fecha de inicio del curso">
					</div>
					<div class="form-group">
						<label for="txtFechaFin">Fecha Fin</label> <input type="text"
							class="form-control" id="txtFechaFin"
							placeholder="fecha de find e curso">
					</div>
					<div class="form-group">
						<label for="txtHorario">Horario</label> <input type="text"
							class="form-control" id="txtHorario"
							placeholder="horario del curso">
					</div>
					<button type="submit" class="btn btn-info">
						<span class="glyphicon glyphicon-ok"></span> Crear
					</button>
					<button type="submit" class="btn btn-info">
						<span class="glyphicon glyphicon-edit"></span> Modificar
					</button>
					<button type="submit" class="btn btn-info">
						<span class="glyphicon glyphicon-trash"></span> Eliminar
					</button>
			<!-- Sección control de alumnos inscritos al curso -->
					<div class="form-group">
						<label for="selectAlumnosAsignados">Alumnos asignados</label> <select
							multiple class="form-control" id="selectAlumnosAsignados">
							<option>Pepito</option>
							<option>Fulanito</option>
						</select>

						<button type="submit" id="btnQuitarUsuario" class="btn btn-info">
							<span class="glyphicon glyphicon-chevron-down"></span> Quitar
						</button>
						<button type="submit" id="btnAgregarUsuario" class="btn btn-info"
							id="btnAgregarUsuario">
							<span class="glyphicon glyphicon-chevron-up"></span> Agregar
						</button>

						<select multiple class="form-control"
							id="selectAlumnosSinAsignar">
							<option>Juan</option>
							<option>Pepe</option>
						</select><label for="selectAlumnosSinAsignar">Alumnos sin asignar</label>
					</div>



				</form>
			</div>
		</div>
	</div>
</div>