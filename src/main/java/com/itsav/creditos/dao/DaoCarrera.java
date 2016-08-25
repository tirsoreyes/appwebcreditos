package com.itsav.creditos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.itsav.creditos.daointerface.IDaoCarrera;
import com.itsav.creditos.entity.TCarrera;
import com.itsav.creditos.entity.TPeriodo;

public class DaoCarrera implements IDaoCarrera {

	@Override
	public boolean delete(EntityManager em, TCarrera Carrera) throws Exception {
		em.remove(Carrera);
		return true;
	}

	@Override
	public boolean insert(EntityManager em, TCarrera Carrera) throws Exception {
		em.persist(Carrera);
		return true;
	}

	@Override
	public boolean update(EntityManager em, TCarrera Carrera) throws Exception {
		em.merge(Carrera);
		return true;
	}

	@Override
	public List<TCarrera> getAllCarreras(EntityManager em) throws Exception {
		TypedQuery<TCarrera> query = em.createNamedQuery("TCarrera.findAll",
				TCarrera.class);

		List<TCarrera> listacarreras = query.getResultList();
		if (listacarreras.size() > 0) {
			return listacarreras;
		}
		return null;
	}

}
