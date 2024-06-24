package com.semillero.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillero.entidades.Proyecto;
import com.semillero.repositorio.ProyectoRepositorio;

@Service
public class ProyectoServicio {

	@Autowired
    private ProyectoRepositorio proyectoRepository;

    public List<Proyecto> listarProyectos() {
        return proyectoRepository.findAll();
    }

}
