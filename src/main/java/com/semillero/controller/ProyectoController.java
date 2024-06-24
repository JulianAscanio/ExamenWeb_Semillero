package com.semillero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.servicio.ProyectoServicio;
import com.semillero.entidades.Proyecto;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

    @Autowired
    private ProyectoServicio proyectoService;

    @GetMapping
    public List<Proyecto> listarProyectos() {
        return proyectoService.listarProyectos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> obtenerProyecto(@PathVariable int id) {
        Proyecto proyecto = proyectoService.obtenerProyecto(id);
        return proyecto != null ? ResponseEntity.ok(proyecto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Proyecto crearProyecto(@RequestBody Proyecto proyecto) {
        return proyectoService.crearProyecto(proyecto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proyecto> actualizarProyecto(@PathVariable int id, @RequestBody Proyecto proyectoDetails) {
        Proyecto proyecto = proyectoService.actualizarProyecto(id, proyectoDetails);
        return proyecto != null ? ResponseEntity.ok(proyecto) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProyecto(@PathVariable int id) {
        proyectoService.eliminarProyecto(id);
        return ResponseEntity.noContent().build();
    }
}
