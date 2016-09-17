package com.itsav.creditos.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.internal.sessions.CommitManager;

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

	@Override
	public boolean p_update(EntityManager em, TAlumno Alumno, int idUsuario) throws Exception {
		try {
			
		
		StoredProcedureQuery query =  em.createNamedStoredProcedureQuery("P_UPTADEALUMNO");
		query.setParameter("idUsuari", idUsuario);
		query.setParameter("Matricul", Alumno.getMatricula());
		query.setParameter("ApellidoPatern", Alumno.getApellidoPaterno());
		query.setParameter("ApellidoMatern", Alumno.getApellidoMaterno());
		query.setParameter("Nombr", Alumno.getNombre());
		query.setParameter("Sex", Alumno.getSexo());
		query.setParameter("Estatu", Alumno.getEstatus());
		query.setParameter("Sistem", Alumno.getSistema());
		query.setParameter("Liberad", Alumno.getLiberado());
		query.setParameter("FechaLiberacio", Alumno.getFechaLiberacion());
		query.setParameter("Emai", Alumno.getEmail());
		query.setParameter("T_CARRERA_IdCarrer", Alumno.getTCarrera().getIdCarrera());
		
		
	
		query.execute();
		
		return true;
		
		} catch (Exception e) {
			return false;
		}
		
		
		
	}
	
	
	

}
