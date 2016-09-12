package com.itsav.creditos.daointerface;

import java.util.List;

import javax.persistence.EntityManager;

import com.itsav.creditos.entity.TAlumno;

public interface IDaoAlumno {

	public boolean delete(EntityManager em, TAlumno Alumno) throws Exception;
	public boolean insert(EntityManager em, TAlumno Alumno) throws Exception;
	public boolean update(EntityManager em, TAlumno Alumno) throws Exception;
	public List<TAlumno> getAllAlumnos(EntityManager em) throws Exception;
	public TAlumno findByMatricula (EntityManager em, String Matricula) throws Exception;
}
