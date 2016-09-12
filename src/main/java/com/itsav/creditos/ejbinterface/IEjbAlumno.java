package com.itsav.creditos.ejbinterface;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import com.itsav.creditos.entity.TAlumno;

@Local
public interface IEjbAlumno {
	
	 
		public Map<String, String> insert();
		public Map<String, String> update();
		public Map<String, String> remove();
		public List<TAlumno> findAll();
		public TAlumno findByMatricula(String Matricula);
		
		public TAlumno getAlumno();
		public void setAlumno(TAlumno Alumno) ;

}
