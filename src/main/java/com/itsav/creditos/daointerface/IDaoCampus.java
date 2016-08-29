package com.itsav.creditos.daointerface;

import java.util.List;

import javax.persistence.EntityManager;

import com.itsav.creditos.entity.TCampus;

public interface IDaoCampus {
	public boolean delete(EntityManager em, TCampus Campus) throws Exception;
	public boolean insert(EntityManager em, TCampus Campus) throws Exception;
	public boolean update(EntityManager em, TCampus Campus) throws Exception;
	public List<TCampus> getAllCampus(EntityManager em) throws Exception;

}
