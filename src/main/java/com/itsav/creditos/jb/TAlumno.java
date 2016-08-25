package com.itsav.creditos.jb;

import java.sql.Date;
import java.util.List;



public class TAlumno {
	private String matricula;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String email;
	private String estatus;
	private Date fechaLiberacion;
	private String liberado;
	private String nombre;
	private String sexo;
	private String sistema;
	private TCarrera TCarrera;
	private List<TAlumnoCurso> TAlumnoCursos;
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public Date getFechaLiberacion() {
		return fechaLiberacion;
	}
	public void setFechaLiberacion(Date fechaLiberacion) {
		this.fechaLiberacion = fechaLiberacion;
	}
	public String getLiberado() {
		return liberado;
	}
	public void setLiberado(String liberado) {
		this.liberado = liberado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public TCarrera getTCarrera() {
		return TCarrera;
	}
	public void setTCarrera(TCarrera tCarrera) {
		TCarrera = tCarrera;
	}
	public List<TAlumnoCurso> getTAlumnoCursos() {
		return TAlumnoCursos;
	}
	public void setTAlumnoCursos(List<TAlumnoCurso> tAlumnoCursos) {
		TAlumnoCursos = tAlumnoCursos;
	}

}