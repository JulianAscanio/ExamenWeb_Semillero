package com.semillero.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillero.entidades.Evento;
import com.semillero.repositorio.EventoRepositorio;

@Service
public class EventoServicio {
	@Autowired
    private EventoRepositorio eventoRepository;

    public Evento crearEvento(Evento evento) {
        return eventoRepository.save(evento);
    }
}
