package com.metaenlace.dto;

import java.io.Serializable;

public class DiagnosticoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String enfermedad;
	private String valoracionEspec;

	private Long citaId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public String getValoracionEspec() {
		return valoracionEspec;
	}

	public void setValoracionEspec(String valoracionEspec) {
		this.valoracionEspec = valoracionEspec;
	}

	public Long getCitaId() {
		return citaId;
	}

	public void setCitaId(Long citaId) {
		this.citaId = citaId;
	}
}
