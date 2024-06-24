package com.semillero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.entidades.Integrante;
import com.semillero.servicio.IntegranteServicio;

@RestController
@RequestMapping("/integrantes")
public class IntegranteController {
    @Autowired
    private IntegranteServicio integranteService;

    @PutMapping
    public Integrante actualizarIntegrante(@RequestBody Integrante integrante) {
        return integranteService.actualizarIntegrante(integrante);
    }
 }
