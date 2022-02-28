package com.metaenlace.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USER_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "clave")
	private String clave;
	
	public Usuario() {}
	
	public Usuario (String nombre, String apellidos, String usuario, String clave) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.clave = clave;	
	}
	
	// Getters and Setters

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
}
