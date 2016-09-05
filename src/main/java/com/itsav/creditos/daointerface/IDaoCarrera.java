package com.itsav.creditos.daointerface;

import java.util.List;

import javax.persistence.EntityManager;

import com.itsav.creditos.entity.TCarrera;

public interface IDaoCarrera {
	public boolean delete(EntityManager em, TCarrera Carrera) throws Exception;
	public boolean insert(EntityManager em, TCarrera Carrera) throws Exception;
	public boolean update(EntityManager em, TCarrera Carrera) throws Exception;
	public List<TCarrera> getAllCarreras(EntityManager em) throws Exception;
}
