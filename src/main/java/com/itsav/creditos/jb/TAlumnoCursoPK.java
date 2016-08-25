package com.itsav.creditos.jb;

public class TAlumnoCursoPK  {

	private int id;
	private String t_ALUMNO_Matricula;
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