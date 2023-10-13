package com.mitocode.service;

import java.util.List;
import java.util.Optional;

import com.mitocode.dto.ConsultaListaExamenDTO;
import com.mitocode.model.Consulta;

public interface IConsultaService {
	
	Consulta registrar(ConsultaListaExamenDTO consultaDTO);
	
	void modificar(Consulta consulta);
	
	void eliminar(int idConsulta);
	
	Optional<Consulta> ListarId(int idConsulta);
	
	List<Consulta> Listar();
}
