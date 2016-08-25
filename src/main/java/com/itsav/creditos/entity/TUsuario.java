package com.itsav.creditos.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_USUARIO database table.
 * 
 */
@Entity
@Table(name="T_USUARIO")
@NamedQueries({
@NamedQuery(name="TUsuario.findAll", query="SELECT t FROM TUsuario t"),
@NamedQuery(name="TUsuario.findByUsuario", query="SELECT t FROM TUsuario t WHERE t.usuario= :usuario")
})


public class TUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdUsuario")
	private int idUsuario;

	@Column(name="ApellidoMaterno")
	private String apellidoMaterno;

	@Column(name="ApellidoPaterno")
	private String apellidoPaterno;

	@Column(name="Email")
	private String email;

	@Column(name="Estatus")
	private String estatus;

	@Temporal(TemporalType.DATE)
	@Column(name="FechaAlta")
	private Date fechaAlta;

	@Column(name="Nombre")
	private String nombre;

	@Column(name="Password")
	private String password;

	@Column(name="Siglas")
	private String siglas;

	@Column(name="Usuario")
	private String usuario;

	//bi-directional many-to-one association to TCampus
	@OneToMany(mappedBy="TUsuario")
	private List<TCampus> TCampuses;

	//bi-directional many-to-one association to TCurso
	@OneToMany(mappedBy="TUsuario")
	private List<TCurso> TCursos;

	//bi-directional many-to-one association to TGrupo
	@ManyToOne
	@JoinColumn(name="T_GRUPO_IdGrupo")
	private TGrupo TGrupo;

	public TUsuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSiglas() {
		return this.siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public List<TCampus> getTCampuses() {
		return this.TCampuses;
	}

	public void setTCampuses(List<TCampus> TCampuses) {
		this.TCampuses = TCampuses;
	}

	public TCampus addTCampus(TCampus TCampus) {
		getTCampuses().add(TCampus);
		TCampus.setTUsuario(this);

		return TCampus;
	}

	public TCampus removeTCampus(TCampus TCampus) {
		getTCampuses().remove(TCampus);
		TCampus.setTUsuario(null);

		return TCampus;
	}

	public List<TCurso> getTCursos() {
		return this.TCursos;
	}

	public void setTCursos(List<TCurso> TCursos) {
		this.TCursos = TCursos;
	}

	public TCurso addTCurso(TCurso TCurso) {
		getTCursos().add(TCurso);
		TCurso.setTUsuario(this);

		return TCurso;
	}

	public TCurso removeTCurso(TCurso TCurso) {
		getTCursos().remove(TCurso);
		TCurso.setTUsuario(null);

		return TCurso;
	}

	public TGrupo getTGrupo() {
		return this.TGrupo;
	}

	public void setTGrupo(TGrupo TGrupo) {
		this.TGrupo = TGrupo;
	}

}