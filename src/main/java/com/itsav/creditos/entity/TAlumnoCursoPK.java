package com.itsav.creditos.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the T_ALUMNO_CURSO database table.
 * 
 */
@Embeddable
public class TAlumnoCursoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Id")
	private int id;

	@Column(name="T_ALUMNO_Matricula", insertable=false, updatable=false)
	private String t_ALUMNO_Matricula;

	@Column(name="T_CURSO_IdCurso", insertable=false, updatable=false)
	private int t_CURSO_IdCurso;

	public TAlumnoCursoPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getT_ALUMNO_Matricula() {
		return this.t_ALUMNO_Matricula;
	}
	public void setT_ALUMNO_Matricula(String t_ALUMNO_Matricula) {
		this.t_ALUMNO_Matricula = t_ALUMNO_Matricula;
	}
	public int getT_CURSO_IdCurso() {
		return this.t_CURSO_IdCurso;
	}
	public void setT_CURSO_IdCurso(int t_CURSO_IdCurso) {
		this.t_CURSO_IdCurso = t_CURSO_IdCurso;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TAlumnoCursoPK)) {
			return false;
		}
		TAlumnoCursoPK castOther = (TAlumnoCursoPK)other;
		return 
			(this.id == castOther.id)
			&& this.t_ALUMNO_Matricula.equals(castOther.t_ALUMNO_Matricula)
			&& (this.t_CURSO_IdCurso == castOther.t_CURSO_IdCurso);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.t_ALUMNO_Matricula.hashCode();
		hash = hash * prime + this.t_CURSO_IdCurso;
		
		return hash;
	}
}