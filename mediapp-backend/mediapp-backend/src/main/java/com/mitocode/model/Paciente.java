package com.mitocode.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@ApiModel(description="Informacion del paciente")
@Entity
@Table(name = "PACIENTES")
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPaciente;
	
	@ApiModelProperty(notes = "Nombres debe tener minimo 3 caracteres")
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "nombres", nullable = true, length = 70)
	private String nombres;
	
	@ApiModelProperty(notes = "Apellidos debe tener minimo 3 caracteres")
	@Size(min = 3, message = "Apellidos debe tener minimo 3 caracteres")
	@Column(name = "apellidos", nullable = true, length = 70)
	private String apellidos;
	
	@ApiModelProperty(notes = "DNI debe tener minimo 8 caracteres")
	@Size(min = 8, max = 8, message = "DNI debe tener minimo 8 caracteres")
	@Column(name = "dni", nullable = true, length = 8)
	private String dni;
	
	@ApiModelProperty(notes = "DNI debe tener minimo 3 caracteres")
	@Size(min = 3, max = 150, message = "DNI debe tener minimo 3 caracteres")
	@Column(name = "direccion", nullable = true, length = 150)
	private String direccion;
	
	@ApiModelProperty(notes = "DNI debe tener minimo 9 caracteres")
	@Size(min = 9, message = "DNI debe tener minimo 9 caracteres")
	@Column(name = "telefono", nullable = true, length = 9)
	private String telefono;

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
