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

import com.itsav.creditos.dao.DaoPeriodo;
import com.itsav.creditos.daointerface.IDaoPeriodo;
import com.itsav.creditos.ejbinterface.IEjbPeriodo;
import com.itsav.creditos.entity.TPeriodo;



@Stateless
public class EjbPeriodo implements IEjbPeriodo {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private EntityTransaction et = null;

	private TPeriodo periodo;

	public EjbPeriodo() {
		this.periodo = new TPeriodo();
	}

	@Override
	public TPeriodo getPeriodo() {
		return periodo;
	}

	@Override
	public void setPeriodo(TPeriodo Periodo) {
		this.periodo = Periodo;
	}

	@Override
	public Map<String, String> insert() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoPeriodo iDaoPeriodo = new DaoPeriodo();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoPeriodo.insert(em, periodo);
			et.commit();
			resultMap.put("result", "true");
			resultMap.put("mensaje", "Registro insertado");
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
			resultMap.put("result", "false");
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
			IDaoPeriodo iDaoPeriodo = new DaoPeriodo();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoPeriodo.update(em, periodo);
			et.commit();
			resultMap.put("result", "true");
			resultMap.put("mensaje", "Registro actualizado");
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
			resultMap.put("result", "false");
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
			IDaoPeriodo iDaoPeriodo = new DaoPeriodo();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoPeriodo.delete(em, periodo);
			et.commit();
			resultMap.put("result", "true");
			resultMap.put("mensaje", "Registro eliminado");
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
			resultMap.put("result", "false");
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
	public List<TPeriodo> findAll() {
		List<TPeriodo> Periodos = new ArrayList<TPeriodo>();
		try {
			IDaoPeriodo iDaoPeriodo = new DaoPeriodo();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			Periodos = iDaoPeriodo.getAllPeriodos(em);
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

		return Periodos;
	}

}
