package com.itsav.creditos.daointerface;

import java.util.List;

import javax.persistence.EntityManager;

import com.itsav.creditos.entity.TCredito;

public interface IDaoCredito {
	public boolean delete(EntityManager em, TCredito Credito) throws Exception;
	public boolean insert(EntityManager em, TCredito Credito) throws Exception;
	public boolean update(EntityManager em, TCredito Credito) throws Exception;
	public List<TCredito> getAllCredito(EntityManager em) throws Exception;

}
