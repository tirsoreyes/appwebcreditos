package com.itsav.creditos.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the T_GRUPO database table.
 * 
 */
@Entity
@Table(name="T_GRUPO")
@NamedQuery(name="TGrupo.findAll", query="SELECT t FROM TGrupo t")
public class TGrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdGrupo")
	private int idGrupo;

	@Column(name="Permiso")
	private String permiso;

	@Column(name="Tipo")
	private String tipo;

	//bi-directional many-to-one association to TUsuario
	@OneToMany(mappedBy="TGrupo")
	private List<TUsuario> TUsuarios;

	public TGrupo() {
	}

	public int getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getPermiso() {
		return this.permiso;
	}

	public void setPermiso(String permiso) {
		this.permiso = permiso;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<TUsuario> getTUsuarios() {
		return this.TUsuarios;
	}

	public void setTUsuarios(List<TUsuario> TUsuarios) {
		this.TUsuarios = TUsuarios;
	}

	public TUsuario addTUsuario(TUsuario TUsuario) {
		getTUsuarios().add(TUsuario);
		TUsuario.setTGrupo(this);

		return TUsuario;
	}

	public TUsuario removeTUsuario(TUsuario TUsuario) {
		getTUsuarios().remove(TUsuario);
		TUsuario.setTGrupo(null);

		return TUsuario;
	}

}