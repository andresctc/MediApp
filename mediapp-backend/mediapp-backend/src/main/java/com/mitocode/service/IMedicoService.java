package com.mitocode.service;

import java.util.List;
import java.util.Optional;

import com.mitocode.model.Medico;

public interface IMedicoService {
	
	void registrar(Medico medico);
	
	void modificar(Medico medico);
	
	void eliminar(int idMedico);
	
	Optional<Medico> ListarId(int idMedico);
	
	List<Medico> Listar();
}
