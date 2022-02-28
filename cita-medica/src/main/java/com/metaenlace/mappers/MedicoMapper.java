package com.metaenlace.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.metaenlace.dto.MedicoDTO;
import com.metaenlace.model.Medico;

@Mapper(componentModel = "spring")
public interface MedicoMapper {

	MedicoDTO toDTO(Medico medico);
	Medico toEntity(MedicoDTO medicoDTO);
	
	List<MedicoDTO> toDTOList(List<Medico> medicos);
	List<Medico> toEntityList(List<MedicoDTO> medicosDTO);
}
