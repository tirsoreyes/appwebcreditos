package com.itsav.creditos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the T_ALUMNO database table.
 * 
 */
@Entity
@Table(name="T_ALUMNO")

@NamedQuery(name="TAlumno.findAll", query="SELECT t FROM TAlumno t")
public class TAlumno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Matricula", insertable=true, unique=true, nullable=false)
	private String matricula;

	@Column(name="ApellidoMaterno")
	private String apellidoMaterno;

	@Column(name="ApellidoPaterno")
	private String apellidoPaterno;

	@Column(name="Email")
	private String email;

	@Column(name="Estatus")
	private String estatus;

	@Temporal(TemporalType.DATE)
	@Column(name="FechaLiberacion")
	private Date fechaLiberacion;

	@Column(name="Liberado")
	private String liberado;

	@Column(name="Nombre")
	private String nombre;

	@Column(name="Sexo")
	private String sexo;

	@Column(name="Sistema")
	private String sistema;

	//bi-directional many-to-one association to TCarrera
	@ManyToOne
	@JoinColumn(name="T_CARRERA_IdCarrera")
	private TCarrera TCarrera;

	//bi-directional many-to-one association to TAlumnoCurso
	@OneToMany(mappedBy="TAlumno")
	private List<TAlumnoCurso> TAlumnoCursos;

	public TAlumno() {
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public Date getFechaLiberacion() {
		return this.fechaLiberacion;
	}

	public void setFechaLiberacion(Date fechaLiberacion) {
		this.fechaLiberacion = fechaLiberacion;
	}

	public String getLiberado() {
		return this.liberado;
	}

	public void setLiberado(String liberado) {
		this.liberado = liberado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSistema() {
		return this.sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public TCarrera getTCarrera() {
		return this.TCarrera;
	}

	public void setTCarrera(TCarrera TCarrera) {
		this.TCarrera = TCarrera;
	}

	public List<TAlumnoCurso> getTAlumnoCursos() {
		return this.TAlumnoCursos;
	}

	public void setTAlumnoCursos(List<TAlumnoCurso> TAlumnoCursos) {
		this.TAlumnoCursos = TAlumnoCursos;
	}

	public TAlumnoCurso addTAlumnoCurso(TAlumnoCurso TAlumnoCurso) {
		getTAlumnoCursos().add(TAlumnoCurso);
		TAlumnoCurso.setTAlumno(this);

		return TAlumnoCurso;
	}

	public TAlumnoCurso removeTAlumnoCurso(TAlumnoCurso TAlumnoCurso) {
		getTAlumnoCursos().remove(TAlumnoCurso);
		TAlumnoCurso.setTAlumno(null);

		return TAlumnoCurso;
	}

}