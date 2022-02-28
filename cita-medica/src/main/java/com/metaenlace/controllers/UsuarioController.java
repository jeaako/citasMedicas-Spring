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

import com.metaenlace.dto.UsuarioDTO;
import com.metaenlace.mappers.UsuarioMapper;
import com.metaenlace.model.Usuario;
import com.metaenlace.services.IUsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private UsuarioMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> getUsuarios() {
		List<Usuario> usuarios = usuarioService.findAllUsuarios();
		if (usuarios != null)
			return ResponseEntity.ok(mapper.toDTOList(usuarios));
		else
			return ResponseEntity.badRequest().build();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UsuarioDTO> getUsuario(@PathVariable Long id) {
		Usuario usuario = usuarioService.findUsuarioById(id); 
		
		if (usuario != null)
			return ResponseEntity.ok(mapper.toDTO(usuario));
		else return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> newUsuario(@RequestBody UsuarioDTO nuevoUsuario) {
		
		if (usuarioService.addUsuario(mapper.toEntity(nuevoUsuario)))
			return ResponseEntity.ok("Usuario creado correctamente.");
		else 
			return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		if (usuarioService.delUsuario(id))
			return ResponseEntity.ok("Usuario eliminado correctamente.");
		return ResponseEntity.notFound().build();
	}
}
