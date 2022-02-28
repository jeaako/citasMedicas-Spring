package com.metaenlace.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metaenlace.dto.PacienteDTO;
import com.metaenlace.mappers.PacienteMapper;
import com.metaenlace.model.Paciente;
import com.metaenlace.services.IPacienteService;


@RestController
@RequestMapping(value = "/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private PacienteMapper mapper;
	
	@GetMapping
	public List<PacienteDTO> getPacientes() {
		List<Paciente> pacientes = pacienteService.findAllPacientes();
		return mapper.toDTOList(pacientes);
	}
	
	@GetMapping(value = "/{id}")
	public PacienteDTO getPaciente(@PathVariable Long id) {
		Paciente paciente = pacienteService.findPacienteById(id); 
		
		if (paciente == null) return null;
		
		return mapper.toDTO(paciente);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> newPaciente(@RequestBody PacienteDTO nuevoPaciente) {
		
		if (pacienteService.addPaciente(mapper.toEntity(nuevoPaciente)))
			return ResponseEntity.ok("Paciente creado correctamente.");
		else 
			return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		if (pacienteService.delPaciente(id))
			return ResponseEntity.ok("Paciente eliminado correctamente.");
		return ResponseEntity.notFound().build();
	}
}
