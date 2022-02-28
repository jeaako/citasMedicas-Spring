package com.metaenlace.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metaenlace.model.Diagnostico;
import com.metaenlace.repositories.DiagnosticoRepo;
import com.metaenlace.services.IDiagnosticoService;

@Service
public class DiagnosticoServiceImpl implements IDiagnosticoService{

	@Autowired
	private DiagnosticoRepo repositorio;
	
	@Override
	public List<Diagnostico> findAllDiagnosticos() {
		List<Diagnostico> diagnosticos = repositorio.findAll();
		return diagnosticos;
	}

	@Override
	public Diagnostico findDiagnosticoById(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	//add
	//delete
}
 