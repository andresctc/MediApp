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
import com.mitocode.service.IExamenService;

@RestController
@RequestMapping("/examenes")
public class Examenes {

	@Autowired
	private IExamenService service;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Examen>> listar(){
		List<Examen> examenes = new ArrayList<>();
		examenes = service.Listar();
		return new ResponseEntity<List<Examen>>(examenes,HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<Optional<Examen>> listarId(@PathVariable Integer id){
		Optional<Examen> examen = Optional.ofNullable(new Examen());
		examen = service.ListarId(id);
		return new ResponseEntity<Optional<Examen>>(examen,HttpStatusCode.valueOf(200));
	}

	@PostMapping("/registrar")
	public ResponseEntity<Integer> registrar(@RequestBody Examen examen){
		int resultado = 0;
		try {
			service.registrar(examen);
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
