package com.metaenlace.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.metaenlace.dto.DiagnosticoDTO;
import com.metaenlace.model.Diagnostico;

@Mapper(componentModel = "spring")
public interface DiagnosticoMapper {
	DiagnosticoDTO toDTO(Diagnostico diagnostico);
	Diagnostico toEntity(DiagnosticoDTO diagnosticoDTO);
	
	List<DiagnosticoDTO> toDTOList(List<Diagnostico> diagnosticos);
	List<Diagnostico> toEntityList(List<DiagnosticoDTO> diagnosticosDTO);
}
