package com.metaenlace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metaenlace.model.Cita;

@Repository
public interface CitaRepo extends JpaRepository<Cita, Long>{

}