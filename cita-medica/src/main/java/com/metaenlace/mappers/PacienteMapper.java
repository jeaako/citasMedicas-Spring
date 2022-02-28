package com.metaenlace.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.metaenlace.dto.PacienteDTO;
import com.metaenlace.model.Paciente;

@Mapper(componentModel = "spring")
public interface PacienteMapper {

	PacienteDTO toDTO(Paciente paciente);
	Paciente toEntity(PacienteDTO pacienteDTO);
	
	List<PacienteDTO> toDTOList(List<Paciente> pacientes);
	List<Paciente> toEntityList(List<PacienteDTO> pacientesDTO);
}
