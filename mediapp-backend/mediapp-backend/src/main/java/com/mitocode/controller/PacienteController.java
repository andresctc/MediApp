package com.mitocode.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.dto.PacienteDTO;
import com.mitocode.exception.ModeloNotFoundException;
import com.mitocode.model.Paciente;
import com.mitocode.service.IPacienteService;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private IPacienteService service;

	@GetMapping("")
	public ResponseEntity<List<Paciente>> listar() {
		List<Paciente> pacientes = new ArrayList<>();
		try {
			pacientes = service.Listar();
		} catch (Exception e) {
			return new ResponseEntity<List<Paciente>>(pacientes, HttpStatusCode.valueOf(500));
		}
		return new ResponseEntity<List<Paciente>>(pacientes, HttpStatusCode.valueOf(200));
	}

	@GetMapping("/{id}")
	public Optional<Paciente> listarId(@PathVariable("id") Integer id) {
		Optional<Paciente> paciente = Optional.ofNullable(new Paciente());

			paciente = service.ListarId(id);
			if(paciente.isEmpty()){
				throw new ModeloNotFoundException("ID: " + id); // Se esta lanzando la excepcion personalizada de la clase creada
			}
			EntityModel<PacienteDTO> resource ;
			WebMvcLinkBuilder linkTo; //= LinkTo(methodOn(this.getClass()));
			
			
//			PersonModel model = new PersonModel();
//			model.firstname = "Dave";
//			model.lastname = "Matthews";
//			model.add(Link.of("https://myhost/people/42"));
			
			
			return paciente;
	}

	@PutMapping("/registrar")
	public ResponseEntity<Paciente> actualizar(@Valid @RequestBody Paciente paciente) {
		Paciente pac = new Paciente();
		try {
			pac = service.registrar(paciente);
		} catch (Exception e) {
			return new ResponseEntity<Paciente>(pac, HttpStatusCode.valueOf(500));
		}
		return new ResponseEntity<Paciente>(pac, HttpStatusCode.valueOf(201));
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminarId(@PathVariable Integer id) {
		Optional<Paciente> pac = service.ListarId(id);
		if(pac.isEmpty()){
			throw new ModeloNotFoundException("ID :" + id); 
		}else {
			service.eliminar(id);
		}
		 
	}
}
