package com.semillero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.entidades.Actividad;
import com.semillero.servicio.ActividadServicio;

@RestController
@RequestMapping("/actividades")
public class ActividadController {
    @Autowired
    private ActividadServicio actividadService;

    @GetMapping("/{id}")
    public Actividad obtenerActividad(@PathVariable int id) {
        return actividadService.obtenerActividadPorId(id);
    }
}
