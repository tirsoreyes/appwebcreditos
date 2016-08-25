package com.itsav.creditos.ejbinterface;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import com.itsav.creditos.entity.TAlumnoCurso;


@Local
public interface IEjbAlumnoCurso {

	public Map<String, String> insert();
	public Map<String, String> update();
	public Map<String, String> remove();
	public List<TAlumnoCurso> findAll();
	
	public TAlumnoCurso getAlumnoCurso();
	public void setAlumnoCurso(TAlumnoCurso AlumnoCurso) ;


}
