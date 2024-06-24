package com.semillero.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.semillero.entidades.Proyecto;


@Repository
public interface ProyectoRepositorio extends JpaRepository<Proyecto, Integer> {

	List<Proyecto> findAll();
}
