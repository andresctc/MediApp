package com.mitocode.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mitocode.dto.ConsultaListaExamenDTO;
import com.mitocode.model.Consulta;
import com.mitocode.service.IConsultaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
	
	@Autowired
	private IConsultaService service;
	
	@GetMapping("listar")
	public ResponseEntity<List<Consulta>> listar(){
		List<Consulta> consultas = new ArrayList<>();
		consultas = service.Listar();
		return new ResponseEntity<List<Consulta>>(consultas, HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("listar/{id}")
	public ResponseEntity<Optional<Consulta>> listarId(@PathVariable("id") Integer id){
		Optional<Consulta> consulta = Optional.ofNullable(new Consulta());
		consulta = service.ListarId(id);
		return new ResponseEntity<Optional<Consulta>>(consulta, HttpStatusCode.valueOf(200));
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Object> registrar(@Valid @RequestBody ConsultaListaExamenDTO consultaDTO) {
		Consulta c = new Consulta();
		c = service.registrar(consultaDTO);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(c.getIdConsulta()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable Integer id){
		int resultado = 0;
		try {
			service.eliminar(id);
			resultado = 1;
		} catch (Exception e) {
			resultado = 0;
		}
		return new ResponseEntity<Integer>(resultado, HttpStatusCode.valueOf(200));
	}
	

}
