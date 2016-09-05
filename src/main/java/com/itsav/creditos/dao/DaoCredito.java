package com.itsav.creditos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.itsav.creditos.daointerface.IDaoCredito;
import com.itsav.creditos.entity.TCampus;
import com.itsav.creditos.entity.TCredito;

public class DaoCredito implements IDaoCredito {

	@Override
	public boolean delete(EntityManager em, TCredito Credito) throws Exception {
		em.remove(Credito);
		return true;
	}

	@Override
	public boolean insert(EntityManager em, TCredito Credito) throws Exception {
		em.persist(Credito);
		return true;
	}

	@Override
	public boolean update(EntityManager em, TCredito Credito) throws Exception {
		em.merge(Credito);
		return true;
	}

	@Override
	public List<TCredito> getAllCredito(EntityManager em) throws Exception {
		TypedQuery<TCredito> query = em.createNamedQuery("TCredito.findAll",
				TCredito.class);

		List<TCredito> listacreditos = query.getResultList();
		if (listacreditos.size() > 0) {
			return listacreditos;
		}
		return null;
	}

}
