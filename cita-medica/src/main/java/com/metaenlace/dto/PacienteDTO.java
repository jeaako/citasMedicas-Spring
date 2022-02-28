package com.metaenlace.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class PacienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String nombre;
	private String apellidos;

	private String usuario;
	private String clave;

	private String nss;
	private String numTarjeta;
	private String telefono;
	private String direccion;

	private List<Long> medicosId = new ArrayList<Long>();
	private List<Long> citasId = new ArrayList<Long>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public List<Long> getMedicosId() {
		return medicosId;
	}

	public void setMedicosId(List<Long> medicosId) {
		this.medicosId = medicosId;
	}

	public List<Long> getCitasId() {
		return citasId;
	}

	public void setCitasId(List<Long> citasId) {
		this.citasId = citasId;
	}

}
