package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IExamenDAO;
import com.mitocode.model.Examen;
import com.mitocode.service.IExamenService;

@Service
public class ExamenServiceImpl implements IExamenService{

	@Autowired
	private IExamenDAO dao;
	
	@Override
	public void registrar(Examen examen) {
		dao.save(examen);
		
	}

	@Override
	public void modificar(Examen examen) {
		dao.save(examen);
		
	}

	@Override
	public void eliminar(int idExamen) {
		dao.deleteById(idExamen);
		
	}

	@Override
	public Optional<Examen> ListarId(int idExamen) {
		return dao.findById(idExamen);
	}

	@Override
	public List<Examen> Listar() {
		return dao.findAll();
	}

}
