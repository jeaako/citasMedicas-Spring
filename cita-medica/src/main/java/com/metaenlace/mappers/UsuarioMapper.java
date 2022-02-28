package com.metaenlace.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.metaenlace.dto.UsuarioDTO;
import com.metaenlace.model.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	UsuarioDTO toDTO(Usuario usuario);
	Usuario toEntity(UsuarioDTO usuarioDTO);
	
	List<UsuarioDTO> toDTOList(List<Usuario> usuarios);
	List<Usuario> toEntityList(List<UsuarioDTO> usuariosDTO);
}
