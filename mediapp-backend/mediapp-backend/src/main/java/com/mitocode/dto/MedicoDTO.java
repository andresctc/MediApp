package com.mitocode.dto;

import org.springframework.hateoas.RepresentationModel;

public class MedicoDTO extends RepresentationModel<MedicoDTO>{
	
	private int idMedico;
	private String nombre;
	
	public int getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
