package com.itsav.creditos.jb;

import java.sql.Date;
import java.util.List;


public class TCurso  {
	
	
	private int idCurso;
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
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
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public List<TAlumnoCurso> getTAlumnoCursos() {
		return TAlumnoCursos;
	}
	public void setTAlumnoCursos(List<TAlumnoCurso> tAlumnoCursos) {
		TAlumnoCursos = tAlumnoCursos;
	}
	public TCampus getTCampus() {
		return TCampus;
	}
	public void setTCampus(TCampus tCampus) {
		TCampus = tCampus;
	}
	public TCredito getTCredito() {
		return TCredito;
	}
	public void setTCredito(TCredito tCredito) {
		TCredito = tCredito;
	}
	public TPeriodo getTPeriodo() {
		return TPeriodo;
	}
	public void setTPeriodo(TPeriodo tPeriodo) {
		TPeriodo = tPeriodo;
	}
	public TUsuario getTUsuario() {
		return TUsuario;
	}
	public void setTUsuario(TUsuario tUsuario) {
		TUsuario = tUsuario;
	}
	private Date fechaFin;
	private Date fechaInicio;
	private String horario;
	private List<TAlumnoCurso> TAlumnoCursos;
	private TCampus TCampus;
	private TCredito TCredito;
	private TPeriodo TPeriodo;
	private TUsuario TUsuario;

}