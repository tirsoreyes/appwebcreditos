package com.itsav.creditos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.itsav.creditos.daointerface.IDaoCampus;
import com.itsav.creditos.entity.TCampus;
import com.itsav.creditos.entity.TGrupo;

public class DaoCampus implements IDaoCampus {

	@Override
	public boolean delete(EntityManager em, TCampus Campus) throws Exception {
		em.remove(Campus);
		return true;
	}

	@Override
	public boolean insert(EntityManager em, TCampus Campus) throws Exception {
		em.persist(Campus);
		return true;
	}

	@Override
	public boolean update(EntityManager em, TCampus Campus) throws Exception {
		em.merge(Campus);
		return true;
	}

	@Override
	public List<TCampus> getAllCampus(EntityManager em) throws Exception {
		
		TypedQuery<TCampus> query = em.createNamedQuery("TCampus.findAll",
				TCampus.class);

		List<TCampus> listacampus = query.getResultList();
		if (listacampus.size() > 0) {
			return listacampus;
		}
		return null;
	}

}
