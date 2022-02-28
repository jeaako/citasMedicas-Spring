package com.metaenlace.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metaenlace.model.Usuario;
import com.metaenlace.repositories.UsuarioRepo;
import com.metaenlace.services.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private UsuarioRepo repositorio;
	
	@Override
	public List<Usuario> findAllUsuarios() {
		List<Usuario> usuarios = repositorio.findAll();
		return usuarios;
	}

	@Override
	public Usuario findUsuarioById(Long id) {
		return repositorio.findById(id).orElse(null);
	}
	
	@Override
	public boolean addUsuario(Usuario nuevoUsuario) {
		if (nuevoUsuario != null) {
			repositorio.save(nuevoUsuario);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean delUsuario(Long id) {

		if (repositorio.existsById(id)) {
			repositorio.deleteById(id);
			return true;
		}
		return false;
	}
}
 