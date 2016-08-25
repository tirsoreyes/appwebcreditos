package com.itsav.creditos.daointerface;

import java.util.List;

import javax.persistence.EntityManager;

import com.itsav.creditos.entity.TCurso;

public interface IDaoCurso {
	public boolean delete(EntityManager em, TCurso Curso) throws Exception;
	public boolean insert(EntityManager em, TCurso Curso) throws Exception;
	public boolean update(EntityManager em, TCurso Curso) throws Exception;
	public List<TCurso> getAllCursos(EntityManager em) throws Exception;
}
