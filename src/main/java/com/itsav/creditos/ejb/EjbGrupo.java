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

import com.itsav.creditos.appwebcreditos.TicketHelper;
import com.itsav.creditos.dao.DaoGrupo;
import com.itsav.creditos.daointerface.IDaoGrupo;
import com.itsav.creditos.ejbinterface.IEjbGrupo;
import com.itsav.creditos.entity.TGrupo;

@Stateless
public class EjbGrupo implements IEjbGrupo {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private EntityTransaction et = null;

	private TGrupo grupo;

	public EjbGrupo() {
		this.grupo = new TGrupo();
	}

	@Override
	public TGrupo getGrupo() {
		return grupo;
	}

	@Override
	public void setGrupo(TGrupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public Map<String, String> insert() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoGrupo iDaoGrupo = new DaoGrupo();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoGrupo.insert(em, grupo);
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
			IDaoGrupo iDaoGrupo = new DaoGrupo();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoGrupo.update(em, grupo);
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
			IDaoGrupo iDaoGrupo = new DaoGrupo();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoGrupo.delete(em, grupo);
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
	public List<TGrupo> findAll() {
		List<TGrupo> grupos = new ArrayList<TGrupo>();
		try {
			IDaoGrupo iDaoGrupo = new DaoGrupo();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			grupos = iDaoGrupo.getAllGrupos(em);
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

		return grupos;
	}

}
