package com.metaenlace.services;

import java.util.List;

import com.metaenlace.model.Medico;

public interface IMedicoService {

	List<Medico> findAllMedicos();

	Medico findMedicoById(Long id);

	boolean addMedico(Medico nuevoMedico);

	boolean delMedico(Long id);

}
