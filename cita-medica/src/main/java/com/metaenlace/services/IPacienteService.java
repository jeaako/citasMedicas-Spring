package com.metaenlace.services;

import java.util.List;

import com.metaenlace.model.Paciente;

public interface IPacienteService {
	
	List<Paciente> findAllPacientes();
	
	Paciente findPacienteById(Long id);

	boolean addPaciente(Paciente nuevoPaciente);

	boolean delPaciente(Long id);

}
