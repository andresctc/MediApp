package com.mitocode.controller;

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

import com.mitocode.model.Examen;
import com.mitocode.model.Medico;
import com.mitocode.service.IMedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	@Autowired
	private IMedicoService service;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Medico>> listar(){
		List<Medico> medicos = new ArrayList<>();
		medicos = service.Listar();
		return new ResponseEntity<List<Medico>>(medicos,HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<Optional<Medico>> listarId(@PathVariable Integer id){
		Optional<Medico> medico = Optional.of(new Medico());
		medico = service.ListarId(id);
		return new ResponseEntity<Optional<Medico>>(medico,HttpStatusCode.valueOf(200));
	}

	@PostMapping("/registrar")
	public ResponseEntity<Integer> registrar(@RequestBody Medico medico){
		int resultado = 0;
		try {
			service.registrar(medico);
			resultado = 1;
		} catch (Exception e) {
			resultado = 0;
		}
		return new ResponseEntity<Integer>(resultado,HttpStatusCode.valueOf(200));
	}

	@DeleteMapping("/eliminar")
	public ResponseEntity<Integer> eliminarId(@PathVariable Integer id){
		int resultado = 0;
		try {
			service.eliminar(id);
			resultado = 1;
		} catch (Exception e) {
			resultado = 0;
		}
		return new ResponseEntity<Integer>(resultado,HttpStatusCode.valueOf(200));
	}
}
