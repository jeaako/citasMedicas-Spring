package com.metaenlace.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.metaenlace.dto.CitaDTO;
import com.metaenlace.model.Cita;

@Mapper(componentModel = "spring")
public interface CitaMapper {
	CitaDTO toDTO(Cita cita);
	Cita toEntity(CitaDTO citaDTO);
	
	List<CitaDTO> toDTOList(List<Cita> citas);
	List<Cita> toEntityList(List<CitaDTO> citasDTO);
}
