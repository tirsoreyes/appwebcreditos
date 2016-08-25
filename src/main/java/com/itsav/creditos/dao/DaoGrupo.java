package com.itsav.creditos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.itsav.creditos.daointerface.IDaoGrupo;
import com.itsav.creditos.entity.TGrupo;


public class DaoGrupo implements IDaoGrupo {

	@Override
	public boolean delete(EntityManager em, TGrupo grupo) throws Exception {
		em.remove(grupo);
		return true;
	}

	@Override
	public boolean insert(EntityManager em, TGrupo grupo) throws Exception {
		em.persist(grupo);
		return true;
	}

	@Override
	public boolean update(EntityManager em, TGrupo grupo) throws Exception {
		em.merge(grupo);
		return true;
	}

	@Override
	public List<TGrupo> getAllGrupos(EntityManager em) throws Exception {
		TypedQuery<TGrupo> query = em.createNamedQuery("TGrupo.findAll",
				TGrupo.class);

		List<TGrupo> listagrupo = query.getResultList();
		if (listagrupo.size() > 0) {
			return listagrupo;
		}

		return null;
	}

}
