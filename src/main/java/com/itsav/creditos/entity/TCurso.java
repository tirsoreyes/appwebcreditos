package com.itsav.creditos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_CURSO database table.
 * 
 */
@Entity
@Table(name="T_CURSO")
@NamedQuery(name="TCurso.findAll", query="SELECT t FROM TCurso t")
public class TCurso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdCurso")
	private int idCurso;

	@Temporal(TemporalType.DATE)
	@Column(name="FechaFin")
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="FechaInicio")
	private Date fechaInicio;

	@Column(name="Horario")
	private String horario;

	//bi-directional many-to-one association to TAlumnoCurso
	@OneToMany(mappedBy="TCurso")
	private List<TAlumnoCurso> TAlumnoCursos;

	//bi-directional many-to-one association to TCampus
	@ManyToOne
	@JoinColumn(name="T_CAMPUS_IdCampus")
	private TCampus TCampus;

	//bi-directional many-to-one association to TCredito
	@ManyToOne
	@JoinColumn(name="T_CREDITO_IdCredito")
	private TCredito TCredito;

	//bi-directional many-to-one association to TPeriodo
	@ManyToOne
	@JoinColumn(name="T_PERIODO_IdPeriodo")
	private TPeriodo TPeriodo;

	//bi-directional many-to-one association to TUsuario
	@ManyToOne
	@JoinColumn(name="T_USUARIO_IdUsuario")
	private TUsuario TUsuario;

	public TCurso() {
	}

	public int getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public List<TAlumnoCurso> getTAlumnoCursos() {
		return this.TAlumnoCursos;
	}

	public void setTAlumnoCursos(List<TAlumnoCurso> TAlumnoCursos) {
		this.TAlumnoCursos = TAlumnoCursos;
	}

	public TAlumnoCurso addTAlumnoCurso(TAlumnoCurso TAlumnoCurso) {
		getTAlumnoCursos().add(TAlumnoCurso);
		TAlumnoCurso.setTCurso(this);

		return TAlumnoCurso;
	}

	public TAlumnoCurso removeTAlumnoCurso(TAlumnoCurso TAlumnoCurso) {
		getTAlumnoCursos().remove(TAlumnoCurso);
		TAlumnoCurso.setTCurso(null);

		return TAlumnoCurso;
	}

	public TCampus getTCampus() {
		return this.TCampus;
	}

	public void setTCampus(TCampus TCampus) {
		this.TCampus = TCampus;
	}

	public TCredito getTCredito() {
		return this.TCredito;
	}

	public void setTCredito(TCredito TCredito) {
		this.TCredito = TCredito;
	}

	public TPeriodo getTPeriodo() {
		return this.TPeriodo;
	}

	public void setTPeriodo(TPeriodo TPeriodo) {
		this.TPeriodo = TPeriodo;
	}

	public TUsuario getTUsuario() {
		return this.TUsuario;
	}

	public void setTUsuario(TUsuario TUsuario) {
		this.TUsuario = TUsuario;
	}

}