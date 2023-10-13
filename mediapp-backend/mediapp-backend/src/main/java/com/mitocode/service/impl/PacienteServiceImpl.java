package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IPacienteDAO;
import com.mitocode.model.Paciente;
import com.mitocode.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteDAO dao;

	@Override
	public Paciente registrar(Paciente paciente) {
		return dao.save(paciente);
	}

	@Override
	public void modificar(Paciente paciente) {
		dao.save(paciente);
		
	}

	@Override
	public void eliminar(int idPaciente) {
		dao.deleteById(idPaciente);
		
	}

	@Override
	public Optional<Paciente> ListarId(int idPaciente) {
		return dao.findById(idPaciente);
	}

	@Override
	public List<Paciente> Listar() {
		return dao.findAll();
	}

}
