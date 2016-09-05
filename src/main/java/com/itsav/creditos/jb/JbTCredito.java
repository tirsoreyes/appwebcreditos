package com.itsav.creditos.jb;

import java.util.List;

public class TCredito {
	
	
	private int idCredito;
	private String credito;
	private double valorCredito;
	private List<TCurso> TCursos;
	
	
	public int getIdCredito() {
		return idCredito;
	}
	public void setIdCredito(int idCredito) {
		this.idCredito = idCredito;
	}
	public String getCredito() {
		return credito;
	}
	public void setCredito(String credito) {
		this.credito = credito;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public List<TCurso> getTCursos() {
		return TCursos;
	}
	public void setTCursos(List<TCurso> tCursos) {
		TCursos = tCursos;
	}

}