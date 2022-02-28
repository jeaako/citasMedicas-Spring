package com.metaenlace.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metaenlace.dto.CitaDTO;
import com.metaenlace.mappers.CitaMapper;
import com.metaenlace.model.Cita;
import com.metaenlace.services.ICitaService;


@RestController
@RequestMapping("/citas")
public class CitaController {
	
	@Autowired
	private ICitaService citaService;
	
	@Autowired
	private CitaMapper mapper;
	
	@GetMapping
	public List<CitaDTO> getCitas() {
		List<Cita> citas = citaService.findAllCitas();
		return mapper.toDTOList(citas);
	}
	
	@GetMapping("/{id}")
	public CitaDTO getCita(@PathVariable Long id) {
		Cita cita = citaService.findCitaById(id); 
		
		if (cita == null) return null;
		
		return mapper.toDTO(cita);
	}

	
	//POST
	//DELETE
}
