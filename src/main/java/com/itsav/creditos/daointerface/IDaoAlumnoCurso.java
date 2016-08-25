package com.itsav.creditos.daointerface;

import java.util.List;

import javax.persistence.EntityManager;

import com.itsav.creditos.entity.TAlumnoCurso;

public interface IDaoAlumnoCurso {
	public boolean delete(EntityManager em, TAlumnoCurso AlumnoCurso) throws Exception;
	public boolean insert(EntityManager em, TAlumnoCurso AlumnoCurso) throws Exception;
	public boolean update(EntityManager em, TAlumnoCurso AlumnoCurso) throws Exception;
	public List<TAlumnoCurso> getAllAlumnoCursos(EntityManager em) throws Exception;
}
