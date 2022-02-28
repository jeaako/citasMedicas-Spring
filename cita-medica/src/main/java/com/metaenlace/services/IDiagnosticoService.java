package com.metaenlace.services;

import java.util.List;

import com.metaenlace.model.Diagnostico;

public interface IDiagnosticoService {

	List<Diagnostico> findAllDiagnosticos();

	Diagnostico findDiagnosticoById(Long id);

}
