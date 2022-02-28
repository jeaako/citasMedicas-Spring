package com.metaenlace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metaenlace.model.Diagnostico;

@Repository
public interface DiagnosticoRepo extends JpaRepository<Diagnostico, Long>{

}
