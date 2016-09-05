package com.itsav.creditos.jb;

import java.util.List;

public class JbTCampus {
	
	private int idCampus;
	private String campus;
	private JbTUsuario TUsuario;
	
	
	
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
	public JbTUsuario getTUsuario() {
		return TUsuario;
	}
	public void setTUsuario(JbTUsuario tUsuario) {
		TUsuario = tUsuario;
	}
	public List<JbTCurso> getTCursos() {
		return TCursos;
	}
	public void setTCursos(List<JbTCurso> tCursos) {
		TCursos = tCursos;
	}
	private List<JbTCurso> TCursos;

}