package com.mitocode.service;

import java.util.List;
import java.util.Optional;

import com.mitocode.model.Examen;

public interface IExamenService {
	
	void registrar(Examen examen);
	
	void modificar(Examen examen);
	
	void eliminar(int idExamen);
	
	Optional<Examen> ListarId(int idExamen);
	
	List<Examen> Listar();

}
