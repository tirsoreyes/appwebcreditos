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

import com.itsav.creditos.dao.DaoCredito;
import com.itsav.creditos.daointerface.IDaoCredito;
import com.itsav.creditos.ejbinterface.IEjbCredito;
import com.itsav.creditos.ejbinterface.IEjbCredito;
import com.itsav.creditos.entity.TCredito;
import com.itsav.creditos.entity.TCredito;


@Stateless
public class EjbCredito implements IEjbCredito {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private EntityTransaction et = null;

	private TCredito credito;

	public EjbCredito() {
		this.credito = new TCredito();
	}

	@Override
	public TCredito getCredito() {
		return credito;
	}

	@Override
	public void setCredito(TCredito credito) {
		this.credito = credito;
	}

	@Override
	public Map<String, String> insert() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoCredito iDaoCredito = new DaoCredito();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoCredito.insert(em, credito);
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
			IDaoCredito iDaoCredito = new DaoCredito();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoCredito.update(em, credito);
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
			IDaoCredito iDaoCredito = new DaoCredito();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoCredito.delete(em, credito);
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
	public List<TCredito> findAll() {
		List<TCredito> Credito = new ArrayList<TCredito>();
		try {
			IDaoCredito iDaoCredito = new DaoCredito();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			Credito = iDaoCredito.getAllCredito(em);
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

		return Credito;
	}

}