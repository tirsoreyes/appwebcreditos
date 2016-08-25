package com.itsav.creditos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the T_CREDITO database table.
 * 
 */
@Entity
@Table(name="T_CREDITO")
@NamedQuery(name="TCredito.findAll", query="SELECT t FROM TCredito t")
public class TCredito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdCredito")
	private int idCredito;

	@Column(name="Credito")
	private String credito;

	@Column(name="ValorCredito")
	private double valorCredito;

	//bi-directional many-to-one association to TCurso
	@OneToMany(mappedBy="TCredito")
	private List<TCurso> TCursos;

	public TCredito() {
	}

	public int getIdCredito() {
		return this.idCredito;
	}

	public void setIdCredito(int idCredito) {
		this.idCredito = idCredito;
	}

	public String getCredito() {
		return this.credito;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}

	public double getValorCredito() {
		return this.valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public List<TCurso> getTCursos() {
		return this.TCursos;
	}

	public void setTCursos(List<TCurso> TCursos) {
		this.TCursos = TCursos;
	}

	public TCurso addTCurso(TCurso TCurso) {
		getTCursos().add(TCurso);
		TCurso.setTCredito(this);

		return TCurso;
	}

	public TCurso removeTCurso(TCurso TCurso) {
		getTCursos().remove(TCurso);
		TCurso.setTCredito(null);

		return TCurso;
	}

}