package com.itsav.creditos.daointerface;

import java.util.List;

import javax.persistence.EntityManager;

import com.itsav.creditos.entity.TUsuario;


public interface IDaoUsuario {
	public boolean delete(EntityManager em, TUsuario usuario) throws Exception;
	public boolean insert(EntityManager em, TUsuario usuario) throws Exception;
	public boolean update(EntityManager em, TUsuario usuario) throws Exception;
	public List<TUsuario> getAllUsuarios(EntityManager em) throws Exception;
	public TUsuario getByUsuario(EntityManager em, String usuario) throws Exception;
	
	
}
