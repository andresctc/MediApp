package com.mitocode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.mitocode.model.Paciente;

public interface IPacienteService {
	
	Paciente registrar(Paciente paciente);
	
	void modificar(Paciente paciente);
	
	void eliminar(int idPaciente);
	
	Optional<Paciente> ListarId(int idPaciente);
	
	List<Paciente> Listar();
}
