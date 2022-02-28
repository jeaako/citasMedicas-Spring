package com.metaenlace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metaenlace.model.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
	
}
