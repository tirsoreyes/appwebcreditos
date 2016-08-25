package com.itsav.creditos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.itsav.creditos.daointerface.IDaoPeriodo;
import com.itsav.creditos.entity.TCredito;
import com.itsav.creditos.entity.TPeriodo;

public class DaoPeriodo implements IDaoPeriodo {

	@Override
	public boolean delete(EntityManager em, TPeriodo Periodo) throws Exception {
		em.remove(Periodo);
		return true;
	}

	@Override
	public boolean insert(EntityManager em, TPeriodo Periodo) throws Exception {
		em.persist(Periodo);
		return true;
	}

	@Override
	public boolean update(EntityManager em, TPeriodo Periodo) throws Exception {
		em.merge(Periodo);
		return true;
	}

	@Override
	public List<TPeriodo> getAllPeriodos(EntityManager em) throws Exception {
		TypedQuery<TPeriodo> query = em.createNamedQuery("TPeriodo.findAll",
				TPeriodo.class);

		List<TPeriodo> listaperiodos = query.getResultList();
		if (listaperiodos.size() > 0) {
			return listaperiodos;
		}

		return null;
	}

}
