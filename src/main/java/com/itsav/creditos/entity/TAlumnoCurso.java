package com.itsav.creditos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the T_ALUMNO_CURSO database table.
 * 
 */
@Entity
@Table(name="T_ALUMNO_CURSO")
@NamedQuery(name="TAlumnoCurso.findAll", query="SELECT t FROM TAlumnoCurso t")
public class TAlumnoCurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TAlumnoCursoPK id;

	@Column(name="Calificacion")
	private String calificacion;

	@Temporal(TemporalType.DATE)
	@Column(name="FechaAcreditado")
	private Date fechaAcreditado;

	@Column(name="ValorCredito")
	private double valorCredito;

	//bi-directional many-to-one association to TAlumno
	@ManyToOne
	@JoinColumn(name="T_ALUMNO_Matricula")
	private TAlumno TAlumno;

	//bi-directional many-to-one association to TCurso
	@ManyToOne
	@JoinColumn(name="T_CURSO_IdCurso")
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