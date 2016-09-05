package com.itsav.creditos.jb;

import java.util.List;

public class JbTCarrera {
	
	private int idCarrera;
	private String nombre;
	private List<JbTAlumno> TAlumnos;
	public int getIdCarrera() {
		return idCarrera;
	}
	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<JbTAlumno> getTAlumnos() {
		return TAlumnos;
	}
	public void setTAlumnos(List<JbTAlumno> tAlumnos) {
		TAlumnos = tAlumnos;
	}

}