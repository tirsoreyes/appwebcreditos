package com.itsav.creditos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.itsav.creditos.daointerface.IDaoAlumno;
import com.itsav.creditos.entity.TAlumno;
import com.itsav.creditos.entity.TCarrera;

public class DaoAlumno implements IDaoAlumno {

	@Override
	public boolean delete(EntityManager em, TAlumno Alumno) throws Exception {
		em.remove(Alumno);
		return true;
	}

	@Override
	public boolean insert(EntityManager em, TAlumno Alumno) throws Exception {
		em.persist(Alumno);
		return true;
	}

	@Override
	public boolean update(EntityManager em, TAlumno Alumno) throws Exception {
		em.merge(Alumno);
		return true;
	}

	@Override
	public List<TAlumno> getAllAlumnos(EntityManager em) throws Exception {
		TypedQuery<TAlumno> query = em.createNamedQuery("TAlumno.findAll",
				TAlumno.class);

		List<TAlumno> listaalumnos = query.getResultList();
		if (listaalumnos.size() > 0) {
			return listaalumnos;
		}

		return null;
	}

	@Override
	public TAlumno findByMatricula(EntityManager em, String Matricula) throws Exception {
	return(em.find(TAlumno.class, Matricula));
	
	}
	
	
	

}
