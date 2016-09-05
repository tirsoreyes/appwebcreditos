package com.itsav.creditos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_PERIODO database table.
 * 
 */
@Entity
@Table(name="T_PERIODO")
@NamedQuery(name="TPeriodo.findAll", query="SELECT t FROM TPeriodo t")
public class TPeriodo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdPeriodo")
	private int idPeriodo;

	@Temporal(TemporalType.DATE)
	@Column(name="FechaFin")
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="FechaInicio")
	private Date fechaInicio;

	//bi-directional many-to-one association to TCurso
	@OneToMany(mappedBy="TPeriodo")
	private List<TCurso> TCursos;

	public TPeriodo() {
	}

	public int getIdPeriodo() {
		return this.idPeriodo;
	}

	public void setIdPeriodo(int idPeriodo) {
		this.idPeriodo = idPeriodo;
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

	public List<TCurso> getTCursos() {
		return this.TCursos;
	}

	public void setTCursos(List<TCurso> TCursos) {
		this.TCursos = TCursos;
	}

	public TCurso addTCurso(TCurso TCurso) {
		getTCursos().add(TCurso);
		TCurso.setTPeriodo(this);

		return TCurso;
	}

	public TCurso removeTCurso(TCurso TCurso) {
		getTCursos().remove(TCurso);
		TCurso.setTPeriodo(null);

		return TCurso;
	}

}