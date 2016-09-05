package com.itsav.creditos.jb;

import java.util.List;


public class TGrupo  {
	
	
	private int idGrupo;
	private String permiso;
	private String tipo;
	private List<TUsuario> TUsuarios;
	
	
	public int getIdGrupo() {
		return idGrupo;
	}
	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}
	public String getPermiso() {
		return permiso;
	}
	public void setPermiso(String permiso) {
		this.permiso = permiso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<TUsuario> getTUsuarios() {
		return TUsuarios;
	}
	public void setTUsuarios(List<TUsuario> tUsuarios) {
		TUsuarios = tUsuarios;
	}

}