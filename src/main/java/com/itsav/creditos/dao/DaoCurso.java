package com.itsav.creditos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.itsav.creditos.daointerface.IDaoCurso;
import com.itsav.creditos.entity.TAlumno;
import com.itsav.creditos.entity.TCurso;

public class DaoCurso implements IDaoCurso {

	@Override
	public boolean delete(EntityManager em, TCurso Curso) throws Exception {
		em.remove(Curso);
		return true;
	}

	@Override
	public boolean insert(EntityManager em, TCurso Curso) throws Exception {
		em.persist(Curso);
		return true;
	}

	@Override
	public boolean update(EntityManager em, TCurso Curso) throws Exception {
		em.merge(Curso);
		return true;
	}

	@Override
	public List<TCurso> getAllCursos(EntityManager em) throws Exception {
		TypedQuery<TCurso> query = em.createNamedQuery("TCurso.findAll",
				TCurso.class);

		List<TCurso> listacursos = query.getResultList();
		if (listacursos.size() > 0) {
			return listacursos;
		}
		return null;
	}

}
