package com.mitocode.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass(ConsultaExamenPK.class)
@Table(name = "CONSULTAEXAMENES")
public class ConsultaExamen {
	
	@Id
	private Examen examen;
	
	@Id
	private Consulta consulta;	
	
	@Override
	public int hashCode() {
		return Objects.hash(consulta, examen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaExamen other = (ConsultaExamen) obj;
		return Objects.equals(consulta, other.consulta) && Objects.equals(examen, other.examen);
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
}
