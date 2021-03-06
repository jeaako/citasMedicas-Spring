package com.metaenlace.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "cita")
public class Cita implements Serializable{

	private static final long serialVersionUID = 1L;
 
	@Id
	@SequenceGenerator(name="CITA_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CITA_SEQ")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "fecha_hora")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaHora;
	
	@Column(name = "motivo_cita")
	private String motivoCita;

	@ManyToOne
	@JoinColumn(name = "medico")
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name = "paciente")
	private Paciente paciente;
	 
	@OneToOne
	@JoinColumn(name = "diagnostico")
	private Diagnostico diagnostico;
	
	
	public Cita() {}
	
	public Cita(Date fechaHora, String motivoCita, Medico medico, Paciente paciente, Diagnostico diagnostico) {
		this.fechaHora = fechaHora;
		this.motivoCita = motivoCita;
		this.medico = medico;
		this.paciente = paciente;
		this.diagnostico = diagnostico;
	}
	
	// Getters and Setters

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

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Diagnostico getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

}