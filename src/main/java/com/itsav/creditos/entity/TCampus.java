package com.itsav.creditos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the T_CAMPUS database table.
 * 
 */
@Entity
@Table(name="T_CAMPUS")
@NamedQuery(name="TCampus.findAll", query="SELECT t FROM TCampus t")
public class TCampus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdCampus")
	private int idCampus;

	@Column(name="Campus")
	private String campus;

	//bi-directional many-to-one association to TUsuario
	@ManyToOne
	@JoinColumn(name="T_USUARIO_IdUsuario")
	private TUsuario TUsuario;

	//bi-directional many-to-one association to TCurso
	@OneToMany(mappedBy="TCampus")
	private List<TCurso> TCursos;

	public TCampus() {
	}

	public int getIdCampus() {
		return this.idCampus;
	}

	public void setIdCampus(int idCampus) {
		this.idCampus = idCampus;
	}

	public String getCampus() {
		return this.campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public TUsuario getTUsuario() {
		return this.TUsuario;
	}

	public void setTUsuario(TUsuario TUsuario) {
		this.TUsuario = TUsuario;
	}

	public List<TCurso> getTCursos() {
		return this.TCursos;
	}

	public void setTCursos(List<TCurso> TCursos) {
		this.TCursos = TCursos;
	}

	public TCurso addTCurso(TCurso TCurso) {
		getTCursos().add(TCurso);
		TCurso.setTCampus(this);

		return TCurso;
	}

	public TCurso removeTCurso(TCurso TCurso) {
		getTCursos().remove(TCurso);
		TCurso.setTCampus(null);

		return TCurso;
	}

}