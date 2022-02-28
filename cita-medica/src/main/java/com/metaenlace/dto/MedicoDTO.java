package com.metaenlace.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String nombre;
	private String apellidos;

	private String usuario;
	private String clave;

	private String numColegiado;
	private List<Long> pacientesId = new ArrayList<Long>();
	private List<Long> citasId =  new ArrayList<Long>();

	public Long getId() {
		return id;
	}

	public void seId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(String numColegiado) {
		this.numColegiado = numColegiado;
	}

	public List<Long> getPacientesId() {
		return pacientesId;
	}

	public void setPacientesId(List<Long> pacientesId) {
		this.pacientesId = pacientesId;
	}

	public List<Long> getCitasId() {
		return citasId;
	}

	public void setCitasId(List<Long> citasId) {
		this.citasId = citasId;
	}

}
