package com.metaenlace.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metaenlace.model.Paciente;
import com.metaenlace.repositories.PacienteRepo;
import com.metaenlace.services.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private PacienteRepo repositorio;
	
	@Override
	public List<Paciente> findAllPacientes() {
		List<Paciente> pacientes = repositorio.findAll();
		return pacientes;
	}

	@Override
	public Paciente findPacienteById(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	@Override
	public boolean addPaciente(Paciente nuevoPaciente) {
		if (nuevoPaciente != null) {
			repositorio.save(nuevoPaciente);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean delPaciente(Long id) {

		if (repositorio.existsById(id)) {
			repositorio.deleteById(id);
			return true;
		}
		return false;
	}
}