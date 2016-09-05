package com.itsav.creditos.ejbinterface;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import com.itsav.creditos.entity.TCredito;

@Local
public interface IEjbCredito {

	public Map<String, String> insert();
	public Map<String, String> update();
	public Map<String, String> remove();
	public List<TCredito> findAll();
	
	public TCredito getCredito();
	public void setCredito(TCredito Credito) ;

}
