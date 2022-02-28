package com.metaenlace.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "diagnostico")
public class Diagnostico implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DIAGN_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIAGN_SEQ")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "valoracion_espec")
	public String valoracionEspecialista;
	
	@Column(name = "enfermedad")
	public String enfermedad;
	
	//@OneToOne
    //private Cita cita;
	
	public Diagnostico() {}
	
	public Diagnostico(String valoracionEspecialista, String enfermedad) {
		this.valoracionEspecialista = valoracionEspecialista;
		this.enfermedad = enfermedad;
	}

	// Getters and Setters
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValoracionEspecialista() {
		return valoracionEspecialista;
	}

	public void setValoracionEspecialista(String valoracionEspecialista) {
		this.valoracionEspecialista = valoracionEspecialista;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

}