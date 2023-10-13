package com.mitocode.dto;

import java.util.List;

import com.mitocode.model.Consulta;
import com.mitocode.model.Examen;

public class ConsultaListaExamenDTO {

	private Consulta consulta;
	private List<Examen> examenes;
	
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	public List<Examen> getExamenes() {
		return examenes;
	}
	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}
	
	
}
