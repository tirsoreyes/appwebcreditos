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
import com.itsav.creditos.dao.DaoUsuario;
import com.itsav.creditos.daointerface.IDaoUsuario;
import com.itsav.creditos.ejbinterface.IEjbUsuario;
import com.itsav.creditos.entity.TUsuario;


@Stateless
public class EjbUsuario implements IEjbUsuario {
	
	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private EntityTransaction et = null;
	
	private TUsuario usuario;
	
	public EjbUsuario() {
		this.usuario = new TUsuario();
	}
	
	
	@Override	
	public TUsuario getUsuario() {
		return usuario;
	}
	@Override
	public void setUsuario(TUsuario usuario) {
		this.usuario = usuario;
	}


	@Override
	public Map<String, String> insert() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try{
			IDaoUsuario iDaoUsuario = new DaoUsuario();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			iDaoUsuario.insert(em, usuario);
			et.commit();
			resultMap.put("result", "true");
			resultMap.put("mensaje", "Registro insertado");
		}catch(Exception e){
			if(et != null){
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
			resultMap.put("result", "false");
		}finally{
			if(emf != null){
				emf.close();
				emf = null;
			}
			if(em != null){
				em.close();
			}
			et = null;
		}
		return resultMap;
	}

	@Override
	public Map<String, String> update() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try{
			IDaoUsuario iDaoUsauario = new DaoUsuario();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			iDaoUsauario.update(em, usuario);
			et.commit();
			resultMap.put("result", "true");
			resultMap.put("mensaje", "Registro actualizado");
		}catch(Exception e){
			if(et != null){
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
			resultMap.put("result", "false");
		}finally{
			if(emf != null){
				emf.close();
				emf = null;
			}
			if(em != null){
				em.close();
			}
			et = null;
		}
		return resultMap;
	}

	@Override
	public Map<String, String> remove() {
		Map<String, String> resultMap = new HashMap<String, String>();
		try{
			IDaoUsuario iDaoUsauario = new DaoUsuario();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			iDaoUsauario.delete(em, usuario);
			et.commit();
			resultMap.put("result", "true");
			resultMap.put("mensaje", "Registro eliminado");
		}catch(Exception e){
			if(et != null){
				et.rollback();
			}
			System.out.println("Error: " + e.getMessage());
			resultMap.put("result", "false");
		}finally{
			if(emf != null){
				emf.close();
				emf = null;
			}
			if(em != null){
				em.close();
			}
			et = null;
		}
		return resultMap;
	}
	
	@Override
	public void getByUsuario(String usuario) {
		try {
			System.out.println("Dato que metodo getByUsuario "+usuario);
			IDaoUsuario iDaoUsuario = new DaoUsuario();
			
			emf=Persistence.createEntityManagerFactory("appwebcreditos");
			em=emf.createEntityManager();
			et=em.getTransaction();
			
			et.begin();
			this.usuario=iDaoUsuario.getByUsuario(em, usuario);
			et.commit();
			
			
		} catch (Exception e) {
			if(et != null){
				et.rollback();
			}
			
			System.out.println("Error: " + e.getMessage());
			
		}finally{
			if(em != null){
				em.close();
				em = null;
			}
			if(emf != null){
				emf.close();
				emf = null;
			}
			et =null;
		}
	}
	
	@Override
	public Map<String, String> login(String contrasenia){

		Map<String, String> returnMap=new HashMap<String, String>();
		try{
			if(usuario==null){
				returnMap.put("correcto", "false");
				returnMap.put("mensajeGeneral", "usuario y/o contraseña incorrectos");
			}else{
				if(new TicketHelper().encript(contrasenia).equals(usuario.getPassword())){
					returnMap.put("correcto", "true");
					returnMap.put("mensajeGeneral", "Inicio de session correcto");
				}else{
					returnMap.put("correcto", "false");
					returnMap.put("mensajeGeneral", "usuario y/o contraseña incorrectos");
				}
			}
			return returnMap;
		}catch(Exception e){
			
			if(et != null){
				et.rollback();
			}
			
			System.out.println("Error: " + e.getMessage() );
			returnMap.put("correcto", "false");
			return returnMap;
		}finally{
			if(em != null){
				em.close();
				em = null;
			}
			if(emf != null){
				emf.close();
				emf = null;
			}
			et =null;
		}
	
	}


	@Override
	public List<TUsuario> findAll() {
		List<TUsuario> usuarios = new ArrayList<TUsuario>();
		try {
			IDaoUsuario iDaoUsuario = new DaoUsuario();
			emf = Persistence.createEntityManagerFactory("appwebcreditos");
			em = emf.createEntityManager();
			et = em.getTransaction();

			et.begin();
			usuarios = iDaoUsuario.getAllUsuarios(em);
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

		return usuarios;
	}


	

}
