package com.mitocode.dto;

import org.springframework.hateoas.RepresentationModel;

public class ConsultaDTO extends RepresentationModel<ConsultaDTO>{
	
	private int idPaciente;
	private String nombresCompletos;
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombresCompletos() {
		return nombresCompletos;
	}
	public void setNombresCompletos(String nombresCompletos) {
		this.nombresCompletos = nombresCompletos;
	}
	
	
}
