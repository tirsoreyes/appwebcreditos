package com.itsav.creditos.ejbinterface;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import com.itsav.creditos.entity.TCarrera;

@Local
public interface IEjbCarrera {

 
	public Map<String, String> insert();
	public Map<String, String> update();
	public Map<String, String> remove();
	public List<TCarrera> findAll();
	
	public TCarrera getCarrera();
	public void setCarrera(TCarrera Carrera) ;
}
