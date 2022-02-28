package com.metaenlace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metaenlace.model.Paciente;

@Repository
public interface PacienteRepo extends JpaRepository<Paciente, Long>{


}