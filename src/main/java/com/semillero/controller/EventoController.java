package com.semillero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.entidades.Evento;
import com.semillero.servicio.EventoServicio;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
    private EventoServicio eventoService;

    @PostMapping
    public Evento crearEvento(@RequestBody Evento evento) {
        return eventoService.crearEvento(evento);
    }
}