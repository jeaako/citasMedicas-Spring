package com.metaenlace.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metaenlace.model.Cita;
import com.metaenlace.repositories.CitaRepo;
import com.metaenlace.services.ICitaService;

@Service
public class CitaServiceImpl implements ICitaService{

	@Autowired
	private CitaRepo repositorio;
	
	@Override
	public List<Cita> findAllCitas() {
		List<Cita> citas = repositorio.findAll();
		return citas;
	}

	@Override
	public Cita findCitaById(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	//add
	//delete
}
 