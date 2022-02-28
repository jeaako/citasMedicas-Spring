package com.metaenlace.services;

import java.util.List;

import com.metaenlace.model.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAllUsuarios();
	
	public Usuario findUsuarioById(Long id);

	public boolean addUsuario(Usuario nuevoUsuario);

	boolean delUsuario(Long id);
	
}
