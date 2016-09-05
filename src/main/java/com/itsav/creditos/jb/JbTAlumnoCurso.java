package com.itsav.creditos.jb;

import java.sql.Date;


public class TAlumnoCurso  {
	
	
	private TAlumnoCursoPK id;
	private String calificacion;
	private Date fechaAcreditado;
	private double valorCredito;
	private TAlumno TAlumno;
	private TCurso TCurso;

	public TAlumnoCurso() {
	}

	public TAlumnoCursoPK getId() {
		return this.id;
	}

	public void setId(TAlumnoCursoPK id) {
		this.id = id;
	}

	public String getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFechaAcreditado() {
		return this.fechaAcreditado;
	}

	public void setFechaAcreditado(Date fechaAcreditado) {
		this.fechaAcreditado = fechaAcreditado;
	}

	public double getValorCredito() {
		return this.valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public TAlumno getTAlumno() {
		return this.TAlumno;
	}

	public void setTAlumno(TAlumno TAlumno) {
		this.TAlumno = TAlumno;
	}

	public TCurso getTCurso() {
		return this.TCurso;
	}

	public void setTCurso(TCurso TCurso) {
		this.TCurso = TCurso;
	}

}