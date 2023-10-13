package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mitocode.dao.IConsultaDAO;
import com.mitocode.dao.IconsultaExamenDAO;
import com.mitocode.dto.ConsultaListaExamenDTO;
import com.mitocode.model.Consulta;
import com.mitocode.service.IConsultaService;

@Service
public class ConsultaServiceImpl implements IConsultaService{
	
	@Autowired
	private IConsultaDAO dao;
	
	@Autowired
	private IconsultaExamenDAO ceDao;
	
	@Transactional
	@Override
	public Consulta registrar(ConsultaListaExamenDTO consultaDTO) {
		Consulta cons = new Consulta();
		consultaDTO.getConsulta().getDetalleConsulta().forEach(x -> x.setConsulta(consultaDTO.getConsulta()));
		cons = dao.save(consultaDTO.getConsulta());
		consultaDTO.getExamenes().forEach(e -> ceDao.registrar(consultaDTO.getConsulta().getIdConsulta(), e.getIdExamen()));
		return cons;
	}

	@Override
	public void modificar(Consulta consulta) {
		dao.save(consulta);
		
	}

	@Override
	public void eliminar(int idConsulta) {
		dao.deleteById(idConsulta);
		
	}

	@Override
	public Optional<Consulta> ListarId(int idConsulta) {
		return dao.findById(idConsulta);
	}

	@Override
	public List<Consulta> Listar() {
		return dao.findAll();
	}
	
	

}
