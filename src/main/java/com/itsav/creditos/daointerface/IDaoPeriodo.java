package com.itsav.creditos.daointerface;

import java.util.List;

import javax.persistence.EntityManager;

import com.itsav.creditos.entity.TPeriodo;

public interface IDaoPeriodo {
	public boolean delete(EntityManager em, TPeriodo Periodo) throws Exception;
	public boolean insert(EntityManager em, TPeriodo Periodo) throws Exception;
	public boolean update(EntityManager em, TPeriodo Periodo) throws Exception;
	public List<TPeriodo> getAllPeriodos(EntityManager em) throws Exception;

}
