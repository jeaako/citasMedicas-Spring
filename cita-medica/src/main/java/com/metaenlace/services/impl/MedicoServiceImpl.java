package com.metaenlace.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metaenlace.model.Medico;
import com.metaenlace.repositories.MedicoRepo;
import com.metaenlace.services.IMedicoService;

@Service
public class MedicoServiceImpl implements IMedicoService{

	@Autowired
	private MedicoRepo repositorio;
	
	@Override
	public List<Medico> findAllMedicos() {
		List<Medico> medicos = repositorio.findAll();
		return medicos;
	}

	@Override
	public Medico findMedicoById(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	@Override
	public boolean addMedico(Medico nuevoMedico) {
		if (nuevoMedico != null) {
			repositorio.save(nuevoMedico);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean delMedico(Long id) {

		if (repositorio.existsById(id)) {
			repositorio.deleteById(id);
			return true;
		}
		return false;
	}
}
 
 