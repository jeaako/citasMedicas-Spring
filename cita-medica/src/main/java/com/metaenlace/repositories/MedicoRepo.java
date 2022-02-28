package com.metaenlace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metaenlace.model.Medico;

@Repository
public interface MedicoRepo extends JpaRepository<Medico, Long>{

}