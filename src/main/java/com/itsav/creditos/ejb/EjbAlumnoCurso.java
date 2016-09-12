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

import com.itsav.creditos.dao.DaoAlumnoCurso;
import com.itsav.creditos.daointerface.IDaoAlumnoCurso;
import com.itsav.creditos.ejbinterface.IEjbAlumnoCurso;
import com.itsav.creditos.entity.TAlumnoCurso;




@Stateless
public class EjbAlumnoCurso implements IEjbAlumnoCurso {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private EntityTransaction et = null;

	private TAlumnoCurso alumnoCurso;

	public EjbAlumnoCurso() {
		this.alumnoCurso = new TAlumnoCurso();
	}

	@Override
	public TAlumnoCurso getAlumnoCurso() {
		return alumnoCurso;
	}

	@Override
	public void setAlumnoCurso(TAlumnoCurso AlumnoCurso) {
		this.alumnoCurso = AlumnoCurso;
	}

	@Override
	public Map<String, String> insert() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try {
			IDaoAlumnoCurso iDaoAlumnoCurso = new DaoAlumnoCurso();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoAlumnoCurso.insert(em, alumnoCurso);
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
			IDaoAlumnoCurso iDaoAlumnoCurso = new DaoAlumnoCurso();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoAlumnoCurso.update(em, alumnoCurso);
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
			IDaoAlumnoCurso iDaoAlumnoCurso = new DaoAlumnoCurso();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			iDaoAlumnoCurso.delete(em, alumnoCurso);
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
	public List<TAlumnoCurso> findAll() {
		List<TAlumnoCurso> clumnoCursos = new ArrayList<TAlumnoCurso>();
		try {
			IDaoAlumnoCurso iDaoAlumnoCurso = new DaoAlumnoCurso();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			clumnoCursos = iDaoAlumnoCurso.getAllAlumnoCursos(em);
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

		return clumnoCursos;
	}

}