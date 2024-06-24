package com.semillero.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.semillero.entidades.Linea;

import java.util.Optional;

@Repository
public interface LineaRepositorio extends JpaRepository<Linea, Integer> {

    Optional<Linea> findByNombre(String nombre);

    Optional<Linea> findById(int id);

    void deleteById(int id);
}

