package com.mitocode.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.dao.IEspecialidadDAO;
import com.mitocode.model.Especialidad;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {

	@Autowired
	private IEspecialidadDAO service;
	
	@GetMapping("listar")
	public ResponseEntity<List<Especialidad>> listar(){
		List<Especialidad> especialidades = new ArrayList<>();
		especialidades = service.findAll();
		return new ResponseEntity<List<Especialidad>>(especialidades, HttpStatusCode.valueOf(200));
	}
	
	@GetMapping("listar/{id}")
	public ResponseEntity<Optional<Especialidad>> listarId(@PathVariable("id") Integer id){
		Optional<Especialidad> especialidad = Optional.ofNullable(new Especialidad());
		especialidad = service.findById(id);
		return new ResponseEntity<Optional<Especialidad>>(especialidad, HttpStatusCode.valueOf(200));
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Integer> registrar(@RequestBody Especialidad especialidad) {
		int resultado = 0;
		try {
			service.save(especialidad);
			resultado = 1;
		} catch (Exception e) {
			resultado = 0;
		}
		return new ResponseEntity<Integer>(resultado, HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Integer> actualizar(@RequestBody Especialidad especialidad){
		int resultado = 0;
		try {
			service.save(especialidad);
			resultado = 1;
		} catch (Exception e) {
			resultado = 0;
		}
		return new ResponseEntity<Integer>(resultado, HttpStatusCode.valueOf(200));
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Integer> eliminar(@PathVariable Integer id){
		int resultado = 0;
		try {
			service.deleteById(id);
			resultado = 1;
		} catch (Exception e) {
			resultado = 0;
		}
		return new ResponseEntity<Integer>(resultado, HttpStatusCode.valueOf(200));
	}
}
