<div class="container-fluid">
	<div class="row">
		<div class="panel panel-info">
			<div class="panel-heading">
				<span class="glyphicon glyphicon-plus"> Grupo</span>
			</div>
			<div class="panel-body">
				<form role="form">
				
					<div class="form-group">
						<label for="selectGrupo">Seleccionar grupo:</label> <select
							class="form-control" id="selectGrupo">
							<option>Administrador</option>
							<option>Profesor</option>
							<option>Coordinador</option>
						</select>
					</div>
					<div class="form-group">
						<label for="selectUsuariosAsignados">Usuarios asignados</label> <select multiple
							class="form-control" id="selectUsuariosAsignados">
							<option>Pepito</option>
							<option>Julanito</option>
						</select>
					
					<button type="submit"  id="btnQuitarUsuario" class="btn btn-info">
						<span class="glyphicon glyphicon-chevron-down"></span> Quitar
					</button>
					<button type="submit" id="btnAgregarUsuario" class="btn btn-info" id  ="btnAgregarUsuario">
						<span class="glyphicon glyphicon-chevron-up"></span> Agregar
					</button>

						<select multiple class="form-control" id="selectUsuariosSinAsignar">
							<option>Juan</option>
							<option>Pepe</option>
						</select><label for="selectUsuariosSinAsignar">Usuarios sin asignar</label>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
