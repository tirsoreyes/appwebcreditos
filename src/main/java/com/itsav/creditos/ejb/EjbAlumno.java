package com.itsav.creditos.ejb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.itsav.creditos.dao.DaoAlumno;
import com.itsav.creditos.daointerface.IDaoAlumno;
import com.itsav.creditos.ejbinterface.IEjbAlumno;
import com.itsav.creditos.entity.TAlumno;

@Stateless
public class EjbAlumno implements IEjbAlumno {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private EntityTransaction et = null;

	private TAlumno alumno;

	public EjbAlumno() {
		this.alumno = new TAlumno();
	}

	@Override
	public TAlumno getAlumno() {
		return alumno;
	}

	@Override
	public void setAlumno(TAlumno Alumno) {
		this.alumno = Alumno;
	}

	@Override
	public Map<String, String> insert() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoAlumno iDaoAlumno = new DaoAlumno();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoAlumno.insert(em, alumno);
			et.commit();
			resultMap.put("resultado", "true");
			resultMap.put("mensaje", "Registro insertado");
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
			resultMap.put("resultado", "false");
		} finally {
			
			if (em != null) {
				em.close();
			}
			
			if (emf != null) {
				emf.close();
				emf = null;
			}
			
			
			et = null;
		}
		return resultMap;
	}

	@Override
	public Map<String, String> update() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoAlumno iDaoAlumno = new DaoAlumno();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoAlumno.update(em, alumno);
			et.commit();
			resultMap.put("resultado", "true");
			resultMap.put("mensaje", "Registro actualizado");
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
			resultMap.put("resultado", "false");
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
				emf = null;
			}
		
			et = null;
		}
		return resultMap;
	}

	@Override
	public Map<String, String> remove() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoAlumno iDaoAlumno = new DaoAlumno();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoAlumno.delete(em, alumno);
			et.commit();
			resultMap.put("resultado", "true");
			resultMap.put("mensaje", "Registro eliminado");
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
			resultMap.put("resultado", "false");
		} finally {
			if (emf != null) {
				emf.close();
				emf = null;
			}
			if (em != null) {
				em.close();
			}
			et = null;
		}
		return resultMap;
	}

	@Override
	public List<TAlumno> findAll() {
		List<TAlumno> alumnos = new ArrayList<TAlumno>();
		try {
			IDaoAlumno iDaoAlumno = new DaoAlumno();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			alumnos = iDaoAlumno.getAllAlumnos(em);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (em != null) {
				em.close();
				em = null;
			}
			if (emf != null) {
				emf.close();
				emf = null;
			}

			et = null;
		}

		return alumnos;
	}

	@Override
	public TAlumno findByMatricula(String Matricula) {
		
		
		try {
			IDaoAlumno iDaoAlumno = new DaoAlumno();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			this.alumno = iDaoAlumno.findByMatricula(em, Matricula);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (em != null) {
				em.close();
				em = null;
			}
			if (emf != null) {
				emf.close();
				emf = null;
			}

			et = null;
		}

		return alumno;

		
	}

}
