package org.edu.clinica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {
@Id
@GeneratedValue

	private Long   id;
	private String usuario;
	private String senhar;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenhar() {
		return senhar;
	}
	public void setSenhar(String senhar) {
		this.senhar = senhar;
	}
	
	
	
}
