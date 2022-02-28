package com.metaenlace.dto;

import java.io.Serializable;
import java.util.Date;

public class CitaDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date fechaHora;
	private String motivoCita;
	
	private Long pacienteId;
	private Long medicoId;
	private Long diagnosticoId;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getMotivoCita() {
		return motivoCita;
	}

	public void setMotivoCita(String motivoCita) {
		this.motivoCita = motivoCita;
	}

	public Long getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(Long pacienteId) {
		this.pacienteId = pacienteId;
	}

	public Long getMedicoId() {
		return medicoId;
	}

	public void setMedicoId(Long medicoId) {
		this.medicoId = medicoId;
	}

	public Long getDiagnosticoId() {
		return diagnosticoId;
	}

	public void setDiagnosticoId(Long diagnosticoId) {
		this.diagnosticoId = diagnosticoId;
	}


	
	
}
