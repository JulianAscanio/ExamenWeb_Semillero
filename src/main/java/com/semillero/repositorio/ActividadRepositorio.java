package com.semillero.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semillero.entidades.Actividad;

public interface ActividadRepositorio extends JpaRepository<Actividad, Integer> {
	Optional<Actividad> findById(int id);
}
