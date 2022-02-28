package com.metaenlace.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "medico")

public class Medico extends Usuario {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "num_colegiado")
	private String numColegiado;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "MEDICO_PACIENTE",
			joinColumns = @JoinColumn(name = "medico"),
			inverseJoinColumns = @JoinColumn(name = "paciente"))
	public List<Paciente> pacientes = new ArrayList<Paciente>();
	
	@OneToMany(mappedBy="medico", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Cita> citas = new ArrayList<Cita>();
	
	public Medico() {
		super();
	}

	public Medico(String nombre, String apellidos, String user,String clave, String numColegiado) {
		super(nombre, apellidos, user, clave);
		this.numColegiado = numColegiado;
	}
	
	// Getters and Setters

	public String getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(String numColegiado) {
		this.numColegiado = numColegiado;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public void addPaciente(Paciente paciente) {
		if(!pacientes.contains(paciente))
			pacientes.add(paciente);
	}
	
}
