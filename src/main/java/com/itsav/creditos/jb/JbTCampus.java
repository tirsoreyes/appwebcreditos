package com.itsav.creditos.jb;

import java.util.List;

public class TCampus {
	
	private int idCampus;
	private String campus;
	private TUsuario TUsuario;
	
	
	
	public int getIdCampus() {
		return idCampus;
	}
	public void setIdCampus(int idCampus) {
		this.idCampus = idCampus;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public TUsuario getTUsuario() {
		return TUsuario;
	}
	public void setTUsuario(TUsuario tUsuario) {
		TUsuario = tUsuario;
	}
	public List<TCurso> getTCursos() {
		return TCursos;
	}
	public void setTCursos(List<TCurso> tCursos) {
		TCursos = tCursos;
	}
	private List<TCurso> TCursos;

}