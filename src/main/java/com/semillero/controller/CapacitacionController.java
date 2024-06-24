package com.semillero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.servicio.CapacitacionServicio;

@RestController
@RequestMapping("/capacitaciones")
public class CapacitacionController {
    @Autowired
    private CapacitacionServicio capacitacionService;

    @DeleteMapping("/{id}")
    public void eliminarCapacitacion(@PathVariable int id) {
        capacitacionService.eliminarCapacitacion(id);
    }
}
