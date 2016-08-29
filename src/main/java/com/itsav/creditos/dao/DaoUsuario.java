package com.itsav.creditos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.itsav.creditos.daointerface.IDaoUsuario;
import com.itsav.creditos.entity.TUsuario;


public class DaoUsuario implements IDaoUsuario {

	@Override
	public boolean delete(EntityManager em, TUsuario usuario) throws Exception {
		em.remove(usuario);
		return true;
	}

	@Override
	public boolean insert(EntityManager em, TUsuario usuario) throws Exception {
		em.persist(usuario);
		return true;
	}

	@Override
	public boolean update(EntityManager em, TUsuario usuario) throws Exception {
		em.merge(usuario);
		return true;
	}

	@Override
	public TUsuario getByUsuario(EntityManager em, String usuario)
			throws Exception {

		TypedQuery<TUsuario> query = em.createNamedQuery(
				"TUsuario.findByUsuario", TUsuario.class);
		query.setParameter("usuario", usuario);

		List<TUsuario> listaUsuario = query.setMaxResults(1).getResultList();
		if (listaUsuario.size() > 0) {
			return listaUsuario.get(0);

		}

		return null;

	}

	@Override
	public List<TUsuario> getAllUsuarios(EntityManager em) throws Exception {
		TypedQuery<TUsuario> query = em.createNamedQuery("TUsuario.findAll",
				TUsuario.class);

		List<TUsuario> listaUsuario = query.getResultList();
		if (listaUsuario.size() > 0) {
			return listaUsuario;
		}

		return null;
	}

}
