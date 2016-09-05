package com.itsav.creditos.daointerface;

import java.util.List;

import javax.persistence.EntityManager;

import com.itsav.creditos.entity.TGrupo;

public interface IDaoGrupo {

	public boolean delete(EntityManager em, TGrupo grupo) throws Exception;
	public boolean insert(EntityManager em, TGrupo grupo) throws Exception;
	public boolean update(EntityManager em, TGrupo grupo) throws Exception;
	public List<TGrupo> getAllGrupos(EntityManager em) throws Exception;
	
}
