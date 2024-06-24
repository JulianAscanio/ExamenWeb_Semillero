package com.semillero.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.semillero.entidades.Integrante;

import java.util.List;
import java.util.Optional;

@Repository
public interface IntegranteRepositorio extends JpaRepository<Integrante, Integer> {

	Integrante save(Integrante integrante);
}

