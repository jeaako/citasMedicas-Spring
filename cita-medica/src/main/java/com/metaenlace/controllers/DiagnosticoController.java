package com.metaenlace.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metaenlace.dto.DiagnosticoDTO;
import com.metaenlace.mappers.DiagnosticoMapper;
import com.metaenlace.model.Diagnostico;
import com.metaenlace.services.IDiagnosticoService;


@RestController
@RequestMapping(value = "/diagnosticos")
public class DiagnosticoController {
	@Autowired
	private IDiagnosticoService diagnosticoService;
	
	@Autowired
	private DiagnosticoMapper mapper;
	
	@GetMapping
	public List<DiagnosticoDTO> getDiagnosticos() {
		List<Diagnostico> diagnosticos = diagnosticoService.findAllDiagnosticos();
		return mapper.toDTOList(diagnosticos);
	}
	
	@GetMapping("/{id}")
	public DiagnosticoDTO getDiagnostico(@PathVariable Long id) {
		Diagnostico diagnostico = diagnosticoService.findDiagnosticoById(id); 
		
		if (diagnostico == null) return null;
		
		return mapper.toDTO(diagnostico);
	}
	
	//POST
	//DELETE
}
