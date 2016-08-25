package com.itsav.creditos.ejbinterface;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;
import com.itsav.creditos.entity.TUsuario;

@Local
public interface IEjbUsuario {
	public Map<String, String> insert();
	public Map<String, String> update();
	public Map<String, String> remove();
	public List<TUsuario> findAll();
	
	public TUsuario getUsuario();
	public void setUsuario(TUsuario usuario);
	public Map<String, String> login(String contrasenia);
	public void getByUsuario(String usuario);
	
}
