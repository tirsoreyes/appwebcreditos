package com.itsav.creditos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.itsav.creditos.daointerface.IDaoAlumnoCurso;
import com.itsav.creditos.entity.TAlumnoCurso;
import com.itsav.creditos.entity.TCurso;

public class DaoAlumnoCurso implements IDaoAlumnoCurso {

	@Override
	public boolean delete(EntityManager em, TAlumnoCurso AlumnoCurso)
			throws Exception {
		em.remove(AlumnoCurso);
		return true;
	}

	@Override
	public boolean insert(EntityManager em, TAlumnoCurso AlumnoCurso)
			throws Exception {
		em.persist(AlumnoCurso);
		return true;
	}

	@Override
	public boolean update(EntityManager em, TAlumnoCurso AlumnoCurso)
			throws Exception {
		em.merge(AlumnoCurso);
		return true;
	}

	@Override
	public List<TAlumnoCurso> getAllAlumnoCursos(EntityManager em)
			throws Exception {
		TypedQuery<TAlumnoCurso> query = em.createNamedQuery("TAlumnoCurso.findAll",
				TAlumnoCurso.class);

		List<TAlumnoCurso> listaalumnocursos = query.getResultList();
		if (listaalumnocursos.size() > 0) {
			return listaalumnocursos;
		}
		return null;
	}

}
