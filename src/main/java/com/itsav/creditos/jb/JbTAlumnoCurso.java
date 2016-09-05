package com.itsav.creditos.jb;

import java.sql.Date;


public class JbTAlumnoCurso  {
	
	
	private JbTAlumnoCursoPK id;
	private String calificacion;
	private Date fechaAcreditado;
	private double valorCredito;
	private JbTAlumno TAlumno;
	private JbTCurso TCurso;

	public JbTAlumnoCurso() {
	}

	public JbTAlumnoCursoPK getId() {
		return this.id;
	}

	public void setId(JbTAlumnoCursoPK id) {
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

	public JbTAlumno getTAlumno() {
		return this.TAlumno;
	}

	public void setTAlumno(JbTAlumno TAlumno) {
		this.TAlumno = TAlumno;
	}

	public JbTCurso getTCurso() {
		return this.TCurso;
	}

	public void setTCurso(JbTCurso TCurso) {
		this.TCurso = TCurso;
	}

}