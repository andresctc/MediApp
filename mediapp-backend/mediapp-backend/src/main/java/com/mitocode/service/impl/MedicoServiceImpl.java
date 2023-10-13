package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IMedicoDAO;
import com.mitocode.model.Medico;
import com.mitocode.service.IMedicoService;

@Service
public class MedicoServiceImpl implements IMedicoService{
	
	@Autowired
	private IMedicoDAO dao;

	@Override
	public void registrar(Medico medico) {
		dao.save(medico);	
	}

	@Override
	public void modificar(Medico medico) {
		dao.save(medico);
	}

	@Override
	public void eliminar(int idMedico) {
		dao.deleteById(idMedico);
	}

	@Override
	public Optional<Medico> ListarId(int idMedico) {
		Optional<Medico> medico = Optional.ofNullable(new Medico());
		medico = dao.findById(idMedico);
		return medico;
	}

	@Override
	public List<Medico> Listar() {
		return dao.findAll();
	}

}
