package com.semillero.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.semillero.entidades.Evento;

public interface EventoRepositorio extends JpaRepository<Evento, Integer> {
    Evento save(Evento evento);
}
