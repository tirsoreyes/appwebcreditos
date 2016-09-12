package com.itsav.creditos.jb;

import java.sql.Date;
import java.util.List;



public class JbTAlumno {
	private String matricula;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String email;
	private String estatus;
	private String fechaLiberacion;
	private String liberado;
	private String nombre;
	private String sexo;
	private String sistema;
	private JbTCarrera TCarrera;
	private List<JbTCurso> TAlumnoCursos;
	
	
	
	
	
	public String getFechaLiberacion() {
		return fechaLiberacion;
	}
	public void setFechaLiberacion(String fechaLiberacion) {
		this.fechaLiberacion = fechaLiberacion;
	}
	public List<JbTCurso> getTAlumnoCursos() {
		return TAlumnoCursos;
	}
	public void setTAlumnoCursos(List<JbTCurso> tAlumnoCursos) {
		TAlumnoCursos = tAlumnoCursos;
	}
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
	public JbTCarrera getTCarrera() {
		return TCarrera;
	}
	public void setTCarrera(JbTCarrera tCarrera) {
		TCarrera = tCarrera;
	}

}