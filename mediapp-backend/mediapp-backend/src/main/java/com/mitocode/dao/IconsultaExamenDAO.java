package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitocode.model.ConsultaExamen;

@Repository
public interface IconsultaExamenDAO extends JpaRepository<ConsultaExamen, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "INSERT INTO CONSULTAEXAMENES(id_consulta, id_examen) VALUES (:idConsulta, :idExamen)", nativeQuery = true)
	int registrar(@Param("idConsulta")Integer idConsulta,@Param("idExamen") Integer idExamen);

}
