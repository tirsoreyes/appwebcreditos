package com.itsav.creditos.ejbinterface;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import com.itsav.creditos.entity.TCurso;

@Local
public interface IEjbCurso {
	public Map<String, String> insert();
	public Map<String, String> update();
	public Map<String, String> remove();
	public List<TCurso> findAll();
	
	public TCurso getCurso();
	public void setCurso(TCurso Curso) ;


}
