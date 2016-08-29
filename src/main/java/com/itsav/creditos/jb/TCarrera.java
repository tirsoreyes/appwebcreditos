package com.itsav.creditos.jb;

import java.util.List;

public class TCarrera {
	
	private int idCarrera;
	private String nombre;
	private List<TAlumno> TAlumnos;
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
	public List<TAlumno> getTAlumnos() {
		return TAlumnos;
	}
	public void setTAlumnos(List<TAlumno> tAlumnos) {
		TAlumnos = tAlumnos;
	}

}