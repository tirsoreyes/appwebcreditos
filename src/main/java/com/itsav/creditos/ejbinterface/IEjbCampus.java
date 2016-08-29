package com.itsav.creditos.ejbinterface;

import java.util.List;
import java.util.Map;

import javax.ejb.Local;

import com.itsav.creditos.entity.TCampus;

@Local
public interface IEjbCampus {
	

	public Map<String, String> insert();
	public Map<String, String> update();
	public Map<String, String> remove();
	public List<TCampus> findAll();
	
	public TCampus getCampus();
	public void setCampus(TCampus Campus) ;


}
