package com.itsav.creditos.jb;

import java.sql.Date;
import java.util.List;


public class TPeriodo {
	
	private int idPeriodo;
	private Date fechaFin;
	private Date fechaInicio;
	private List<TCurso> TCursos;
	
	
	public int getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public List<TCurso> getTCursos() {
		return TCursos;
	}
	public void setTCursos(List<TCurso> tCursos) {
		TCursos = tCursos;
	}

}