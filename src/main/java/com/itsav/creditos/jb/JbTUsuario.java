package com.itsav.creditos.jb;

import java.sql.Date;
import java.util.List;


public class JbTUsuario  {
	
	private int idUsuario;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String email;
	private String estatus;
	private Date fechaAlta;
	private String nombre;
	private String password;
	private String siglas;
	private String usuario;
	private List<JbTCampus> TCampuses;
	private List<JbTCurso> TCursos;
	private JbTGrupo TGrupo;

	
	
	
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSiglas() {
		return siglas;
	}
	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public List<JbTCampus> getTCampuses() {
		return TCampuses;
	}
	public void setTCampuses(List<JbTCampus> tCampuses) {
		TCampuses = tCampuses;
	}
	public List<JbTCurso> getTCursos() {
		return TCursos;
	}
	public void setTCursos(List<JbTCurso> tCursos) {
		TCursos = tCursos;
	}
	public JbTGrupo getTGrupo() {
		return TGrupo;
	}
	public void setTGrupo(JbTGrupo tGrupo) {
		TGrupo = tGrupo;
	}
	

}