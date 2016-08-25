package com.itsav.creditos.ejbinterface;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import com.itsav.creditos.entity.TPeriodo;

@Local
public interface IEjbPeriodo {


	public Map<String, String> insert();
	public Map<String, String> update();
	public Map<String, String> remove();
	public List<TPeriodo> findAll();
	
	public TPeriodo getPeriodo();
	public void setPeriodo(TPeriodo Periodo) ;
}
