package com.itsav.creditos.ejbinterface;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import com.itsav.creditos.entity.TGrupo;

@Local
public interface IEjbGrupo {
	
		public Map<String, String> insert();
		public Map<String, String> update();
		public Map<String, String> remove();
		public List<TGrupo> findAll();
		
		public TGrupo getGrupo();
		public void setGrupo(TGrupo Grupo) ;
		
		

}
