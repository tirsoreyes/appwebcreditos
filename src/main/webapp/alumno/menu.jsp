<div class="container-fluid">
	<div class="row">

		<div class="col-md-4">
			<div class="panel panel-info">
				<div class="panel-heading" align="center">
					<font size="4.5"> <span class="fa fa-graduation-cap"><strong>
								Alumnos</strong> </span></font>
				</div>
				<div class="panel-body">
					<form role="form">
						<div class="form-group">
							<label for="AlumnoSelectCarrera">Carrera:</label> <select
								class="form-control" id="AlumnoSelectCarrera">
								<option value="0"></option>

							</select>
						</div>

						<div class="form-group">
							<label for="AlumnoSelectAlumnos">Alumnos:</label> <select
								class="form-control" id="AlumnoSelectAlumnos">
								<option value='0'></option>
							</select>
						</div>
						
						<div class="form-group">
							<label for="AlumnoTxtMatricula">Matrícula:</label> <input
								type="text" class="form-control" id="AlumnoTxtMatricula"
								placeholder="Matrícula">
						</div>
						<div class="form-group">
							<label for="AlumnoTxtPaterno">Apellido Paterno:</label> <input
								type="text" class="form-control" id="AlumnoTxtPaterno"
								placeholder="Apellido Paterno">
						</div>
						<div class="form-group">
							<label for="AlumnoTxtMaterno">Apellido Materno:</label> <input
								type="text" class="form-control" id="AlumnoTxtMaterno"
								placeholder="Apellido Materno">
						</div>
						<div class="form-group">
							<label for="AlumnoTxtNombre">Nombre:</label> <input type="text"
								class="form-control" id="AlumnoTxtNombre" placeholder="Nombre">
						</div>

						<div class="form-group">
							<label for="AlumnoSexo">Sexo:</label><br> <input
								type="radio" name="alumnoSexo" value="AlumnoSexoM"
								id="AlumnoSexoM"> Masculino <input type="radio"
								name="alumnoSexo" value="AlumnoSexoF" id="AlumnoSexoF">
							Femenino<br>

						</div>
						<div class="form-group">
							<label for="AlumnoStatus">Status del Alumno:</label><br> 
							<input type="radio" name="alumnoStatus" value="AlumnoActivo" id="AlumnoActivo"> Activo 
							<input type="radio"name="alumnoStatus" value="AlumnoBajaTemporal" id="AlumnoBajaTemporal"> Baja Temporal
							<input type="radio" name="alumnoStatus" value="AlumnoBajaDefinitiva" id="AlumnoBajaDefinitiva"> Baja Definitiva
							<br>

						</div>

						<div class="form-group">
							<label for="AlumnoSistema">Sistema:</label><br> <input
								type="radio" name="alumnoSistema" value="AlumnoEscolarizado"
								id="AlumnoEscolarizado"> Escolarizado <input
								type="radio" name="alumnoSistema" value="AlumnoSemiEscolarizado"
								id="AlumnoSemiEscolarizado"> Semi-Escolarizado<br>

						</div>
						<div class="form-group">
							<label for="AlumnoLiberacion">Status de liberación:</label><br>
							<input type="radio" name="AlumnoLiberacion" value="AlumnoStatus1"
								id="AlumnoStatus1"> Liberado <input type="radio"
								name="AlumnoLiberacion" value="AlumnoStatus0" id="AlumnoStatus0">
							No Liberado<br>

						</div>


						<div class="form-group">
							<label for="AlumnoTxtFechaLib">Fecha de Liberación:</label> <input
								type="text" class="form-control" id="AlumnoTxtFechaLib"
								placeholder="Fecha de Liberación" disabled>
						</div>
						<div class="form-group">
							<label for="AlumnoTxtEmail">Email:</label> <input type="text"
								class="form-control" id="AlumnoTxtEmail" placeholder="Email">
						</div>

						<button type="submit" class="btn btn-info" id="AlumnobtnAgregar">
							<span class="fa fa-plus"></span> Agregar
						</button>
						<button type="submit" class="btn btn-info" id="AlumnobtnModificar">
							<span class="fa fa-pencil-square-o" aria-hidden="true"></span>
							Modificar
						</button>
					</form>
				</div>
			</div>
		</div>



		<div class="col-md-8">
			<div class="panel panel-info">

				<div class="panel-heading">


					<form class="form-inline" role="form">

						<div class="form-group">
							<button type="submit" class="btn btn-info" id="AlumnobtnBuscar">
								<i class="fa fa-search-plus" aria-hidden="true"></i><strong>
									Buscar:</strong>

							</button>
						</div>



					</form>





				</div>



				<form role="form">

					<div class="form-group">
						<label for="AlumnoSelectBusqueda"></label> <select multiple
							class="form-control" id="AlumnoSelectBusqueda">
							<option></option>
						</select>

					</div>
					<button type="submit" id="AlumnobtnEditar" class="btn btn-info">
						<span class="class=" fa fa-pencil-square-o" aria-hidden="true"></span>
						Editar
					</button>
				</form>

			</div>
		</div>



		<div class="col-md-8">
			<div class="panel panel-info">

				<div class="panel-heading">


					<form class="form-inline" role="form">

						<div class="form-group">
							<font size="4.5"><span class="fa fa-history"
								aria-hidden="true"> </span></font>


						</div>

						<div class="form-group">
							<label for="label1"> Historial de Otros Créditos
								Cursados:</label>

						</div>



					</form>

				</div>



				<div class="panel-body">
					<div class=" table-responsive">
						<table
							class="table table-bordered table-condensed table-striped table-hover">
							<thead>
								<tr>
									<th>Curso</th>
									<th>Inicio</th>
									<th>Fin</th>
									<th>Horario</th>
									<th>Periodo</th>
									<th>Campus</th>
									<th>valor</th>
									<th>Catedratico</th>
									<th>calificación</th>

								</tr>
							</thead>
							<tbody id="tbodyHistorial">
								<tr id="1">
									<td>Base de datos</td>
									<td>2016-03-22</td>
									<td>2016-04-24</td>
									<td>09:00 a 12:00</td>
									<td>Verano</td>
									<td>ITSAV Medellin</td>
									<td>1</td>
									<td>Ing. Augusto López</td>
									<td>Aprobado</td>
								</tr>
								<tr id="2">
									<td>Taller Lectura y Redacción</td>
									<td>2016-01-22</td>
									<td>2016-02-24</td>
									<td>14:00 a 16:00</td>
									<td>Invierno</td>
									<td>ITSAV Medellin</td>
									<td>1</td>
									<td>Ing. María Perez</td>
									<td>Aprobado</td>
								</tr>

							</tbody>
						</table>

					</div>

				</div>
			</div>
		</div>


	</div>
</div>