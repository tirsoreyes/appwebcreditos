package com.itsav.creditos.jb;

import java.sql.Date;
import java.util.List;


public class JbTCurso  {
	
	
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
	public List<JbTAlumnoCurso> getTAlumnoCursos() {
		return TAlumnoCursos;
	}
	public void setTAlumnoCursos(List<JbTAlumnoCurso> tAlumnoCursos) {
		TAlumnoCursos = tAlumnoCursos;
	}
	public JbTCampus getTCampus() {
		return TCampus;
	}
	public void setTCampus(JbTCampus tCampus) {
		TCampus = tCampus;
	}
	public JbTCredito getTCredito() {
		return TCredito;
	}
	public void setTCredito(JbTCredito tCredito) {
		TCredito = tCredito;
	}
	public JbTPeriodo getTPeriodo() {
		return TPeriodo;
	}
	public void setTPeriodo(JbTPeriodo tPeriodo) {
		TPeriodo = tPeriodo;
	}
	public JbTUsuario getTUsuario() {
		return TUsuario;
	}
	public void setTUsuario(JbTUsuario tUsuario) {
		TUsuario = tUsuario;
	}
	private Date fechaFin;
	private Date fechaInicio;
	private String horario;
	private List<JbTAlumnoCurso> TAlumnoCursos;
	private JbTCampus TCampus;
	private JbTCredito TCredito;
	private JbTPeriodo TPeriodo;
	private JbTUsuario TUsuario;

}