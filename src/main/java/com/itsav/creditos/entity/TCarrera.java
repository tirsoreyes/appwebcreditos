package com.itsav.creditos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the T_CARRERA database table.
 * 
 */
@Entity
@Table(name="T_CARRERA")
@NamedQuery(name="TCarrera.findAll", query="SELECT t FROM TCarrera t")
public class TCarrera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdCarrera")
	private int idCarrera;

	@Column(name="Nombre")
	private String nombre;

	//bi-directional many-to-one association to TAlumno
	@OneToMany(mappedBy="TCarrera")
	private List<TAlumno> TAlumnos;

	public TCarrera() {
	}

	public int getIdCarrera() {
		return this.idCarrera;
	}

	public void setIdCarrera(int idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<TAlumno> getTAlumnos() {
		return this.TAlumnos;
	}

	public void setTAlumnos(List<TAlumno> TAlumnos) {
		this.TAlumnos = TAlumnos;
	}

	public TAlumno addTAlumno(TAlumno TAlumno) {
		getTAlumnos().add(TAlumno);
		TAlumno.setTCarrera(this);

		return TAlumno;
	}

	public TAlumno removeTAlumno(TAlumno TAlumno) {
		getTAlumnos().remove(TAlumno);
		TAlumno.setTCarrera(null);

		return TAlumno;
	}

}