package com.metaenlace.services;

import java.util.List;

import com.metaenlace.model.Cita;

public interface ICitaService {

	List<Cita> findAllCitas();

	Cita findCitaById(Long id);

}
