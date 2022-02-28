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

import com.metaenlace.dto.MedicoDTO;
import com.metaenlace.mappers.MedicoMapper;
import com.metaenlace.model.Medico;
import com.metaenlace.services.IMedicoService;


@RestController
@RequestMapping(value = "/medicos")
public class MedicoController {
	@Autowired
	private IMedicoService medicoService;
	
	@Autowired
	private MedicoMapper mapper;
	
	@GetMapping
	public List<MedicoDTO> getMedicos() {
		List<Medico> medicos = medicoService.findAllMedicos();
		return mapper.toDTOList(medicos);
	}
	
	@GetMapping("/{id}")
	public MedicoDTO getMedico(@PathVariable Long id) {
		Medico medico = medicoService.findMedicoById(id); 
		
		if (medico == null) return null;
		
		return mapper.toDTO(medico);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> newMedico(@RequestBody MedicoDTO nuevoMedico) {
		
		if (medicoService.addMedico(mapper.toEntity(nuevoMedico)))
			return ResponseEntity.ok("Medico creado correctamente.");
		else 
			return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		if (medicoService.delMedico(id))
			return ResponseEntity.ok("Medico eliminado correctamente.");
		return ResponseEntity.notFound().build();
	}
}
