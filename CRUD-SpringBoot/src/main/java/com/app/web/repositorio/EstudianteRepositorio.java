package com.app.web.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Estudiante;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long>{

	@Query (value = "SELECT * FROM estudiantes e WHERE (e.nombre LIKE %?1% OR e.apellido LIKE %?1% OR e.email LIKE %?1%)", nativeQuery=true)

	public List<Estudiante> findAll(String palabraClave);
}
