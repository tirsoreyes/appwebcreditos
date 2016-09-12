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

import com.itsav.creditos.dao.DaoCarrera;
import com.itsav.creditos.daointerface.IDaoCarrera;
import com.itsav.creditos.ejbinterface.IEjbCarrera;
import com.itsav.creditos.entity.TCarrera;




@Stateless
public class EjbCarrera implements IEjbCarrera {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private EntityTransaction et = null;

	private TCarrera carrera;

	public EjbCarrera() {
		this.carrera = new TCarrera();
	}

	@Override
	public TCarrera getCarrera() {
		return carrera;
	}

	@Override
	public void setCarrera(TCarrera Carrera) {
		this.carrera = Carrera;
	}

	@Override
	public Map<String, String> insert() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoCarrera iDaoCarrera = new DaoCarrera();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoCarrera.insert(em, carrera);
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
	public Map<String, String> update() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoCarrera iDaoCarrera = new DaoCarrera();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoCarrera.update(em, carrera);
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
	public Map<String, String> remove() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoCarrera iDaoCarrera = new DaoCarrera();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoCarrera.delete(em, carrera);
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
	public List<TCarrera> findAll() {
		List<TCarrera> carreras = new ArrayList<TCarrera>();
		try {
			IDaoCarrera iDaoCarrera = new DaoCarrera();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			carreras = iDaoCarrera.getAllCarreras(em);
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

		return carreras;
	}

	@Override
	public TCarrera findById(String idCarrera) {
		try {
			IDaoCarrera iDaoCarrera = new DaoCarrera();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			int idcarrera= Integer.parseInt(idCarrera);
			this.carrera = iDaoCarrera.findById(em, idcarrera);
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

		return carrera;
	}

}