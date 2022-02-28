package com.metaenlace.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "paciente")

public class Paciente extends Usuario {

	private static final long serialVersionUID = 1L;

	@Column(name = "NSS")
	private String nss;
	
	@Column(name = "num_tarjeta")
	private String numTarjeta;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "direccion")
	private String direccion;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "pacientes")
	private List<Medico> medicos = new ArrayList<Medico>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="paciente", orphanRemoval = true)
	private List<Cita> citas = new ArrayList<Cita>();
	
	public Paciente() {
		super();
	}

	public Paciente(String nombre, String apellidos, String usuario, String clave, String nss, String numTarjeta, String telefono, String direccion) {
		super(nombre, apellidos, usuario, clave);
		this.nss = nss;
		this.numTarjeta = numTarjeta;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	// Getters and Setters

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}
	
	public void addMedico(Medico medico) {
		if(!medicos.contains(medico))
			medicos.add(medico);
	}

}